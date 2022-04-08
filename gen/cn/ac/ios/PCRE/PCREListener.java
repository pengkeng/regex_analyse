// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/PCRE.g4 by ANTLR 4.9.1
package cn.ac.ios.REGEX;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PCREParser}.
 */
public interface PCREListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PCREParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PCREParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PCREParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#global_option_pattern}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_pattern(PCREParser.Global_option_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#global_option_pattern}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_pattern(PCREParser.Global_option_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#alternation}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(PCREParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#alternation}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(PCREParser.AlternationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PCREParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PCREParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PCREParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PCREParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(PCREParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(PCREParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_greedy(PCREParser.Quantifier_greedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_greedy(PCREParser.Quantifier_greedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_lazy(PCREParser.Quantifier_lazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_lazy(PCREParser.Quantifier_lazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_possesstive(PCREParser.Quantifier_possesstiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_possesstive(PCREParser.Quantifier_possesstiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_Kleene(PCREParser.Quantifier_KleeneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_Kleene(PCREParser.Quantifier_KleeneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_add}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_add(PCREParser.Quantifier_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_add}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_add(PCREParser.Quantifier_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_option}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_option(PCREParser.Quantifier_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_option}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_option(PCREParser.Quantifier_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_range}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_range(PCREParser.Quantifier_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_range}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_range(PCREParser.Quantifier_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#character_class}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class(PCREParser.Character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#character_class}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class(PCREParser.Character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#negative_character_class}.
	 * @param ctx the parse tree
	 */
	void enterNegative_character_class(PCREParser.Negative_character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#negative_character_class}.
	 * @param ctx the parse tree
	 */
	void exitNegative_character_class(PCREParser.Negative_character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#character_class_intersection}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class_intersection(PCREParser.Character_class_intersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#character_class_intersection}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class_intersection(PCREParser.Character_class_intersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference(PCREParser.BackreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference(PCREParser.BackreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#backreference_or_index}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_index(PCREParser.Backreference_or_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#backreference_or_index}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_index(PCREParser.Backreference_or_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#backreference_or_name}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_name(PCREParser.Backreference_or_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#backreference_or_name}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_name(PCREParser.Backreference_or_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#character_octal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_octal(PCREParser.Character_octalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#character_octal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_octal(PCREParser.Character_octalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(PCREParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(PCREParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#name_caturpe}.
	 * @param ctx the parse tree
	 */
	void enterName_caturpe(PCREParser.Name_caturpeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#name_caturpe}.
	 * @param ctx the parse tree
	 */
	void exitName_caturpe(PCREParser.Name_caturpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture(PCREParser.Non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture(PCREParser.Non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_non_capture(PCREParser.Atomic_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_non_capture(PCREParser.Atomic_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#reset_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterReset_non_capture(PCREParser.Reset_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#reset_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitReset_non_capture(PCREParser.Reset_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#base_non_capture}.
	 * @param ctx the parse tree
	 */
	void enterBase_non_capture(PCREParser.Base_non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#base_non_capture}.
	 * @param ctx the parse tree
	 */
	void exitBase_non_capture(PCREParser.Base_non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PCREParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PCREParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(PCREParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(PCREParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void enterOption_flags(PCREParser.Option_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void exitOption_flags(PCREParser.Option_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void enterOption_flag(PCREParser.Option_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void exitOption_flag(PCREParser.Option_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#global_option_flags}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_flags(PCREParser.Global_option_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#global_option_flags}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_flags(PCREParser.Global_option_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#global_option_flag}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_option_flag(PCREParser.Global_option_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#global_option_flag}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_option_flag(PCREParser.Global_option_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#look_around}.
	 * @param ctx the parse tree
	 */
	void enterLook_around(PCREParser.Look_aroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#look_around}.
	 * @param ctx the parse tree
	 */
	void exitLook_around(PCREParser.Look_aroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 */
	void enterLook_ahead_positive(PCREParser.Look_ahead_positiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 */
	void exitLook_ahead_positive(PCREParser.Look_ahead_positiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 */
	void enterLook_ahead_negative(PCREParser.Look_ahead_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 */
	void exitLook_ahead_negative(PCREParser.Look_ahead_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#look_behind_positive}.
	 * @param ctx the parse tree
	 */
	void enterLook_behind_positive(PCREParser.Look_behind_positiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#look_behind_positive}.
	 * @param ctx the parse tree
	 */
	void exitLook_behind_positive(PCREParser.Look_behind_positiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#look_behind_negative}.
	 * @param ctx the parse tree
	 */
	void enterLook_behind_negative(PCREParser.Look_behind_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#look_behind_negative}.
	 * @param ctx the parse tree
	 */
	void exitLook_behind_negative(PCREParser.Look_behind_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#embedded_code}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_code(PCREParser.Embedded_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#embedded_code}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_code(PCREParser.Embedded_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#define_group}.
	 * @param ctx the parse tree
	 */
	void enterDefine_group(PCREParser.Define_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#define_group}.
	 * @param ctx the parse tree
	 */
	void exitDefine_group(PCREParser.Define_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_reference(PCREParser.Subroutine_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_reference(PCREParser.Subroutine_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(PCREParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(PCREParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void enterBacktrack_control(PCREParser.Backtrack_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void exitBacktrack_control(PCREParser.Backtrack_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void enterNewline_convention(PCREParser.Newline_conventionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void exitNewline_convention(PCREParser.Newline_conventionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#callout}.
	 * @param ctx the parse tree
	 */
	void enterCallout(PCREParser.CalloutContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#callout}.
	 * @param ctx the parse tree
	 */
	void exitCallout(PCREParser.CalloutContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PCREParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PCREParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(PCREParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(PCREParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom(PCREParser.Cc_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom(PCREParser.Cc_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void enterShared_atom(PCREParser.Shared_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void exitShared_atom(PCREParser.Shared_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PCREParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PCREParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void enterCc_literal(PCREParser.Cc_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void exitCc_literal(PCREParser.Cc_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void enterShared_literal(PCREParser.Shared_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void exitShared_literal(PCREParser.Shared_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PCREParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PCREParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void enterOctal_char(PCREParser.Octal_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void exitOctal_char(PCREParser.Octal_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#hex_char}.
	 * @param ctx the parse tree
	 */
	void enterHex_char(PCREParser.Hex_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#hex_char}.
	 * @param ctx the parse tree
	 */
	void exitHex_char(PCREParser.Hex_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void enterOctal_digit(PCREParser.Octal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void exitOctal_digit(PCREParser.Octal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void enterHex_digit(PCREParser.Hex_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void exitHex_digit(PCREParser.Hex_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(PCREParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(PCREParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(PCREParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(PCREParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PCREParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PCREParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_nums(PCREParser.Alpha_numsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_nums(PCREParser.Alpha_numsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_parens(PCREParser.Non_close_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_parens(PCREParser.Non_close_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_paren(PCREParser.Non_close_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_paren(PCREParser.Non_close_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(PCREParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(PCREParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#block_quoted}.
	 * @param ctx the parse tree
	 */
	void enterBlock_quoted(PCREParser.Block_quotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#block_quoted}.
	 * @param ctx the parse tree
	 */
	void exitBlock_quoted(PCREParser.Block_quotedContext ctx);
}