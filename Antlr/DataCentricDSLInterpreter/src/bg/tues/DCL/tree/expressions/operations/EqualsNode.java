package bg.tues.DCL.tree.expressions.operations;

import bg.tues.DCL.Value;
import bg.tues.DCL.tree.Node;

public class EqualsNode implements Node {
	private Node lhs;
	private Node rhs;

	public EqualsNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if(a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble().equals(b.asDouble()));
		}

		if(a.isString() && b.isString()) {
			return new Value(a.asString().compareTo(b.asString()) == 0);
		}

		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s < %s)", lhs, rhs);
	}
}
