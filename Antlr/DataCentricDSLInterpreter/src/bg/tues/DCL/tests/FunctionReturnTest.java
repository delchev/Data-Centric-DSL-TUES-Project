package bg.tues.DCL.tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.tues.DCL.DataCentricDSLLexer;
import bg.tues.DCL.DataCentricDSLParser;
import bg.tues.DCL.ProgramWalker;
import bg.tues.DCL.DataCentricDSLParser.program_return;
import bg.tues.DCL.derbyDB.CreateDB;

public class FunctionReturnTest {


	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void VariableCallDeclarationTest() throws RecognitionException, SQLException{
		CharStream cs = new ANTLRStringStream("func compTwoNum(b) {	if(b == 5) {return true;}else{return false;}}b = 5;println compTwoNum(b);");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		myMap.put("outputStream", System.out);

		ProgramWalker walker = new ProgramWalker(nodeStream, myMap, parser.functions);
		walker.program(); 
		assertEquals("true", outContent.toString().trim());
	}
}