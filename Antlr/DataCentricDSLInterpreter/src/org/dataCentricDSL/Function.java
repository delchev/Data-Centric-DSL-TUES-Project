package org.dataCentricDSL;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.ProgramWalker;
import org.dataCentricDSL.tree.TLNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Function {

	private String id;
	private List<String> identifiers;
	private CommonTree code;
	private Scope scope;

	public Function(String i, CommonTree ids, CommonTree block) {
		id = i;
		identifiers = toList(ids);
		code = block;
		scope = new Scope();
	}

	public Function(Function original) {
		// Used for recursively calling functions
		id = original.id;
		identifiers = original.identifiers;
		code = original.code;
		scope = original.scope.copy();
	}

	public TLNode invoke(List<TLNode> params, Map<String, Function> functions) {
//		System.out.println(params.size());
//		System.out.println(identifiers.size());
		
		if(params.size() != identifiers.size()) {
			throw new RuntimeException("illegal function call: " + identifiers.size() +
					" parameters expected for function `" + id + "`");
		}

		// Assign all expression parameters to this function's identifiers
		for(int i = 0; i < identifiers.size(); i++) {
			scope.assign(identifiers.get(i), params.get(i).evaluate());
		}

		try {
			// Create a tree walker to evaluate this function's code block
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(code);
			ProgramWalker walker = new ProgramWalker(nodes, scope, functions);
//			return walker.program().evaluate();
			return walker.program();
		} catch (RecognitionException e) {
			// do not recover from this
			throw new RuntimeException("something went wrong, terminating...", e);
		}
	}

	private List<String> toList(CommonTree tree) {
		List<String> ids = new ArrayList<String>();

		// convert the tree to a List of Strings
		for(int i = 0; i < tree.getChildCount(); i++) {
			CommonTree child = (CommonTree)tree.getChild(i);
			ids.add(child.getText());
		}
		return ids;
	}
}

