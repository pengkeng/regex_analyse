// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/PCRE.g4 by ANTLR 4.9.1
package cn.ac.ios.PCRE;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCREParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCREVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PCREParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PCREParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#global_option_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_pattern(PCREParser.Global_option_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(PCREParser.AlternationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PCREParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PCREParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(PCREParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_greedy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_greedy(PCREParser.Quantifier_greedyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_lazy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_lazy(PCREParser.Quantifier_lazyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_possesstive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_possesstive(PCREParser.Quantifier_possesstiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_Kleene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_Kleene(PCREParser.Quantifier_KleeneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_add(PCREParser.Quantifier_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_option(PCREParser.Quantifier_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_range(PCREParser.Quantifier_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class(PCREParser.Character_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#negative_character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_character_class(PCREParser.Negative_character_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#character_class_intersection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class_intersection(PCREParser.Character_class_intersectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference(PCREParser.BackreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference_or_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_index(PCREParser.Backreference_or_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference_or_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_name(PCREParser.Backreference_or_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#character_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_octal(PCREParser.Character_octalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(PCREParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#name_caturpe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_caturpe(PCREParser.Name_caturpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture(PCREParser.Non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#atomic_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_non_capture(PCREParser.Atomic_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#reset_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_non_capture(PCREParser.Reset_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#base_non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_non_capture(PCREParser.Base_non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PCREParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(PCREParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flags(PCREParser.Option_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flag(PCREParser.Option_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#global_option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_flags(PCREParser.Global_option_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#global_option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_option_flag(PCREParser.Global_option_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#look_around}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_around(PCREParser.Look_aroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#look_ahead_positive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_ahead_positive(PCREParser.Look_ahead_positiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#look_ahead_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_ahead_negative(PCREParser.Look_ahead_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#look_behind_positive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_behind_positive(PCREParser.Look_behind_positiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#look_behind_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_behind_negative(PCREParser.Look_behind_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#embedded_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_code(PCREParser.Embedded_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#define_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_group(PCREParser.Define_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#subroutine_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_reference(PCREParser.Subroutine_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(PCREParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backtrack_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktrack_control(PCREParser.Backtrack_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#newline_convention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_convention(PCREParser.Newline_conventionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout(PCREParser.CalloutContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PCREParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(PCREParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom(PCREParser.Cc_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#shared_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_atom(PCREParser.Shared_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PCREParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#cc_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_literal(PCREParser.Cc_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#shared_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_literal(PCREParser.Shared_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PCREParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#octal_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_char(PCREParser.Octal_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#hex_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_char(PCREParser.Hex_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#octal_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_digit(PCREParser.Octal_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#hex_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_digit(PCREParser.Hex_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(PCREParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(PCREParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PCREParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#alpha_nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_nums(PCREParser.Alpha_numsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#non_close_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_parens(PCREParser.Non_close_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#non_close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_paren(PCREParser.Non_close_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(PCREParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#block_quoted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_quoted(PCREParser.Block_quotedContext ctx);
}