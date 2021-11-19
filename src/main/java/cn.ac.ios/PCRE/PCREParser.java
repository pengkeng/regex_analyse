// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/PCRE.g4 by ANTLR 4.9.1
package cn.ac.ios.PCRE;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCREParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Quoted=2, BellChar=3, ControlChar=4, EscapeChar=5, FormFeed=6, 
		NewLine=7, CarriageReturn=8, Tab=9, Backslash=10, Dot=11, OneDataUnit=12, 
		DecimalDigit=13, NotDecimalDigit=14, HorizontalWhiteSpace=15, NotHorizontalWhiteSpace=16, 
		NotNewLine=17, CharWithProperty=18, SingleCharWithProperty=19, CharWithoutProperty=20, 
		SingleCharWithoutProperty=21, NewLineSequence=22, WhiteSpace=23, NotWhiteSpace=24, 
		VerticalWhiteSpace=25, NotVerticalWhiteSpace=26, WordChar=27, NotWordChar=28, 
		ExtendedUnicodeChar=29, CharacterClassStart=30, CharacterClassEnd=31, 
		Caret=32, Hyphen=33, POSIXNamedSet=34, POSIXNegatedNamedSet=35, QuestionMark=36, 
		Plus=37, Star=38, OpenBrace=39, CloseBrace=40, Comma=41, WordBoundary=42, 
		NonWordBoundary=43, StartOfSubject=44, EndOfSubjectOrLine=45, EndOfSubjectOrLineEndOfSubject=46, 
		EndOfSubject=47, PreviousMatchInSubject=48, ResetStartMatch=49, SubroutineOrNamedReferenceStartG=50, 
		NamedReferenceStartK=51, Pipe=52, OpenParen=53, CloseParen=54, LessThan=55, 
		GreaterThan=56, SingleQuote=57, Underscore=58, Colon=59, Hash=60, Equals=61, 
		Exclamation=62, Ampersand=63, Slash=64, Semicolon=65, Mail=66, Percent=67, 
		Wave=68, DoubleQuote=69, Backquote=70, BackSlashq=71, BackSlashe=72, BackSlashu=73, 
		BackSlashx=74, ALC=75, BLC=76, CLC=77, DLC=78, ELC=79, FLC=80, GLC=81, 
		HLC=82, ILC=83, JLC=84, KLC=85, LLC=86, MLC=87, NLC=88, OLC=89, PLC=90, 
		QLC=91, RLC=92, SLC=93, TLC=94, ULC=95, VLC=96, WLC=97, XLC=98, YLC=99, 
		ZLC=100, AUC=101, BUC=102, CUC=103, DUC=104, EUC=105, FUC=106, GUC=107, 
		HUC=108, IUC=109, JUC=110, KUC=111, LUC=112, MUC=113, NUC=114, OUC=115, 
		PUC=116, QUC=117, RUC=118, SUC=119, TUC=120, UUC=121, VUC=122, WUC=123, 
		XUC=124, YUC=125, ZUC=126, D1=127, D2=128, D3=129, D4=130, D5=131, D6=132, 
		D7=133, D8=134, D9=135, D0=136, OtherChar=137;
	public static final int
		RULE_parse = 0, RULE_global_option_pattern = 1, RULE_alternation = 2, 
		RULE_expr = 3, RULE_element = 4, RULE_quantifier = 5, RULE_quantifier_greedy = 6, 
		RULE_quantifier_lazy = 7, RULE_quantifier_possesstive = 8, RULE_quantifier_Kleene = 9, 
		RULE_quantifier_add = 10, RULE_quantifier_option = 11, RULE_quantifier_range = 12, 
		RULE_character_class = 13, RULE_negative_character_class = 14, RULE_character_class_intersection = 15, 
		RULE_backreference = 16, RULE_backreference_or_index = 17, RULE_backreference_or_name = 18, 
		RULE_backreference_or_octal = 19, RULE_capture = 20, RULE_name_caturpe = 21, 
		RULE_non_capture = 22, RULE_atomic_non_capture = 23, RULE_reset_non_capture = 24, 
		RULE_base_non_capture = 25, RULE_comment = 26, RULE_option = 27, RULE_option_flags = 28, 
		RULE_option_flag = 29, RULE_global_option_flags = 30, RULE_global_option_flag = 31, 
		RULE_look_around = 32, RULE_look_ahead_positive = 33, RULE_look_ahead_negative = 34, 
		RULE_look_behind_positive = 35, RULE_look_behind_negative = 36, RULE_embedded_code = 37, 
		RULE_define_group = 38, RULE_subroutine_reference = 39, RULE_conditional = 40, 
		RULE_backtrack_control = 41, RULE_newline_convention = 42, RULE_callout = 43, 
		RULE_atom = 44, RULE_cc_atom = 45, RULE_shared_atom = 46, RULE_literal = 47, 
		RULE_cc_literal = 48, RULE_shared_literal = 49, RULE_number = 50, RULE_octal_char = 51, 
		RULE_hex_char = 52, RULE_octal_digit = 53, RULE_hex_digit = 54, RULE_digits = 55, 
		RULE_digit = 56, RULE_name = 57, RULE_alpha_nums = 58, RULE_non_close_parens = 59, 
		RULE_non_close_paren = 60, RULE_letter = 61, RULE_block_quoted = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "global_option_pattern", "alternation", "expr", "element", "quantifier", 
			"quantifier_greedy", "quantifier_lazy", "quantifier_possesstive", "quantifier_Kleene", 
			"quantifier_add", "quantifier_option", "quantifier_range", "character_class", 
			"negative_character_class", "character_class_intersection", "backreference", 
			"backreference_or_index", "backreference_or_name", "backreference_or_octal", 
			"capture", "name_caturpe", "non_capture", "atomic_non_capture", "reset_non_capture", 
			"base_non_capture", "comment", "option", "option_flags", "option_flag", 
			"global_option_flags", "global_option_flag", "look_around", "look_ahead_positive", 
			"look_ahead_negative", "look_behind_positive", "look_behind_negative", 
			"embedded_code", "define_group", "subroutine_reference", "conditional", 
			"backtrack_control", "newline_convention", "callout", "atom", "cc_atom", 
			"shared_atom", "literal", "cc_literal", "shared_literal", "number", "octal_char", 
			"hex_char", "octal_digit", "hex_digit", "digits", "digit", "name", "alpha_nums", 
			"non_close_parens", "non_close_paren", "letter", "block_quoted"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\U'", null, "'\\a'", null, "'\\e'", "'\\f'", "'\\n'", "'\\r'", 
			"'\\t'", "'\\'", "'.'", "'\\C'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", 
			"'\\N'", null, null, null, null, "'\\R'", "'\\s'", "'\\S'", "'\\v'", 
			"'\\V'", "'\\w'", "'\\W'", "'\\X'", "'['", "']'", "'^'", "'-'", null, 
			null, "'?'", "'+'", "'*'", "'{'", "'}'", "','", "'\\b'", "'\\B'", "'\\A'", 
			"'$'", "'\\Z'", "'\\z'", "'\\G'", "'\\K'", "'\\g'", "'\\k'", "'|'", "'('", 
			"')'", "'<'", "'>'", "'''", "'_'", "':'", "'#'", "'='", "'!'", "'&'", 
			"'/'", "';'", "'@'", "'%'", "'~'", "'\"'", "'`'", "'\\Q'", "'\\E'", "'\\u'", 
			"'\\x'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", 
			"'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", 
			"'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", 
			"'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", 
			"'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", 
			"'X'", "'Y'", "'Z'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
			"'8'", "'9'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Quoted", "BellChar", "ControlChar", "EscapeChar", "FormFeed", 
			"NewLine", "CarriageReturn", "Tab", "Backslash", "Dot", "OneDataUnit", 
			"DecimalDigit", "NotDecimalDigit", "HorizontalWhiteSpace", "NotHorizontalWhiteSpace", 
			"NotNewLine", "CharWithProperty", "SingleCharWithProperty", "CharWithoutProperty", 
			"SingleCharWithoutProperty", "NewLineSequence", "WhiteSpace", "NotWhiteSpace", 
			"VerticalWhiteSpace", "NotVerticalWhiteSpace", "WordChar", "NotWordChar", 
			"ExtendedUnicodeChar", "CharacterClassStart", "CharacterClassEnd", "Caret", 
			"Hyphen", "POSIXNamedSet", "POSIXNegatedNamedSet", "QuestionMark", "Plus", 
			"Star", "OpenBrace", "CloseBrace", "Comma", "WordBoundary", "NonWordBoundary", 
			"StartOfSubject", "EndOfSubjectOrLine", "EndOfSubjectOrLineEndOfSubject", 
			"EndOfSubject", "PreviousMatchInSubject", "ResetStartMatch", "SubroutineOrNamedReferenceStartG", 
			"NamedReferenceStartK", "Pipe", "OpenParen", "CloseParen", "LessThan", 
			"GreaterThan", "SingleQuote", "Underscore", "Colon", "Hash", "Equals", 
			"Exclamation", "Ampersand", "Slash", "Semicolon", "Mail", "Percent", 
			"Wave", "DoubleQuote", "Backquote", "BackSlashq", "BackSlashe", "BackSlashu", 
			"BackSlashx", "ALC", "BLC", "CLC", "DLC", "ELC", "FLC", "GLC", "HLC", 
			"ILC", "JLC", "KLC", "LLC", "MLC", "NLC", "OLC", "PLC", "QLC", "RLC", 
			"SLC", "TLC", "ULC", "VLC", "WLC", "XLC", "YLC", "ZLC", "AUC", "BUC", 
			"CUC", "DUC", "EUC", "FUC", "GUC", "HUC", "IUC", "JUC", "KUC", "LUC", 
			"MUC", "NUC", "OUC", "PUC", "QUC", "RUC", "SUC", "TUC", "UUC", "VUC", 
			"WUC", "XUC", "YUC", "ZUC", "D1", "D2", "D3", "D4", "D5", "D6", "D7", 
			"D8", "D9", "D0", "OtherChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PCRE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCREParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PCREParser.EOF, 0); }
		public List<Global_option_patternContext> global_option_pattern() {
			return getRuleContexts(Global_option_patternContext.class);
		}
		public Global_option_patternContext global_option_pattern(int i) {
			return getRuleContext(Global_option_patternContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Global_option_flagsContext global_option_flags() {
			return getRuleContext(Global_option_flagsContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				alternation();
				setState(127);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				global_option_pattern();
				setState(130);
				expr();
				setState(131);
				alternation();
				setState(132);
				global_option_pattern();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (SLC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0)) {
					{
					setState(133);
					global_option_flags();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_option_patternContext extends ParserRuleContext {
		public TerminalNode Slash() { return getToken(PCREParser.Slash, 0); }
		public TerminalNode Wave() { return getToken(PCREParser.Wave, 0); }
		public TerminalNode DoubleQuote() { return getToken(PCREParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(PCREParser.SingleQuote, 0); }
		public TerminalNode Mail() { return getToken(PCREParser.Mail, 0); }
		public TerminalNode Hash() { return getToken(PCREParser.Hash, 0); }
		public TerminalNode Percent() { return getToken(PCREParser.Percent, 0); }
		public TerminalNode Backquote() { return getToken(PCREParser.Backquote, 0); }
		public TerminalNode Semicolon() { return getToken(PCREParser.Semicolon, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public Global_option_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_option_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterGlobal_option_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitGlobal_option_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitGlobal_option_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_option_patternContext global_option_pattern() throws RecognitionException {
		Global_option_patternContext _localctx = new Global_option_patternContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global_option_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Pipe - 52)) | (1L << (SingleQuote - 52)) | (1L << (Hash - 52)) | (1L << (Exclamation - 52)) | (1L << (Slash - 52)) | (1L << (Semicolon - 52)) | (1L << (Mail - 52)) | (1L << (Percent - 52)) | (1L << (Wave - 52)) | (1L << (DoubleQuote - 52)) | (1L << (Backquote - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(PCREParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PCREParser.Pipe, i);
		}
		public AlternationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAlternation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAlternation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternationContext alternation() throws RecognitionException {
		AlternationContext _localctx = new AlternationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alternation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(Pipe);
					setState(142);
					expr();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					element();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			atom();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(155);
				quantifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public Quantifier_greedyContext quantifier_greedy() {
			return getRuleContext(Quantifier_greedyContext.class,0);
		}
		public Quantifier_lazyContext quantifier_lazy() {
			return getRuleContext(Quantifier_lazyContext.class,0);
		}
		public Quantifier_possesstiveContext quantifier_possesstive() {
			return getRuleContext(Quantifier_possesstiveContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quantifier);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				quantifier_greedy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				quantifier_lazy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				quantifier_possesstive();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_greedyContext extends ParserRuleContext {
		public Quantifier_KleeneContext quantifier_Kleene() {
			return getRuleContext(Quantifier_KleeneContext.class,0);
		}
		public Quantifier_addContext quantifier_add() {
			return getRuleContext(Quantifier_addContext.class,0);
		}
		public Quantifier_optionContext quantifier_option() {
			return getRuleContext(Quantifier_optionContext.class,0);
		}
		public Quantifier_rangeContext quantifier_range() {
			return getRuleContext(Quantifier_rangeContext.class,0);
		}
		public Quantifier_greedyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_greedy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_greedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_greedy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_greedy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_greedyContext quantifier_greedy() throws RecognitionException {
		Quantifier_greedyContext _localctx = new Quantifier_greedyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier_greedy);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				quantifier_Kleene();
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				quantifier_add();
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				quantifier_option();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				quantifier_range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_lazyContext extends ParserRuleContext {
		public Quantifier_KleeneContext quantifier_Kleene() {
			return getRuleContext(Quantifier_KleeneContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public Quantifier_addContext quantifier_add() {
			return getRuleContext(Quantifier_addContext.class,0);
		}
		public Quantifier_optionContext quantifier_option() {
			return getRuleContext(Quantifier_optionContext.class,0);
		}
		public Quantifier_rangeContext quantifier_range() {
			return getRuleContext(Quantifier_rangeContext.class,0);
		}
		public Quantifier_lazyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_lazy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_lazy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_lazy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_lazy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_lazyContext quantifier_lazy() throws RecognitionException {
		Quantifier_lazyContext _localctx = new Quantifier_lazyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quantifier_lazy);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				quantifier_Kleene();
				setState(170);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				quantifier_add();
				setState(173);
				match(QuestionMark);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				quantifier_option();
				setState(176);
				match(QuestionMark);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				quantifier_range();
				setState(179);
				match(QuestionMark);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_possesstiveContext extends ParserRuleContext {
		public Quantifier_KleeneContext quantifier_Kleene() {
			return getRuleContext(Quantifier_KleeneContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public Quantifier_addContext quantifier_add() {
			return getRuleContext(Quantifier_addContext.class,0);
		}
		public Quantifier_optionContext quantifier_option() {
			return getRuleContext(Quantifier_optionContext.class,0);
		}
		public Quantifier_rangeContext quantifier_range() {
			return getRuleContext(Quantifier_rangeContext.class,0);
		}
		public Quantifier_possesstiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_possesstive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_possesstive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_possesstive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_possesstive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_possesstiveContext quantifier_possesstive() throws RecognitionException {
		Quantifier_possesstiveContext _localctx = new Quantifier_possesstiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantifier_possesstive);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				quantifier_Kleene();
				setState(184);
				match(Plus);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				quantifier_add();
				setState(187);
				match(Plus);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				quantifier_option();
				setState(190);
				match(Plus);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				quantifier_range();
				setState(193);
				match(Plus);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_KleeneContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public Quantifier_KleeneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_Kleene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_Kleene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_Kleene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_Kleene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_KleeneContext quantifier_Kleene() throws RecognitionException {
		Quantifier_KleeneContext _localctx = new Quantifier_KleeneContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantifier_Kleene);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(Star);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_addContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public Quantifier_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_addContext quantifier_add() throws RecognitionException {
		Quantifier_addContext _localctx = new Quantifier_addContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Plus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_optionContext extends ParserRuleContext {
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public Quantifier_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_optionContext quantifier_option() throws RecognitionException {
		Quantifier_optionContext _localctx = new Quantifier_optionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(QuestionMark);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_rangeContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(PCREParser.Comma, 0); }
		public Quantifier_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_rangeContext quantifier_range() throws RecognitionException {
		Quantifier_rangeContext _localctx = new Quantifier_rangeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier_range);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(OpenBrace);
				setState(204);
				number();
				setState(205);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(OpenBrace);
				setState(208);
				number();
				setState(209);
				match(Comma);
				setState(210);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(OpenBrace);
				setState(213);
				number();
				setState(214);
				match(Comma);
				setState(215);
				number();
				setState(216);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_classContext extends ParserRuleContext {
		public Negative_character_classContext negative_character_class() {
			return getRuleContext(Negative_character_classContext.class,0);
		}
		public TerminalNode CharacterClassStart() { return getToken(PCREParser.CharacterClassStart, 0); }
		public List<TerminalNode> CharacterClassEnd() { return getTokens(PCREParser.CharacterClassEnd); }
		public TerminalNode CharacterClassEnd(int i) {
			return getToken(PCREParser.CharacterClassEnd, i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public List<Character_class_intersectionContext> character_class_intersection() {
			return getRuleContexts(Character_class_intersectionContext.class);
		}
		public Character_class_intersectionContext character_class_intersection(int i) {
			return getRuleContext(Character_class_intersectionContext.class,i);
		}
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public Character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCharacter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCharacter_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCharacter_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_character_class);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				negative_character_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(CharacterClassStart);
				setState(222);
				match(CharacterClassEnd);
				setState(223);
				match(Hyphen);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					character_class_intersection();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(229);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(CharacterClassStart);
				setState(232);
				match(CharacterClassEnd);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(233);
					character_class_intersection();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(CharacterClassStart);
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					character_class_intersection();
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(246);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(CharacterClassStart);
				setState(249);
				match(CharacterClassEnd);
				setState(250);
				match(Hyphen);
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(251);
					cc_atom();
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(256);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(CharacterClassStart);
				setState(259);
				match(CharacterClassEnd);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(260);
					cc_atom();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(CharacterClassEnd);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				match(CharacterClassStart);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(268);
					cc_atom();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(CharacterClassEnd);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_character_classContext extends ParserRuleContext {
		public TerminalNode CharacterClassStart() { return getToken(PCREParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public List<TerminalNode> CharacterClassEnd() { return getTokens(PCREParser.CharacterClassEnd); }
		public TerminalNode CharacterClassEnd(int i) {
			return getToken(PCREParser.CharacterClassEnd, i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public List<Character_class_intersectionContext> character_class_intersection() {
			return getRuleContexts(Character_class_intersectionContext.class);
		}
		public Character_class_intersectionContext character_class_intersection(int i) {
			return getRuleContext(Character_class_intersectionContext.class,i);
		}
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public Negative_character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNegative_character_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNegative_character_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNegative_character_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_character_classContext negative_character_class() throws RecognitionException {
		Negative_character_classContext _localctx = new Negative_character_classContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_negative_character_class);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(CharacterClassStart);
				setState(278);
				match(Caret);
				setState(279);
				match(CharacterClassEnd);
				setState(280);
				match(Hyphen);
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281);
					character_class_intersection();
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(286);
				match(CharacterClassEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(CharacterClassStart);
				setState(289);
				match(Caret);
				setState(290);
				match(CharacterClassEnd);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(291);
					character_class_intersection();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(CharacterClassStart);
				setState(299);
				match(Caret);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					character_class_intersection();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(305);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(CharacterClassStart);
				setState(308);
				match(Caret);
				setState(309);
				match(CharacterClassEnd);
				setState(310);
				match(Hyphen);
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(311);
					cc_atom();
					}
					}
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(316);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(CharacterClassStart);
				setState(319);
				match(Caret);
				setState(320);
				match(CharacterClassEnd);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(321);
					cc_atom();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(CharacterClassStart);
				setState(329);
				match(Caret);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(330);
					cc_atom();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(CharacterClassEnd);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_class_intersectionContext extends ParserRuleContext {
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public List<TerminalNode> Ampersand() { return getTokens(PCREParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(PCREParser.Ampersand, i);
		}
		public Character_class_intersectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class_intersection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCharacter_class_intersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCharacter_class_intersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCharacter_class_intersection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_class_intersectionContext character_class_intersection() throws RecognitionException {
		Character_class_intersectionContext _localctx = new Character_class_intersectionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_character_class_intersection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(339);
					cc_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(351); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(344);
					match(Ampersand);
					setState(345);
					match(Ampersand);
					setState(347); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(346);
							cc_atom();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(349); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackreferenceContext extends ParserRuleContext {
		public Backreference_or_octalContext backreference_or_octal() {
			return getRuleContext(Backreference_or_octalContext.class,0);
		}
		public Backreference_or_indexContext backreference_or_index() {
			return getRuleContext(Backreference_or_indexContext.class,0);
		}
		public Backreference_or_nameContext backreference_or_name() {
			return getRuleContext(Backreference_or_nameContext.class,0);
		}
		public BackreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackreferenceContext backreference() throws RecognitionException {
		BackreferenceContext _localctx = new BackreferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_backreference);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				backreference_or_octal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				backreference_or_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				backreference_or_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backreference_or_indexContext extends ParserRuleContext {
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public Backreference_or_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference_or_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference_or_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference_or_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference_or_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backreference_or_indexContext backreference_or_index() throws RecognitionException {
		Backreference_or_indexContext _localctx = new Backreference_or_indexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_backreference_or_index);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(SubroutineOrNamedReferenceStartG);
				setState(361);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(SubroutineOrNamedReferenceStartG);
				setState(363);
				match(OpenBrace);
				setState(364);
				number();
				setState(365);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(SubroutineOrNamedReferenceStartG);
				setState(368);
				match(OpenBrace);
				setState(369);
				match(Hyphen);
				setState(370);
				number();
				setState(371);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backreference_or_nameContext extends ParserRuleContext {
		public TerminalNode NamedReferenceStartK() { return getToken(PCREParser.NamedReferenceStartK, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Backreference_or_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference_or_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference_or_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference_or_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference_or_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backreference_or_nameContext backreference_or_name() throws RecognitionException {
		Backreference_or_nameContext _localctx = new Backreference_or_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_backreference_or_name);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(NamedReferenceStartK);
				setState(376);
				match(LessThan);
				setState(377);
				name();
				setState(378);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(NamedReferenceStartK);
				setState(381);
				match(SingleQuote);
				setState(382);
				name();
				setState(383);
				match(SingleQuote);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(SubroutineOrNamedReferenceStartG);
				setState(386);
				match(OpenBrace);
				setState(387);
				name();
				setState(388);
				match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(NamedReferenceStartK);
				setState(391);
				match(OpenBrace);
				setState(392);
				name();
				setState(393);
				match(CloseBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				match(OpenParen);
				setState(396);
				match(QuestionMark);
				setState(397);
				match(PUC);
				setState(398);
				match(Equals);
				setState(399);
				name();
				setState(400);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backreference_or_octalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Backreference_or_octalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference_or_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference_or_octal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference_or_octal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference_or_octal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backreference_or_octalContext backreference_or_octal() throws RecognitionException {
		Backreference_or_octalContext _localctx = new Backreference_or_octalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_backreference_or_octal);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(Backslash);
				setState(406);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public Name_caturpeContext name_caturpe() {
			return getRuleContext(Name_caturpeContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_capture);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				name_caturpe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OpenParen);
				setState(411);
				alternation();
				setState(412);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_caturpeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public Name_caturpeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_caturpe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterName_caturpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitName_caturpe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitName_caturpe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_caturpeContext name_caturpe() throws RecognitionException {
		Name_caturpeContext _localctx = new Name_caturpeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name_caturpe);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(OpenParen);
				setState(417);
				match(QuestionMark);
				setState(418);
				match(LessThan);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hyphen) {
					{
					setState(419);
					match(Hyphen);
					}
				}

				setState(422);
				name();
				setState(423);
				match(GreaterThan);
				setState(424);
				alternation();
				setState(425);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(OpenParen);
				setState(428);
				match(QuestionMark);
				setState(429);
				match(SingleQuote);
				setState(430);
				name();
				setState(431);
				match(SingleQuote);
				setState(432);
				alternation();
				setState(433);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(OpenParen);
				setState(436);
				match(QuestionMark);
				setState(437);
				match(PUC);
				setState(438);
				match(LessThan);
				setState(439);
				name();
				setState(440);
				match(GreaterThan);
				setState(441);
				alternation();
				setState(442);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_captureContext extends ParserRuleContext {
		public Base_non_captureContext base_non_capture() {
			return getRuleContext(Base_non_captureContext.class,0);
		}
		public Reset_non_captureContext reset_non_capture() {
			return getRuleContext(Reset_non_captureContext.class,0);
		}
		public Atomic_non_captureContext atomic_non_capture() {
			return getRuleContext(Atomic_non_captureContext.class,0);
		}
		public Non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_capture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_capture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_captureContext non_capture() throws RecognitionException {
		Non_captureContext _localctx = new Non_captureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_non_capture);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				base_non_capture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				reset_non_capture();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				atomic_non_capture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atomic_non_captureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Atomic_non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAtomic_non_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAtomic_non_capture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAtomic_non_capture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_non_captureContext atomic_non_capture() throws RecognitionException {
		Atomic_non_captureContext _localctx = new Atomic_non_captureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomic_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(OpenParen);
			setState(452);
			match(QuestionMark);
			setState(453);
			match(GreaterThan);
			setState(454);
			alternation();
			setState(455);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reset_non_captureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Reset_non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterReset_non_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitReset_non_capture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitReset_non_capture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reset_non_captureContext reset_non_capture() throws RecognitionException {
		Reset_non_captureContext _localctx = new Reset_non_captureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reset_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(OpenParen);
			setState(458);
			match(QuestionMark);
			setState(459);
			match(Pipe);
			setState(460);
			alternation();
			setState(461);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_non_captureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Base_non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBase_non_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBase_non_capture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBase_non_capture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_non_captureContext base_non_capture() throws RecognitionException {
		Base_non_captureContext _localctx = new Base_non_captureContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_base_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(OpenParen);
			setState(464);
			match(QuestionMark);
			setState(465);
			match(Colon);
			setState(466);
			alternation();
			setState(467);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Hash() { return getToken(PCREParser.Hash, 0); }
		public Non_close_parensContext non_close_parens() {
			return getRuleContext(Non_close_parensContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OpenParen);
			setState(470);
			match(QuestionMark);
			setState(471);
			match(Hash);
			setState(472);
			non_close_parens();
			setState(473);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public List<Option_flagsContext> option_flags() {
			return getRuleContexts(Option_flagsContext.class);
		}
		public Option_flagsContext option_flags(int i) {
			return getRuleContext(Option_flagsContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public List<TerminalNode> OUC() { return getTokens(PCREParser.OUC); }
		public TerminalNode OUC(int i) {
			return getToken(PCREParser.OUC, i);
		}
		public List<TerminalNode> Underscore() { return getTokens(PCREParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(PCREParser.Underscore, i);
		}
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public List<TerminalNode> TUC() { return getTokens(PCREParser.TUC); }
		public TerminalNode TUC(int i) {
			return getToken(PCREParser.TUC, i);
		}
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode D8() { return getToken(PCREParser.D8, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_option);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(OpenParen);
				setState(476);
				match(QuestionMark);
				setState(477);
				option_flags();
				setState(478);
				match(Hyphen);
				setState(479);
				option_flags();
				setState(480);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(OpenParen);
				setState(483);
				match(QuestionMark);
				setState(484);
				option_flags();
				setState(485);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(OpenParen);
				setState(488);
				match(QuestionMark);
				setState(489);
				match(Hyphen);
				setState(490);
				option_flags();
				setState(491);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(OpenParen);
				setState(494);
				match(QuestionMark);
				setState(495);
				option_flags();
				setState(496);
				match(Colon);
				setState(497);
				alternation();
				setState(498);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				match(OpenParen);
				setState(501);
				match(QuestionMark);
				setState(502);
				match(Hyphen);
				setState(503);
				option_flags();
				setState(504);
				match(Colon);
				setState(505);
				alternation();
				setState(506);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(508);
				match(OpenParen);
				setState(509);
				match(Star);
				setState(510);
				match(NUC);
				setState(511);
				match(OUC);
				setState(512);
				match(Underscore);
				setState(513);
				match(SUC);
				setState(514);
				match(TUC);
				setState(515);
				match(AUC);
				setState(516);
				match(RUC);
				setState(517);
				match(TUC);
				setState(518);
				match(Underscore);
				setState(519);
				match(OUC);
				setState(520);
				match(PUC);
				setState(521);
				match(TUC);
				setState(522);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(523);
				match(OpenParen);
				setState(524);
				match(Star);
				setState(525);
				match(UUC);
				setState(526);
				match(TUC);
				setState(527);
				match(FUC);
				setState(528);
				match(D8);
				setState(529);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(530);
				match(OpenParen);
				setState(531);
				match(Star);
				setState(532);
				match(UUC);
				setState(533);
				match(TUC);
				setState(534);
				match(FUC);
				setState(535);
				match(D1);
				setState(536);
				match(D6);
				setState(537);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(538);
				match(OpenParen);
				setState(539);
				match(Star);
				setState(540);
				match(UUC);
				setState(541);
				match(CUC);
				setState(542);
				match(PUC);
				setState(543);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_flagsContext extends ParserRuleContext {
		public List<Option_flagContext> option_flag() {
			return getRuleContexts(Option_flagContext.class);
		}
		public Option_flagContext option_flag(int i) {
			return getRuleContext(Option_flagContext.class,i);
		}
		public Option_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption_flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption_flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagsContext option_flags() throws RecognitionException {
		Option_flagsContext _localctx = new Option_flagsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(546);
				option_flag();
				}
				}
				setState(549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (NLC - 83)) | (1L << (SLC - 83)) | (1L << (ULC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_flagContext extends ParserRuleContext {
		public TerminalNode ILC() { return getToken(PCREParser.ILC, 0); }
		public TerminalNode JUC() { return getToken(PCREParser.JUC, 0); }
		public TerminalNode MLC() { return getToken(PCREParser.MLC, 0); }
		public TerminalNode SLC() { return getToken(PCREParser.SLC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode XLC() { return getToken(PCREParser.XLC, 0); }
		public TerminalNode ULC() { return getToken(PCREParser.ULC, 0); }
		public TerminalNode NLC() { return getToken(PCREParser.NLC, 0); }
		public Option_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagContext option_flag() throws RecognitionException {
		Option_flagContext _localctx = new Option_flagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (NLC - 83)) | (1L << (SLC - 83)) | (1L << (ULC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_option_flagsContext extends ParserRuleContext {
		public List<Global_option_flagContext> global_option_flag() {
			return getRuleContexts(Global_option_flagContext.class);
		}
		public Global_option_flagContext global_option_flag(int i) {
			return getRuleContext(Global_option_flagContext.class,i);
		}
		public Global_option_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_option_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterGlobal_option_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitGlobal_option_flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitGlobal_option_flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_option_flagsContext global_option_flags() throws RecognitionException {
		Global_option_flagsContext _localctx = new Global_option_flagsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_global_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(553);
				global_option_flag();
				}
				}
				setState(556); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (SLC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_option_flagContext extends ParserRuleContext {
		public TerminalNode ILC() { return getToken(PCREParser.ILC, 0); }
		public TerminalNode JUC() { return getToken(PCREParser.JUC, 0); }
		public TerminalNode MLC() { return getToken(PCREParser.MLC, 0); }
		public TerminalNode SLC() { return getToken(PCREParser.SLC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode XLC() { return getToken(PCREParser.XLC, 0); }
		public Global_option_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_option_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterGlobal_option_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitGlobal_option_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitGlobal_option_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_option_flagContext global_option_flag() throws RecognitionException {
		Global_option_flagContext _localctx = new Global_option_flagContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_global_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (SLC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_aroundContext extends ParserRuleContext {
		public Look_ahead_positiveContext look_ahead_positive() {
			return getRuleContext(Look_ahead_positiveContext.class,0);
		}
		public Look_ahead_negativeContext look_ahead_negative() {
			return getRuleContext(Look_ahead_negativeContext.class,0);
		}
		public Look_behind_positiveContext look_behind_positive() {
			return getRuleContext(Look_behind_positiveContext.class,0);
		}
		public Look_behind_negativeContext look_behind_negative() {
			return getRuleContext(Look_behind_negativeContext.class,0);
		}
		public Look_aroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_around; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLook_around(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLook_around(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLook_around(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_aroundContext look_around() throws RecognitionException {
		Look_aroundContext _localctx = new Look_aroundContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_look_around);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				look_ahead_positive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				look_ahead_negative();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				look_behind_positive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				look_behind_negative();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_ahead_positiveContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Look_ahead_positiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_ahead_positive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLook_ahead_positive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLook_ahead_positive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLook_ahead_positive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_ahead_positiveContext look_ahead_positive() throws RecognitionException {
		Look_ahead_positiveContext _localctx = new Look_ahead_positiveContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_look_ahead_positive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(OpenParen);
			setState(567);
			match(QuestionMark);
			setState(568);
			match(Equals);
			setState(569);
			alternation();
			setState(570);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_ahead_negativeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Look_ahead_negativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_ahead_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLook_ahead_negative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLook_ahead_negative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLook_ahead_negative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_ahead_negativeContext look_ahead_negative() throws RecognitionException {
		Look_ahead_negativeContext _localctx = new Look_ahead_negativeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_look_ahead_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(OpenParen);
			setState(573);
			match(QuestionMark);
			setState(574);
			match(Exclamation);
			setState(575);
			alternation();
			setState(576);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_behind_positiveContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Look_behind_positiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_behind_positive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLook_behind_positive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLook_behind_positive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLook_behind_positive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_behind_positiveContext look_behind_positive() throws RecognitionException {
		Look_behind_positiveContext _localctx = new Look_behind_positiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_look_behind_positive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(OpenParen);
			setState(579);
			match(QuestionMark);
			setState(580);
			match(LessThan);
			setState(581);
			match(Equals);
			setState(582);
			alternation();
			setState(583);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_behind_negativeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Look_behind_negativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_behind_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLook_behind_negative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLook_behind_negative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLook_behind_negative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_behind_negativeContext look_behind_negative() throws RecognitionException {
		Look_behind_negativeContext _localctx = new Look_behind_negativeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_look_behind_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(OpenParen);
			setState(586);
			match(QuestionMark);
			setState(587);
			match(LessThan);
			setState(588);
			match(Exclamation);
			setState(589);
			alternation();
			setState(590);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_codeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public List<TerminalNode> QuestionMark() { return getTokens(PCREParser.QuestionMark); }
		public TerminalNode QuestionMark(int i) {
			return getToken(PCREParser.QuestionMark, i);
		}
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Embedded_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterEmbedded_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitEmbedded_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitEmbedded_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_codeContext embedded_code() throws RecognitionException {
		Embedded_codeContext _localctx = new Embedded_codeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_embedded_code);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(OpenParen);
				setState(593);
				match(QuestionMark);
				setState(594);
				match(QuestionMark);
				setState(595);
				match(OpenBrace);
				setState(596);
				alternation();
				setState(597);
				match(CloseBrace);
				setState(598);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(OpenParen);
				setState(601);
				match(QuestionMark);
				setState(602);
				match(OpenBrace);
				setState(603);
				alternation();
				setState(604);
				match(CloseBrace);
				setState(605);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_groupContext extends ParserRuleContext {
		public List<TerminalNode> OpenParen() { return getTokens(PCREParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(PCREParser.OpenParen, i);
		}
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public List<TerminalNode> EUC() { return getTokens(PCREParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(PCREParser.EUC, i);
		}
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public List<TerminalNode> CloseParen() { return getTokens(PCREParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(PCREParser.CloseParen, i);
		}
		public Name_caturpeContext name_caturpe() {
			return getRuleContext(Name_caturpeContext.class,0);
		}
		public Define_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterDefine_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitDefine_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitDefine_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_groupContext define_group() throws RecognitionException {
		Define_groupContext _localctx = new Define_groupContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_define_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(OpenParen);
			setState(610);
			match(QuestionMark);
			setState(611);
			match(OpenParen);
			setState(612);
			match(DUC);
			setState(613);
			match(EUC);
			setState(614);
			match(FUC);
			setState(615);
			match(IUC);
			setState(616);
			match(NUC);
			setState(617);
			match(EUC);
			setState(618);
			match(CloseParen);
			setState(619);
			name_caturpe();
			setState(620);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subroutine_referenceContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public Subroutine_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterSubroutine_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitSubroutine_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitSubroutine_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_referenceContext subroutine_reference() throws RecognitionException {
		Subroutine_referenceContext _localctx = new Subroutine_referenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subroutine_reference);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(OpenParen);
				setState(623);
				match(QuestionMark);
				setState(624);
				match(RUC);
				setState(625);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(OpenParen);
				setState(627);
				match(QuestionMark);
				setState(628);
				number();
				setState(629);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(OpenParen);
				setState(632);
				match(QuestionMark);
				setState(633);
				match(Plus);
				setState(634);
				number();
				setState(635);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(OpenParen);
				setState(638);
				match(QuestionMark);
				setState(639);
				match(Hyphen);
				setState(640);
				number();
				setState(641);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				match(OpenParen);
				setState(644);
				match(QuestionMark);
				setState(645);
				match(Ampersand);
				setState(646);
				name();
				setState(647);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(649);
				match(OpenParen);
				setState(650);
				match(QuestionMark);
				setState(651);
				match(PUC);
				setState(652);
				match(GreaterThan);
				setState(653);
				name();
				setState(654);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(656);
				match(SubroutineOrNamedReferenceStartG);
				setState(657);
				match(LessThan);
				setState(658);
				name();
				setState(659);
				match(GreaterThan);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(661);
				match(SubroutineOrNamedReferenceStartG);
				setState(662);
				match(SingleQuote);
				setState(663);
				name();
				setState(664);
				match(SingleQuote);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(666);
				match(SubroutineOrNamedReferenceStartG);
				setState(667);
				match(LessThan);
				setState(668);
				number();
				setState(669);
				match(GreaterThan);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(671);
				match(SubroutineOrNamedReferenceStartG);
				setState(672);
				match(SingleQuote);
				setState(673);
				number();
				setState(674);
				match(SingleQuote);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(676);
				match(SubroutineOrNamedReferenceStartG);
				setState(677);
				match(LessThan);
				setState(678);
				match(Plus);
				setState(679);
				number();
				setState(680);
				match(GreaterThan);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(682);
				match(SubroutineOrNamedReferenceStartG);
				setState(683);
				match(SingleQuote);
				setState(684);
				match(Plus);
				setState(685);
				number();
				setState(686);
				match(SingleQuote);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(688);
				match(SubroutineOrNamedReferenceStartG);
				setState(689);
				match(LessThan);
				setState(690);
				match(Hyphen);
				setState(691);
				number();
				setState(692);
				match(GreaterThan);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(694);
				match(SubroutineOrNamedReferenceStartG);
				setState(695);
				match(SingleQuote);
				setState(696);
				match(Hyphen);
				setState(697);
				number();
				setState(698);
				match(SingleQuote);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public List<TerminalNode> OpenParen() { return getTokens(PCREParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(PCREParser.OpenParen, i);
		}
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> CloseParen() { return getTokens(PCREParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(PCREParser.CloseParen, i);
		}
		public List<AlternationContext> alternation() {
			return getRuleContexts(AlternationContext.class);
		}
		public AlternationContext alternation(int i) {
			return getRuleContext(AlternationContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public List<TerminalNode> EUC() { return getTokens(PCREParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(PCREParser.EUC, i);
		}
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode ALC() { return getToken(PCREParser.ALC, 0); }
		public List<TerminalNode> SLC() { return getTokens(PCREParser.SLC); }
		public TerminalNode SLC(int i) {
			return getToken(PCREParser.SLC, i);
		}
		public TerminalNode ELC() { return getToken(PCREParser.ELC, 0); }
		public TerminalNode RLC() { return getToken(PCREParser.RLC, 0); }
		public TerminalNode TLC() { return getToken(PCREParser.TLC, 0); }
		public Look_aroundContext look_around() {
			return getRuleContext(Look_aroundContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional);
		int _la;
		try {
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(OpenParen);
				setState(703);
				match(QuestionMark);
				setState(704);
				match(OpenParen);
				setState(705);
				number();
				setState(706);
				match(CloseParen);
				setState(707);
				alternation();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(708);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(709);
					alternation();
					}
				}

				setState(712);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(OpenParen);
				setState(715);
				match(QuestionMark);
				setState(716);
				match(LessThan);
				setState(717);
				number();
				setState(718);
				match(GreaterThan);
				setState(719);
				alternation();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(720);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(721);
					alternation();
					}
				}

				setState(724);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(OpenParen);
				setState(727);
				match(QuestionMark);
				setState(728);
				match(OpenParen);
				setState(729);
				match(Plus);
				setState(730);
				number();
				setState(731);
				match(CloseParen);
				setState(732);
				alternation();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(733);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(734);
					alternation();
					}
				}

				setState(737);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(OpenParen);
				setState(740);
				match(QuestionMark);
				setState(741);
				match(OpenParen);
				setState(742);
				match(Hyphen);
				setState(743);
				number();
				setState(744);
				match(CloseParen);
				setState(745);
				alternation();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(746);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(747);
					alternation();
					}
				}

				setState(750);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				match(OpenParen);
				setState(753);
				match(QuestionMark);
				setState(754);
				match(OpenParen);
				setState(755);
				match(LessThan);
				setState(756);
				name();
				setState(757);
				match(GreaterThan);
				setState(758);
				match(CloseParen);
				setState(759);
				alternation();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(761);
					alternation();
					}
				}

				setState(764);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				match(OpenParen);
				setState(767);
				match(QuestionMark);
				setState(768);
				match(OpenParen);
				setState(769);
				match(SingleQuote);
				setState(770);
				name();
				setState(771);
				match(SingleQuote);
				setState(772);
				match(CloseParen);
				setState(773);
				alternation();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(774);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(775);
					alternation();
					}
				}

				setState(778);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(780);
				match(OpenParen);
				setState(781);
				match(QuestionMark);
				setState(782);
				match(OpenParen);
				setState(783);
				match(RUC);
				setState(784);
				number();
				setState(785);
				match(CloseParen);
				setState(786);
				alternation();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(787);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(788);
					alternation();
					}
				}

				setState(791);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(793);
				match(OpenParen);
				setState(794);
				match(QuestionMark);
				setState(795);
				match(OpenParen);
				setState(796);
				match(RUC);
				setState(797);
				match(CloseParen);
				setState(798);
				alternation();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(799);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(800);
					alternation();
					}
				}

				setState(803);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(805);
				match(OpenParen);
				setState(806);
				match(QuestionMark);
				setState(807);
				match(OpenParen);
				setState(808);
				match(RUC);
				setState(809);
				match(Ampersand);
				setState(810);
				name();
				setState(811);
				match(CloseParen);
				setState(812);
				alternation();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(813);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(814);
					alternation();
					}
				}

				setState(817);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(819);
				match(OpenParen);
				setState(820);
				match(QuestionMark);
				setState(821);
				match(OpenParen);
				setState(822);
				match(DUC);
				setState(823);
				match(EUC);
				setState(824);
				match(FUC);
				setState(825);
				match(IUC);
				setState(826);
				match(NUC);
				setState(827);
				match(EUC);
				setState(828);
				match(CloseParen);
				setState(829);
				alternation();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(831);
					alternation();
					}
				}

				setState(834);
				match(CloseParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(836);
				match(OpenParen);
				setState(837);
				match(QuestionMark);
				setState(838);
				match(OpenParen);
				setState(839);
				match(ALC);
				setState(840);
				match(SLC);
				setState(841);
				match(SLC);
				setState(842);
				match(ELC);
				setState(843);
				match(RLC);
				setState(844);
				match(TLC);
				setState(845);
				match(CloseParen);
				setState(846);
				alternation();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(847);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(848);
					alternation();
					}
				}

				setState(851);
				match(CloseParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(853);
				match(OpenParen);
				setState(854);
				match(QuestionMark);
				setState(855);
				match(OpenParen);
				setState(856);
				name();
				setState(857);
				match(CloseParen);
				setState(858);
				alternation();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(859);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(860);
					alternation();
					}
				}

				setState(863);
				match(CloseParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(865);
				match(OpenParen);
				setState(866);
				match(QuestionMark);
				setState(867);
				look_around();
				setState(868);
				alternation();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(869);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(870);
					alternation();
					}
				}

				setState(873);
				match(CloseParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(875);
				match(OpenParen);
				setState(876);
				match(QuestionMark);
				setState(877);
				match(OpenParen);
				setState(878);
				alternation();
				setState(879);
				match(CloseParen);
				setState(880);
				alternation();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(881);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(882);
					alternation();
					}
				}

				setState(885);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backtrack_controlContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public List<TerminalNode> AUC() { return getTokens(PCREParser.AUC); }
		public TerminalNode AUC(int i) {
			return getToken(PCREParser.AUC, i);
		}
		public List<TerminalNode> CUC() { return getTokens(PCREParser.CUC); }
		public TerminalNode CUC(int i) {
			return getToken(PCREParser.CUC, i);
		}
		public List<TerminalNode> EUC() { return getTokens(PCREParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(PCREParser.EUC, i);
		}
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode TUC() { return getToken(PCREParser.TUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public List<TerminalNode> NUC() { return getTokens(PCREParser.NUC); }
		public TerminalNode NUC(int i) {
			return getToken(PCREParser.NUC, i);
		}
		public List<TerminalNode> MUC() { return getTokens(PCREParser.MUC); }
		public TerminalNode MUC(int i) {
			return getToken(PCREParser.MUC, i);
		}
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode KUC() { return getToken(PCREParser.KUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode HUC() { return getToken(PCREParser.HUC, 0); }
		public Backtrack_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtrack_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBacktrack_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBacktrack_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBacktrack_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backtrack_controlContext backtrack_control() throws RecognitionException {
		Backtrack_controlContext _localctx = new Backtrack_controlContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_backtrack_control);
		int _la;
		try {
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(OpenParen);
				setState(890);
				match(Star);
				setState(891);
				match(AUC);
				setState(892);
				match(CUC);
				setState(893);
				match(CUC);
				setState(894);
				match(EUC);
				setState(895);
				match(PUC);
				setState(896);
				match(TUC);
				setState(897);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(OpenParen);
				setState(899);
				match(Star);
				setState(900);
				match(FUC);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUC) {
					{
					setState(901);
					match(AUC);
					setState(902);
					match(IUC);
					setState(903);
					match(LUC);
					}
				}

				setState(906);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				match(OpenParen);
				setState(908);
				match(Star);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUC) {
					{
					setState(909);
					match(MUC);
					setState(910);
					match(AUC);
					setState(911);
					match(RUC);
					setState(912);
					match(KUC);
					}
				}

				setState(915);
				match(Colon);
				setState(916);
				match(NUC);
				setState(917);
				match(AUC);
				setState(918);
				match(MUC);
				setState(919);
				match(EUC);
				setState(920);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(921);
				match(OpenParen);
				setState(922);
				match(Star);
				setState(923);
				match(CUC);
				setState(924);
				match(OUC);
				setState(925);
				match(MUC);
				setState(926);
				match(MUC);
				setState(927);
				match(IUC);
				setState(928);
				match(TUC);
				setState(929);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(930);
				match(OpenParen);
				setState(931);
				match(Star);
				setState(932);
				match(PUC);
				setState(933);
				match(RUC);
				setState(934);
				match(UUC);
				setState(935);
				match(NUC);
				setState(936);
				match(EUC);
				setState(937);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(938);
				match(OpenParen);
				setState(939);
				match(Star);
				setState(940);
				match(PUC);
				setState(941);
				match(RUC);
				setState(942);
				match(UUC);
				setState(943);
				match(NUC);
				setState(944);
				match(EUC);
				setState(945);
				match(Colon);
				setState(946);
				match(NUC);
				setState(947);
				match(AUC);
				setState(948);
				match(MUC);
				setState(949);
				match(EUC);
				setState(950);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(951);
				match(OpenParen);
				setState(952);
				match(Star);
				setState(953);
				match(SUC);
				setState(954);
				match(KUC);
				setState(955);
				match(IUC);
				setState(956);
				match(PUC);
				setState(957);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(958);
				match(OpenParen);
				setState(959);
				match(Star);
				setState(960);
				match(SUC);
				setState(961);
				match(KUC);
				setState(962);
				match(IUC);
				setState(963);
				match(PUC);
				setState(964);
				match(Colon);
				setState(965);
				match(NUC);
				setState(966);
				match(AUC);
				setState(967);
				match(MUC);
				setState(968);
				match(EUC);
				setState(969);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(970);
				match(OpenParen);
				setState(971);
				match(Star);
				setState(972);
				match(TUC);
				setState(973);
				match(HUC);
				setState(974);
				match(EUC);
				setState(975);
				match(NUC);
				setState(976);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(977);
				match(OpenParen);
				setState(978);
				match(Star);
				setState(979);
				match(TUC);
				setState(980);
				match(HUC);
				setState(981);
				match(EUC);
				setState(982);
				match(NUC);
				setState(983);
				match(Colon);
				setState(984);
				match(NUC);
				setState(985);
				match(AUC);
				setState(986);
				match(MUC);
				setState(987);
				match(EUC);
				setState(988);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Newline_conventionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public List<TerminalNode> RUC() { return getTokens(PCREParser.RUC); }
		public TerminalNode RUC(int i) {
			return getToken(PCREParser.RUC, i);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode YUC() { return getToken(PCREParser.YUC, 0); }
		public TerminalNode BUC() { return getToken(PCREParser.BUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode Underscore() { return getToken(PCREParser.Underscore, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public TerminalNode EUC() { return getToken(PCREParser.EUC, 0); }
		public Newline_conventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline_convention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNewline_convention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNewline_convention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNewline_convention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newline_conventionContext newline_convention() throws RecognitionException {
		Newline_conventionContext _localctx = new Newline_conventionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_newline_convention);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(OpenParen);
				setState(992);
				match(Star);
				setState(993);
				match(CUC);
				setState(994);
				match(RUC);
				setState(995);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				match(OpenParen);
				setState(997);
				match(Star);
				setState(998);
				match(LUC);
				setState(999);
				match(FUC);
				setState(1000);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(OpenParen);
				setState(1002);
				match(Star);
				setState(1003);
				match(CUC);
				setState(1004);
				match(RUC);
				setState(1005);
				match(LUC);
				setState(1006);
				match(FUC);
				setState(1007);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(OpenParen);
				setState(1009);
				match(Star);
				setState(1010);
				match(AUC);
				setState(1011);
				match(NUC);
				setState(1012);
				match(YUC);
				setState(1013);
				match(CUC);
				setState(1014);
				match(RUC);
				setState(1015);
				match(LUC);
				setState(1016);
				match(FUC);
				setState(1017);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				match(OpenParen);
				setState(1019);
				match(Star);
				setState(1020);
				match(AUC);
				setState(1021);
				match(NUC);
				setState(1022);
				match(YUC);
				setState(1023);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1024);
				match(OpenParen);
				setState(1025);
				match(Star);
				setState(1026);
				match(BUC);
				setState(1027);
				match(SUC);
				setState(1028);
				match(RUC);
				setState(1029);
				match(Underscore);
				setState(1030);
				match(AUC);
				setState(1031);
				match(NUC);
				setState(1032);
				match(YUC);
				setState(1033);
				match(CUC);
				setState(1034);
				match(RUC);
				setState(1035);
				match(LUC);
				setState(1036);
				match(FUC);
				setState(1037);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1038);
				match(OpenParen);
				setState(1039);
				match(Star);
				setState(1040);
				match(BUC);
				setState(1041);
				match(SUC);
				setState(1042);
				match(RUC);
				setState(1043);
				match(Underscore);
				setState(1044);
				match(UUC);
				setState(1045);
				match(NUC);
				setState(1046);
				match(IUC);
				setState(1047);
				match(CUC);
				setState(1048);
				match(OUC);
				setState(1049);
				match(DUC);
				setState(1050);
				match(EUC);
				setState(1051);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalloutContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CalloutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCallout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCallout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCallout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalloutContext callout() throws RecognitionException {
		CalloutContext _localctx = new CalloutContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callout);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(OpenParen);
				setState(1055);
				match(QuestionMark);
				setState(1056);
				match(CUC);
				setState(1057);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(OpenParen);
				setState(1059);
				match(QuestionMark);
				setState(1060);
				match(CUC);
				setState(1061);
				number();
				setState(1062);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Subroutine_referenceContext subroutine_reference() {
			return getRuleContext(Subroutine_referenceContext.class,0);
		}
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Non_captureContext non_capture() {
			return getRuleContext(Non_captureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public Look_aroundContext look_around() {
			return getRuleContext(Look_aroundContext.class,0);
		}
		public BackreferenceContext backreference() {
			return getRuleContext(BackreferenceContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Define_groupContext define_group() {
			return getRuleContext(Define_groupContext.class,0);
		}
		public Embedded_codeContext embedded_code() {
			return getRuleContext(Embedded_codeContext.class,0);
		}
		public Backtrack_controlContext backtrack_control() {
			return getRuleContext(Backtrack_controlContext.class,0);
		}
		public Newline_conventionContext newline_convention() {
			return getRuleContext(Newline_conventionContext.class,0);
		}
		public CalloutContext callout() {
			return getRuleContext(CalloutContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PCREParser.Dot, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public TerminalNode StartOfSubject() { return getToken(PCREParser.StartOfSubject, 0); }
		public TerminalNode WordBoundary() { return getToken(PCREParser.WordBoundary, 0); }
		public TerminalNode NonWordBoundary() { return getToken(PCREParser.NonWordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(PCREParser.EndOfSubjectOrLine, 0); }
		public TerminalNode EndOfSubjectOrLineEndOfSubject() { return getToken(PCREParser.EndOfSubjectOrLineEndOfSubject, 0); }
		public TerminalNode EndOfSubject() { return getToken(PCREParser.EndOfSubject, 0); }
		public TerminalNode PreviousMatchInSubject() { return getToken(PCREParser.PreviousMatchInSubject, 0); }
		public TerminalNode ResetStartMatch() { return getToken(PCREParser.ResetStartMatch, 0); }
		public TerminalNode OneDataUnit() { return getToken(PCREParser.OneDataUnit, 0); }
		public TerminalNode ExtendedUnicodeChar() { return getToken(PCREParser.ExtendedUnicodeChar, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atom);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				subroutine_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				shared_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1068);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1069);
				character_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1070);
				capture();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1071);
				non_capture();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1072);
				comment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1073);
				option();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1074);
				look_around();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				backreference();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1076);
				conditional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1077);
				define_group();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1078);
				embedded_code();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1079);
				backtrack_control();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1080);
				newline_convention();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1081);
				callout();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1082);
				match(Dot);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1083);
				match(Caret);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1084);
				match(StartOfSubject);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1085);
				match(WordBoundary);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1086);
				match(NonWordBoundary);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1087);
				match(EndOfSubjectOrLine);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1088);
				match(EndOfSubjectOrLineEndOfSubject);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1089);
				match(EndOfSubject);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1090);
				match(PreviousMatchInSubject);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1091);
				match(ResetStartMatch);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1092);
				match(OneDataUnit);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1093);
				match(ExtendedUnicodeChar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_atomContext extends ParserRuleContext {
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public List<Cc_literalContext> cc_literal() {
			return getRuleContexts(Cc_literalContext.class);
		}
		public Cc_literalContext cc_literal(int i) {
			return getRuleContext(Cc_literalContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public Backreference_or_octalContext backreference_or_octal() {
			return getRuleContext(Backreference_or_octalContext.class,0);
		}
		public Cc_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_atomContext cc_atom() throws RecognitionException {
		Cc_atomContext _localctx = new Cc_atomContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cc_atom);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				character_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				cc_literal();
				setState(1098);
				match(Hyphen);
				setState(1099);
				cc_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				shared_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
				cc_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1103);
				backreference_or_octal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_atomContext extends ParserRuleContext {
		public TerminalNode POSIXNamedSet() { return getToken(PCREParser.POSIXNamedSet, 0); }
		public TerminalNode POSIXNegatedNamedSet() { return getToken(PCREParser.POSIXNegatedNamedSet, 0); }
		public TerminalNode ControlChar() { return getToken(PCREParser.ControlChar, 0); }
		public TerminalNode DecimalDigit() { return getToken(PCREParser.DecimalDigit, 0); }
		public TerminalNode NotDecimalDigit() { return getToken(PCREParser.NotDecimalDigit, 0); }
		public TerminalNode HorizontalWhiteSpace() { return getToken(PCREParser.HorizontalWhiteSpace, 0); }
		public TerminalNode NotHorizontalWhiteSpace() { return getToken(PCREParser.NotHorizontalWhiteSpace, 0); }
		public TerminalNode NotNewLine() { return getToken(PCREParser.NotNewLine, 0); }
		public TerminalNode CharWithProperty() { return getToken(PCREParser.CharWithProperty, 0); }
		public TerminalNode SingleCharWithProperty() { return getToken(PCREParser.SingleCharWithProperty, 0); }
		public TerminalNode CharWithoutProperty() { return getToken(PCREParser.CharWithoutProperty, 0); }
		public TerminalNode SingleCharWithoutProperty() { return getToken(PCREParser.SingleCharWithoutProperty, 0); }
		public TerminalNode NewLineSequence() { return getToken(PCREParser.NewLineSequence, 0); }
		public TerminalNode WhiteSpace() { return getToken(PCREParser.WhiteSpace, 0); }
		public TerminalNode NotWhiteSpace() { return getToken(PCREParser.NotWhiteSpace, 0); }
		public TerminalNode VerticalWhiteSpace() { return getToken(PCREParser.VerticalWhiteSpace, 0); }
		public TerminalNode NotVerticalWhiteSpace() { return getToken(PCREParser.NotVerticalWhiteSpace, 0); }
		public TerminalNode WordChar() { return getToken(PCREParser.WordChar, 0); }
		public TerminalNode NotWordChar() { return getToken(PCREParser.NotWordChar, 0); }
		public Shared_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterShared_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitShared_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitShared_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_atomContext shared_atom() throws RecognitionException {
		Shared_atomContext _localctx = new Shared_atomContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_shared_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ControlChar) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode CharacterClassEnd() { return getToken(PCREParser.CharacterClassEnd, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Quoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case Slash:
			case Semicolon:
			case Mail:
			case Percent:
			case Wave:
			case DoubleQuote:
			case Backquote:
			case BackSlashq:
			case BackSlashe:
			case BackSlashu:
			case BackSlashx:
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				shared_literal();
				}
				break;
			case CharacterClassEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(CharacterClassEnd);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_literalContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PCREParser.Dot, 0); }
		public TerminalNode CharacterClassStart() { return getToken(PCREParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode WordBoundary() { return getToken(PCREParser.WordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(PCREParser.EndOfSubjectOrLine, 0); }
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Cc_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_literalContext cc_literal() throws RecognitionException {
		Cc_literalContext _localctx = new Cc_literalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cc_literal);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Quoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case Slash:
			case Semicolon:
			case Mail:
			case Percent:
			case Wave:
			case DoubleQuote:
			case Backquote:
			case BackSlashq:
			case BackSlashe:
			case BackSlashu:
			case BackSlashx:
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				shared_literal();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				match(Dot);
				}
				break;
			case CharacterClassStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				match(CharacterClassStart);
				}
				break;
			case Caret:
				enterOuterAlt(_localctx, 4);
				{
				setState(1115);
				match(Caret);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 5);
				{
				setState(1116);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 6);
				{
				setState(1117);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 7);
				{
				setState(1118);
				match(Star);
				}
				break;
			case WordBoundary:
				enterOuterAlt(_localctx, 8);
				{
				setState(1119);
				match(WordBoundary);
				}
				break;
			case EndOfSubjectOrLine:
				enterOuterAlt(_localctx, 9);
				{
				setState(1120);
				match(EndOfSubjectOrLine);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 10);
				{
				setState(1121);
				match(Pipe);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 11);
				{
				setState(1122);
				match(OpenParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 12);
				{
				setState(1123);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_literalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public Hex_charContext hex_char() {
			return getRuleContext(Hex_charContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Block_quotedContext block_quoted() {
			return getRuleContext(Block_quotedContext.class,0);
		}
		public TerminalNode BellChar() { return getToken(PCREParser.BellChar, 0); }
		public TerminalNode EscapeChar() { return getToken(PCREParser.EscapeChar, 0); }
		public TerminalNode FormFeed() { return getToken(PCREParser.FormFeed, 0); }
		public TerminalNode NewLine() { return getToken(PCREParser.NewLine, 0); }
		public TerminalNode CarriageReturn() { return getToken(PCREParser.CarriageReturn, 0); }
		public TerminalNode Tab() { return getToken(PCREParser.Tab, 0); }
		public TerminalNode Quoted() { return getToken(PCREParser.Quoted, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(PCREParser.Comma, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public TerminalNode SingleQuote() { return getToken(PCREParser.SingleQuote, 0); }
		public TerminalNode Underscore() { return getToken(PCREParser.Underscore, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public TerminalNode Hash() { return getToken(PCREParser.Hash, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public TerminalNode OtherChar() { return getToken(PCREParser.OtherChar, 0); }
		public TerminalNode Slash() { return getToken(PCREParser.Slash, 0); }
		public TerminalNode Semicolon() { return getToken(PCREParser.Semicolon, 0); }
		public TerminalNode Mail() { return getToken(PCREParser.Mail, 0); }
		public TerminalNode Percent() { return getToken(PCREParser.Percent, 0); }
		public TerminalNode Wave() { return getToken(PCREParser.Wave, 0); }
		public TerminalNode DoubleQuote() { return getToken(PCREParser.DoubleQuote, 0); }
		public TerminalNode Backquote() { return getToken(PCREParser.Backquote, 0); }
		public TerminalNode BackSlashq() { return getToken(PCREParser.BackSlashq, 0); }
		public TerminalNode BackSlashe() { return getToken(PCREParser.BackSlashe, 0); }
		public TerminalNode BackSlashu() { return getToken(PCREParser.BackSlashu, 0); }
		public TerminalNode BackSlashx() { return getToken(PCREParser.BackSlashx, 0); }
		public Shared_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterShared_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitShared_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitShared_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_literalContext shared_literal() throws RecognitionException {
		Shared_literalContext _localctx = new Shared_literalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_shared_literal);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				hex_char();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				letter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				digit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				block_quoted();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131);
				match(BellChar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1132);
				match(EscapeChar);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1133);
				match(FormFeed);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1134);
				match(NewLine);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1135);
				match(CarriageReturn);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1136);
				match(Tab);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1137);
				match(Quoted);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1138);
				match(OpenBrace);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1139);
				match(CloseBrace);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1140);
				match(Comma);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1141);
				match(Hyphen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1142);
				match(LessThan);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1143);
				match(GreaterThan);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1144);
				match(SingleQuote);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1145);
				match(Underscore);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1146);
				match(Colon);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1147);
				match(Hash);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1148);
				match(Equals);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1149);
				match(Exclamation);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1150);
				match(Ampersand);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1151);
				match(OtherChar);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1152);
				match(Slash);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1153);
				match(Semicolon);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1154);
				match(Mail);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1155);
				match(Percent);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1156);
				match(Wave);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1157);
				match(DoubleQuote);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1158);
				match(Backquote);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1159);
				match(BackSlashq);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1160);
				match(BackSlashe);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1161);
				match(BackSlashu);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1162);
				match(BackSlashx);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			digits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_charContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public List<Octal_digitContext> octal_digit() {
			return getRuleContexts(Octal_digitContext.class);
		}
		public Octal_digitContext octal_digit(int i) {
			return getRuleContext(Octal_digitContext.class,i);
		}
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public Octal_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOctal_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOctal_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOctal_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_charContext octal_char() throws RecognitionException {
		Octal_charContext _localctx = new Octal_charContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_octal_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1167);
				match(Backslash);
				setState(1168);
				_la = _input.LA(1);
				if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (D1 - 127)) | (1L << (D2 - 127)) | (1L << (D3 - 127)) | (1L << (D0 - 127)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1169);
				octal_digit();
				setState(1170);
				octal_digit();
				}
				break;
			case 2:
				{
				setState(1172);
				match(Backslash);
				setState(1173);
				octal_digit();
				setState(1174);
				octal_digit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_charContext extends ParserRuleContext {
		public TerminalNode BackSlashx() { return getToken(PCREParser.BackSlashx, 0); }
		public List<Hex_digitContext> hex_digit() {
			return getRuleContexts(Hex_digitContext.class);
		}
		public Hex_digitContext hex_digit(int i) {
			return getRuleContext(Hex_digitContext.class,i);
		}
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode BackSlashu() { return getToken(PCREParser.BackSlashu, 0); }
		public Hex_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterHex_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitHex_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitHex_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_charContext hex_char() throws RecognitionException {
		Hex_charContext _localctx = new Hex_charContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hex_char);
		int _la;
		try {
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(BackSlashx);
				setState(1193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALC:
				case BLC:
				case CLC:
				case DLC:
				case ELC:
				case FLC:
				case AUC:
				case BUC:
				case CUC:
				case DUC:
				case EUC:
				case FUC:
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(1179);
					hex_digit();
					setState(1180);
					hex_digit();
					}
					break;
				case OpenBrace:
					{
					setState(1182);
					match(OpenBrace);
					setState(1183);
					hex_digit();
					setState(1184);
					hex_digit();
					setState(1188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (D1 - 75)) | (1L << (D2 - 75)) | (1L << (D3 - 75)) | (1L << (D4 - 75)) | (1L << (D5 - 75)) | (1L << (D6 - 75)) | (1L << (D7 - 75)) | (1L << (D8 - 75)) | (1L << (D9 - 75)) | (1L << (D0 - 75)))) != 0)) {
						{
						{
						setState(1185);
						hex_digit();
						}
						}
						setState(1190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1191);
					match(CloseBrace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==BackSlashu) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1196);
				hex_digit();
				setState(1197);
				hex_digit();
				setState(1198);
				hex_digit();
				setState(1199);
				hex_digit();
				setState(1200);
				hex_digit();
				setState(1201);
				hex_digit();
				setState(1202);
				hex_digit();
				setState(1203);
				hex_digit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==BackSlashu) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1206);
				hex_digit();
				setState(1207);
				hex_digit();
				setState(1208);
				hex_digit();
				setState(1209);
				hex_digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_digitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public TerminalNode D4() { return getToken(PCREParser.D4, 0); }
		public TerminalNode D5() { return getToken(PCREParser.D5, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode D7() { return getToken(PCREParser.D7, 0); }
		public Octal_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOctal_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOctal_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOctal_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_digitContext octal_digit() throws RecognitionException {
		Octal_digitContext _localctx = new Octal_digitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_octal_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (D1 - 127)) | (1L << (D2 - 127)) | (1L << (D3 - 127)) | (1L << (D4 - 127)) | (1L << (D5 - 127)) | (1L << (D6 - 127)) | (1L << (D7 - 127)) | (1L << (D0 - 127)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_digitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public TerminalNode D4() { return getToken(PCREParser.D4, 0); }
		public TerminalNode D5() { return getToken(PCREParser.D5, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode D7() { return getToken(PCREParser.D7, 0); }
		public TerminalNode D8() { return getToken(PCREParser.D8, 0); }
		public TerminalNode D9() { return getToken(PCREParser.D9, 0); }
		public TerminalNode ALC() { return getToken(PCREParser.ALC, 0); }
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode BLC() { return getToken(PCREParser.BLC, 0); }
		public TerminalNode BUC() { return getToken(PCREParser.BUC, 0); }
		public TerminalNode CLC() { return getToken(PCREParser.CLC, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public TerminalNode DLC() { return getToken(PCREParser.DLC, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public TerminalNode ELC() { return getToken(PCREParser.ELC, 0); }
		public TerminalNode EUC() { return getToken(PCREParser.EUC, 0); }
		public TerminalNode FLC() { return getToken(PCREParser.FLC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public Hex_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterHex_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitHex_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitHex_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_digitContext hex_digit() throws RecognitionException {
		Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_hex_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (D1 - 75)) | (1L << (D2 - 75)) | (1L << (D3 - 75)) | (1L << (D4 - 75)) | (1L << (D5 - 75)) | (1L << (D6 - 75)) | (1L << (D7 - 75)) | (1L << (D8 - 75)) | (1L << (D9 - 75)) | (1L << (D0 - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_digits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1217);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public TerminalNode D4() { return getToken(PCREParser.D4, 0); }
		public TerminalNode D5() { return getToken(PCREParser.D5, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode D7() { return getToken(PCREParser.D7, 0); }
		public TerminalNode D8() { return getToken(PCREParser.D8, 0); }
		public TerminalNode D9() { return getToken(PCREParser.D9, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (D1 - 127)) | (1L << (D2 - 127)) | (1L << (D3 - 127)) | (1L << (D4 - 127)) | (1L << (D5 - 127)) | (1L << (D6 - 127)) | (1L << (D7 - 127)) | (1L << (D8 - 127)) | (1L << (D9 - 127)) | (1L << (D0 - 127)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Alpha_numsContext alpha_nums() {
			return getRuleContext(Alpha_numsContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			alpha_nums();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alpha_numsContext extends ParserRuleContext {
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(PCREParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(PCREParser.Underscore, i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Alpha_numsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAlpha_nums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAlpha_nums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAlpha_nums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alpha_numsContext alpha_nums() throws RecognitionException {
		Alpha_numsContext _localctx = new Alpha_numsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alpha_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
				{
				setState(1226);
				letter();
				}
				break;
			case Underscore:
				{
				setState(1227);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Underscore || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (GLC - 75)) | (1L << (HLC - 75)) | (1L << (ILC - 75)) | (1L << (JLC - 75)) | (1L << (KLC - 75)) | (1L << (LLC - 75)) | (1L << (MLC - 75)) | (1L << (NLC - 75)) | (1L << (OLC - 75)) | (1L << (PLC - 75)) | (1L << (QLC - 75)) | (1L << (RLC - 75)) | (1L << (SLC - 75)) | (1L << (TLC - 75)) | (1L << (ULC - 75)) | (1L << (VLC - 75)) | (1L << (WLC - 75)) | (1L << (XLC - 75)) | (1L << (YLC - 75)) | (1L << (ZLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (GUC - 75)) | (1L << (HUC - 75)) | (1L << (IUC - 75)) | (1L << (JUC - 75)) | (1L << (KUC - 75)) | (1L << (LUC - 75)) | (1L << (MUC - 75)) | (1L << (NUC - 75)) | (1L << (OUC - 75)) | (1L << (PUC - 75)) | (1L << (QUC - 75)) | (1L << (RUC - 75)) | (1L << (SUC - 75)) | (1L << (TUC - 75)) | (1L << (UUC - 75)) | (1L << (VUC - 75)) | (1L << (WUC - 75)) | (1L << (XUC - 75)) | (1L << (YUC - 75)) | (1L << (ZUC - 75)) | (1L << (D1 - 75)) | (1L << (D2 - 75)) | (1L << (D3 - 75)) | (1L << (D4 - 75)) | (1L << (D5 - 75)) | (1L << (D6 - 75)) | (1L << (D7 - 75)) | (1L << (D8 - 75)) | (1L << (D9 - 75)) | (1L << (D0 - 75)))) != 0)) {
				{
				setState(1233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALC:
				case BLC:
				case CLC:
				case DLC:
				case ELC:
				case FLC:
				case GLC:
				case HLC:
				case ILC:
				case JLC:
				case KLC:
				case LLC:
				case MLC:
				case NLC:
				case OLC:
				case PLC:
				case QLC:
				case RLC:
				case SLC:
				case TLC:
				case ULC:
				case VLC:
				case WLC:
				case XLC:
				case YLC:
				case ZLC:
				case AUC:
				case BUC:
				case CUC:
				case DUC:
				case EUC:
				case FUC:
				case GUC:
				case HUC:
				case IUC:
				case JUC:
				case KUC:
				case LUC:
				case MUC:
				case NUC:
				case OUC:
				case PUC:
				case QUC:
				case RUC:
				case SUC:
				case TUC:
				case UUC:
				case VUC:
				case WUC:
				case XUC:
				case YUC:
				case ZUC:
					{
					setState(1230);
					letter();
					}
					break;
				case Underscore:
					{
					setState(1231);
					match(Underscore);
					}
					break;
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(1232);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parensContext extends ParserRuleContext {
		public List<Non_close_parenContext> non_close_paren() {
			return getRuleContexts(Non_close_parenContext.class);
		}
		public Non_close_parenContext non_close_paren(int i) {
			return getRuleContext(Non_close_parenContext.class,i);
		}
		public Non_close_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_close_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_close_parens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_close_parens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parensContext non_close_parens() throws RecognitionException {
		Non_close_parensContext _localctx = new Non_close_parensContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_non_close_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1238);
				non_close_paren();
				}
				}
				setState(1241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << OneDataUnit) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << ExtendedUnicodeChar) | (1L << CharacterClassStart) | (1L << CharacterClassEnd) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << NonWordBoundary) | (1L << StartOfSubject) | (1L << EndOfSubjectOrLine) | (1L << EndOfSubjectOrLineEndOfSubject) | (1L << EndOfSubject) | (1L << PreviousMatchInSubject) | (1L << ResetStartMatch) | (1L << SubroutineOrNamedReferenceStartG) | (1L << NamedReferenceStartK) | (1L << Pipe) | (1L << OpenParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_close_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_close_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_close_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parenContext non_close_paren() throws RecognitionException {
		Non_close_parenContext _localctx = new Non_close_parenContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_non_close_paren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==CloseParen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode ALC() { return getToken(PCREParser.ALC, 0); }
		public TerminalNode BLC() { return getToken(PCREParser.BLC, 0); }
		public TerminalNode CLC() { return getToken(PCREParser.CLC, 0); }
		public TerminalNode DLC() { return getToken(PCREParser.DLC, 0); }
		public TerminalNode ELC() { return getToken(PCREParser.ELC, 0); }
		public TerminalNode FLC() { return getToken(PCREParser.FLC, 0); }
		public TerminalNode GLC() { return getToken(PCREParser.GLC, 0); }
		public TerminalNode HLC() { return getToken(PCREParser.HLC, 0); }
		public TerminalNode ILC() { return getToken(PCREParser.ILC, 0); }
		public TerminalNode JLC() { return getToken(PCREParser.JLC, 0); }
		public TerminalNode KLC() { return getToken(PCREParser.KLC, 0); }
		public TerminalNode LLC() { return getToken(PCREParser.LLC, 0); }
		public TerminalNode MLC() { return getToken(PCREParser.MLC, 0); }
		public TerminalNode NLC() { return getToken(PCREParser.NLC, 0); }
		public TerminalNode OLC() { return getToken(PCREParser.OLC, 0); }
		public TerminalNode PLC() { return getToken(PCREParser.PLC, 0); }
		public TerminalNode QLC() { return getToken(PCREParser.QLC, 0); }
		public TerminalNode RLC() { return getToken(PCREParser.RLC, 0); }
		public TerminalNode SLC() { return getToken(PCREParser.SLC, 0); }
		public TerminalNode TLC() { return getToken(PCREParser.TLC, 0); }
		public TerminalNode ULC() { return getToken(PCREParser.ULC, 0); }
		public TerminalNode VLC() { return getToken(PCREParser.VLC, 0); }
		public TerminalNode WLC() { return getToken(PCREParser.WLC, 0); }
		public TerminalNode XLC() { return getToken(PCREParser.XLC, 0); }
		public TerminalNode YLC() { return getToken(PCREParser.YLC, 0); }
		public TerminalNode ZLC() { return getToken(PCREParser.ZLC, 0); }
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode BUC() { return getToken(PCREParser.BUC, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public TerminalNode EUC() { return getToken(PCREParser.EUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode GUC() { return getToken(PCREParser.GUC, 0); }
		public TerminalNode HUC() { return getToken(PCREParser.HUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode JUC() { return getToken(PCREParser.JUC, 0); }
		public TerminalNode KUC() { return getToken(PCREParser.KUC, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode MUC() { return getToken(PCREParser.MUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode QUC() { return getToken(PCREParser.QUC, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode TUC() { return getToken(PCREParser.TUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode VUC() { return getToken(PCREParser.VUC, 0); }
		public TerminalNode WUC() { return getToken(PCREParser.WUC, 0); }
		public TerminalNode XUC() { return getToken(PCREParser.XUC, 0); }
		public TerminalNode YUC() { return getToken(PCREParser.YUC, 0); }
		public TerminalNode ZUC() { return getToken(PCREParser.ZUC, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (GLC - 75)) | (1L << (HLC - 75)) | (1L << (ILC - 75)) | (1L << (JLC - 75)) | (1L << (KLC - 75)) | (1L << (LLC - 75)) | (1L << (MLC - 75)) | (1L << (NLC - 75)) | (1L << (OLC - 75)) | (1L << (PLC - 75)) | (1L << (QLC - 75)) | (1L << (RLC - 75)) | (1L << (SLC - 75)) | (1L << (TLC - 75)) | (1L << (ULC - 75)) | (1L << (VLC - 75)) | (1L << (WLC - 75)) | (1L << (XLC - 75)) | (1L << (YLC - 75)) | (1L << (ZLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (GUC - 75)) | (1L << (HUC - 75)) | (1L << (IUC - 75)) | (1L << (JUC - 75)) | (1L << (KUC - 75)) | (1L << (LUC - 75)) | (1L << (MUC - 75)) | (1L << (NUC - 75)) | (1L << (OUC - 75)) | (1L << (PUC - 75)) | (1L << (QUC - 75)) | (1L << (RUC - 75)) | (1L << (SUC - 75)) | (1L << (TUC - 75)) | (1L << (UUC - 75)) | (1L << (VUC - 75)) | (1L << (WUC - 75)) | (1L << (XUC - 75)) | (1L << (YUC - 75)) | (1L << (ZUC - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_quotedContext extends ParserRuleContext {
		public TerminalNode BackSlashq() { return getToken(PCREParser.BackSlashq, 0); }
		public TerminalNode BackSlashe() { return getToken(PCREParser.BackSlashe, 0); }
		public Block_quotedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_quoted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBlock_quoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBlock_quoted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBlock_quoted(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_quotedContext block_quoted() throws RecognitionException {
		Block_quotedContext _localctx = new Block_quotedContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_block_quoted);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(BackSlashq);
			setState(1251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1248);
					matchWildcard();
					}
					} 
				}
				setState(1253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(1254);
			match(BackSlashe);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008b\u04eb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0089\n\2\5\2\u008b"+
		"\n\2\3\3\3\3\3\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4\3\5\7\5\u0098"+
		"\n\5\f\5\16\5\u009b\13\5\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\5\7\u00a4\n"+
		"\7\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00b8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00c6\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\6\17\u00e4\n\17\r\17\16\17\u00e5\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u00ed\n\17\f\17\16\17\u00f0\13\17\3\17\3\17\3\17\6\17\u00f5"+
		"\n\17\r\17\16\17\u00f6\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00ff\n\17\r"+
		"\17\16\17\u0100\3\17\3\17\3\17\3\17\3\17\7\17\u0108\n\17\f\17\16\17\u010b"+
		"\13\17\3\17\3\17\3\17\7\17\u0110\n\17\f\17\16\17\u0113\13\17\3\17\5\17"+
		"\u0116\n\17\3\20\3\20\3\20\3\20\3\20\6\20\u011d\n\20\r\20\16\20\u011e"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20\u012a\13\20"+
		"\3\20\3\20\3\20\3\20\6\20\u0130\n\20\r\20\16\20\u0131\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\6\20\u013b\n\20\r\20\16\20\u013c\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0145\n\20\f\20\16\20\u0148\13\20\3\20\3\20\3\20\3\20"+
		"\7\20\u014e\n\20\f\20\16\20\u0151\13\20\3\20\5\20\u0154\n\20\3\21\6\21"+
		"\u0157\n\21\r\21\16\21\u0158\3\21\3\21\3\21\6\21\u015e\n\21\r\21\16\21"+
		"\u015f\6\21\u0162\n\21\r\21\16\21\u0163\3\22\3\22\3\22\5\22\u0169\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0178\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0195\n\24\3\25\3\25\3\25\5\25\u019a\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u01a1\n\26\3\27\3\27\3\27\3\27\5\27\u01a7\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01bf\n\27\3\30\3\30\3\30\5\30\u01c4"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0223\n\35\3\36"+
		"\6\36\u0226\n\36\r\36\16\36\u0227\3\37\3\37\3 \6 \u022d\n \r \16 \u022e"+
		"\3!\3!\3\"\3\"\3\"\3\"\5\"\u0237\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0262\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02bf\n)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u02c9\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02d5\n*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02e2\n*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u02ef\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02fd\n*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u030b\n*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u0318\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0324\n*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0332\n*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u0343\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u0354\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0360\n*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u036a\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0376\n"+
		"*\3*\3*\5*\u037a\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u038b"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0394\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03e0\n+\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u041f\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u042b\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0449\n.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\5/\u0453\n/\3\60\3\60\3\61\3\61\5\61\u0459\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0467\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u048e\n\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u049b\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u04a5\n\66\f\66\16\66\u04a8\13\66\3\66\3\66"+
		"\5\66\u04ac\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u04be\n\66\3\67\3\67\38\38\39\69\u04c5"+
		"\n9\r9\169\u04c6\3:\3:\3;\3;\3<\3<\5<\u04cf\n<\3<\3<\3<\7<\u04d4\n<\f"+
		"<\16<\u04d7\13<\3=\6=\u04da\n=\r=\16=\u04db\3>\3>\3?\3?\3@\3@\7@\u04e4"+
		"\n@\f@\16@\u04e7\13@\3@\3@\3@\3\u04e5\2A\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2"+
		"\16\7\2\66\66;;>>@@BH\t\2UUYZ__aaddpp{{\b\2UUYY__ddpp{{\4\2\66\66==\5"+
		"\2\6\6\17\36$%\4\2\u0081\u0083\u008a\u008a\4\2\3\3KK\4\2\u0081\u0087\u008a"+
		"\u008a\5\2MRgl\u0081\u008a\3\2\u0081\u008a\3\288\3\2M\u0080\2\u0589\2"+
		"\u008a\3\2\2\2\4\u008c\3\2\2\2\6\u008e\3\2\2\2\b\u0099\3\2\2\2\n\u009c"+
		"\3\2\2\2\f\u00a3\3\2\2\2\16\u00a9\3\2\2\2\20\u00b7\3\2\2\2\22\u00c5\3"+
		"\2\2\2\24\u00c7\3\2\2\2\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2\32\u00dc\3\2"+
		"\2\2\34\u0115\3\2\2\2\36\u0153\3\2\2\2 \u0156\3\2\2\2\"\u0168\3\2\2\2"+
		"$\u0177\3\2\2\2&\u0194\3\2\2\2(\u0199\3\2\2\2*\u01a0\3\2\2\2,\u01be\3"+
		"\2\2\2.\u01c3\3\2\2\2\60\u01c5\3\2\2\2\62\u01cb\3\2\2\2\64\u01d1\3\2\2"+
		"\2\66\u01d7\3\2\2\28\u0222\3\2\2\2:\u0225\3\2\2\2<\u0229\3\2\2\2>\u022c"+
		"\3\2\2\2@\u0230\3\2\2\2B\u0236\3\2\2\2D\u0238\3\2\2\2F\u023e\3\2\2\2H"+
		"\u0244\3\2\2\2J\u024b\3\2\2\2L\u0261\3\2\2\2N\u0263\3\2\2\2P\u02be\3\2"+
		"\2\2R\u0379\3\2\2\2T\u03df\3\2\2\2V\u041e\3\2\2\2X\u042a\3\2\2\2Z\u0448"+
		"\3\2\2\2\\\u0452\3\2\2\2^\u0454\3\2\2\2`\u0458\3\2\2\2b\u0466\3\2\2\2"+
		"d\u048d\3\2\2\2f\u048f\3\2\2\2h\u049a\3\2\2\2j\u04bd\3\2\2\2l\u04bf\3"+
		"\2\2\2n\u04c1\3\2\2\2p\u04c4\3\2\2\2r\u04c8\3\2\2\2t\u04ca\3\2\2\2v\u04ce"+
		"\3\2\2\2x\u04d9\3\2\2\2z\u04dd\3\2\2\2|\u04df\3\2\2\2~\u04e1\3\2\2\2\u0080"+
		"\u0081\5\6\4\2\u0081\u0082\7\2\2\3\u0082\u008b\3\2\2\2\u0083\u0084\5\4"+
		"\3\2\u0084\u0085\5\b\5\2\u0085\u0086\5\6\4\2\u0086\u0088\5\4\3\2\u0087"+
		"\u0089\5> \2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2"+
		"\2\u008a\u0080\3\2\2\2\u008a\u0083\3\2\2\2\u008b\3\3\2\2\2\u008c\u008d"+
		"\t\2\2\2\u008d\5\3\2\2\2\u008e\u0093\5\b\5\2\u008f\u0090\7\66\2\2\u0090"+
		"\u0092\5\b\5\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\7\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098"+
		"\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\t\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\5Z.\2\u009d"+
		"\u009f\5\f\7\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2"+
		"\2\u00a0\u00a4\5\16\b\2\u00a1\u00a4\5\20\t\2\u00a2\u00a4\5\22\n\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\r\3\2\2\2"+
		"\u00a5\u00aa\5\24\13\2\u00a6\u00aa\5\26\f\2\u00a7\u00aa\5\30\r\2\u00a8"+
		"\u00aa\5\32\16\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\5\24\13\2\u00ac"+
		"\u00ad\7&\2\2\u00ad\u00b8\3\2\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7&"+
		"\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7&\2\2\u00b3"+
		"\u00b8\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7&\2\2\u00b6\u00b8\3"+
		"\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7\'"+
		"\2\2\u00bb\u00c6\3\2\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be\7\'\2\2\u00be"+
		"\u00c6\3\2\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7\'\2\2\u00c1\u00c6\3"+
		"\2\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\'\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00b9\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\25\3\2\2\2\u00c9\u00ca"+
		"\7\'\2\2\u00ca\27\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\31\3\2\2\2\u00cd\u00ce"+
		"\7)\2\2\u00ce\u00cf\5f\64\2\u00cf\u00d0\7*\2\2\u00d0\u00dd\3\2\2\2\u00d1"+
		"\u00d2\7)\2\2\u00d2\u00d3\5f\64\2\u00d3\u00d4\7+\2\2\u00d4\u00d5\7*\2"+
		"\2\u00d5\u00dd\3\2\2\2\u00d6\u00d7\7)\2\2\u00d7\u00d8\5f\64\2\u00d8\u00d9"+
		"\7+\2\2\u00d9\u00da\5f\64\2\u00da\u00db\7*\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00cd\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dd\33\3\2\2"+
		"\2\u00de\u0116\5\36\20\2\u00df\u00e0\7 \2\2\u00e0\u00e1\7!\2\2\u00e1\u00e3"+
		"\7#\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7!"+
		"\2\2\u00e8\u0116\3\2\2\2\u00e9\u00ea\7 \2\2\u00ea\u00ee\7!\2\2\u00eb\u00ed"+
		"\5 \21\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u0116\7!"+
		"\2\2\u00f2\u00f4\7 \2\2\u00f3\u00f5\5 \21\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\7!\2\2\u00f9\u0116\3\2\2\2\u00fa\u00fb\7 \2\2\u00fb\u00fc"+
		"\7!\2\2\u00fc\u00fe\7#\2\2\u00fd\u00ff\5\\/\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\7!\2\2\u0103\u0116\3\2\2\2\u0104\u0105\7 \2\2\u0105\u0109"+
		"\7!\2\2\u0106\u0108\5\\/\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u0116\7!\2\2\u010d\u0111\7 \2\2\u010e\u0110\5\\/\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7!\2\2\u0115\u00de\3\2"+
		"\2\2\u0115\u00df\3\2\2\2\u0115\u00e9\3\2\2\2\u0115\u00f2\3\2\2\2\u0115"+
		"\u00fa\3\2\2\2\u0115\u0104\3\2\2\2\u0115\u010d\3\2\2\2\u0116\35\3\2\2"+
		"\2\u0117\u0118\7 \2\2\u0118\u0119\7\"\2\2\u0119\u011a\7!\2\2\u011a\u011c"+
		"\7#\2\2\u011b\u011d\5 \21\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7!"+
		"\2\2\u0121\u0154\3\2\2\2\u0122\u0123\7 \2\2\u0123\u0124\7\"\2\2\u0124"+
		"\u0128\7!\2\2\u0125\u0127\5 \21\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0154\7!\2\2\u012c\u012d\7 \2\2\u012d\u012f\7\"\2"+
		"\2\u012e\u0130\5 \21\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7!\2\2\u0134"+
		"\u0154\3\2\2\2\u0135\u0136\7 \2\2\u0136\u0137\7\"\2\2\u0137\u0138\7!\2"+
		"\2\u0138\u013a\7#\2\2\u0139\u013b\5\\/\2\u013a\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\7!\2\2\u013f\u0154\3\2\2\2\u0140\u0141\7 \2\2\u0141\u0142\7\"\2"+
		"\2\u0142\u0146\7!\2\2\u0143\u0145\5\\/\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0154\7!\2\2\u014a\u014b\7 \2\2\u014b\u014f\7\"\2"+
		"\2\u014c\u014e\5\\/\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0154\7!\2\2\u0153\u0117\3\2\2\2\u0153\u0122\3\2\2\2\u0153\u012c\3\2"+
		"\2\2\u0153\u0135\3\2\2\2\u0153\u0140\3\2\2\2\u0153\u014a\3\2\2\2\u0154"+
		"\37\3\2\2\2\u0155\u0157\5\\/\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0161\3\2\2\2\u015a\u015b"+
		"\7A\2\2\u015b\u015d\7A\2\2\u015c\u015e\5\\/\2\u015d\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2"+
		"\2\2\u0161\u015a\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164!\3\2\2\2\u0165\u0169\5(\25\2\u0166\u0169\5$\23\2"+
		"\u0167\u0169\5&\24\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167"+
		"\3\2\2\2\u0169#\3\2\2\2\u016a\u016b\7\64\2\2\u016b\u0178\5f\64\2\u016c"+
		"\u016d\7\64\2\2\u016d\u016e\7)\2\2\u016e\u016f\5f\64\2\u016f\u0170\7*"+
		"\2\2\u0170\u0178\3\2\2\2\u0171\u0172\7\64\2\2\u0172\u0173\7)\2\2\u0173"+
		"\u0174\7#\2\2\u0174\u0175\5f\64\2\u0175\u0176\7*\2\2\u0176\u0178\3\2\2"+
		"\2\u0177\u016a\3\2\2\2\u0177\u016c\3\2\2\2\u0177\u0171\3\2\2\2\u0178%"+
		"\3\2\2\2\u0179\u017a\7\65\2\2\u017a\u017b\79\2\2\u017b\u017c\5t;\2\u017c"+
		"\u017d\7:\2\2\u017d\u0195\3\2\2\2\u017e\u017f\7\65\2\2\u017f\u0180\7;"+
		"\2\2\u0180\u0181\5t;\2\u0181\u0182\7;\2\2\u0182\u0195\3\2\2\2\u0183\u0184"+
		"\7\64\2\2\u0184\u0185\7)\2\2\u0185\u0186\5t;\2\u0186\u0187\7*\2\2\u0187"+
		"\u0195\3\2\2\2\u0188\u0189\7\65\2\2\u0189\u018a\7)\2\2\u018a\u018b\5t"+
		";\2\u018b\u018c\7*\2\2\u018c\u0195\3\2\2\2\u018d\u018e\7\67\2\2\u018e"+
		"\u018f\7&\2\2\u018f\u0190\7v\2\2\u0190\u0191\7?\2\2\u0191\u0192\5t;\2"+
		"\u0192\u0193\78\2\2\u0193\u0195\3\2\2\2\u0194\u0179\3\2\2\2\u0194\u017e"+
		"\3\2\2\2\u0194\u0183\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018d\3\2\2\2\u0195"+
		"\'\3\2\2\2\u0196\u019a\5h\65\2\u0197\u0198\7\f\2\2\u0198\u019a\5r:\2\u0199"+
		"\u0196\3\2\2\2\u0199\u0197\3\2\2\2\u019a)\3\2\2\2\u019b\u01a1\5,\27\2"+
		"\u019c\u019d\7\67\2\2\u019d\u019e\5\6\4\2\u019e\u019f\78\2\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1+\3\2\2\2\u01a2"+
		"\u01a3\7\67\2\2\u01a3\u01a4\7&\2\2\u01a4\u01a6\79\2\2\u01a5\u01a7\7#\2"+
		"\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\5t;\2\u01a9\u01aa\7:\2\2\u01aa\u01ab\5\6\4\2\u01ab\u01ac\78\2\2\u01ac"+
		"\u01bf\3\2\2\2\u01ad\u01ae\7\67\2\2\u01ae\u01af\7&\2\2\u01af\u01b0\7;"+
		"\2\2\u01b0\u01b1\5t;\2\u01b1\u01b2\7;\2\2\u01b2\u01b3\5\6\4\2\u01b3\u01b4"+
		"\78\2\2\u01b4\u01bf\3\2\2\2\u01b5\u01b6\7\67\2\2\u01b6\u01b7\7&\2\2\u01b7"+
		"\u01b8\7v\2\2\u01b8\u01b9\79\2\2\u01b9\u01ba\5t;\2\u01ba\u01bb\7:\2\2"+
		"\u01bb\u01bc\5\6\4\2\u01bc\u01bd\78\2\2\u01bd\u01bf\3\2\2\2\u01be\u01a2"+
		"\3\2\2\2\u01be\u01ad\3\2\2\2\u01be\u01b5\3\2\2\2\u01bf-\3\2\2\2\u01c0"+
		"\u01c4\5\64\33\2\u01c1\u01c4\5\62\32\2\u01c2\u01c4\5\60\31\2\u01c3\u01c0"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4/\3\2\2\2\u01c5"+
		"\u01c6\7\67\2\2\u01c6\u01c7\7&\2\2\u01c7\u01c8\7:\2\2\u01c8\u01c9\5\6"+
		"\4\2\u01c9\u01ca\78\2\2\u01ca\61\3\2\2\2\u01cb\u01cc\7\67\2\2\u01cc\u01cd"+
		"\7&\2\2\u01cd\u01ce\7\66\2\2\u01ce\u01cf\5\6\4\2\u01cf\u01d0\78\2\2\u01d0"+
		"\63\3\2\2\2\u01d1\u01d2\7\67\2\2\u01d2\u01d3\7&\2\2\u01d3\u01d4\7=\2\2"+
		"\u01d4\u01d5\5\6\4\2\u01d5\u01d6\78\2\2\u01d6\65\3\2\2\2\u01d7\u01d8\7"+
		"\67\2\2\u01d8\u01d9\7&\2\2\u01d9\u01da\7>\2\2\u01da\u01db\5x=\2\u01db"+
		"\u01dc\78\2\2\u01dc\67\3\2\2\2\u01dd\u01de\7\67\2\2\u01de\u01df\7&\2\2"+
		"\u01df\u01e0\5:\36\2\u01e0\u01e1\7#\2\2\u01e1\u01e2\5:\36\2\u01e2\u01e3"+
		"\78\2\2\u01e3\u0223\3\2\2\2\u01e4\u01e5\7\67\2\2\u01e5\u01e6\7&\2\2\u01e6"+
		"\u01e7\5:\36\2\u01e7\u01e8\78\2\2\u01e8\u0223\3\2\2\2\u01e9\u01ea\7\67"+
		"\2\2\u01ea\u01eb\7&\2\2\u01eb\u01ec\7#\2\2\u01ec\u01ed\5:\36\2\u01ed\u01ee"+
		"\78\2\2\u01ee\u0223\3\2\2\2\u01ef\u01f0\7\67\2\2\u01f0\u01f1\7&\2\2\u01f1"+
		"\u01f2\5:\36\2\u01f2\u01f3\7=\2\2\u01f3\u01f4\5\6\4\2\u01f4\u01f5\78\2"+
		"\2\u01f5\u0223\3\2\2\2\u01f6\u01f7\7\67\2\2\u01f7\u01f8\7&\2\2\u01f8\u01f9"+
		"\7#\2\2\u01f9\u01fa\5:\36\2\u01fa\u01fb\7=\2\2\u01fb\u01fc\5\6\4\2\u01fc"+
		"\u01fd\78\2\2\u01fd\u0223\3\2\2\2\u01fe\u01ff\7\67\2\2\u01ff\u0200\7("+
		"\2\2\u0200\u0201\7t\2\2\u0201\u0202\7u\2\2\u0202\u0203\7<\2\2\u0203\u0204"+
		"\7y\2\2\u0204\u0205\7z\2\2\u0205\u0206\7g\2\2\u0206\u0207\7x\2\2\u0207"+
		"\u0208\7z\2\2\u0208\u0209\7<\2\2\u0209\u020a\7u\2\2\u020a\u020b\7v\2\2"+
		"\u020b\u020c\7z\2\2\u020c\u0223\78\2\2\u020d\u020e\7\67\2\2\u020e\u020f"+
		"\7(\2\2\u020f\u0210\7{\2\2\u0210\u0211\7z\2\2\u0211\u0212\7l\2\2\u0212"+
		"\u0213\7\u0088\2\2\u0213\u0223\78\2\2\u0214\u0215\7\67\2\2\u0215\u0216"+
		"\7(\2\2\u0216\u0217\7{\2\2\u0217\u0218\7z\2\2\u0218\u0219\7l\2\2\u0219"+
		"\u021a\7\u0081\2\2\u021a\u021b\7\u0086\2\2\u021b\u0223\78\2\2\u021c\u021d"+
		"\7\67\2\2\u021d\u021e\7(\2\2\u021e\u021f\7{\2\2\u021f\u0220\7i\2\2\u0220"+
		"\u0221\7v\2\2\u0221\u0223\78\2\2\u0222\u01dd\3\2\2\2\u0222\u01e4\3\2\2"+
		"\2\u0222\u01e9\3\2\2\2\u0222\u01ef\3\2\2\2\u0222\u01f6\3\2\2\2\u0222\u01fe"+
		"\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u0214\3\2\2\2\u0222\u021c\3\2\2\2\u0223"+
		"9\3\2\2\2\u0224\u0226\5<\37\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228;\3\2\2\2\u0229\u022a\t"+
		"\3\2\2\u022a=\3\2\2\2\u022b\u022d\5@!\2\u022c\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f?\3\2\2\2\u0230"+
		"\u0231\t\4\2\2\u0231A\3\2\2\2\u0232\u0237\5D#\2\u0233\u0237\5F$\2\u0234"+
		"\u0237\5H%\2\u0235\u0237\5J&\2\u0236\u0232\3\2\2\2\u0236\u0233\3\2\2\2"+
		"\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237C\3\2\2\2\u0238\u0239\7"+
		"\67\2\2\u0239\u023a\7&\2\2\u023a\u023b\7?\2\2\u023b\u023c\5\6\4\2\u023c"+
		"\u023d\78\2\2\u023dE\3\2\2\2\u023e\u023f\7\67\2\2\u023f\u0240\7&\2\2\u0240"+
		"\u0241\7@\2\2\u0241\u0242\5\6\4\2\u0242\u0243\78\2\2\u0243G\3\2\2\2\u0244"+
		"\u0245\7\67\2\2\u0245\u0246\7&\2\2\u0246\u0247\79\2\2\u0247\u0248\7?\2"+
		"\2\u0248\u0249\5\6\4\2\u0249\u024a\78\2\2\u024aI\3\2\2\2\u024b\u024c\7"+
		"\67\2\2\u024c\u024d\7&\2\2\u024d\u024e\79\2\2\u024e\u024f\7@\2\2\u024f"+
		"\u0250\5\6\4\2\u0250\u0251\78\2\2\u0251K\3\2\2\2\u0252\u0253\7\67\2\2"+
		"\u0253\u0254\7&\2\2\u0254\u0255\7&\2\2\u0255\u0256\7)\2\2\u0256\u0257"+
		"\5\6\4\2\u0257\u0258\7*\2\2\u0258\u0259\78\2\2\u0259\u0262\3\2\2\2\u025a"+
		"\u025b\7\67\2\2\u025b\u025c\7&\2\2\u025c\u025d\7)\2\2\u025d\u025e\5\6"+
		"\4\2\u025e\u025f\7*\2\2\u025f\u0260\78\2\2\u0260\u0262\3\2\2\2\u0261\u0252"+
		"\3\2\2\2\u0261\u025a\3\2\2\2\u0262M\3\2\2\2\u0263\u0264\7\67\2\2\u0264"+
		"\u0265\7&\2\2\u0265\u0266\7\67\2\2\u0266\u0267\7j\2\2\u0267\u0268\7k\2"+
		"\2\u0268\u0269\7l\2\2\u0269\u026a\7o\2\2\u026a\u026b\7t\2\2\u026b\u026c"+
		"\7k\2\2\u026c\u026d\78\2\2\u026d\u026e\5,\27\2\u026e\u026f\78\2\2\u026f"+
		"O\3\2\2\2\u0270\u0271\7\67\2\2\u0271\u0272\7&\2\2\u0272\u0273\7x\2\2\u0273"+
		"\u02bf\78\2\2\u0274\u0275\7\67\2\2\u0275\u0276\7&\2\2\u0276\u0277\5f\64"+
		"\2\u0277\u0278\78\2\2\u0278\u02bf\3\2\2\2\u0279\u027a\7\67\2\2\u027a\u027b"+
		"\7&\2\2\u027b\u027c\7\'\2\2\u027c\u027d\5f\64\2\u027d\u027e\78\2\2\u027e"+
		"\u02bf\3\2\2\2\u027f\u0280\7\67\2\2\u0280\u0281\7&\2\2\u0281\u0282\7#"+
		"\2\2\u0282\u0283\5f\64\2\u0283\u0284\78\2\2\u0284\u02bf\3\2\2\2\u0285"+
		"\u0286\7\67\2\2\u0286\u0287\7&\2\2\u0287\u0288\7A\2\2\u0288\u0289\5t;"+
		"\2\u0289\u028a\78\2\2\u028a\u02bf\3\2\2\2\u028b\u028c\7\67\2\2\u028c\u028d"+
		"\7&\2\2\u028d\u028e\7v\2\2\u028e\u028f\7:\2\2\u028f\u0290\5t;\2\u0290"+
		"\u0291\78\2\2\u0291\u02bf\3\2\2\2\u0292\u0293\7\64\2\2\u0293\u0294\79"+
		"\2\2\u0294\u0295\5t;\2\u0295\u0296\7:\2\2\u0296\u02bf\3\2\2\2\u0297\u0298"+
		"\7\64\2\2\u0298\u0299\7;\2\2\u0299\u029a\5t;\2\u029a\u029b\7;\2\2\u029b"+
		"\u02bf\3\2\2\2\u029c\u029d\7\64\2\2\u029d\u029e\79\2\2\u029e\u029f\5f"+
		"\64\2\u029f\u02a0\7:\2\2\u02a0\u02bf\3\2\2\2\u02a1\u02a2\7\64\2\2\u02a2"+
		"\u02a3\7;\2\2\u02a3\u02a4\5f\64\2\u02a4\u02a5\7;\2\2\u02a5\u02bf\3\2\2"+
		"\2\u02a6\u02a7\7\64\2\2\u02a7\u02a8\79\2\2\u02a8\u02a9\7\'\2\2\u02a9\u02aa"+
		"\5f\64\2\u02aa\u02ab\7:\2\2\u02ab\u02bf\3\2\2\2\u02ac\u02ad\7\64\2\2\u02ad"+
		"\u02ae\7;\2\2\u02ae\u02af\7\'\2\2\u02af\u02b0\5f\64\2\u02b0\u02b1\7;\2"+
		"\2\u02b1\u02bf\3\2\2\2\u02b2\u02b3\7\64\2\2\u02b3\u02b4\79\2\2\u02b4\u02b5"+
		"\7#\2\2\u02b5\u02b6\5f\64\2\u02b6\u02b7\7:\2\2\u02b7\u02bf\3\2\2\2\u02b8"+
		"\u02b9\7\64\2\2\u02b9\u02ba\7;\2\2\u02ba\u02bb\7#\2\2\u02bb\u02bc\5f\64"+
		"\2\u02bc\u02bd\7;\2\2\u02bd\u02bf\3\2\2\2\u02be\u0270\3\2\2\2\u02be\u0274"+
		"\3\2\2\2\u02be\u0279\3\2\2\2\u02be\u027f\3\2\2\2\u02be\u0285\3\2\2\2\u02be"+
		"\u028b\3\2\2\2\u02be\u0292\3\2\2\2\u02be\u0297\3\2\2\2\u02be\u029c\3\2"+
		"\2\2\u02be\u02a1\3\2\2\2\u02be\u02a6\3\2\2\2\u02be\u02ac\3\2\2\2\u02be"+
		"\u02b2\3\2\2\2\u02be\u02b8\3\2\2\2\u02bfQ\3\2\2\2\u02c0\u02c1\7\67\2\2"+
		"\u02c1\u02c2\7&\2\2\u02c2\u02c3\7\67\2\2\u02c3\u02c4\5f\64\2\u02c4\u02c5"+
		"\78\2\2\u02c5\u02c8\5\6\4\2\u02c6\u02c7\t\5\2\2\u02c7\u02c9\5\6\4\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\78"+
		"\2\2\u02cb\u037a\3\2\2\2\u02cc\u02cd\7\67\2\2\u02cd\u02ce\7&\2\2\u02ce"+
		"\u02cf\79\2\2\u02cf\u02d0\5f\64\2\u02d0\u02d1\7:\2\2\u02d1\u02d4\5\6\4"+
		"\2\u02d2\u02d3\t\5\2\2\u02d3\u02d5\5\6\4\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\78\2\2\u02d7\u037a\3\2\2\2\u02d8"+
		"\u02d9\7\67\2\2\u02d9\u02da\7&\2\2\u02da\u02db\7\67\2\2\u02db\u02dc\7"+
		"\'\2\2\u02dc\u02dd\5f\64\2\u02dd\u02de\78\2\2\u02de\u02e1\5\6\4\2\u02df"+
		"\u02e0\t\5\2\2\u02e0\u02e2\5\6\4\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\78\2\2\u02e4\u037a\3\2\2\2\u02e5"+
		"\u02e6\7\67\2\2\u02e6\u02e7\7&\2\2\u02e7\u02e8\7\67\2\2\u02e8\u02e9\7"+
		"#\2\2\u02e9\u02ea\5f\64\2\u02ea\u02eb\78\2\2\u02eb\u02ee\5\6\4\2\u02ec"+
		"\u02ed\t\5\2\2\u02ed\u02ef\5\6\4\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\78\2\2\u02f1\u037a\3\2\2\2\u02f2"+
		"\u02f3\7\67\2\2\u02f3\u02f4\7&\2\2\u02f4\u02f5\7\67\2\2\u02f5\u02f6\7"+
		"9\2\2\u02f6\u02f7\5t;\2\u02f7\u02f8\7:\2\2\u02f8\u02f9\78\2\2\u02f9\u02fc"+
		"\5\6\4\2\u02fa\u02fb\t\5\2\2\u02fb\u02fd\5\6\4\2\u02fc\u02fa\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\78\2\2\u02ff\u037a\3\2"+
		"\2\2\u0300\u0301\7\67\2\2\u0301\u0302\7&\2\2\u0302\u0303\7\67\2\2\u0303"+
		"\u0304\7;\2\2\u0304\u0305\5t;\2\u0305\u0306\7;\2\2\u0306\u0307\78\2\2"+
		"\u0307\u030a\5\6\4\2\u0308\u0309\t\5\2\2\u0309\u030b\5\6\4\2\u030a\u0308"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\78\2\2\u030d"+
		"\u037a\3\2\2\2\u030e\u030f\7\67\2\2\u030f\u0310\7&\2\2\u0310\u0311\7\67"+
		"\2\2\u0311\u0312\7x\2\2\u0312\u0313\5f\64\2\u0313\u0314\78\2\2\u0314\u0317"+
		"\5\6\4\2\u0315\u0316\t\5\2\2\u0316\u0318\5\6\4\2\u0317\u0315\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\78\2\2\u031a\u037a\3\2"+
		"\2\2\u031b\u031c\7\67\2\2\u031c\u031d\7&\2\2\u031d\u031e\7\67\2\2\u031e"+
		"\u031f\7x\2\2\u031f\u0320\78\2\2\u0320\u0323\5\6\4\2\u0321\u0322\t\5\2"+
		"\2\u0322\u0324\5\6\4\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325\u0326\78\2\2\u0326\u037a\3\2\2\2\u0327\u0328\7\67\2\2\u0328"+
		"\u0329\7&\2\2\u0329\u032a\7\67\2\2\u032a\u032b\7x\2\2\u032b\u032c\7A\2"+
		"\2\u032c\u032d\5t;\2\u032d\u032e\78\2\2\u032e\u0331\5\6\4\2\u032f\u0330"+
		"\t\5\2\2\u0330\u0332\5\6\4\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0334\78\2\2\u0334\u037a\3\2\2\2\u0335\u0336\7\67"+
		"\2\2\u0336\u0337\7&\2\2\u0337\u0338\7\67\2\2\u0338\u0339\7j\2\2\u0339"+
		"\u033a\7k\2\2\u033a\u033b\7l\2\2\u033b\u033c\7o\2\2\u033c\u033d\7t\2\2"+
		"\u033d\u033e\7k\2\2\u033e\u033f\78\2\2\u033f\u0342\5\6\4\2\u0340\u0341"+
		"\t\5\2\2\u0341\u0343\5\6\4\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0345\78\2\2\u0345\u037a\3\2\2\2\u0346\u0347\7\67"+
		"\2\2\u0347\u0348\7&\2\2\u0348\u0349\7\67\2\2\u0349\u034a\7M\2\2\u034a"+
		"\u034b\7_\2\2\u034b\u034c\7_\2\2\u034c\u034d\7Q\2\2\u034d\u034e\7^\2\2"+
		"\u034e\u034f\7`\2\2\u034f\u0350\78\2\2\u0350\u0353\5\6\4\2\u0351\u0352"+
		"\t\5\2\2\u0352\u0354\5\6\4\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\78\2\2\u0356\u037a\3\2\2\2\u0357\u0358\7\67"+
		"\2\2\u0358\u0359\7&\2\2\u0359\u035a\7\67\2\2\u035a\u035b\5t;\2\u035b\u035c"+
		"\78\2\2\u035c\u035f\5\6\4\2\u035d\u035e\t\5\2\2\u035e\u0360\5\6\4\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\78"+
		"\2\2\u0362\u037a\3\2\2\2\u0363\u0364\7\67\2\2\u0364\u0365\7&\2\2\u0365"+
		"\u0366\5B\"\2\u0366\u0369\5\6\4\2\u0367\u0368\t\5\2\2\u0368\u036a\5\6"+
		"\4\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036c\78\2\2\u036c\u037a\3\2\2\2\u036d\u036e\7\67\2\2\u036e\u036f\7&"+
		"\2\2\u036f\u0370\7\67\2\2\u0370\u0371\5\6\4\2\u0371\u0372\78\2\2\u0372"+
		"\u0375\5\6\4\2\u0373\u0374\t\5\2\2\u0374\u0376\5\6\4\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\78\2\2\u0378"+
		"\u037a\3\2\2\2\u0379\u02c0\3\2\2\2\u0379\u02cc\3\2\2\2\u0379\u02d8\3\2"+
		"\2\2\u0379\u02e5\3\2\2\2\u0379\u02f2\3\2\2\2\u0379\u0300\3\2\2\2\u0379"+
		"\u030e\3\2\2\2\u0379\u031b\3\2\2\2\u0379\u0327\3\2\2\2\u0379\u0335\3\2"+
		"\2\2\u0379\u0346\3\2\2\2\u0379\u0357\3\2\2\2\u0379\u0363\3\2\2\2\u0379"+
		"\u036d\3\2\2\2\u037aS\3\2\2\2\u037b\u037c\7\67\2\2\u037c\u037d\7(\2\2"+
		"\u037d\u037e\7g\2\2\u037e\u037f\7i\2\2\u037f\u0380\7i\2\2\u0380\u0381"+
		"\7k\2\2\u0381\u0382\7v\2\2\u0382\u0383\7z\2\2\u0383\u03e0\78\2\2\u0384"+
		"\u0385\7\67\2\2\u0385\u0386\7(\2\2\u0386\u038a\7l\2\2\u0387\u0388\7g\2"+
		"\2\u0388\u0389\7o\2\2\u0389\u038b\7r\2\2\u038a\u0387\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03e0\78\2\2\u038d\u038e\7\67\2\2\u038e"+
		"\u0393\7(\2\2\u038f\u0390\7s\2\2\u0390\u0391\7g\2\2\u0391\u0392\7x\2\2"+
		"\u0392\u0394\7q\2\2\u0393\u038f\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u0396\7=\2\2\u0396\u0397\7t\2\2\u0397\u0398\7g\2\2\u0398"+
		"\u0399\7s\2\2\u0399\u039a\7k\2\2\u039a\u03e0\78\2\2\u039b\u039c\7\67\2"+
		"\2\u039c\u039d\7(\2\2\u039d\u039e\7i\2\2\u039e\u039f\7u\2\2\u039f\u03a0"+
		"\7s\2\2\u03a0\u03a1\7s\2\2\u03a1\u03a2\7o\2\2\u03a2\u03a3\7z\2\2\u03a3"+
		"\u03e0\78\2\2\u03a4\u03a5\7\67\2\2\u03a5\u03a6\7(\2\2\u03a6\u03a7\7v\2"+
		"\2\u03a7\u03a8\7x\2\2\u03a8\u03a9\7{\2\2\u03a9\u03aa\7t\2\2\u03aa\u03ab"+
		"\7k\2\2\u03ab\u03e0\78\2\2\u03ac\u03ad\7\67\2\2\u03ad\u03ae\7(\2\2\u03ae"+
		"\u03af\7v\2\2\u03af\u03b0\7x\2\2\u03b0\u03b1\7{\2\2\u03b1\u03b2\7t\2\2"+
		"\u03b2\u03b3\7k\2\2\u03b3\u03b4\7=\2\2\u03b4\u03b5\7t\2\2\u03b5\u03b6"+
		"\7g\2\2\u03b6\u03b7\7s\2\2\u03b7\u03b8\7k\2\2\u03b8\u03e0\78\2\2\u03b9"+
		"\u03ba\7\67\2\2\u03ba\u03bb\7(\2\2\u03bb\u03bc\7y\2\2\u03bc\u03bd\7q\2"+
		"\2\u03bd\u03be\7o\2\2\u03be\u03bf\7v\2\2\u03bf\u03e0\78\2\2\u03c0\u03c1"+
		"\7\67\2\2\u03c1\u03c2\7(\2\2\u03c2\u03c3\7y\2\2\u03c3\u03c4\7q\2\2\u03c4"+
		"\u03c5\7o\2\2\u03c5\u03c6\7v\2\2\u03c6\u03c7\7=\2\2\u03c7\u03c8\7t\2\2"+
		"\u03c8\u03c9\7g\2\2\u03c9\u03ca\7s\2\2\u03ca\u03cb\7k\2\2\u03cb\u03e0"+
		"\78\2\2\u03cc\u03cd\7\67\2\2\u03cd\u03ce\7(\2\2\u03ce\u03cf\7z\2\2\u03cf"+
		"\u03d0\7n\2\2\u03d0\u03d1\7k\2\2\u03d1\u03d2\7t\2\2\u03d2\u03e0\78\2\2"+
		"\u03d3\u03d4\7\67\2\2\u03d4\u03d5\7(\2\2\u03d5\u03d6\7z\2\2\u03d6\u03d7"+
		"\7n\2\2\u03d7\u03d8\7k\2\2\u03d8\u03d9\7t\2\2\u03d9\u03da\7=\2\2\u03da"+
		"\u03db\7t\2\2\u03db\u03dc\7g\2\2\u03dc\u03dd\7s\2\2\u03dd\u03de\7k\2\2"+
		"\u03de\u03e0\78\2\2\u03df\u037b\3\2\2\2\u03df\u0384\3\2\2\2\u03df\u038d"+
		"\3\2\2\2\u03df\u039b\3\2\2\2\u03df\u03a4\3\2\2\2\u03df\u03ac\3\2\2\2\u03df"+
		"\u03b9\3\2\2\2\u03df\u03c0\3\2\2\2\u03df\u03cc\3\2\2\2\u03df\u03d3\3\2"+
		"\2\2\u03e0U\3\2\2\2\u03e1\u03e2\7\67\2\2\u03e2\u03e3\7(\2\2\u03e3\u03e4"+
		"\7i\2\2\u03e4\u03e5\7x\2\2\u03e5\u041f\78\2\2\u03e6\u03e7\7\67\2\2\u03e7"+
		"\u03e8\7(\2\2\u03e8\u03e9\7r\2\2\u03e9\u03ea\7l\2\2\u03ea\u041f\78\2\2"+
		"\u03eb\u03ec\7\67\2\2\u03ec\u03ed\7(\2\2\u03ed\u03ee\7i\2\2\u03ee\u03ef"+
		"\7x\2\2\u03ef\u03f0\7r\2\2\u03f0\u03f1\7l\2\2\u03f1\u041f\78\2\2\u03f2"+
		"\u03f3\7\67\2\2\u03f3\u03f4\7(\2\2\u03f4\u03f5\7g\2\2\u03f5\u03f6\7t\2"+
		"\2\u03f6\u03f7\7\177\2\2\u03f7\u03f8\7i\2\2\u03f8\u03f9\7x\2\2\u03f9\u03fa"+
		"\7r\2\2\u03fa\u03fb\7l\2\2\u03fb\u041f\78\2\2\u03fc\u03fd\7\67\2\2\u03fd"+
		"\u03fe\7(\2\2\u03fe\u03ff\7g\2\2\u03ff\u0400\7t\2\2\u0400\u0401\7\177"+
		"\2\2\u0401\u041f\78\2\2\u0402\u0403\7\67\2\2\u0403\u0404\7(\2\2\u0404"+
		"\u0405\7h\2\2\u0405\u0406\7y\2\2\u0406\u0407\7x\2\2\u0407\u0408\7<\2\2"+
		"\u0408\u0409\7g\2\2\u0409\u040a\7t\2\2\u040a\u040b\7\177\2\2\u040b\u040c"+
		"\7i\2\2\u040c\u040d\7x\2\2\u040d\u040e\7r\2\2\u040e\u040f\7l\2\2\u040f"+
		"\u041f\78\2\2\u0410\u0411\7\67\2\2\u0411\u0412\7(\2\2\u0412\u0413\7h\2"+
		"\2\u0413\u0414\7y\2\2\u0414\u0415\7x\2\2\u0415\u0416\7<\2\2\u0416\u0417"+
		"\7{\2\2\u0417\u0418\7t\2\2\u0418\u0419\7o\2\2\u0419\u041a\7i\2\2\u041a"+
		"\u041b\7u\2\2\u041b\u041c\7j\2\2\u041c\u041d\7k\2\2\u041d\u041f\78\2\2"+
		"\u041e\u03e1\3\2\2\2\u041e\u03e6\3\2\2\2\u041e\u03eb\3\2\2\2\u041e\u03f2"+
		"\3\2\2\2\u041e\u03fc\3\2\2\2\u041e\u0402\3\2\2\2\u041e\u0410\3\2\2\2\u041f"+
		"W\3\2\2\2\u0420\u0421\7\67\2\2\u0421\u0422\7&\2\2\u0422\u0423\7i\2\2\u0423"+
		"\u042b\78\2\2\u0424\u0425\7\67\2\2\u0425\u0426\7&\2\2\u0426\u0427\7i\2"+
		"\2\u0427\u0428\5f\64\2\u0428\u0429\78\2\2\u0429\u042b\3\2\2\2\u042a\u0420"+
		"\3\2\2\2\u042a\u0424\3\2\2\2\u042bY\3\2\2\2\u042c\u0449\5P)\2\u042d\u0449"+
		"\5^\60\2\u042e\u0449\5`\61\2\u042f\u0449\5\34\17\2\u0430\u0449\5*\26\2"+
		"\u0431\u0449\5.\30\2\u0432\u0449\5\66\34\2\u0433\u0449\58\35\2\u0434\u0449"+
		"\5B\"\2\u0435\u0449\5\"\22\2\u0436\u0449\5R*\2\u0437\u0449\5N(\2\u0438"+
		"\u0449\5L\'\2\u0439\u0449\5T+\2\u043a\u0449\5V,\2\u043b\u0449\5X-\2\u043c"+
		"\u0449\7\r\2\2\u043d\u0449\7\"\2\2\u043e\u0449\7.\2\2\u043f\u0449\7,\2"+
		"\2\u0440\u0449\7-\2\2\u0441\u0449\7/\2\2\u0442\u0449\7\60\2\2\u0443\u0449"+
		"\7\61\2\2\u0444\u0449\7\62\2\2\u0445\u0449\7\63\2\2\u0446\u0449\7\16\2"+
		"\2\u0447\u0449\7\37\2\2\u0448\u042c\3\2\2\2\u0448\u042d\3\2\2\2\u0448"+
		"\u042e\3\2\2\2\u0448\u042f\3\2\2\2\u0448\u0430\3\2\2\2\u0448\u0431\3\2"+
		"\2\2\u0448\u0432\3\2\2\2\u0448\u0433\3\2\2\2\u0448\u0434\3\2\2\2\u0448"+
		"\u0435\3\2\2\2\u0448\u0436\3\2\2\2\u0448\u0437\3\2\2\2\u0448\u0438\3\2"+
		"\2\2\u0448\u0439\3\2\2\2\u0448\u043a\3\2\2\2\u0448\u043b\3\2\2\2\u0448"+
		"\u043c\3\2\2\2\u0448\u043d\3\2\2\2\u0448\u043e\3\2\2\2\u0448\u043f\3\2"+
		"\2\2\u0448\u0440\3\2\2\2\u0448\u0441\3\2\2\2\u0448\u0442\3\2\2\2\u0448"+
		"\u0443\3\2\2\2\u0448\u0444\3\2\2\2\u0448\u0445\3\2\2\2\u0448\u0446\3\2"+
		"\2\2\u0448\u0447\3\2\2\2\u0449[\3\2\2\2\u044a\u0453\5\34\17\2\u044b\u044c"+
		"\5b\62\2\u044c\u044d\7#\2\2\u044d\u044e\5b\62\2\u044e\u0453\3\2\2\2\u044f"+
		"\u0453\5^\60\2\u0450\u0453\5b\62\2\u0451\u0453\5(\25\2\u0452\u044a\3\2"+
		"\2\2\u0452\u044b\3\2\2\2\u0452\u044f\3\2\2\2\u0452\u0450\3\2\2\2\u0452"+
		"\u0451\3\2\2\2\u0453]\3\2\2\2\u0454\u0455\t\6\2\2\u0455_\3\2\2\2\u0456"+
		"\u0459\5d\63\2\u0457\u0459\7!\2\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2"+
		"\2\2\u0459a\3\2\2\2\u045a\u0467\5d\63\2\u045b\u0467\7\r\2\2\u045c\u0467"+
		"\7 \2\2\u045d\u0467\7\"\2\2\u045e\u0467\7&\2\2\u045f\u0467\7\'\2\2\u0460"+
		"\u0467\7(\2\2\u0461\u0467\7,\2\2\u0462\u0467\7/\2\2\u0463\u0467\7\66\2"+
		"\2\u0464\u0467\7\67\2\2\u0465\u0467\78\2\2\u0466\u045a\3\2\2\2\u0466\u045b"+
		"\3\2\2\2\u0466\u045c\3\2\2\2\u0466\u045d\3\2\2\2\u0466\u045e\3\2\2\2\u0466"+
		"\u045f\3\2\2\2\u0466\u0460\3\2\2\2\u0466\u0461\3\2\2\2\u0466\u0462\3\2"+
		"\2\2\u0466\u0463\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467"+
		"c\3\2\2\2\u0468\u048e\5h\65\2\u0469\u048e\5j\66\2\u046a\u048e\5|?\2\u046b"+
		"\u048e\5r:\2\u046c\u048e\5~@\2\u046d\u048e\7\5\2\2\u046e\u048e\7\7\2\2"+
		"\u046f\u048e\7\b\2\2\u0470\u048e\7\t\2\2\u0471\u048e\7\n\2\2\u0472\u048e"+
		"\7\13\2\2\u0473\u048e\7\4\2\2\u0474\u048e\7)\2\2\u0475\u048e\7*\2\2\u0476"+
		"\u048e\7+\2\2\u0477\u048e\7#\2\2\u0478\u048e\79\2\2\u0479\u048e\7:\2\2"+
		"\u047a\u048e\7;\2\2\u047b\u048e\7<\2\2\u047c\u048e\7=\2\2\u047d\u048e"+
		"\7>\2\2\u047e\u048e\7?\2\2\u047f\u048e\7@\2\2\u0480\u048e\7A\2\2\u0481"+
		"\u048e\7\u008b\2\2\u0482\u048e\7B\2\2\u0483\u048e\7C\2\2\u0484\u048e\7"+
		"D\2\2\u0485\u048e\7E\2\2\u0486\u048e\7F\2\2\u0487\u048e\7G\2\2\u0488\u048e"+
		"\7H\2\2\u0489\u048e\7I\2\2\u048a\u048e\7J\2\2\u048b\u048e\7K\2\2\u048c"+
		"\u048e\7L\2\2\u048d\u0468\3\2\2\2\u048d\u0469\3\2\2\2\u048d\u046a\3\2"+
		"\2\2\u048d\u046b\3\2\2\2\u048d\u046c\3\2\2\2\u048d\u046d\3\2\2\2\u048d"+
		"\u046e\3\2\2\2\u048d\u046f\3\2\2\2\u048d\u0470\3\2\2\2\u048d\u0471\3\2"+
		"\2\2\u048d\u0472\3\2\2\2\u048d\u0473\3\2\2\2\u048d\u0474\3\2\2\2\u048d"+
		"\u0475\3\2\2\2\u048d\u0476\3\2\2\2\u048d\u0477\3\2\2\2\u048d\u0478\3\2"+
		"\2\2\u048d\u0479\3\2\2\2\u048d\u047a\3\2\2\2\u048d\u047b\3\2\2\2\u048d"+
		"\u047c\3\2\2\2\u048d\u047d\3\2\2\2\u048d\u047e\3\2\2\2\u048d\u047f\3\2"+
		"\2\2\u048d\u0480\3\2\2\2\u048d\u0481\3\2\2\2\u048d\u0482\3\2\2\2\u048d"+
		"\u0483\3\2\2\2\u048d\u0484\3\2\2\2\u048d\u0485\3\2\2\2\u048d\u0486\3\2"+
		"\2\2\u048d\u0487\3\2\2\2\u048d\u0488\3\2\2\2\u048d\u0489\3\2\2\2\u048d"+
		"\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048c\3\2\2\2\u048ee\3\2\2\2"+
		"\u048f\u0490\5p9\2\u0490g\3\2\2\2\u0491\u0492\7\f\2\2\u0492\u0493\t\7"+
		"\2\2\u0493\u0494\5l\67\2\u0494\u0495\5l\67\2\u0495\u049b\3\2\2\2\u0496"+
		"\u0497\7\f\2\2\u0497\u0498\5l\67\2\u0498\u0499\5l\67\2\u0499\u049b\3\2"+
		"\2\2\u049a\u0491\3\2\2\2\u049a\u0496\3\2\2\2\u049bi\3\2\2\2\u049c\u04ab"+
		"\7L\2\2\u049d\u049e\5n8\2\u049e\u049f\5n8\2\u049f\u04ac\3\2\2\2\u04a0"+
		"\u04a1\7)\2\2\u04a1\u04a2\5n8\2\u04a2\u04a6\5n8\2\u04a3\u04a5\5n8\2\u04a4"+
		"\u04a3\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2"+
		"\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04aa\7*\2\2\u04aa"+
		"\u04ac\3\2\2\2\u04ab\u049d\3\2\2\2\u04ab\u04a0\3\2\2\2\u04ac\u04be\3\2"+
		"\2\2\u04ad\u04ae\t\b\2\2\u04ae\u04af\5n8\2\u04af\u04b0\5n8\2\u04b0\u04b1"+
		"\5n8\2\u04b1\u04b2\5n8\2\u04b2\u04b3\5n8\2\u04b3\u04b4\5n8\2\u04b4\u04b5"+
		"\5n8\2\u04b5\u04b6\5n8\2\u04b6\u04be\3\2\2\2\u04b7\u04b8\t\b\2\2\u04b8"+
		"\u04b9\5n8\2\u04b9\u04ba\5n8\2\u04ba\u04bb\5n8\2\u04bb\u04bc\5n8\2\u04bc"+
		"\u04be\3\2\2\2\u04bd\u049c\3\2\2\2\u04bd\u04ad\3\2\2\2\u04bd\u04b7\3\2"+
		"\2\2\u04bek\3\2\2\2\u04bf\u04c0\t\t\2\2\u04c0m\3\2\2\2\u04c1\u04c2\t\n"+
		"\2\2\u04c2o\3\2\2\2\u04c3\u04c5\5r:\2\u04c4\u04c3\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7q\3\2\2\2\u04c8"+
		"\u04c9\t\13\2\2\u04c9s\3\2\2\2\u04ca\u04cb\5v<\2\u04cbu\3\2\2\2\u04cc"+
		"\u04cf\5|?\2\u04cd\u04cf\7<\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cd\3\2\2"+
		"\2\u04cf\u04d5\3\2\2\2\u04d0\u04d4\5|?\2\u04d1\u04d4\7<\2\2\u04d2\u04d4"+
		"\5r:\2\u04d3\u04d0\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4"+
		"\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6w\3\2\2\2"+
		"\u04d7\u04d5\3\2\2\2\u04d8\u04da\5z>\2\u04d9\u04d8\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dcy\3\2\2\2\u04dd"+
		"\u04de\n\f\2\2\u04de{\3\2\2\2\u04df\u04e0\t\r\2\2\u04e0}\3\2\2\2\u04e1"+
		"\u04e5\7I\2\2\u04e2\u04e4\13\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e7\3\2"+
		"\2\2\u04e5\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7"+
		"\u04e5\3\2\2\2\u04e8\u04e9\7J\2\2\u04e9\177\3\2\2\2N\u0088\u008a\u0093"+
		"\u0099\u009e\u00a3\u00a9\u00b7\u00c5\u00dc\u00e5\u00ee\u00f6\u0100\u0109"+
		"\u0111\u0115\u011e\u0128\u0131\u013c\u0146\u014f\u0153\u0158\u015f\u0163"+
		"\u0168\u0177\u0194\u0199\u01a0\u01a6\u01be\u01c3\u0222\u0227\u022e\u0236"+
		"\u0261\u02be\u02c8\u02d4\u02e1\u02ee\u02fc\u030a\u0317\u0323\u0331\u0342"+
		"\u0353\u035f\u0369\u0375\u0379\u038a\u0393\u03df\u041e\u042a\u0448\u0452"+
		"\u0458\u0466\u048d\u049a\u04a6\u04ab\u04bd\u04c6\u04ce\u04d3\u04d5\u04db"+
		"\u04e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}