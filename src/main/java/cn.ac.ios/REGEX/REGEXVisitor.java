// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/REGEX.g4 by ANTLR 4.9.1
package cn.ac.ios.REGEX;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link REGEXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface REGEXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link REGEXParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(REGEXParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#global_option_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_pattern(REGEXParser.Global_option_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(REGEXParser.AlternationContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(REGEXParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(REGEXParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(REGEXParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_greedy(REGEXParser.Quantifier_greedyContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_lazy(REGEXParser.Quantifier_lazyContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_possesstive(REGEXParser.Quantifier_possesstiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_Kleene(REGEXParser.Quantifier_KleeneContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_add(REGEXParser.Quantifier_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_option(REGEXParser.Quantifier_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#quantifier_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_range(REGEXParser.Quantifier_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class(REGEXParser.Character_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#negative_character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_character_class(REGEXParser.Negative_character_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#character_class_intersection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class_intersection(REGEXParser.Character_class_intersectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference(REGEXParser.BackreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#backreference_or_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_index(REGEXParser.Backreference_or_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#backreference_or_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_name(REGEXParser.Backreference_or_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_octal(REGEXParser.Backreference_or_octalContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#character_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_octal(REGEXParser.Character_octalContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(REGEXParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#name_caturpe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_caturpe(REGEXParser.Name_caturpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture(REGEXParser.Non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_non_capture(REGEXParser.Atomic_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#reset_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_non_capture(REGEXParser.Reset_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#base_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_non_capture(REGEXParser.Base_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(REGEXParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(REGEXParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flags(REGEXParser.Option_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flag(REGEXParser.Option_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#global_option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_flags(REGEXParser.Global_option_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#global_option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_flag(REGEXParser.Global_option_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#look_around}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_around(REGEXParser.Look_aroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_ahead_positive(REGEXParser.Look_ahead_positiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_ahead_negative(REGEXParser.Look_ahead_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#look_behind_positive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_behind_positive(REGEXParser.Look_behind_positiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#look_behind_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_behind_negative(REGEXParser.Look_behind_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#embedded_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_code(REGEXParser.Embedded_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#define_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_group(REGEXParser.Define_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#subroutine_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_reference(REGEXParser.Subroutine_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(REGEXParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#backtrack_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktrack_control(REGEXParser.Backtrack_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#newline_convention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_convention(REGEXParser.Newline_conventionContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout(REGEXParser.CalloutContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(REGEXParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(REGEXParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom(REGEXParser.Cc_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#shared_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_atom(REGEXParser.Shared_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(REGEXParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#cc_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_literal(REGEXParser.Cc_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#shared_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_literal(REGEXParser.Shared_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(REGEXParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#octal_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_char(REGEXParser.Octal_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#hex_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_char(REGEXParser.Hex_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#octal_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_digit(REGEXParser.Octal_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#hex_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_digit(REGEXParser.Hex_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(REGEXParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(REGEXParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(REGEXParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#alpha_nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_nums(REGEXParser.Alpha_numsContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#non_close_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_parens(REGEXParser.Non_close_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#non_close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_paren(REGEXParser.Non_close_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(REGEXParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link REGEXParser#block_quoted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_quoted(REGEXParser.Block_quotedContext ctx);
}