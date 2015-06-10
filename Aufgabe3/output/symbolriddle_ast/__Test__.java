package symbolriddle_ast;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import symbolriddle_ast.grammar.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolRiddle_ASTLexer lex = new SymbolRiddle_ASTLexer(new ANTLRFileStream("__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolRiddle_ASTParser parser = new SymbolRiddle_ASTParser(tokens);
        SymbolRiddle_ASTParser.prog_return r = parser.prog();
        CommonTree walkerTree = (CommonTree) r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());

        SymbolRiddle_ASTWalker walker = new SymbolRiddle_ASTWalker(nodes);

    	System.out.println(walkerTree.toStringTree());
		System.out.println(((CommonTree)  walker.prog().getTree()).toStringTree());

    }

}