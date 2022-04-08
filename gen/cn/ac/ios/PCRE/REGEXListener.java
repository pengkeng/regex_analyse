// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/REGEX.g4 by ANTLR 4.9.1
package cn.ac.ios.REGEX;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link REGEXParser}.
 */
public interface REGEXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link REGEXParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(REGEXParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(REGEXParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#global_option_pattern}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_pattern(REGEXParser.Global_option_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#global_option_pattern}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_pattern(REGEXParser.Global_option_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#alternation}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(REGEXParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#alternation}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(REGEXParser.AlternationContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(REGEXParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(REGEXParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(REGEXParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(REGEXParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(REGEXParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(REGEXParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_greedy(REGEXParser.Quantifier_greedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_greedy(REGEXParser.Quantifier_greedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_lazy(REGEXParser.Quantifier_lazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_lazy(REGEXParser.Quantifier_lazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_possesstive(REGEXParser.Quantifier_possesstiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_possesstive(REGEXParser.Quantifier_possesstiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_Kleene(REGEXParser.Quantifier_KleeneContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_Kleene(REGEXParser.Quantifier_KleeneContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_add}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_add(REGEXParser.Quantifier_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_add}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_add(REGEXParser.Quantifier_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_option}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_option(REGEXParser.Quantifier_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_option}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_option(REGEXParser.Quantifier_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#quantifier_range}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_range(REGEXParser.Quantifier_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#quantifier_range}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_range(REGEXParser.Quantifier_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#character_class}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class(REGEXParser.Character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#character_class}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class(REGEXParser.Character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#negative_character_class}.
	 * @param ctx the parse tree
	 */
	void enterNegative_character_class(REGEXParser.Negative_character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#negative_character_class}.
	 * @param ctx the parse tree
	 */
	void exitNegative_character_class(REGEXParser.Negative_character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#character_class_intersection}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class_intersection(REGEXParser.Character_class_intersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#character_class_intersection}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class_intersection(REGEXParser.Character_class_intersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference(REGEXParser.BackreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference(REGEXParser.BackreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#backreference_or_index}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_index(REGEXParser.Backreference_or_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#backreference_or_index}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_index(REGEXParser.Backreference_or_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#backreference_or_name}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_name(REGEXParser.Backreference_or_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#backreference_or_name}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_name(REGEXParser.Backreference_or_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_octal(REGEXParser.Backreference_or_octalContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_octal(REGEXParser.Backreference_or_octalContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#character_octal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_octal(REGEXParser.Character_octalContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#character_octal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_octal(REGEXParser.Character_octalContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(REGEXParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(REGEXParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#name_caturpe}.
	 * @param ctx the parse tree
	 */
	void enterName_caturpe(REGEXParser.Name_caturpeContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#name_caturpe}.
	 * @param ctx the parse tree
	 */
	void exitName_caturpe(REGEXParser.Name_caturpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture(REGEXParser.Non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture(REGEXParser.Non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_non_capture(REGEXParser.Atomic_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_non_capture(REGEXParser.Atomic_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#reset_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterReset_non_capture(REGEXParser.Reset_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#reset_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitReset_non_capture(REGEXParser.Reset_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#base_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterBase_non_capture(REGEXParser.Base_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#base_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitBase_non_capture(REGEXParser.Base_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(REGEXParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(REGEXParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(REGEXParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(REGEXParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void enterOption_flags(REGEXParser.Option_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void exitOption_flags(REGEXParser.Option_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void enterOption_flag(REGEXParser.Option_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void exitOption_flag(REGEXParser.Option_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#global_option_flags}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_flags(REGEXParser.Global_option_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#global_option_flags}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_flags(REGEXParser.Global_option_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#global_option_flag}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_flag(REGEXParser.Global_option_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#global_option_flag}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_flag(REGEXParser.Global_option_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#look_around}.
	 * @param ctx the parse tree
	 */
	void enterLook_around(REGEXParser.Look_aroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#look_around}.
	 * @param ctx the parse tree
	 */
	void exitLook_around(REGEXParser.Look_aroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 */
	void enterLook_ahead_positive(REGEXParser.Look_ahead_positiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 */
	void exitLook_ahead_positive(REGEXParser.Look_ahead_positiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 */
	void enterLook_ahead_negative(REGEXParser.Look_ahead_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 */
	void exitLook_ahead_negative(REGEXParser.Look_ahead_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#look_behind_positive}.
	 * @param ctx the parse tree
	 */
	void enterLook_behind_positive(REGEXParser.Look_behind_positiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#look_behind_positive}.
	 * @param ctx the parse tree
	 */
	void exitLook_behind_positive(REGEXParser.Look_behind_positiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#look_behind_negative}.
	 * @param ctx the parse tree
	 */
	void enterLook_behind_negative(REGEXParser.Look_behind_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#look_behind_negative}.
	 * @param ctx the parse tree
	 */
	void exitLook_behind_negative(REGEXParser.Look_behind_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#embedded_code}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_code(REGEXParser.Embedded_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#embedded_code}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_code(REGEXParser.Embedded_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#define_group}.
	 * @param ctx the parse tree
	 */
	void enterDefine_group(REGEXParser.Define_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#define_group}.
	 * @param ctx the parse tree
	 */
	void exitDefine_group(REGEXParser.Define_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_reference(REGEXParser.Subroutine_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_reference(REGEXParser.Subroutine_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(REGEXParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(REGEXParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void enterBacktrack_control(REGEXParser.Backtrack_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void exitBacktrack_control(REGEXParser.Backtrack_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void enterNewline_convention(REGEXParser.Newline_conventionContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void exitNewline_convention(REGEXParser.Newline_conventionContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#callout}.
	 * @param ctx the parse tree
	 */
	void enterCallout(REGEXParser.CalloutContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#callout}.
	 * @param ctx the parse tree
	 */
	void exitCallout(REGEXParser.CalloutContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(REGEXParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(REGEXParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(REGEXParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(REGEXParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom(REGEXParser.Cc_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom(REGEXParser.Cc_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void enterShared_atom(REGEXParser.Shared_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void exitShared_atom(REGEXParser.Shared_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(REGEXParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(REGEXParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void enterCc_literal(REGEXParser.Cc_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void exitCc_literal(REGEXParser.Cc_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void enterShared_literal(REGEXParser.Shared_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void exitShared_literal(REGEXParser.Shared_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(REGEXParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(REGEXParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void enterOctal_char(REGEXParser.Octal_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void exitOctal_char(REGEXParser.Octal_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#hex_char}.
	 * @param ctx the parse tree
	 */
	void enterHex_char(REGEXParser.Hex_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#hex_char}.
	 * @param ctx the parse tree
	 */
	void exitHex_char(REGEXParser.Hex_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void enterOctal_digit(REGEXParser.Octal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void exitOctal_digit(REGEXParser.Octal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void enterHex_digit(REGEXParser.Hex_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void exitHex_digit(REGEXParser.Hex_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(REGEXParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(REGEXParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(REGEXParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(REGEXParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(REGEXParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(REGEXParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_nums(REGEXParser.Alpha_numsContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_nums(REGEXParser.Alpha_numsContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_parens(REGEXParser.Non_close_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_parens(REGEXParser.Non_close_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_paren(REGEXParser.Non_close_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_paren(REGEXParser.Non_close_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(REGEXParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(REGEXParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link REGEXParser#block_quoted}.
	 * @param ctx the parse tree
	 */
	void enterBlock_quoted(REGEXParser.Block_quotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link REGEXParser#block_quoted}.
	 * @param ctx the parse tree
	 */
	void exitBlock_quoted(REGEXParser.Block_quotedContext ctx);
}