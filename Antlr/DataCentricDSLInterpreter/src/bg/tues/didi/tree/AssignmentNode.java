package bg.tues.didi.tree;

import bg.tues.didi.Scope;
import bg.tues.didi.Value;

import java.util.ArrayList;
import java.util.List;

public class AssignmentNode implements Node {

	protected String identifier;
	protected List<Node> indexNodes;
	protected Node rhs;
	protected Scope scope;

	public AssignmentNode(String i, List<Node> e, Node n, Scope s) {
		identifier = i;
		indexNodes = (e == null) ? new ArrayList<Node>() : e;
		rhs = n;
		scope = s;
	}

	public AssignmentNode(String i, Node n, Scope s) {
		identifier = i;
		indexNodes = new ArrayList<Node>();
		rhs = n;
		scope = s;
	}

	@Override
	public Value evaluate() {

		Value value = rhs.evaluate();
		if (value == Value.VOID) {
			throw new RuntimeException("Can't assign VOID to " + identifier);
		}

		if (indexNodes.isEmpty()) { // A simple assignment
			scope.assign(identifier, value);
		}
		else { // A possible list-lookup and reassignment

			Value list = scope.resolve(identifier);

			// Iterate up to `foo[x][y]` in case of `foo[x][y][z] = 42;`
			for (int i = 0; i < indexNodes.size() - 1 && list != null; i++) {
				Value index = indexNodes.get(i).evaluate();

				if (!index.isNumber() || !list.isList()) { // sanity checks
					throw new RuntimeException("Illegal statement: " + this);
				}

				int idx = index.asLong().intValue();
				list = list.asList().get(idx);
			}
			// List is now pointing to `foo[x][y]` in case of `foo[x][y][z] = 42;`

			// Get the value `z`: the last index, in `foo[x][y][z] = 42;`
			Value lastIndex = indexNodes.get(indexNodes.size() - 1).evaluate();

			if (!lastIndex.isNumber() || !list.isList()) { // sanity checks
				throw new RuntimeException("Illegal statement: " + this);
			}

			// Re-assign `foo[x][y][z]`
			List<Value> existing = list.asList();
			existing.set(lastIndex.asLong().intValue(), value);
		}

		return Value.VOID;
	}

	@Override
	public String toString() {
		return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
	}
}
