package cn.ac.ios.PCRE;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;


public final class PCREBuilder {

    private static final DescriptiveBailErrorListener ERROR_LISTENER = new DescriptiveBailErrorListener();

    // No need to instantiate this class.
    private PCREBuilder() {
    }

    public static final class Lexer {

        private PCRELexer lexer;

        public Lexer(String input) {
            this(new ANTLRInputStream(input));
        }

        public Lexer(ANTLRInputStream input) {
            this.lexer = new PCRELexer(input);
            this.lexer.removeErrorListeners();
            this.lexer.addErrorListener(ERROR_LISTENER);
        }

        public Lexer withErrorListener(ANTLRErrorListener listener) {
            this.lexer.removeErrorListeners();
            this.lexer.addErrorListener(listener);
            return this;
        }

        public PCRELexer build() {
            return this.lexer;
        }
    }

    public static final class Parser {

        private PCREParser parser;

        public Parser(String input) {
            this(new ANTLRInputStream(input));
        }

        public Parser(ANTLRInputStream input) {
            PCRELexer lexer = new PCRELexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ERROR_LISTENER);
            this.parser = new PCREParser(new CommonTokenStream(lexer));
            this.parser.removeErrorListeners();
            this.parser.addErrorListener(ERROR_LISTENER);
        }

        public Parser(PCRELexer lexer) {
            this.parser = new PCREParser(new CommonTokenStream(lexer));
            this.parser.removeErrorListeners();
            this.parser.addErrorListener(ERROR_LISTENER);
        }

        public Parser withErrorListener(ANTLRErrorListener listener) {
            this.parser.removeErrorListeners();
            this.parser.addErrorListener(listener);
            return this;
        }

        public PCREParser build() {
            return this.parser;
        }
    }

    public static final class Tree {

        private final String input;
        public HashMap<String, ArrayList<ParserRuleContext>> hashMap;
        public ArrayList arrayList = new ArrayList();

        public Tree(String input) {
            this.input = input;
        }

        public String toStringASCII() {

            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            StringBuilder builder = new StringBuilder();
            walk(tree, builder);
            return builder.toString();
        }

        private void walk(ParseTree tree, StringBuilder builder) {

            List<ParseTree> firstStack = new ArrayList<ParseTree>();
            firstStack.add(tree);

            List<List<ParseTree>> childListStack = new ArrayList<List<ParseTree>>();
            childListStack.add(firstStack);

            while (!childListStack.isEmpty()) {

                List<ParseTree> childStack = childListStack.get(childListStack.size() - 1);

                if (childStack.isEmpty()) {
                    childListStack.remove(childListStack.size() - 1);
                } else {
                    tree = childStack.remove(0);

                    String node = tree.getClass().getSimpleName().replace("Context", "");
                    node = Character.toLowerCase(node.charAt(0)) + node.substring(1);

                    String indent = "";

                    for (int i = 0; i < childListStack.size() - 1; i++) {
                        indent += (childListStack.get(i).size() > 0) ? "|  " : "   ";
                    }

                    builder.append(indent)
                            .append(childStack.isEmpty() ? "'- " : "|- ")
                            .append(node.startsWith("terminal") ? tree.getText() : node)
                            .append("\n");

                    if (tree.getChildCount() > 0) {
                        List<ParseTree> children = new ArrayList<ParseTree>();
                        for (int i = 0; i < tree.getChildCount(); i++) {
                            children.add(tree.getChild(i));
                        }
                        childListStack.add(children);
                    }
                }
            }
        }

        public void traverse() {
            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            ParseTreeWalker walker = new ParseTreeWalker();
            PCREBaseListener baseListener = new PCREBaseListener();
            walker.walk(baseListener, tree);
            this.hashMap = baseListener.hashMap;
            this.arrayList = baseListener.arrayList;
        }

        public int getNest() {
            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            return getCount(tree.getChild(0));
        }

        public int getStar() {
            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            return getStarCount(tree.getChild(0));
        }

        public int getQuantifier() {
            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            return getQuantifierCount(tree.getChild(0));
        }

        public int[] getNestAndStar() {
            PCREParser parser = new Parser(input).build();
            ParseTree tree = parser.parse();
            int[] ints = new int[2];
            ints[0] = getCount(tree.getChild(0));
            ints[1] = getStarCount(tree.getChild(0));
            return ints;
        }

        public int getCount(ParseTree tree) {
            if (tree.getChildCount() == 0) {
                return 0;
            } else if (tree.getChildCount() == 1) {
                return getCount(tree.getChild(0));
            } else if (tree instanceof PCREParser.CaptureContext && tree.getChildCount() == 3) {
                return 1 + getCount(tree.getChild(tree.getChildCount() - 2));
            } else if (tree instanceof PCREParser.Name_caturpeContext || tree instanceof PCREParser.Base_non_captureContext || tree instanceof PCREParser.Reset_non_captureContext || tree instanceof PCREParser.Atomic_non_captureContext) {
                return 1 + getCount(tree.getChild(tree.getChildCount() - 2));
            } else {
                int max = 0;
                for (int i = 0; i < tree.getChildCount(); i++) {
                    max = Math.max(max, getCount(tree.getChild(i)));
                }
                return max;
            }
        }

        public int getStarCount(ParseTree tree) {
            if (tree.getChildCount() == 0) {
                return 0;
            } else if (tree.getChildCount() == 1) {
                return getStarCount(tree.getChild(0));
            } else if (tree instanceof PCREParser.ElementContext) {
                if (tree.getChildCount() == 2 &&
                        tree.getChild(0) instanceof PCREParser.AtomContext &&
                        tree.getChild(1) instanceof PCREParser.QuantifierContext &&
                        tree.getChild(1).getText().contains("*")) {
                    return getStarCount(tree.getChild(0)) + 1;
                } else {
                    return getStarCount(tree.getChild(0));
                }
            } else {
                int max = 0;
                for (int i = 0; i < tree.getChildCount(); i++) {
                    max = Math.max(max, getStarCount(tree.getChild(i)));
                }
                return max;
            }
        }


        public int getQuantifierCount(ParseTree tree) {
            if (tree.getChildCount() == 0) {
                return 0;
            } else if (tree.getChildCount() == 1) {
                return getQuantifierCount(tree.getChild(0));
            } else if (tree instanceof PCREParser.ElementContext) {
                if (tree.getChildCount() == 2 &&
                        tree.getChild(0) instanceof PCREParser.AtomContext &&
                        tree.getChild(1) instanceof PCREParser.QuantifierContext) {
                    return getQuantifierCount(tree.getChild(0)) + 1;
                } else {
                    return getQuantifierCount(tree.getChild(0));
                }
            } else {
                int max = 0;
                for (int i = 0; i < tree.getChildCount(); i++) {
                    max = Math.max(max, getQuantifierCount(tree.getChild(i)));
                }
                return max;
            }
        }
    }

}