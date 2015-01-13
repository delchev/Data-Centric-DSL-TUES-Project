/*
 * generated by Xtext
 */
package org.validation

import org.dataCentricDSL.Condition
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.DataCentricDSLPackage
import org.dataCentricDSL.ForStatement
import org.dataCentricDSL.FunctionCall
import org.dataCentricDSL.FunctionDecl
import org.dataCentricDSL.IfStatement
import org.dataCentricDSL.NumberLiteral
import org.dataCentricDSL.Query
import org.dataCentricDSL.StringLiteral
import org.dataCentricDSL.VariableCall
import org.dataCentricDSL.VariableDecl
import org.dataCentricDSL.WhileStatement
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DataCentricDSLValidator extends AbstractDataCentricDSLValidator {
	
	@Check
	def void checkIfQueryStringIsEmpty(Query que){
		if(que.queryValue.toString.equals("")){
			error("Query string cannot be empty.", DataCentricDSLPackage.Literals::QUERY__QUERY_VALUE);
		}
	}
	
	@Check
	def void checkConditionOperands(Condition c) {
		var leftOperand = c.expressions.get(0);
		var rightOperand = c.expressions.get(1);
		if(leftOperand instanceof NumberLiteral) {
			if(!(rightOperand instanceof NumberLiteral)) {
				error("Operands of incompatible types.", DataCentricDSLPackage.Literals::CONDITION__EXPRESSIONS)
			}
		}
		if(leftOperand instanceof StringLiteral) {
			if(!(rightOperand instanceof StringLiteral)) {
				error("Operands of incompatible types.", DataCentricDSLPackage.Literals::CONDITION__EXPRESSIONS)
			}
		}
	}
	
	@Check
	def void checkIfCalledFunctionExists(FunctionCall fc) {
		var Array = fc.eContainer;
		while(!(Array instanceof DataCentricDSL)) {
			Array = Array.eContainer;
		}
		
		val Elements = (Array as DataCentricDSL)
							.elements
							.toArray
							.filter(typeof(FunctionDecl));
							
		var found = 0;
		for(i : 0..< Elements.length) {
			if(found == 0) {
				if(Elements.get(i).name.toString.equals(fc.name.toString)) {
					found = 1;
				}
			} else {
				return;
			}
		}
		
		if(found == 0) {
			error("Undefined function.", DataCentricDSLPackage.Literals::FUNCTION_CALL__NAME);
		}
	}
	
// doesn't work for now (again......)
	@Check
	def void checkIfAssignedVariableExists(VariableCall vc) {
		var Array = vc.eContainer;
		var found = 0;
		while(!(Array instanceof DataCentricDSL)) {
			Array = Array.eContainer;
			
			if(Array instanceof IfStatement) {
				var Elements = (Array as IfStatement).statements.toArray.filter(typeof(VariableDecl));
				for(i : 0..< Elements.length) {
					if(found == 0) {
						if(Elements.get(i).name.toString.equals(vc.variableCall.toString)) {
							found = 1;
						}
					} else {
						return;
					}
				}
			} else if(Array instanceof ForStatement) {
				var Elements = (Array as ForStatement).statements.toArray.filter(typeof(VariableDecl));
				for(i : 0..< Elements.length) {
					if(found == 0) {
						if(Elements.get(i).name.toString.equals(vc.variableCall.toString)) {
							found = 1;
						}
					} else {
						return;
					}
				}
			} else if(Array instanceof WhileStatement) {
				var Elements = (Array as WhileStatement).statements.toArray.filter(typeof(VariableDecl));
				for(i : 0..< Elements.length) {
					if(found == 0) {
						if(Elements.get(i).name.toString.equals(vc.variableCall.toString)) {
							found = 1;
						}
					} else {
						return;
					}
				}
			}
		}
		val Elements = (Array as DataCentricDSL).elements.toArray.filter(typeof(VariableDecl));
		for(i : 0..< Elements.length) {
			if(found == 0) {
				if(Elements.get(i).name.toString.equals(vc.variableCall.toString)) {
					found = 1;
				}
			} else {
				return;
			}
		}
		if(found == 0) {
			error("Undefined variable.", DataCentricDSLPackage.Literals::VARIABLE_CALL__VARIABLE_CALL);
		}
	}

}