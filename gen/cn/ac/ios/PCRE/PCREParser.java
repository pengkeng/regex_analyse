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
		RULE_backreference_or_octal = 19, RULE_character_octal = 20, RULE_capture = 21, 
		RULE_name_caturpe = 22, RULE_non_capture = 23, RULE_atomic_non_capture = 24, 
		RULE_reset_non_capture = 25, RULE_base_non_capture = 26, RULE_comment = 27, 
		RULE_option = 28, RULE_option_flags = 29, RULE_option_flag = 30, RULE_global_option_flags = 31, 
		RULE_global_option_flag = 32, RULE_look_around = 33, RULE_look_ahead_positive = 34, 
		RULE_look_ahead_negative = 35, RULE_look_behind_positive = 36, RULE_look_behind_negative = 37, 
		RULE_embedded_code = 38, RULE_define_group = 39, RULE_subroutine_reference = 40, 
		RULE_conditional = 41, RULE_backtrack_control = 42, RULE_newline_convention = 43, 
		RULE_callout = 44, RULE_atom = 45, RULE_anchor = 46, RULE_cc_atom = 47, 
		RULE_shared_atom = 48, RULE_literal = 49, RULE_cc_literal = 50, RULE_shared_literal = 51, 
		RULE_number = 52, RULE_octal_char = 53, RULE_hex_char = 54, RULE_octal_digit = 55, 
		RULE_hex_digit = 56, RULE_digits = 57, RULE_digit = 58, RULE_name = 59, 
		RULE_alpha_nums = 60, RULE_non_close_parens = 61, RULE_non_close_paren = 62, 
		RULE_letter = 63, RULE_block_quoted = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "global_option_pattern", "alternation", "expr", "element", "quantifier", 
			"quantifier_greedy", "quantifier_lazy", "quantifier_possesstive", "quantifier_Kleene", 
			"quantifier_add", "quantifier_option", "quantifier_range", "character_class", 
			"negative_character_class", "character_class_intersection", "backreference", 
			"backreference_or_index", "backreference_or_name", "backreference_or_octal", 
			"character_octal", "capture", "name_caturpe", "non_capture", "atomic_non_capture", 
			"reset_non_capture", "base_non_capture", "comment", "option", "option_flags", 
			"option_flag", "global_option_flags", "global_option_flag", "look_around", 
			"look_ahead_positive", "look_ahead_negative", "look_behind_positive", 
			"look_behind_negative", "embedded_code", "define_group", "subroutine_reference", 
			"conditional", "backtrack_control", "newline_convention", "callout", 
			"atom", "anchor", "cc_atom", "shared_atom", "literal", "cc_literal", 
			"shared_literal", "number", "octal_char", "hex_char", "octal_digit", 
			"hex_digit", "digits", "digit", "name", "alpha_nums", "non_close_parens", 
			"non_close_paren", "letter", "block_quoted"
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				alternation();
				setState(131);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				global_option_pattern();
				setState(134);
				expr();
				setState(135);
				alternation();
				setState(136);
				global_option_pattern();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ILC - 83)) | (1L << (MLC - 83)) | (1L << (SLC - 83)) | (1L << (XLC - 83)) | (1L << (JUC - 83)) | (1L << (UUC - 83)))) != 0)) {
					{
					setState(137);
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
			setState(142);
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
			setState(144);
			expr();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(Pipe);
					setState(146);
					expr();
					}
					} 
				}
				setState(151);
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
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					element();
					}
					} 
				}
				setState(157);
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
			setState(158);
			atom();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(159);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				quantifier_greedy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				quantifier_lazy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				quantifier_Kleene();
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				quantifier_add();
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				quantifier_option();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				quantifier_Kleene();
				setState(174);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				quantifier_add();
				setState(177);
				match(QuestionMark);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				quantifier_option();
				setState(180);
				match(QuestionMark);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				quantifier_range();
				setState(183);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				quantifier_Kleene();
				setState(188);
				match(Plus);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				quantifier_add();
				setState(191);
				match(Plus);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				quantifier_option();
				setState(194);
				match(Plus);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				quantifier_range();
				setState(197);
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
			setState(201);
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
			setState(203);
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
			setState(205);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(OpenBrace);
				setState(208);
				number();
				setState(209);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(OpenBrace);
				setState(212);
				number();
				setState(213);
				match(Comma);
				setState(214);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(OpenBrace);
				setState(217);
				number();
				setState(218);
				match(Comma);
				setState(219);
				number();
				setState(220);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				negative_character_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(CharacterClassStart);
				setState(226);
				match(CharacterClassEnd);
				setState(227);
				match(Hyphen);
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					character_class_intersection();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(233);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(CharacterClassStart);
				setState(236);
				match(CharacterClassEnd);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(237);
					character_class_intersection();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(CharacterClassStart);
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					character_class_intersection();
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(250);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(CharacterClassStart);
				setState(253);
				match(CharacterClassEnd);
				setState(254);
				match(Hyphen);
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					cc_atom();
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(260);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(CharacterClassStart);
				setState(263);
				match(CharacterClassEnd);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(264);
					cc_atom();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(CharacterClassEnd);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(CharacterClassStart);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(272);
					cc_atom();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(CharacterClassStart);
				setState(282);
				match(Caret);
				setState(283);
				match(CharacterClassEnd);
				setState(284);
				match(Hyphen);
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285);
					character_class_intersection();
					}
					}
					setState(288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(290);
				match(CharacterClassEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(CharacterClassStart);
				setState(293);
				match(Caret);
				setState(294);
				match(CharacterClassEnd);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(295);
					character_class_intersection();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(CharacterClassStart);
				setState(303);
				match(Caret);
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					character_class_intersection();
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(309);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(CharacterClassStart);
				setState(312);
				match(Caret);
				setState(313);
				match(CharacterClassEnd);
				setState(314);
				match(Hyphen);
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(315);
					cc_atom();
					}
					}
					setState(318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0) );
				setState(320);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(CharacterClassStart);
				setState(323);
				match(Caret);
				setState(324);
				match(CharacterClassEnd);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(325);
					cc_atom();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(CharacterClassStart);
				setState(333);
				match(Caret);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Quoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Slash - 64)) | (1L << (Semicolon - 64)) | (1L << (Mail - 64)) | (1L << (Percent - 64)) | (1L << (Wave - 64)) | (1L << (DoubleQuote - 64)) | (1L << (Backquote - 64)) | (1L << (BackSlashq - 64)) | (1L << (BackSlashe - 64)) | (1L << (BackSlashu - 64)) | (1L << (BackSlashx - 64)) | (1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (D2 - 128)) | (1L << (D3 - 128)) | (1L << (D4 - 128)) | (1L << (D5 - 128)) | (1L << (D6 - 128)) | (1L << (D7 - 128)) | (1L << (D8 - 128)) | (1L << (D9 - 128)) | (1L << (D0 - 128)) | (1L << (OtherChar - 128)))) != 0)) {
					{
					{
					setState(334);
					cc_atom();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
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
			setState(344); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					cc_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(346); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(355); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
					match(Ampersand);
					setState(349);
					match(Ampersand);
					setState(351); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(350);
							cc_atom();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(353); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); 
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				backreference_or_octal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				backreference_or_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(SubroutineOrNamedReferenceStartG);
				setState(365);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(SubroutineOrNamedReferenceStartG);
				setState(367);
				match(OpenBrace);
				setState(368);
				number();
				setState(369);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(SubroutineOrNamedReferenceStartG);
				setState(372);
				match(OpenBrace);
				setState(373);
				match(Hyphen);
				setState(374);
				number();
				setState(375);
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
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(NamedReferenceStartK);
				setState(380);
				match(LessThan);
				setState(381);
				name();
				setState(382);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(NamedReferenceStartK);
				setState(385);
				match(SingleQuote);
				setState(386);
				name();
				setState(387);
				match(SingleQuote);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(SubroutineOrNamedReferenceStartG);
				setState(390);
				match(OpenBrace);
				setState(391);
				name();
				setState(392);
				match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(NamedReferenceStartK);
				setState(395);
				match(OpenBrace);
				setState(396);
				name();
				setState(397);
				match(CloseBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(OpenParen);
				setState(400);
				match(QuestionMark);
				setState(401);
				match(PUC);
				setState(402);
				match(Equals);
				setState(403);
				name();
				setState(404);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(Backslash);
				setState(410);
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

	public static class Character_octalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Character_octalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCharacter_octal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCharacter_octal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCharacter_octal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_octalContext character_octal() throws RecognitionException {
		Character_octalContext _localctx = new Character_octalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_character_octal);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(Backslash);
				setState(415);
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
		enterRule(_localctx, 42, RULE_capture);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				name_caturpe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(OpenParen);
				setState(420);
				alternation();
				setState(421);
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
		enterRule(_localctx, 44, RULE_name_caturpe);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(OpenParen);
				setState(426);
				match(QuestionMark);
				setState(427);
				match(LessThan);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hyphen) {
					{
					setState(428);
					match(Hyphen);
					}
				}

				setState(431);
				name();
				setState(432);
				match(GreaterThan);
				setState(433);
				alternation();
				setState(434);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(OpenParen);
				setState(437);
				match(QuestionMark);
				setState(438);
				match(SingleQuote);
				setState(439);
				name();
				setState(440);
				match(SingleQuote);
				setState(441);
				alternation();
				setState(442);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(OpenParen);
				setState(445);
				match(QuestionMark);
				setState(446);
				match(PUC);
				setState(447);
				match(LessThan);
				setState(448);
				name();
				setState(449);
				match(GreaterThan);
				setState(450);
				alternation();
				setState(451);
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
		enterRule(_localctx, 46, RULE_non_capture);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				base_non_capture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				reset_non_capture();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
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
		enterRule(_localctx, 48, RULE_atomic_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(OpenParen);
			setState(461);
			match(QuestionMark);
			setState(462);
			match(GreaterThan);
			setState(463);
			alternation();
			setState(464);
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
		enterRule(_localctx, 50, RULE_reset_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(OpenParen);
			setState(467);
			match(QuestionMark);
			setState(468);
			match(Pipe);
			setState(469);
			alternation();
			setState(470);
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
		enterRule(_localctx, 52, RULE_base_non_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(OpenParen);
			setState(473);
			match(QuestionMark);
			setState(474);
			match(Colon);
			setState(475);
			alternation();
			setState(476);
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
		enterRule(_localctx, 54, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(OpenParen);
			setState(479);
			match(QuestionMark);
			setState(480);
			match(Hash);
			setState(481);
			non_close_parens();
			setState(482);
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
		enterRule(_localctx, 56, RULE_option);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(OpenParen);
				setState(485);
				match(QuestionMark);
				setState(486);
				option_flags();
				setState(487);
				match(Hyphen);
				setState(488);
				option_flags();
				setState(489);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(OpenParen);
				setState(492);
				match(QuestionMark);
				setState(493);
				option_flags();
				setState(494);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(OpenParen);
				setState(497);
				match(QuestionMark);
				setState(498);
				match(Hyphen);
				setState(499);
				option_flags();
				setState(500);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(OpenParen);
				setState(503);
				match(QuestionMark);
				setState(504);
				option_flags();
				setState(505);
				match(Colon);
				setState(506);
				alternation();
				setState(507);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				match(OpenParen);
				setState(510);
				match(QuestionMark);
				setState(511);
				match(Hyphen);
				setState(512);
				option_flags();
				setState(513);
				match(Colon);
				setState(514);
				alternation();
				setState(515);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				match(OpenParen);
				setState(518);
				match(Star);
				setState(519);
				match(NUC);
				setState(520);
				match(OUC);
				setState(521);
				match(Underscore);
				setState(522);
				match(SUC);
				setState(523);
				match(TUC);
				setState(524);
				match(AUC);
				setState(525);
				match(RUC);
				setState(526);
				match(TUC);
				setState(527);
				match(Underscore);
				setState(528);
				match(OUC);
				setState(529);
				match(PUC);
				setState(530);
				match(TUC);
				setState(531);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				match(OpenParen);
				setState(533);
				match(Star);
				setState(534);
				match(UUC);
				setState(535);
				match(TUC);
				setState(536);
				match(FUC);
				setState(537);
				match(D8);
				setState(538);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(539);
				match(OpenParen);
				setState(540);
				match(Star);
				setState(541);
				match(UUC);
				setState(542);
				match(TUC);
				setState(543);
				match(FUC);
				setState(544);
				match(D1);
				setState(545);
				match(D6);
				setState(546);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
				match(OpenParen);
				setState(548);
				match(Star);
				setState(549);
				match(UUC);
				setState(550);
				match(CUC);
				setState(551);
				match(PUC);
				setState(552);
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
		enterRule(_localctx, 58, RULE_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(555);
				option_flag();
				}
				}
				setState(558); 
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
		enterRule(_localctx, 60, RULE_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 62, RULE_global_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				global_option_flag();
				}
				}
				setState(565); 
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
		enterRule(_localctx, 64, RULE_global_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 66, RULE_look_around);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				look_ahead_positive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				look_ahead_negative();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				look_behind_positive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
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
		enterRule(_localctx, 68, RULE_look_ahead_positive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(OpenParen);
			setState(576);
			match(QuestionMark);
			setState(577);
			match(Equals);
			setState(578);
			alternation();
			setState(579);
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
		enterRule(_localctx, 70, RULE_look_ahead_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(OpenParen);
			setState(582);
			match(QuestionMark);
			setState(583);
			match(Exclamation);
			setState(584);
			alternation();
			setState(585);
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
		enterRule(_localctx, 72, RULE_look_behind_positive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(OpenParen);
			setState(588);
			match(QuestionMark);
			setState(589);
			match(LessThan);
			setState(590);
			match(Equals);
			setState(591);
			alternation();
			setState(592);
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
		enterRule(_localctx, 74, RULE_look_behind_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(OpenParen);
			setState(595);
			match(QuestionMark);
			setState(596);
			match(LessThan);
			setState(597);
			match(Exclamation);
			setState(598);
			alternation();
			setState(599);
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
		enterRule(_localctx, 76, RULE_embedded_code);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(OpenParen);
				setState(602);
				match(QuestionMark);
				setState(603);
				match(QuestionMark);
				setState(604);
				match(OpenBrace);
				setState(605);
				alternation();
				setState(606);
				match(CloseBrace);
				setState(607);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(OpenParen);
				setState(610);
				match(QuestionMark);
				setState(611);
				match(OpenBrace);
				setState(612);
				alternation();
				setState(613);
				match(CloseBrace);
				setState(614);
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
		enterRule(_localctx, 78, RULE_define_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(OpenParen);
			setState(619);
			match(QuestionMark);
			setState(620);
			match(OpenParen);
			setState(621);
			match(DUC);
			setState(622);
			match(EUC);
			setState(623);
			match(FUC);
			setState(624);
			match(IUC);
			setState(625);
			match(NUC);
			setState(626);
			match(EUC);
			setState(627);
			match(CloseParen);
			setState(628);
			name_caturpe();
			setState(629);
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
		enterRule(_localctx, 80, RULE_subroutine_reference);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(OpenParen);
				setState(632);
				match(QuestionMark);
				setState(633);
				match(RUC);
				setState(634);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(OpenParen);
				setState(636);
				match(QuestionMark);
				setState(637);
				number();
				setState(638);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				match(OpenParen);
				setState(641);
				match(QuestionMark);
				setState(642);
				match(Plus);
				setState(643);
				number();
				setState(644);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				match(OpenParen);
				setState(647);
				match(QuestionMark);
				setState(648);
				match(Hyphen);
				setState(649);
				number();
				setState(650);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				match(OpenParen);
				setState(653);
				match(QuestionMark);
				setState(654);
				match(Ampersand);
				setState(655);
				name();
				setState(656);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				match(OpenParen);
				setState(659);
				match(QuestionMark);
				setState(660);
				match(PUC);
				setState(661);
				match(GreaterThan);
				setState(662);
				name();
				setState(663);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				match(SubroutineOrNamedReferenceStartG);
				setState(666);
				match(LessThan);
				setState(667);
				name();
				setState(668);
				match(GreaterThan);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(670);
				match(SubroutineOrNamedReferenceStartG);
				setState(671);
				match(SingleQuote);
				setState(672);
				name();
				setState(673);
				match(SingleQuote);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(675);
				match(SubroutineOrNamedReferenceStartG);
				setState(676);
				match(LessThan);
				setState(677);
				number();
				setState(678);
				match(GreaterThan);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(680);
				match(SubroutineOrNamedReferenceStartG);
				setState(681);
				match(SingleQuote);
				setState(682);
				number();
				setState(683);
				match(SingleQuote);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(685);
				match(SubroutineOrNamedReferenceStartG);
				setState(686);
				match(LessThan);
				setState(687);
				match(Plus);
				setState(688);
				number();
				setState(689);
				match(GreaterThan);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(691);
				match(SubroutineOrNamedReferenceStartG);
				setState(692);
				match(SingleQuote);
				setState(693);
				match(Plus);
				setState(694);
				number();
				setState(695);
				match(SingleQuote);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(697);
				match(SubroutineOrNamedReferenceStartG);
				setState(698);
				match(LessThan);
				setState(699);
				match(Hyphen);
				setState(700);
				number();
				setState(701);
				match(GreaterThan);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(703);
				match(SubroutineOrNamedReferenceStartG);
				setState(704);
				match(SingleQuote);
				setState(705);
				match(Hyphen);
				setState(706);
				number();
				setState(707);
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
		enterRule(_localctx, 82, RULE_conditional);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(OpenParen);
				setState(712);
				match(QuestionMark);
				setState(713);
				match(OpenParen);
				setState(714);
				number();
				setState(715);
				match(CloseParen);
				setState(716);
				alternation();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(717);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(718);
					alternation();
					}
				}

				setState(721);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(OpenParen);
				setState(724);
				match(QuestionMark);
				setState(725);
				match(LessThan);
				setState(726);
				number();
				setState(727);
				match(GreaterThan);
				setState(728);
				alternation();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(729);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(730);
					alternation();
					}
				}

				setState(733);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(OpenParen);
				setState(736);
				match(QuestionMark);
				setState(737);
				match(OpenParen);
				setState(738);
				match(Plus);
				setState(739);
				number();
				setState(740);
				match(CloseParen);
				setState(741);
				alternation();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(742);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(743);
					alternation();
					}
				}

				setState(746);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(OpenParen);
				setState(749);
				match(QuestionMark);
				setState(750);
				match(OpenParen);
				setState(751);
				match(Hyphen);
				setState(752);
				number();
				setState(753);
				match(CloseParen);
				setState(754);
				alternation();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(755);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(756);
					alternation();
					}
				}

				setState(759);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(761);
				match(OpenParen);
				setState(762);
				match(QuestionMark);
				setState(763);
				match(OpenParen);
				setState(764);
				match(LessThan);
				setState(765);
				name();
				setState(766);
				match(GreaterThan);
				setState(767);
				match(CloseParen);
				setState(768);
				alternation();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(769);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(770);
					alternation();
					}
				}

				setState(773);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				match(OpenParen);
				setState(776);
				match(QuestionMark);
				setState(777);
				match(OpenParen);
				setState(778);
				match(SingleQuote);
				setState(779);
				name();
				setState(780);
				match(SingleQuote);
				setState(781);
				match(CloseParen);
				setState(782);
				alternation();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(784);
					alternation();
					}
				}

				setState(787);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(789);
				match(OpenParen);
				setState(790);
				match(QuestionMark);
				setState(791);
				match(OpenParen);
				setState(792);
				match(RUC);
				setState(793);
				number();
				setState(794);
				match(CloseParen);
				setState(795);
				alternation();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(796);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(797);
					alternation();
					}
				}

				setState(800);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(802);
				match(OpenParen);
				setState(803);
				match(QuestionMark);
				setState(804);
				match(OpenParen);
				setState(805);
				match(RUC);
				setState(806);
				match(CloseParen);
				setState(807);
				alternation();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(809);
					alternation();
					}
				}

				setState(812);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(814);
				match(OpenParen);
				setState(815);
				match(QuestionMark);
				setState(816);
				match(OpenParen);
				setState(817);
				match(RUC);
				setState(818);
				match(Ampersand);
				setState(819);
				name();
				setState(820);
				match(CloseParen);
				setState(821);
				alternation();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(822);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(823);
					alternation();
					}
				}

				setState(826);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				match(OpenParen);
				setState(829);
				match(QuestionMark);
				setState(830);
				match(OpenParen);
				setState(831);
				match(DUC);
				setState(832);
				match(EUC);
				setState(833);
				match(FUC);
				setState(834);
				match(IUC);
				setState(835);
				match(NUC);
				setState(836);
				match(EUC);
				setState(837);
				match(CloseParen);
				setState(838);
				alternation();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(839);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(840);
					alternation();
					}
				}

				setState(843);
				match(CloseParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(845);
				match(OpenParen);
				setState(846);
				match(QuestionMark);
				setState(847);
				match(OpenParen);
				setState(848);
				match(ALC);
				setState(849);
				match(SLC);
				setState(850);
				match(SLC);
				setState(851);
				match(ELC);
				setState(852);
				match(RLC);
				setState(853);
				match(TLC);
				setState(854);
				match(CloseParen);
				setState(855);
				alternation();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(856);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(857);
					alternation();
					}
				}

				setState(860);
				match(CloseParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(862);
				match(OpenParen);
				setState(863);
				match(QuestionMark);
				setState(864);
				match(OpenParen);
				setState(865);
				name();
				setState(866);
				match(CloseParen);
				setState(867);
				alternation();
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(868);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(869);
					alternation();
					}
				}

				setState(872);
				match(CloseParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(874);
				match(OpenParen);
				setState(875);
				match(QuestionMark);
				setState(876);
				look_around();
				setState(877);
				alternation();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(878);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(879);
					alternation();
					}
				}

				setState(882);
				match(CloseParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(884);
				match(OpenParen);
				setState(885);
				match(QuestionMark);
				setState(886);
				match(OpenParen);
				setState(887);
				alternation();
				setState(888);
				match(CloseParen);
				setState(889);
				alternation();
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe || _la==Colon) {
					{
					setState(890);
					_la = _input.LA(1);
					if ( !(_la==Pipe || _la==Colon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(891);
					alternation();
					}
				}

				setState(894);
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
		enterRule(_localctx, 84, RULE_backtrack_control);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(OpenParen);
				setState(899);
				match(Star);
				setState(900);
				match(AUC);
				setState(901);
				match(CUC);
				setState(902);
				match(CUC);
				setState(903);
				match(EUC);
				setState(904);
				match(PUC);
				setState(905);
				match(TUC);
				setState(906);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				match(OpenParen);
				setState(908);
				match(Star);
				setState(909);
				match(FUC);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUC) {
					{
					setState(910);
					match(AUC);
					setState(911);
					match(IUC);
					setState(912);
					match(LUC);
					}
				}

				setState(915);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				match(OpenParen);
				setState(917);
				match(Star);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUC) {
					{
					setState(918);
					match(MUC);
					setState(919);
					match(AUC);
					setState(920);
					match(RUC);
					setState(921);
					match(KUC);
					}
				}

				setState(924);
				match(Colon);
				setState(925);
				match(NUC);
				setState(926);
				match(AUC);
				setState(927);
				match(MUC);
				setState(928);
				match(EUC);
				setState(929);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				match(OpenParen);
				setState(931);
				match(Star);
				setState(932);
				match(CUC);
				setState(933);
				match(OUC);
				setState(934);
				match(MUC);
				setState(935);
				match(MUC);
				setState(936);
				match(IUC);
				setState(937);
				match(TUC);
				setState(938);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(939);
				match(OpenParen);
				setState(940);
				match(Star);
				setState(941);
				match(PUC);
				setState(942);
				match(RUC);
				setState(943);
				match(UUC);
				setState(944);
				match(NUC);
				setState(945);
				match(EUC);
				setState(946);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(947);
				match(OpenParen);
				setState(948);
				match(Star);
				setState(949);
				match(PUC);
				setState(950);
				match(RUC);
				setState(951);
				match(UUC);
				setState(952);
				match(NUC);
				setState(953);
				match(EUC);
				setState(954);
				match(Colon);
				setState(955);
				match(NUC);
				setState(956);
				match(AUC);
				setState(957);
				match(MUC);
				setState(958);
				match(EUC);
				setState(959);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(960);
				match(OpenParen);
				setState(961);
				match(Star);
				setState(962);
				match(SUC);
				setState(963);
				match(KUC);
				setState(964);
				match(IUC);
				setState(965);
				match(PUC);
				setState(966);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(967);
				match(OpenParen);
				setState(968);
				match(Star);
				setState(969);
				match(SUC);
				setState(970);
				match(KUC);
				setState(971);
				match(IUC);
				setState(972);
				match(PUC);
				setState(973);
				match(Colon);
				setState(974);
				match(NUC);
				setState(975);
				match(AUC);
				setState(976);
				match(MUC);
				setState(977);
				match(EUC);
				setState(978);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(979);
				match(OpenParen);
				setState(980);
				match(Star);
				setState(981);
				match(TUC);
				setState(982);
				match(HUC);
				setState(983);
				match(EUC);
				setState(984);
				match(NUC);
				setState(985);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(986);
				match(OpenParen);
				setState(987);
				match(Star);
				setState(988);
				match(TUC);
				setState(989);
				match(HUC);
				setState(990);
				match(EUC);
				setState(991);
				match(NUC);
				setState(992);
				match(Colon);
				setState(993);
				match(NUC);
				setState(994);
				match(AUC);
				setState(995);
				match(MUC);
				setState(996);
				match(EUC);
				setState(997);
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
		enterRule(_localctx, 86, RULE_newline_convention);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				match(OpenParen);
				setState(1001);
				match(Star);
				setState(1002);
				match(CUC);
				setState(1003);
				match(RUC);
				setState(1004);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(OpenParen);
				setState(1006);
				match(Star);
				setState(1007);
				match(LUC);
				setState(1008);
				match(FUC);
				setState(1009);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				match(OpenParen);
				setState(1011);
				match(Star);
				setState(1012);
				match(CUC);
				setState(1013);
				match(RUC);
				setState(1014);
				match(LUC);
				setState(1015);
				match(FUC);
				setState(1016);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				match(OpenParen);
				setState(1018);
				match(Star);
				setState(1019);
				match(AUC);
				setState(1020);
				match(NUC);
				setState(1021);
				match(YUC);
				setState(1022);
				match(CUC);
				setState(1023);
				match(RUC);
				setState(1024);
				match(LUC);
				setState(1025);
				match(FUC);
				setState(1026);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1027);
				match(OpenParen);
				setState(1028);
				match(Star);
				setState(1029);
				match(AUC);
				setState(1030);
				match(NUC);
				setState(1031);
				match(YUC);
				setState(1032);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1033);
				match(OpenParen);
				setState(1034);
				match(Star);
				setState(1035);
				match(BUC);
				setState(1036);
				match(SUC);
				setState(1037);
				match(RUC);
				setState(1038);
				match(Underscore);
				setState(1039);
				match(AUC);
				setState(1040);
				match(NUC);
				setState(1041);
				match(YUC);
				setState(1042);
				match(CUC);
				setState(1043);
				match(RUC);
				setState(1044);
				match(LUC);
				setState(1045);
				match(FUC);
				setState(1046);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1047);
				match(OpenParen);
				setState(1048);
				match(Star);
				setState(1049);
				match(BUC);
				setState(1050);
				match(SUC);
				setState(1051);
				match(RUC);
				setState(1052);
				match(Underscore);
				setState(1053);
				match(UUC);
				setState(1054);
				match(NUC);
				setState(1055);
				match(IUC);
				setState(1056);
				match(CUC);
				setState(1057);
				match(OUC);
				setState(1058);
				match(DUC);
				setState(1059);
				match(EUC);
				setState(1060);
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
		enterRule(_localctx, 88, RULE_callout);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(OpenParen);
				setState(1064);
				match(QuestionMark);
				setState(1065);
				match(CUC);
				setState(1066);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				match(OpenParen);
				setState(1068);
				match(QuestionMark);
				setState(1069);
				match(CUC);
				setState(1070);
				number();
				setState(1071);
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
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
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
		enterRule(_localctx, 90, RULE_atom);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				subroutine_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				shared_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				anchor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
				character_class();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080);
				capture();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				non_capture();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1082);
				comment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1083);
				option();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1084);
				look_around();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1085);
				backreference();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1086);
				conditional();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1087);
				define_group();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1088);
				embedded_code();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1089);
				backtrack_control();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1090);
				newline_convention();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1091);
				callout();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1092);
				match(ResetStartMatch);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1093);
				match(OneDataUnit);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1094);
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

	public static class AnchorContext extends ParserRuleContext {
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public TerminalNode StartOfSubject() { return getToken(PCREParser.StartOfSubject, 0); }
		public TerminalNode WordBoundary() { return getToken(PCREParser.WordBoundary, 0); }
		public TerminalNode NonWordBoundary() { return getToken(PCREParser.NonWordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(PCREParser.EndOfSubjectOrLine, 0); }
		public TerminalNode EndOfSubjectOrLineEndOfSubject() { return getToken(PCREParser.EndOfSubjectOrLineEndOfSubject, 0); }
		public TerminalNode EndOfSubject() { return getToken(PCREParser.EndOfSubject, 0); }
		public TerminalNode PreviousMatchInSubject() { return getToken(PCREParser.PreviousMatchInSubject, 0); }
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_anchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Caret) | (1L << WordBoundary) | (1L << NonWordBoundary) | (1L << StartOfSubject) | (1L << EndOfSubjectOrLine) | (1L << EndOfSubjectOrLineEndOfSubject) | (1L << EndOfSubject) | (1L << PreviousMatchInSubject))) != 0)) ) {
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
		public Character_octalContext character_octal() {
			return getRuleContext(Character_octalContext.class,0);
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
		enterRule(_localctx, 94, RULE_cc_atom);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				character_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				cc_literal();
				setState(1101);
				match(Hyphen);
				setState(1102);
				cc_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				shared_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105);
				cc_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1106);
				character_octal();
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
		public TerminalNode Dot() { return getToken(PCREParser.Dot, 0); }
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
		enterRule(_localctx, 96, RULE_shared_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ControlChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << SingleCharWithProperty) | (1L << CharWithoutProperty) | (1L << SingleCharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_literal);
		try {
			setState(1113);
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
				setState(1111);
				shared_literal();
				}
				break;
			case CharacterClassEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
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
		enterRule(_localctx, 100, RULE_cc_literal);
		try {
			setState(1127);
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
				setState(1115);
				shared_literal();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(Dot);
				}
				break;
			case CharacterClassStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				match(CharacterClassStart);
				}
				break;
			case Caret:
				enterOuterAlt(_localctx, 4);
				{
				setState(1118);
				match(Caret);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 5);
				{
				setState(1119);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 6);
				{
				setState(1120);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 7);
				{
				setState(1121);
				match(Star);
				}
				break;
			case WordBoundary:
				enterOuterAlt(_localctx, 8);
				{
				setState(1122);
				match(WordBoundary);
				}
				break;
			case EndOfSubjectOrLine:
				enterOuterAlt(_localctx, 9);
				{
				setState(1123);
				match(EndOfSubjectOrLine);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 10);
				{
				setState(1124);
				match(Pipe);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 11);
				{
				setState(1125);
				match(OpenParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 12);
				{
				setState(1126);
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
		enterRule(_localctx, 102, RULE_shared_literal);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				hex_char();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				letter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				digit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1133);
				block_quoted();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				match(BellChar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1135);
				match(EscapeChar);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1136);
				match(FormFeed);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1137);
				match(NewLine);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1138);
				match(CarriageReturn);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1139);
				match(Tab);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1140);
				match(Quoted);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1141);
				match(OpenBrace);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1142);
				match(CloseBrace);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1143);
				match(Comma);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1144);
				match(Hyphen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1145);
				match(LessThan);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1146);
				match(GreaterThan);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1147);
				match(SingleQuote);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1148);
				match(Underscore);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1149);
				match(Colon);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1150);
				match(Hash);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1151);
				match(Equals);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1152);
				match(Exclamation);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1153);
				match(Ampersand);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1154);
				match(OtherChar);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1155);
				match(Slash);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1156);
				match(Semicolon);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1157);
				match(Mail);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1158);
				match(Percent);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1159);
				match(Wave);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1160);
				match(DoubleQuote);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1161);
				match(Backquote);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1162);
				match(BackSlashq);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1163);
				match(BackSlashe);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1164);
				match(BackSlashu);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1165);
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
		enterRule(_localctx, 104, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
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
		enterRule(_localctx, 106, RULE_octal_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1170);
				match(Backslash);
				setState(1171);
				_la = _input.LA(1);
				if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (D1 - 127)) | (1L << (D2 - 127)) | (1L << (D3 - 127)) | (1L << (D0 - 127)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1172);
				octal_digit();
				setState(1173);
				octal_digit();
				}
				break;
			case 2:
				{
				setState(1175);
				match(Backslash);
				setState(1176);
				octal_digit();
				setState(1177);
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
		enterRule(_localctx, 108, RULE_hex_char);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(BackSlashx);
				setState(1196);
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
					setState(1182);
					hex_digit();
					setState(1183);
					hex_digit();
					}
					break;
				case OpenBrace:
					{
					setState(1185);
					match(OpenBrace);
					setState(1186);
					hex_digit();
					setState(1187);
					hex_digit();
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (D1 - 75)) | (1L << (D2 - 75)) | (1L << (D3 - 75)) | (1L << (D4 - 75)) | (1L << (D5 - 75)) | (1L << (D6 - 75)) | (1L << (D7 - 75)) | (1L << (D8 - 75)) | (1L << (D9 - 75)) | (1L << (D0 - 75)))) != 0)) {
						{
						{
						setState(1188);
						hex_digit();
						}
						}
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1194);
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
				setState(1198);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==BackSlashu) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				setState(1204);
				hex_digit();
				setState(1205);
				hex_digit();
				setState(1206);
				hex_digit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==BackSlashu) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1209);
				hex_digit();
				setState(1210);
				hex_digit();
				setState(1211);
				hex_digit();
				setState(1212);
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
		enterRule(_localctx, 110, RULE_octal_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
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
		enterRule(_localctx, 112, RULE_hex_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
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
		enterRule(_localctx, 114, RULE_digits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1221); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1220);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 116, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
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
		enterRule(_localctx, 118, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
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
		enterRule(_localctx, 120, RULE_alpha_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
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
				setState(1229);
				letter();
				}
				break;
			case Underscore:
				{
				setState(1230);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Underscore || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ALC - 75)) | (1L << (BLC - 75)) | (1L << (CLC - 75)) | (1L << (DLC - 75)) | (1L << (ELC - 75)) | (1L << (FLC - 75)) | (1L << (GLC - 75)) | (1L << (HLC - 75)) | (1L << (ILC - 75)) | (1L << (JLC - 75)) | (1L << (KLC - 75)) | (1L << (LLC - 75)) | (1L << (MLC - 75)) | (1L << (NLC - 75)) | (1L << (OLC - 75)) | (1L << (PLC - 75)) | (1L << (QLC - 75)) | (1L << (RLC - 75)) | (1L << (SLC - 75)) | (1L << (TLC - 75)) | (1L << (ULC - 75)) | (1L << (VLC - 75)) | (1L << (WLC - 75)) | (1L << (XLC - 75)) | (1L << (YLC - 75)) | (1L << (ZLC - 75)) | (1L << (AUC - 75)) | (1L << (BUC - 75)) | (1L << (CUC - 75)) | (1L << (DUC - 75)) | (1L << (EUC - 75)) | (1L << (FUC - 75)) | (1L << (GUC - 75)) | (1L << (HUC - 75)) | (1L << (IUC - 75)) | (1L << (JUC - 75)) | (1L << (KUC - 75)) | (1L << (LUC - 75)) | (1L << (MUC - 75)) | (1L << (NUC - 75)) | (1L << (OUC - 75)) | (1L << (PUC - 75)) | (1L << (QUC - 75)) | (1L << (RUC - 75)) | (1L << (SUC - 75)) | (1L << (TUC - 75)) | (1L << (UUC - 75)) | (1L << (VUC - 75)) | (1L << (WUC - 75)) | (1L << (XUC - 75)) | (1L << (YUC - 75)) | (1L << (ZUC - 75)) | (1L << (D1 - 75)) | (1L << (D2 - 75)) | (1L << (D3 - 75)) | (1L << (D4 - 75)) | (1L << (D5 - 75)) | (1L << (D6 - 75)) | (1L << (D7 - 75)) | (1L << (D8 - 75)) | (1L << (D9 - 75)) | (1L << (D0 - 75)))) != 0)) {
				{
				setState(1236);
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
					setState(1233);
					letter();
					}
					break;
				case Underscore:
					{
					setState(1234);
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
					setState(1235);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1240);
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
		enterRule(_localctx, 122, RULE_non_close_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1241);
				non_close_paren();
				}
				}
				setState(1244); 
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
		enterRule(_localctx, 124, RULE_non_close_paren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
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
		enterRule(_localctx, 126, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
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
		enterRule(_localctx, 128, RULE_block_quoted);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(BackSlashq);
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1251);
					matchWildcard();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(1257);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008b\u04ee\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u008d"+
		"\n\2\5\2\u008f\n\2\3\3\3\3\3\4\3\4\3\4\7\4\u0096\n\4\f\4\16\4\u0099\13"+
		"\4\3\5\7\5\u009c\n\5\f\5\16\5\u009f\13\5\3\6\3\6\5\6\u00a3\n\6\3\7\3\7"+
		"\3\7\5\7\u00a8\n\7\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00ca\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\6\17\u00e8\n\17\r\17\16\17\u00e9\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u00f1\n\17\f\17\16\17\u00f4\13\17\3\17\3\17\3"+
		"\17\6\17\u00f9\n\17\r\17\16\17\u00fa\3\17\3\17\3\17\3\17\3\17\3\17\6\17"+
		"\u0103\n\17\r\17\16\17\u0104\3\17\3\17\3\17\3\17\3\17\7\17\u010c\n\17"+
		"\f\17\16\17\u010f\13\17\3\17\3\17\3\17\7\17\u0114\n\17\f\17\16\17\u0117"+
		"\13\17\3\17\5\17\u011a\n\17\3\20\3\20\3\20\3\20\3\20\6\20\u0121\n\20\r"+
		"\20\16\20\u0122\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012b\n\20\f\20\16"+
		"\20\u012e\13\20\3\20\3\20\3\20\3\20\6\20\u0134\n\20\r\20\16\20\u0135\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u013f\n\20\r\20\16\20\u0140\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0149\n\20\f\20\16\20\u014c\13\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0152\n\20\f\20\16\20\u0155\13\20\3\20\5\20\u0158"+
		"\n\20\3\21\6\21\u015b\n\21\r\21\16\21\u015c\3\21\3\21\3\21\6\21\u0162"+
		"\n\21\r\21\16\21\u0163\6\21\u0166\n\21\r\21\16\21\u0167\3\22\3\22\3\22"+
		"\5\22\u016d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u017c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0199\n\24\3\25\3\25\3\25\5\25\u019e\n\25\3"+
		"\26\3\26\3\26\5\26\u01a3\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u01aa\n\27"+
		"\3\30\3\30\3\30\3\30\5\30\u01b0\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01c8\n\30\3\31\3\31\3\31\5\31\u01cd\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u022c\n\36\3\37\6\37\u022f\n\37\r\37"+
		"\16\37\u0230\3 \3 \3!\6!\u0236\n!\r!\16!\u0237\3\"\3\"\3#\3#\3#\3#\5#"+
		"\u0240\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\5(\u026b\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u02c8\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02d2\n+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u02de\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02eb"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02f8\n+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u0306\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0314"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0321\n+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u032d\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u033b\n+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u034c\n+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u035d\n+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u0369\n+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0373\n+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u037f\n+\3+\3+\5+\u0383\n+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u0394\n,\3,\3,\3,\3,\3,\3,\3,\5,\u039d\n,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u03e9\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0428\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0434\n.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u044a\n/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0456\n\61\3\62\3\62\3\63"+
		"\3\63\5\63\u045c\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u046a\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0491\n\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u049e\n\67\38\38\38\38\38\38\38\38\78\u04a8\n8\f8\168\u04ab\138"+
		"\38\38\58\u04af\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58"+
		"\u04c1\n8\39\39\3:\3:\3;\6;\u04c8\n;\r;\16;\u04c9\3<\3<\3=\3=\3>\3>\5"+
		">\u04d2\n>\3>\3>\3>\7>\u04d7\n>\f>\16>\u04da\13>\3?\6?\u04dd\n?\r?\16"+
		"?\u04de\3@\3@\3A\3A\3B\3B\7B\u04e7\nB\fB\16B\u04ea\13B\3B\3B\3B\3\u04e8"+
		"\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\17\7\2\66\66;;>>@@BH\t\2"+
		"UUYZ__aaddpp{{\b\2UUYY__ddpp{{\4\2\66\66==\4\2\"\",\62\6\2\6\6\r\r\17"+
		"\36$%\4\2\u0081\u0083\u008a\u008a\4\2\3\3KK\4\2\u0081\u0087\u008a\u008a"+
		"\5\2MRgl\u0081\u008a\3\2\u0081\u008a\3\288\3\2M\u0080\2\u0583\2\u008e"+
		"\3\2\2\2\4\u0090\3\2\2\2\6\u0092\3\2\2\2\b\u009d\3\2\2\2\n\u00a0\3\2\2"+
		"\2\f\u00a7\3\2\2\2\16\u00ad\3\2\2\2\20\u00bb\3\2\2\2\22\u00c9\3\2\2\2"+
		"\24\u00cb\3\2\2\2\26\u00cd\3\2\2\2\30\u00cf\3\2\2\2\32\u00e0\3\2\2\2\34"+
		"\u0119\3\2\2\2\36\u0157\3\2\2\2 \u015a\3\2\2\2\"\u016c\3\2\2\2$\u017b"+
		"\3\2\2\2&\u0198\3\2\2\2(\u019d\3\2\2\2*\u01a2\3\2\2\2,\u01a9\3\2\2\2."+
		"\u01c7\3\2\2\2\60\u01cc\3\2\2\2\62\u01ce\3\2\2\2\64\u01d4\3\2\2\2\66\u01da"+
		"\3\2\2\28\u01e0\3\2\2\2:\u022b\3\2\2\2<\u022e\3\2\2\2>\u0232\3\2\2\2@"+
		"\u0235\3\2\2\2B\u0239\3\2\2\2D\u023f\3\2\2\2F\u0241\3\2\2\2H\u0247\3\2"+
		"\2\2J\u024d\3\2\2\2L\u0254\3\2\2\2N\u026a\3\2\2\2P\u026c\3\2\2\2R\u02c7"+
		"\3\2\2\2T\u0382\3\2\2\2V\u03e8\3\2\2\2X\u0427\3\2\2\2Z\u0433\3\2\2\2\\"+
		"\u0449\3\2\2\2^\u044b\3\2\2\2`\u0455\3\2\2\2b\u0457\3\2\2\2d\u045b\3\2"+
		"\2\2f\u0469\3\2\2\2h\u0490\3\2\2\2j\u0492\3\2\2\2l\u049d\3\2\2\2n\u04c0"+
		"\3\2\2\2p\u04c2\3\2\2\2r\u04c4\3\2\2\2t\u04c7\3\2\2\2v\u04cb\3\2\2\2x"+
		"\u04cd\3\2\2\2z\u04d1\3\2\2\2|\u04dc\3\2\2\2~\u04e0\3\2\2\2\u0080\u04e2"+
		"\3\2\2\2\u0082\u04e4\3\2\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7\2\2\3\u0086"+
		"\u008f\3\2\2\2\u0087\u0088\5\4\3\2\u0088\u0089\5\b\5\2\u0089\u008a\5\6"+
		"\4\2\u008a\u008c\5\4\3\2\u008b\u008d\5@!\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0087\3\2\2\2\u008f"+
		"\3\3\2\2\2\u0090\u0091\t\2\2\2\u0091\5\3\2\2\2\u0092\u0097\5\b\5\2\u0093"+
		"\u0094\7\66\2\2\u0094\u0096\5\b\5\2\u0095\u0093\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\7\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009c\5\n\6\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\t\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u00a0\u00a2\5\\/\2\u00a1\u00a3\5\f\7\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a8\5\16\b\2\u00a5\u00a8\5\20\t\2\u00a6"+
		"\u00a8\5\22\n\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\r\3\2\2\2\u00a9\u00ae\5\24\13\2\u00aa\u00ae\5\26\f\2\u00ab"+
		"\u00ae\5\30\r\2\u00ac\u00ae\5\32\16\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\17\3\2\2\2\u00af"+
		"\u00b0\5\24\13\2\u00b0\u00b1\7&\2\2\u00b1\u00bc\3\2\2\2\u00b2\u00b3\5"+
		"\26\f\2\u00b3\u00b4\7&\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00b6\5\30\r\2\u00b6"+
		"\u00b7\7&\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\7"+
		"&\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\5\24\13"+
		"\2\u00be\u00bf\7\'\2\2\u00bf\u00ca\3\2\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\u00c2\7\'\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\7"+
		"\'\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\7\'\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\25"+
		"\3\2\2\2\u00cd\u00ce\7\'\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0"+
		"\31\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\5j\66\2\u00d3\u00d4\7*\2\2"+
		"\u00d4\u00e1\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\5j\66\2\u00d7\u00d8"+
		"\7+\2\2\u00d8\u00d9\7*\2\2\u00d9\u00e1\3\2\2\2\u00da\u00db\7)\2\2\u00db"+
		"\u00dc\5j\66\2\u00dc\u00dd\7+\2\2\u00dd\u00de\5j\66\2\u00de\u00df\7*\2"+
		"\2\u00df\u00e1\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00da"+
		"\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u011a\5\36\20\2\u00e3\u00e4\7 \2\2\u00e4"+
		"\u00e5\7!\2\2\u00e5\u00e7\7#\2\2\u00e6\u00e8\5 \21\2\u00e7\u00e6\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\7!\2\2\u00ec\u011a\3\2\2\2\u00ed\u00ee\7 \2\2\u00ee"+
		"\u00f2\7!\2\2\u00ef\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u011a\7!\2\2\u00f6\u00f8\7 \2\2\u00f7\u00f9\5 \21"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7!\2\2\u00fd\u011a\3\2\2\2\u00fe"+
		"\u00ff\7 \2\2\u00ff\u0100\7!\2\2\u0100\u0102\7#\2\2\u0101\u0103\5`\61"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7!\2\2\u0107\u011a\3\2\2\2\u0108"+
		"\u0109\7 \2\2\u0109\u010d\7!\2\2\u010a\u010c\5`\61\2\u010b\u010a\3\2\2"+
		"\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u011a\7!\2\2\u0111\u0115\7 \2\2\u0112"+
		"\u0114\5`\61\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011a\7!\2\2\u0119\u00e2\3\2\2\2\u0119\u00e3\3\2\2\2\u0119\u00ed\3\2"+
		"\2\2\u0119\u00f6\3\2\2\2\u0119\u00fe\3\2\2\2\u0119\u0108\3\2\2\2\u0119"+
		"\u0111\3\2\2\2\u011a\35\3\2\2\2\u011b\u011c\7 \2\2\u011c\u011d\7\"\2\2"+
		"\u011d\u011e\7!\2\2\u011e\u0120\7#\2\2\u011f\u0121\5 \21\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\7!\2\2\u0125\u0158\3\2\2\2\u0126\u0127\7 \2"+
		"\2\u0127\u0128\7\"\2\2\u0128\u012c\7!\2\2\u0129\u012b\5 \21\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0158\7!\2\2\u0130\u0131\7 \2"+
		"\2\u0131\u0133\7\"\2\2\u0132\u0134\5 \21\2\u0133\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\7!\2\2\u0138\u0158\3\2\2\2\u0139\u013a\7 \2\2\u013a\u013b\7\"\2"+
		"\2\u013b\u013c\7!\2\2\u013c\u013e\7#\2\2\u013d\u013f\5`\61\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\7!\2\2\u0143\u0158\3\2\2\2\u0144\u0145\7 \2"+
		"\2\u0145\u0146\7\"\2\2\u0146\u014a\7!\2\2\u0147\u0149\5`\61\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0158\7!\2\2\u014e\u014f\7 \2"+
		"\2\u014f\u0153\7\"\2\2\u0150\u0152\5`\61\2\u0151\u0150\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0158\7!\2\2\u0157\u011b\3\2\2\2\u0157\u0126\3\2"+
		"\2\2\u0157\u0130\3\2\2\2\u0157\u0139\3\2\2\2\u0157\u0144\3\2\2\2\u0157"+
		"\u014e\3\2\2\2\u0158\37\3\2\2\2\u0159\u015b\5`\61\2\u015a\u0159\3\2\2"+
		"\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0165"+
		"\3\2\2\2\u015e\u015f\7A\2\2\u015f\u0161\7A\2\2\u0160\u0162\5`\61\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u015e\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168!\3\2\2\2\u0169\u016d\5(\25\2"+
		"\u016a\u016d\5$\23\2\u016b\u016d\5&\24\2\u016c\u0169\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016d#\3\2\2\2\u016e\u016f\7\64\2\2\u016f"+
		"\u017c\5j\66\2\u0170\u0171\7\64\2\2\u0171\u0172\7)\2\2\u0172\u0173\5j"+
		"\66\2\u0173\u0174\7*\2\2\u0174\u017c\3\2\2\2\u0175\u0176\7\64\2\2\u0176"+
		"\u0177\7)\2\2\u0177\u0178\7#\2\2\u0178\u0179\5j\66\2\u0179\u017a\7*\2"+
		"\2\u017a\u017c\3\2\2\2\u017b\u016e\3\2\2\2\u017b\u0170\3\2\2\2\u017b\u0175"+
		"\3\2\2\2\u017c%\3\2\2\2\u017d\u017e\7\65\2\2\u017e\u017f\79\2\2\u017f"+
		"\u0180\5x=\2\u0180\u0181\7:\2\2\u0181\u0199\3\2\2\2\u0182\u0183\7\65\2"+
		"\2\u0183\u0184\7;\2\2\u0184\u0185\5x=\2\u0185\u0186\7;\2\2\u0186\u0199"+
		"\3\2\2\2\u0187\u0188\7\64\2\2\u0188\u0189\7)\2\2\u0189\u018a\5x=\2\u018a"+
		"\u018b\7*\2\2\u018b\u0199\3\2\2\2\u018c\u018d\7\65\2\2\u018d\u018e\7)"+
		"\2\2\u018e\u018f\5x=\2\u018f\u0190\7*\2\2\u0190\u0199\3\2\2\2\u0191\u0192"+
		"\7\67\2\2\u0192\u0193\7&\2\2\u0193\u0194\7v\2\2\u0194\u0195\7?\2\2\u0195"+
		"\u0196\5x=\2\u0196\u0197\78\2\2\u0197\u0199\3\2\2\2\u0198\u017d\3\2\2"+
		"\2\u0198\u0182\3\2\2\2\u0198\u0187\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u0191"+
		"\3\2\2\2\u0199\'\3\2\2\2\u019a\u019e\5l\67\2\u019b\u019c\7\f\2\2\u019c"+
		"\u019e\5v<\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019e)\3\2\2\2\u019f"+
		"\u01a3\5l\67\2\u01a0\u01a1\7\f\2\2\u01a1\u01a3\5v<\2\u01a2\u019f\3\2\2"+
		"\2\u01a2\u01a0\3\2\2\2\u01a3+\3\2\2\2\u01a4\u01aa\5.\30\2\u01a5\u01a6"+
		"\7\67\2\2\u01a6\u01a7\5\6\4\2\u01a7\u01a8\78\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa-\3\2\2\2\u01ab\u01ac\7\67\2\2"+
		"\u01ac\u01ad\7&\2\2\u01ad\u01af\79\2\2\u01ae\u01b0\7#\2\2\u01af\u01ae"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5x=\2\u01b2"+
		"\u01b3\7:\2\2\u01b3\u01b4\5\6\4\2\u01b4\u01b5\78\2\2\u01b5\u01c8\3\2\2"+
		"\2\u01b6\u01b7\7\67\2\2\u01b7\u01b8\7&\2\2\u01b8\u01b9\7;\2\2\u01b9\u01ba"+
		"\5x=\2\u01ba\u01bb\7;\2\2\u01bb\u01bc\5\6\4\2\u01bc\u01bd\78\2\2\u01bd"+
		"\u01c8\3\2\2\2\u01be\u01bf\7\67\2\2\u01bf\u01c0\7&\2\2\u01c0\u01c1\7v"+
		"\2\2\u01c1\u01c2\79\2\2\u01c2\u01c3\5x=\2\u01c3\u01c4\7:\2\2\u01c4\u01c5"+
		"\5\6\4\2\u01c5\u01c6\78\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01ab\3\2\2\2\u01c7"+
		"\u01b6\3\2\2\2\u01c7\u01be\3\2\2\2\u01c8/\3\2\2\2\u01c9\u01cd\5\66\34"+
		"\2\u01ca\u01cd\5\64\33\2\u01cb\u01cd\5\62\32\2\u01cc\u01c9\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\61\3\2\2\2\u01ce\u01cf\7\67\2"+
		"\2\u01cf\u01d0\7&\2\2\u01d0\u01d1\7:\2\2\u01d1\u01d2\5\6\4\2\u01d2\u01d3"+
		"\78\2\2\u01d3\63\3\2\2\2\u01d4\u01d5\7\67\2\2\u01d5\u01d6\7&\2\2\u01d6"+
		"\u01d7\7\66\2\2\u01d7\u01d8\5\6\4\2\u01d8\u01d9\78\2\2\u01d9\65\3\2\2"+
		"\2\u01da\u01db\7\67\2\2\u01db\u01dc\7&\2\2\u01dc\u01dd\7=\2\2\u01dd\u01de"+
		"\5\6\4\2\u01de\u01df\78\2\2\u01df\67\3\2\2\2\u01e0\u01e1\7\67\2\2\u01e1"+
		"\u01e2\7&\2\2\u01e2\u01e3\7>\2\2\u01e3\u01e4\5|?\2\u01e4\u01e5\78\2\2"+
		"\u01e59\3\2\2\2\u01e6\u01e7\7\67\2\2\u01e7\u01e8\7&\2\2\u01e8\u01e9\5"+
		"<\37\2\u01e9\u01ea\7#\2\2\u01ea\u01eb\5<\37\2\u01eb\u01ec\78\2\2\u01ec"+
		"\u022c\3\2\2\2\u01ed\u01ee\7\67\2\2\u01ee\u01ef\7&\2\2\u01ef\u01f0\5<"+
		"\37\2\u01f0\u01f1\78\2\2\u01f1\u022c\3\2\2\2\u01f2\u01f3\7\67\2\2\u01f3"+
		"\u01f4\7&\2\2\u01f4\u01f5\7#\2\2\u01f5\u01f6\5<\37\2\u01f6\u01f7\78\2"+
		"\2\u01f7\u022c\3\2\2\2\u01f8\u01f9\7\67\2\2\u01f9\u01fa\7&\2\2\u01fa\u01fb"+
		"\5<\37\2\u01fb\u01fc\7=\2\2\u01fc\u01fd\5\6\4\2\u01fd\u01fe\78\2\2\u01fe"+
		"\u022c\3\2\2\2\u01ff\u0200\7\67\2\2\u0200\u0201\7&\2\2\u0201\u0202\7#"+
		"\2\2\u0202\u0203\5<\37\2\u0203\u0204\7=\2\2\u0204\u0205\5\6\4\2\u0205"+
		"\u0206\78\2\2\u0206\u022c\3\2\2\2\u0207\u0208\7\67\2\2\u0208\u0209\7("+
		"\2\2\u0209\u020a\7t\2\2\u020a\u020b\7u\2\2\u020b\u020c\7<\2\2\u020c\u020d"+
		"\7y\2\2\u020d\u020e\7z\2\2\u020e\u020f\7g\2\2\u020f\u0210\7x\2\2\u0210"+
		"\u0211\7z\2\2\u0211\u0212\7<\2\2\u0212\u0213\7u\2\2\u0213\u0214\7v\2\2"+
		"\u0214\u0215\7z\2\2\u0215\u022c\78\2\2\u0216\u0217\7\67\2\2\u0217\u0218"+
		"\7(\2\2\u0218\u0219\7{\2\2\u0219\u021a\7z\2\2\u021a\u021b\7l\2\2\u021b"+
		"\u021c\7\u0088\2\2\u021c\u022c\78\2\2\u021d\u021e\7\67\2\2\u021e\u021f"+
		"\7(\2\2\u021f\u0220\7{\2\2\u0220\u0221\7z\2\2\u0221\u0222\7l\2\2\u0222"+
		"\u0223\7\u0081\2\2\u0223\u0224\7\u0086\2\2\u0224\u022c\78\2\2\u0225\u0226"+
		"\7\67\2\2\u0226\u0227\7(\2\2\u0227\u0228\7{\2\2\u0228\u0229\7i\2\2\u0229"+
		"\u022a\7v\2\2\u022a\u022c\78\2\2\u022b\u01e6\3\2\2\2\u022b\u01ed\3\2\2"+
		"\2\u022b\u01f2\3\2\2\2\u022b\u01f8\3\2\2\2\u022b\u01ff\3\2\2\2\u022b\u0207"+
		"\3\2\2\2\u022b\u0216\3\2\2\2\u022b\u021d\3\2\2\2\u022b\u0225\3\2\2\2\u022c"+
		";\3\2\2\2\u022d\u022f\5> \2\u022e\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231=\3\2\2\2\u0232\u0233\t\3\2\2"+
		"\u0233?\3\2\2\2\u0234\u0236\5B\"\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238A\3\2\2\2\u0239\u023a"+
		"\t\4\2\2\u023aC\3\2\2\2\u023b\u0240\5F$\2\u023c\u0240\5H%\2\u023d\u0240"+
		"\5J&\2\u023e\u0240\5L\'\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240E\3\2\2\2\u0241\u0242\7\67\2\2"+
		"\u0242\u0243\7&\2\2\u0243\u0244\7?\2\2\u0244\u0245\5\6\4\2\u0245\u0246"+
		"\78\2\2\u0246G\3\2\2\2\u0247\u0248\7\67\2\2\u0248\u0249\7&\2\2\u0249\u024a"+
		"\7@\2\2\u024a\u024b\5\6\4\2\u024b\u024c\78\2\2\u024cI\3\2\2\2\u024d\u024e"+
		"\7\67\2\2\u024e\u024f\7&\2\2\u024f\u0250\79\2\2\u0250\u0251\7?\2\2\u0251"+
		"\u0252\5\6\4\2\u0252\u0253\78\2\2\u0253K\3\2\2\2\u0254\u0255\7\67\2\2"+
		"\u0255\u0256\7&\2\2\u0256\u0257\79\2\2\u0257\u0258\7@\2\2\u0258\u0259"+
		"\5\6\4\2\u0259\u025a\78\2\2\u025aM\3\2\2\2\u025b\u025c\7\67\2\2\u025c"+
		"\u025d\7&\2\2\u025d\u025e\7&\2\2\u025e\u025f\7)\2\2\u025f\u0260\5\6\4"+
		"\2\u0260\u0261\7*\2\2\u0261\u0262\78\2\2\u0262\u026b\3\2\2\2\u0263\u0264"+
		"\7\67\2\2\u0264\u0265\7&\2\2\u0265\u0266\7)\2\2\u0266\u0267\5\6\4\2\u0267"+
		"\u0268\7*\2\2\u0268\u0269\78\2\2\u0269\u026b\3\2\2\2\u026a\u025b\3\2\2"+
		"\2\u026a\u0263\3\2\2\2\u026bO\3\2\2\2\u026c\u026d\7\67\2\2\u026d\u026e"+
		"\7&\2\2\u026e\u026f\7\67\2\2\u026f\u0270\7j\2\2\u0270\u0271\7k\2\2\u0271"+
		"\u0272\7l\2\2\u0272\u0273\7o\2\2\u0273\u0274\7t\2\2\u0274\u0275\7k\2\2"+
		"\u0275\u0276\78\2\2\u0276\u0277\5.\30\2\u0277\u0278\78\2\2\u0278Q\3\2"+
		"\2\2\u0279\u027a\7\67\2\2\u027a\u027b\7&\2\2\u027b\u027c\7x\2\2\u027c"+
		"\u02c8\78\2\2\u027d\u027e\7\67\2\2\u027e\u027f\7&\2\2\u027f\u0280\5j\66"+
		"\2\u0280\u0281\78\2\2\u0281\u02c8\3\2\2\2\u0282\u0283\7\67\2\2\u0283\u0284"+
		"\7&\2\2\u0284\u0285\7\'\2\2\u0285\u0286\5j\66\2\u0286\u0287\78\2\2\u0287"+
		"\u02c8\3\2\2\2\u0288\u0289\7\67\2\2\u0289\u028a\7&\2\2\u028a\u028b\7#"+
		"\2\2\u028b\u028c\5j\66\2\u028c\u028d\78\2\2\u028d\u02c8\3\2\2\2\u028e"+
		"\u028f\7\67\2\2\u028f\u0290\7&\2\2\u0290\u0291\7A\2\2\u0291\u0292\5x="+
		"\2\u0292\u0293\78\2\2\u0293\u02c8\3\2\2\2\u0294\u0295\7\67\2\2\u0295\u0296"+
		"\7&\2\2\u0296\u0297\7v\2\2\u0297\u0298\7:\2\2\u0298\u0299\5x=\2\u0299"+
		"\u029a\78\2\2\u029a\u02c8\3\2\2\2\u029b\u029c\7\64\2\2\u029c\u029d\79"+
		"\2\2\u029d\u029e\5x=\2\u029e\u029f\7:\2\2\u029f\u02c8\3\2\2\2\u02a0\u02a1"+
		"\7\64\2\2\u02a1\u02a2\7;\2\2\u02a2\u02a3\5x=\2\u02a3\u02a4\7;\2\2\u02a4"+
		"\u02c8\3\2\2\2\u02a5\u02a6\7\64\2\2\u02a6\u02a7\79\2\2\u02a7\u02a8\5j"+
		"\66\2\u02a8\u02a9\7:\2\2\u02a9\u02c8\3\2\2\2\u02aa\u02ab\7\64\2\2\u02ab"+
		"\u02ac\7;\2\2\u02ac\u02ad\5j\66\2\u02ad\u02ae\7;\2\2\u02ae\u02c8\3\2\2"+
		"\2\u02af\u02b0\7\64\2\2\u02b0\u02b1\79\2\2\u02b1\u02b2\7\'\2\2\u02b2\u02b3"+
		"\5j\66\2\u02b3\u02b4\7:\2\2\u02b4\u02c8\3\2\2\2\u02b5\u02b6\7\64\2\2\u02b6"+
		"\u02b7\7;\2\2\u02b7\u02b8\7\'\2\2\u02b8\u02b9\5j\66\2\u02b9\u02ba\7;\2"+
		"\2\u02ba\u02c8\3\2\2\2\u02bb\u02bc\7\64\2\2\u02bc\u02bd\79\2\2\u02bd\u02be"+
		"\7#\2\2\u02be\u02bf\5j\66\2\u02bf\u02c0\7:\2\2\u02c0\u02c8\3\2\2\2\u02c1"+
		"\u02c2\7\64\2\2\u02c2\u02c3\7;\2\2\u02c3\u02c4\7#\2\2\u02c4\u02c5\5j\66"+
		"\2\u02c5\u02c6\7;\2\2\u02c6\u02c8\3\2\2\2\u02c7\u0279\3\2\2\2\u02c7\u027d"+
		"\3\2\2\2\u02c7\u0282\3\2\2\2\u02c7\u0288\3\2\2\2\u02c7\u028e\3\2\2\2\u02c7"+
		"\u0294\3\2\2\2\u02c7\u029b\3\2\2\2\u02c7\u02a0\3\2\2\2\u02c7\u02a5\3\2"+
		"\2\2\u02c7\u02aa\3\2\2\2\u02c7\u02af\3\2\2\2\u02c7\u02b5\3\2\2\2\u02c7"+
		"\u02bb\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c8S\3\2\2\2\u02c9\u02ca\7\67\2\2"+
		"\u02ca\u02cb\7&\2\2\u02cb\u02cc\7\67\2\2\u02cc\u02cd\5j\66\2\u02cd\u02ce"+
		"\78\2\2\u02ce\u02d1\5\6\4\2\u02cf\u02d0\t\5\2\2\u02d0\u02d2\5\6\4\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\78"+
		"\2\2\u02d4\u0383\3\2\2\2\u02d5\u02d6\7\67\2\2\u02d6\u02d7\7&\2\2\u02d7"+
		"\u02d8\79\2\2\u02d8\u02d9\5j\66\2\u02d9\u02da\7:\2\2\u02da\u02dd\5\6\4"+
		"\2\u02db\u02dc\t\5\2\2\u02dc\u02de\5\6\4\2\u02dd\u02db\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\78\2\2\u02e0\u0383\3\2\2\2\u02e1"+
		"\u02e2\7\67\2\2\u02e2\u02e3\7&\2\2\u02e3\u02e4\7\67\2\2\u02e4\u02e5\7"+
		"\'\2\2\u02e5\u02e6\5j\66\2\u02e6\u02e7\78\2\2\u02e7\u02ea\5\6\4\2\u02e8"+
		"\u02e9\t\5\2\2\u02e9\u02eb\5\6\4\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\78\2\2\u02ed\u0383\3\2\2\2\u02ee"+
		"\u02ef\7\67\2\2\u02ef\u02f0\7&\2\2\u02f0\u02f1\7\67\2\2\u02f1\u02f2\7"+
		"#\2\2\u02f2\u02f3\5j\66\2\u02f3\u02f4\78\2\2\u02f4\u02f7\5\6\4\2\u02f5"+
		"\u02f6\t\5\2\2\u02f6\u02f8\5\6\4\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\78\2\2\u02fa\u0383\3\2\2\2\u02fb"+
		"\u02fc\7\67\2\2\u02fc\u02fd\7&\2\2\u02fd\u02fe\7\67\2\2\u02fe\u02ff\7"+
		"9\2\2\u02ff\u0300\5x=\2\u0300\u0301\7:\2\2\u0301\u0302\78\2\2\u0302\u0305"+
		"\5\6\4\2\u0303\u0304\t\5\2\2\u0304\u0306\5\6\4\2\u0305\u0303\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\78\2\2\u0308\u0383\3\2"+
		"\2\2\u0309\u030a\7\67\2\2\u030a\u030b\7&\2\2\u030b\u030c\7\67\2\2\u030c"+
		"\u030d\7;\2\2\u030d\u030e\5x=\2\u030e\u030f\7;\2\2\u030f\u0310\78\2\2"+
		"\u0310\u0313\5\6\4\2\u0311\u0312\t\5\2\2\u0312\u0314\5\6\4\2\u0313\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\78\2\2\u0316"+
		"\u0383\3\2\2\2\u0317\u0318\7\67\2\2\u0318\u0319\7&\2\2\u0319\u031a\7\67"+
		"\2\2\u031a\u031b\7x\2\2\u031b\u031c\5j\66\2\u031c\u031d\78\2\2\u031d\u0320"+
		"\5\6\4\2\u031e\u031f\t\5\2\2\u031f\u0321\5\6\4\2\u0320\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\78\2\2\u0323\u0383\3\2"+
		"\2\2\u0324\u0325\7\67\2\2\u0325\u0326\7&\2\2\u0326\u0327\7\67\2\2\u0327"+
		"\u0328\7x\2\2\u0328\u0329\78\2\2\u0329\u032c\5\6\4\2\u032a\u032b\t\5\2"+
		"\2\u032b\u032d\5\6\4\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u032f\78\2\2\u032f\u0383\3\2\2\2\u0330\u0331\7\67\2\2\u0331"+
		"\u0332\7&\2\2\u0332\u0333\7\67\2\2\u0333\u0334\7x\2\2\u0334\u0335\7A\2"+
		"\2\u0335\u0336\5x=\2\u0336\u0337\78\2\2\u0337\u033a\5\6\4\2\u0338\u0339"+
		"\t\5\2\2\u0339\u033b\5\6\4\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\78\2\2\u033d\u0383\3\2\2\2\u033e\u033f\7\67"+
		"\2\2\u033f\u0340\7&\2\2\u0340\u0341\7\67\2\2\u0341\u0342\7j\2\2\u0342"+
		"\u0343\7k\2\2\u0343\u0344\7l\2\2\u0344\u0345\7o\2\2\u0345\u0346\7t\2\2"+
		"\u0346\u0347\7k\2\2\u0347\u0348\78\2\2\u0348\u034b\5\6\4\2\u0349\u034a"+
		"\t\5\2\2\u034a\u034c\5\6\4\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u034e\78\2\2\u034e\u0383\3\2\2\2\u034f\u0350\7\67"+
		"\2\2\u0350\u0351\7&\2\2\u0351\u0352\7\67\2\2\u0352\u0353\7M\2\2\u0353"+
		"\u0354\7_\2\2\u0354\u0355\7_\2\2\u0355\u0356\7Q\2\2\u0356\u0357\7^\2\2"+
		"\u0357\u0358\7`\2\2\u0358\u0359\78\2\2\u0359\u035c\5\6\4\2\u035a\u035b"+
		"\t\5\2\2\u035b\u035d\5\6\4\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\78\2\2\u035f\u0383\3\2\2\2\u0360\u0361\7\67"+
		"\2\2\u0361\u0362\7&\2\2\u0362\u0363\7\67\2\2\u0363\u0364\5x=\2\u0364\u0365"+
		"\78\2\2\u0365\u0368\5\6\4\2\u0366\u0367\t\5\2\2\u0367\u0369\5\6\4\2\u0368"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\78"+
		"\2\2\u036b\u0383\3\2\2\2\u036c\u036d\7\67\2\2\u036d\u036e\7&\2\2\u036e"+
		"\u036f\5D#\2\u036f\u0372\5\6\4\2\u0370\u0371\t\5\2\2\u0371\u0373\5\6\4"+
		"\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375"+
		"\78\2\2\u0375\u0383\3\2\2\2\u0376\u0377\7\67\2\2\u0377\u0378\7&\2\2\u0378"+
		"\u0379\7\67\2\2\u0379\u037a\5\6\4\2\u037a\u037b\78\2\2\u037b\u037e\5\6"+
		"\4\2\u037c\u037d\t\5\2\2\u037d\u037f\5\6\4\2\u037e\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\78\2\2\u0381\u0383\3\2"+
		"\2\2\u0382\u02c9\3\2\2\2\u0382\u02d5\3\2\2\2\u0382\u02e1\3\2\2\2\u0382"+
		"\u02ee\3\2\2\2\u0382\u02fb\3\2\2\2\u0382\u0309\3\2\2\2\u0382\u0317\3\2"+
		"\2\2\u0382\u0324\3\2\2\2\u0382\u0330\3\2\2\2\u0382\u033e\3\2\2\2\u0382"+
		"\u034f\3\2\2\2\u0382\u0360\3\2\2\2\u0382\u036c\3\2\2\2\u0382\u0376\3\2"+
		"\2\2\u0383U\3\2\2\2\u0384\u0385\7\67\2\2\u0385\u0386\7(\2\2\u0386\u0387"+
		"\7g\2\2\u0387\u0388\7i\2\2\u0388\u0389\7i\2\2\u0389\u038a\7k\2\2\u038a"+
		"\u038b\7v\2\2\u038b\u038c\7z\2\2\u038c\u03e9\78\2\2\u038d\u038e\7\67\2"+
		"\2\u038e\u038f\7(\2\2\u038f\u0393\7l\2\2\u0390\u0391\7g\2\2\u0391\u0392"+
		"\7o\2\2\u0392\u0394\7r\2\2\u0393\u0390\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u03e9\78\2\2\u0396\u0397\7\67\2\2\u0397\u039c\7("+
		"\2\2\u0398\u0399\7s\2\2\u0399\u039a\7g\2\2\u039a\u039b\7x\2\2\u039b\u039d"+
		"\7q\2\2\u039c\u0398\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u039f\7=\2\2\u039f\u03a0\7t\2\2\u03a0\u03a1\7g\2\2\u03a1\u03a2\7s\2\2"+
		"\u03a2\u03a3\7k\2\2\u03a3\u03e9\78\2\2\u03a4\u03a5\7\67\2\2\u03a5\u03a6"+
		"\7(\2\2\u03a6\u03a7\7i\2\2\u03a7\u03a8\7u\2\2\u03a8\u03a9\7s\2\2\u03a9"+
		"\u03aa\7s\2\2\u03aa\u03ab\7o\2\2\u03ab\u03ac\7z\2\2\u03ac\u03e9\78\2\2"+
		"\u03ad\u03ae\7\67\2\2\u03ae\u03af\7(\2\2\u03af\u03b0\7v\2\2\u03b0\u03b1"+
		"\7x\2\2\u03b1\u03b2\7{\2\2\u03b2\u03b3\7t\2\2\u03b3\u03b4\7k\2\2\u03b4"+
		"\u03e9\78\2\2\u03b5\u03b6\7\67\2\2\u03b6\u03b7\7(\2\2\u03b7\u03b8\7v\2"+
		"\2\u03b8\u03b9\7x\2\2\u03b9\u03ba\7{\2\2\u03ba\u03bb\7t\2\2\u03bb\u03bc"+
		"\7k\2\2\u03bc\u03bd\7=\2\2\u03bd\u03be\7t\2\2\u03be\u03bf\7g\2\2\u03bf"+
		"\u03c0\7s\2\2\u03c0\u03c1\7k\2\2\u03c1\u03e9\78\2\2\u03c2\u03c3\7\67\2"+
		"\2\u03c3\u03c4\7(\2\2\u03c4\u03c5\7y\2\2\u03c5\u03c6\7q\2\2\u03c6\u03c7"+
		"\7o\2\2\u03c7\u03c8\7v\2\2\u03c8\u03e9\78\2\2\u03c9\u03ca\7\67\2\2\u03ca"+
		"\u03cb\7(\2\2\u03cb\u03cc\7y\2\2\u03cc\u03cd\7q\2\2\u03cd\u03ce\7o\2\2"+
		"\u03ce\u03cf\7v\2\2\u03cf\u03d0\7=\2\2\u03d0\u03d1\7t\2\2\u03d1\u03d2"+
		"\7g\2\2\u03d2\u03d3\7s\2\2\u03d3\u03d4\7k\2\2\u03d4\u03e9\78\2\2\u03d5"+
		"\u03d6\7\67\2\2\u03d6\u03d7\7(\2\2\u03d7\u03d8\7z\2\2\u03d8\u03d9\7n\2"+
		"\2\u03d9\u03da\7k\2\2\u03da\u03db\7t\2\2\u03db\u03e9\78\2\2\u03dc\u03dd"+
		"\7\67\2\2\u03dd\u03de\7(\2\2\u03de\u03df\7z\2\2\u03df\u03e0\7n\2\2\u03e0"+
		"\u03e1\7k\2\2\u03e1\u03e2\7t\2\2\u03e2\u03e3\7=\2\2\u03e3\u03e4\7t\2\2"+
		"\u03e4\u03e5\7g\2\2\u03e5\u03e6\7s\2\2\u03e6\u03e7\7k\2\2\u03e7\u03e9"+
		"\78\2\2\u03e8\u0384\3\2\2\2\u03e8\u038d\3\2\2\2\u03e8\u0396\3\2\2\2\u03e8"+
		"\u03a4\3\2\2\2\u03e8\u03ad\3\2\2\2\u03e8\u03b5\3\2\2\2\u03e8\u03c2\3\2"+
		"\2\2\u03e8\u03c9\3\2\2\2\u03e8\u03d5\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e9"+
		"W\3\2\2\2\u03ea\u03eb\7\67\2\2\u03eb\u03ec\7(\2\2\u03ec\u03ed\7i\2\2\u03ed"+
		"\u03ee\7x\2\2\u03ee\u0428\78\2\2\u03ef\u03f0\7\67\2\2\u03f0\u03f1\7(\2"+
		"\2\u03f1\u03f2\7r\2\2\u03f2\u03f3\7l\2\2\u03f3\u0428\78\2\2\u03f4\u03f5"+
		"\7\67\2\2\u03f5\u03f6\7(\2\2\u03f6\u03f7\7i\2\2\u03f7\u03f8\7x\2\2\u03f8"+
		"\u03f9\7r\2\2\u03f9\u03fa\7l\2\2\u03fa\u0428\78\2\2\u03fb\u03fc\7\67\2"+
		"\2\u03fc\u03fd\7(\2\2\u03fd\u03fe\7g\2\2\u03fe\u03ff\7t\2\2\u03ff\u0400"+
		"\7\177\2\2\u0400\u0401\7i\2\2\u0401\u0402\7x\2\2\u0402\u0403\7r\2\2\u0403"+
		"\u0404\7l\2\2\u0404\u0428\78\2\2\u0405\u0406\7\67\2\2\u0406\u0407\7(\2"+
		"\2\u0407\u0408\7g\2\2\u0408\u0409\7t\2\2\u0409\u040a\7\177\2\2\u040a\u0428"+
		"\78\2\2\u040b\u040c\7\67\2\2\u040c\u040d\7(\2\2\u040d\u040e\7h\2\2\u040e"+
		"\u040f\7y\2\2\u040f\u0410\7x\2\2\u0410\u0411\7<\2\2\u0411\u0412\7g\2\2"+
		"\u0412\u0413\7t\2\2\u0413\u0414\7\177\2\2\u0414\u0415\7i\2\2\u0415\u0416"+
		"\7x\2\2\u0416\u0417\7r\2\2\u0417\u0418\7l\2\2\u0418\u0428\78\2\2\u0419"+
		"\u041a\7\67\2\2\u041a\u041b\7(\2\2\u041b\u041c\7h\2\2\u041c\u041d\7y\2"+
		"\2\u041d\u041e\7x\2\2\u041e\u041f\7<\2\2\u041f\u0420\7{\2\2\u0420\u0421"+
		"\7t\2\2\u0421\u0422\7o\2\2\u0422\u0423\7i\2\2\u0423\u0424\7u\2\2\u0424"+
		"\u0425\7j\2\2\u0425\u0426\7k\2\2\u0426\u0428\78\2\2\u0427\u03ea\3\2\2"+
		"\2\u0427\u03ef\3\2\2\2\u0427\u03f4\3\2\2\2\u0427\u03fb\3\2\2\2\u0427\u0405"+
		"\3\2\2\2\u0427\u040b\3\2\2\2\u0427\u0419\3\2\2\2\u0428Y\3\2\2\2\u0429"+
		"\u042a\7\67\2\2\u042a\u042b\7&\2\2\u042b\u042c\7i\2\2\u042c\u0434\78\2"+
		"\2\u042d\u042e\7\67\2\2\u042e\u042f\7&\2\2\u042f\u0430\7i\2\2\u0430\u0431"+
		"\5j\66\2\u0431\u0432\78\2\2\u0432\u0434\3\2\2\2\u0433\u0429\3\2\2\2\u0433"+
		"\u042d\3\2\2\2\u0434[\3\2\2\2\u0435\u044a\5R*\2\u0436\u044a\5b\62\2\u0437"+
		"\u044a\5^\60\2\u0438\u044a\5d\63\2\u0439\u044a\5\34\17\2\u043a\u044a\5"+
		",\27\2\u043b\u044a\5\60\31\2\u043c\u044a\58\35\2\u043d\u044a\5:\36\2\u043e"+
		"\u044a\5D#\2\u043f\u044a\5\"\22\2\u0440\u044a\5T+\2\u0441\u044a\5P)\2"+
		"\u0442\u044a\5N(\2\u0443\u044a\5V,\2\u0444\u044a\5X-\2\u0445\u044a\5Z"+
		".\2\u0446\u044a\7\63\2\2\u0447\u044a\7\16\2\2\u0448\u044a\7\37\2\2\u0449"+
		"\u0435\3\2\2\2\u0449\u0436\3\2\2\2\u0449\u0437\3\2\2\2\u0449\u0438\3\2"+
		"\2\2\u0449\u0439\3\2\2\2\u0449\u043a\3\2\2\2\u0449\u043b\3\2\2\2\u0449"+
		"\u043c\3\2\2\2\u0449\u043d\3\2\2\2\u0449\u043e\3\2\2\2\u0449\u043f\3\2"+
		"\2\2\u0449\u0440\3\2\2\2\u0449\u0441\3\2\2\2\u0449\u0442\3\2\2\2\u0449"+
		"\u0443\3\2\2\2\u0449\u0444\3\2\2\2\u0449\u0445\3\2\2\2\u0449\u0446\3\2"+
		"\2\2\u0449\u0447\3\2\2\2\u0449\u0448\3\2\2\2\u044a]\3\2\2\2\u044b\u044c"+
		"\t\6\2\2\u044c_\3\2\2\2\u044d\u0456\5\34\17\2\u044e\u044f\5f\64\2\u044f"+
		"\u0450\7#\2\2\u0450\u0451\5f\64\2\u0451\u0456\3\2\2\2\u0452\u0456\5b\62"+
		"\2\u0453\u0456\5f\64\2\u0454\u0456\5*\26\2\u0455\u044d\3\2\2\2\u0455\u044e"+
		"\3\2\2\2\u0455\u0452\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0454\3\2\2\2\u0456"+
		"a\3\2\2\2\u0457\u0458\t\7\2\2\u0458c\3\2\2\2\u0459\u045c\5h\65\2\u045a"+
		"\u045c\7!\2\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045ce\3\2\2\2\u045d"+
		"\u046a\5h\65\2\u045e\u046a\7\r\2\2\u045f\u046a\7 \2\2\u0460\u046a\7\""+
		"\2\2\u0461\u046a\7&\2\2\u0462\u046a\7\'\2\2\u0463\u046a\7(\2\2\u0464\u046a"+
		"\7,\2\2\u0465\u046a\7/\2\2\u0466\u046a\7\66\2\2\u0467\u046a\7\67\2\2\u0468"+
		"\u046a\78\2\2\u0469\u045d\3\2\2\2\u0469\u045e\3\2\2\2\u0469\u045f\3\2"+
		"\2\2\u0469\u0460\3\2\2\2\u0469\u0461\3\2\2\2\u0469\u0462\3\2\2\2\u0469"+
		"\u0463\3\2\2\2\u0469\u0464\3\2\2\2\u0469\u0465\3\2\2\2\u0469\u0466\3\2"+
		"\2\2\u0469\u0467\3\2\2\2\u0469\u0468\3\2\2\2\u046ag\3\2\2\2\u046b\u0491"+
		"\5l\67\2\u046c\u0491\5n8\2\u046d\u0491\5\u0080A\2\u046e\u0491\5v<\2\u046f"+
		"\u0491\5\u0082B\2\u0470\u0491\7\5\2\2\u0471\u0491\7\7\2\2\u0472\u0491"+
		"\7\b\2\2\u0473\u0491\7\t\2\2\u0474\u0491\7\n\2\2\u0475\u0491\7\13\2\2"+
		"\u0476\u0491\7\4\2\2\u0477\u0491\7)\2\2\u0478\u0491\7*\2\2\u0479\u0491"+
		"\7+\2\2\u047a\u0491\7#\2\2\u047b\u0491\79\2\2\u047c\u0491\7:\2\2\u047d"+
		"\u0491\7;\2\2\u047e\u0491\7<\2\2\u047f\u0491\7=\2\2\u0480\u0491\7>\2\2"+
		"\u0481\u0491\7?\2\2\u0482\u0491\7@\2\2\u0483\u0491\7A\2\2\u0484\u0491"+
		"\7\u008b\2\2\u0485\u0491\7B\2\2\u0486\u0491\7C\2\2\u0487\u0491\7D\2\2"+
		"\u0488\u0491\7E\2\2\u0489\u0491\7F\2\2\u048a\u0491\7G\2\2\u048b\u0491"+
		"\7H\2\2\u048c\u0491\7I\2\2\u048d\u0491\7J\2\2\u048e\u0491\7K\2\2\u048f"+
		"\u0491\7L\2\2\u0490\u046b\3\2\2\2\u0490\u046c\3\2\2\2\u0490\u046d\3\2"+
		"\2\2\u0490\u046e\3\2\2\2\u0490\u046f\3\2\2\2\u0490\u0470\3\2\2\2\u0490"+
		"\u0471\3\2\2\2\u0490\u0472\3\2\2\2\u0490\u0473\3\2\2\2\u0490\u0474\3\2"+
		"\2\2\u0490\u0475\3\2\2\2\u0490\u0476\3\2\2\2\u0490\u0477\3\2\2\2\u0490"+
		"\u0478\3\2\2\2\u0490\u0479\3\2\2\2\u0490\u047a\3\2\2\2\u0490\u047b\3\2"+
		"\2\2\u0490\u047c\3\2\2\2\u0490\u047d\3\2\2\2\u0490\u047e\3\2\2\2\u0490"+
		"\u047f\3\2\2\2\u0490\u0480\3\2\2\2\u0490\u0481\3\2\2\2\u0490\u0482\3\2"+
		"\2\2\u0490\u0483\3\2\2\2\u0490\u0484\3\2\2\2\u0490\u0485\3\2\2\2\u0490"+
		"\u0486\3\2\2\2\u0490\u0487\3\2\2\2\u0490\u0488\3\2\2\2\u0490\u0489\3\2"+
		"\2\2\u0490\u048a\3\2\2\2\u0490\u048b\3\2\2\2\u0490\u048c\3\2\2\2\u0490"+
		"\u048d\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u048f\3\2\2\2\u0491i\3\2\2\2"+
		"\u0492\u0493\5t;\2\u0493k\3\2\2\2\u0494\u0495\7\f\2\2\u0495\u0496\t\b"+
		"\2\2\u0496\u0497\5p9\2\u0497\u0498\5p9\2\u0498\u049e\3\2\2\2\u0499\u049a"+
		"\7\f\2\2\u049a\u049b\5p9\2\u049b\u049c\5p9\2\u049c\u049e\3\2\2\2\u049d"+
		"\u0494\3\2\2\2\u049d\u0499\3\2\2\2\u049em\3\2\2\2\u049f\u04ae\7L\2\2\u04a0"+
		"\u04a1\5r:\2\u04a1\u04a2\5r:\2\u04a2\u04af\3\2\2\2\u04a3\u04a4\7)\2\2"+
		"\u04a4\u04a5\5r:\2\u04a5\u04a9\5r:\2\u04a6\u04a8\5r:\2\u04a7\u04a6\3\2"+
		"\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ac\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ad\7*\2\2\u04ad\u04af\3\2"+
		"\2\2\u04ae\u04a0\3\2\2\2\u04ae\u04a3\3\2\2\2\u04af\u04c1\3\2\2\2\u04b0"+
		"\u04b1\t\t\2\2\u04b1\u04b2\5r:\2\u04b2\u04b3\5r:\2\u04b3\u04b4\5r:\2\u04b4"+
		"\u04b5\5r:\2\u04b5\u04b6\5r:\2\u04b6\u04b7\5r:\2\u04b7\u04b8\5r:\2\u04b8"+
		"\u04b9\5r:\2\u04b9\u04c1\3\2\2\2\u04ba\u04bb\t\t\2\2\u04bb\u04bc\5r:\2"+
		"\u04bc\u04bd\5r:\2\u04bd\u04be\5r:\2\u04be\u04bf\5r:\2\u04bf\u04c1\3\2"+
		"\2\2\u04c0\u049f\3\2\2\2\u04c0\u04b0\3\2\2\2\u04c0\u04ba\3\2\2\2\u04c1"+
		"o\3\2\2\2\u04c2\u04c3\t\n\2\2\u04c3q\3\2\2\2\u04c4\u04c5\t\13\2\2\u04c5"+
		"s\3\2\2\2\u04c6\u04c8\5v<\2\u04c7\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04cau\3\2\2\2\u04cb\u04cc\t\f\2\2"+
		"\u04ccw\3\2\2\2\u04cd\u04ce\5z>\2\u04cey\3\2\2\2\u04cf\u04d2\5\u0080A"+
		"\2\u04d0\u04d2\7<\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d8"+
		"\3\2\2\2\u04d3\u04d7\5\u0080A\2\u04d4\u04d7\7<\2\2\u04d5\u04d7\5v<\2\u04d6"+
		"\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04da\3\2"+
		"\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9{\3\2\2\2\u04da\u04d8"+
		"\3\2\2\2\u04db\u04dd\5~@\2\u04dc\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df}\3\2\2\2\u04e0\u04e1\n\r\2\2"+
		"\u04e1\177\3\2\2\2\u04e2\u04e3\t\16\2\2\u04e3\u0081\3\2\2\2\u04e4\u04e8"+
		"\7I\2\2\u04e5\u04e7\13\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04eb\u04ec\7J\2\2\u04ec\u0083\3\2\2\2O\u008c\u008e\u0097\u009d\u00a2"+
		"\u00a7\u00ad\u00bb\u00c9\u00e0\u00e9\u00f2\u00fa\u0104\u010d\u0115\u0119"+
		"\u0122\u012c\u0135\u0140\u014a\u0153\u0157\u015c\u0163\u0167\u016c\u017b"+
		"\u0198\u019d\u01a2\u01a9\u01af\u01c7\u01cc\u022b\u0230\u0237\u023f\u026a"+
		"\u02c7\u02d1\u02dd\u02ea\u02f7\u0305\u0313\u0320\u032c\u033a\u034b\u035c"+
		"\u0368\u0372\u037e\u0382\u0393\u039c\u03e8\u0427\u0433\u0449\u0455\u045b"+
		"\u0469\u0490\u049d\u04a9\u04ae\u04c0\u04c9\u04d1\u04d6\u04d8\u04de\u04e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}