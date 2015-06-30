package symbolpuzzle.implementation;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import symbolpuzzle.grammar.SymbolRiddle_ASTLexer;
import symbolpuzzle.grammar.SymbolRiddle_ASTParser;
import symbolpuzzle.grammar.SymbolRiddle_ASTWalker;
import symbolpuzzle.grammar.SymbolraetselEmitter;

import javax.swing.*;
import java.io.*;

public class Main {
	private static final String TEMPLATE_FILE = "src/symbolpuzzle/implementation/template.stg";
	private static final File FILE = new File("src/symbolpuzzle/implementation/Prog.java");

	public static void main(String[] args) throws RecognitionException, IOException {
		SymbolRiddle_ASTLexer lex = new SymbolRiddle_ASTLexer(new ANTLRFileStream("src/symbolpuzzle/SymbolRiddle.txt", "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SymbolRiddle_ASTParser parser = new SymbolRiddle_ASTParser(tokens);

		SymbolRiddle_ASTParser.prog_return r = parser.prog();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
		SymbolRiddle_ASTWalker walker = new SymbolRiddle_ASTWalker(nodes);
		CommonTree walkerTree = (CommonTree) r.getTree();
		CommonTree puzzleTree = (CommonTree) walker.prog().getTree();

		System.out.println(walkerTree.toStringTree());
		System.out.println(puzzleTree.toStringTree());

		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(puzzleTree);
		nodes2.setTokenStream(tokens);
		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);

//		InputStream templateIs = Main.class.getClassLoader()
//				.getResourceAsStream(TEMPLATE_FILE);

		FileReader templateIs = new FileReader(TEMPLATE_FILE);
//		System.out.println("INputStream " + templateIs);
//		StringTemplateGroup templates = new StringTemplateGroup(
//				new InputStreamReader(templateIs, "ISO-8859-15"),
//				AngleBracketTemplateLexer.class);
		StringTemplateGroup templates = new StringTemplateGroup(templateIs);
		emitter.setTemplateLib(templates);
		SymbolraetselEmitter.prog_return puzzle_return = emitter.prog();
		String output = puzzle_return.getTemplate().toString();
//		System.out.println(output);

		writeToFile(output);



	}

	private static void writeToFile(String output) {
		try{
			if (!FILE.exists()) {
				FILE.createNewFile();
			}

			FileWriter file =  new FileWriter(FILE, false);
			BufferedWriter bw = new BufferedWriter(file);
			bw.write(output);
			bw.close();

		} catch (IOException e) {
			System.err.println("write to file did not work");
			System.out.println(e);
		}
	}

}
