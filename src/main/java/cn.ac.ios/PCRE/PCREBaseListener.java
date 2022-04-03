// Generated from /Users/pqc/idea/regex_analyse/src/main/java/cn.ac.ios/PCRE/PCRE.g4 by ANTLR 4.9.1
package cn.ac.ios.PCRE;

import cn.ac.ios.Bean.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * This class provides an empty implementation of {@link PCREListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class PCREBaseListener implements PCREListener {

    public HashMap<String, ArrayList<ParserRuleContext>> hashMap = new HashMap<>();
    public ArrayList<String> arrayList = new ArrayList<>();

    /**
     * init
     */
    public PCREBaseListener() {
    }

    private void saveData(ParserRuleContext ctx) {
        ArrayList<ParserRuleContext> list = hashMap.getOrDefault(getName(ctx), new ArrayList<>());
        list.add(ctx);
        hashMap.put(getName(ctx), list);
        if (ctx instanceof PCREParser.OptionContext) {
            if (ctx.getText().startsWith("(?")) {
                String str = ctx.getText();
                if (ctx.getChildCount() >= 5 && ctx.getChild(4) instanceof PCREParser.AlternationContext || ctx.getChild(5) instanceof PCREParser.AlternationContext) {
                    arrayList.add(str.substring(2, str.indexOf(":")));
                } else {
                    arrayList.add(str.substring(2, str.indexOf(")")));
                }
            }
        }
    }

    public static String getName(ParserRuleContext context) {
        return context.getClass().getSimpleName().replace("Context", "").toLowerCase();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParse(PCREParser.ParseContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParse(PCREParser.ParseContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterGlobal_option_pattern(PCREParser.Global_option_patternContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitGlobal_option_pattern(PCREParser.Global_option_patternContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAlternation(PCREParser.AlternationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAlternation(PCREParser.AlternationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpr(PCREParser.ExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpr(PCREParser.ExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterElement(PCREParser.ElementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitElement(PCREParser.ElementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterQuantifier(PCREParser.QuantifierContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitQuantifier(PCREParser.QuantifierContext ctx) {
    }

    @Override
    public void enterQuantifier_greedy(PCREParser.Quantifier_greedyContext ctx) {

    }

    @Override
    public void exitQuantifier_greedy(PCREParser.Quantifier_greedyContext ctx) {

    }

    @Override
    public void enterQuantifier_lazy(PCREParser.Quantifier_lazyContext ctx) {

    }

    @Override
    public void exitQuantifier_lazy(PCREParser.Quantifier_lazyContext ctx) {

    }

    @Override
    public void enterQuantifier_possesstive(PCREParser.Quantifier_possesstiveContext ctx) {

    }

    @Override
    public void exitQuantifier_possesstive(PCREParser.Quantifier_possesstiveContext ctx) {

    }

    @Override
    public void enterQuantifier_Kleene(PCREParser.Quantifier_KleeneContext ctx) {

    }

    @Override
    public void exitQuantifier_Kleene(PCREParser.Quantifier_KleeneContext ctx) {

    }

    @Override
    public void enterQuantifier_add(PCREParser.Quantifier_addContext ctx) {

    }

    @Override
    public void exitQuantifier_add(PCREParser.Quantifier_addContext ctx) {

    }

    @Override
    public void enterQuantifier_option(PCREParser.Quantifier_optionContext ctx) {

    }

    @Override
    public void exitQuantifier_option(PCREParser.Quantifier_optionContext ctx) {

    }

    @Override
    public void enterQuantifier_range(PCREParser.Quantifier_rangeContext ctx) {

    }

    @Override
    public void exitQuantifier_range(PCREParser.Quantifier_rangeContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCharacter_class(PCREParser.Character_classContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCharacter_class(PCREParser.Character_classContext ctx) {
    }

    @Override
    public void enterNegative_character_class(PCREParser.Negative_character_classContext ctx) {

    }

    @Override
    public void exitNegative_character_class(PCREParser.Negative_character_classContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCharacter_class_intersection(PCREParser.Character_class_intersectionContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCharacter_class_intersection(PCREParser.Character_class_intersectionContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBackreference(PCREParser.BackreferenceContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBackreference(PCREParser.BackreferenceContext ctx) {
    }

    @Override
    public void enterBackreference_or_index(PCREParser.Backreference_or_indexContext ctx) {

    }

    @Override
    public void exitBackreference_or_index(PCREParser.Backreference_or_indexContext ctx) {

    }

    @Override
    public void enterBackreference_or_name(PCREParser.Backreference_or_nameContext ctx) {


    }

    @Override
    public void exitBackreference_or_name(PCREParser.Backreference_or_nameContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx) {
    }

    @Override
    public void enterCharacter_octal(PCREParser.Character_octalContext ctx) {

    }

    @Override
    public void exitCharacter_octal(PCREParser.Character_octalContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCapture(PCREParser.CaptureContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCapture(PCREParser.CaptureContext ctx) {
    }

    @Override
    public void enterName_caturpe(PCREParser.Name_caturpeContext ctx) {

    }

    @Override
    public void exitName_caturpe(PCREParser.Name_caturpeContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNon_capture(PCREParser.Non_captureContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNon_capture(PCREParser.Non_captureContext ctx) {
    }

    @Override
    public void enterAtomic_non_capture(PCREParser.Atomic_non_captureContext ctx) {

    }

    @Override
    public void exitAtomic_non_capture(PCREParser.Atomic_non_captureContext ctx) {

    }

    @Override
    public void enterReset_non_capture(PCREParser.Reset_non_captureContext ctx) {

    }

    @Override
    public void exitReset_non_capture(PCREParser.Reset_non_captureContext ctx) {

    }

    @Override
    public void enterBase_non_capture(PCREParser.Base_non_captureContext ctx) {

    }

    @Override
    public void exitBase_non_capture(PCREParser.Base_non_captureContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterComment(PCREParser.CommentContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitComment(PCREParser.CommentContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOption(PCREParser.OptionContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOption(PCREParser.OptionContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOption_flags(PCREParser.Option_flagsContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOption_flags(PCREParser.Option_flagsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOption_flag(PCREParser.Option_flagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOption_flag(PCREParser.Option_flagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterGlobal_option_flags(PCREParser.Global_option_flagsContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitGlobal_option_flags(PCREParser.Global_option_flagsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterGlobal_option_flag(PCREParser.Global_option_flagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitGlobal_option_flag(PCREParser.Global_option_flagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLook_around(PCREParser.Look_aroundContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLook_around(PCREParser.Look_aroundContext ctx) {
    }

    @Override
    public void enterLook_ahead_positive(PCREParser.Look_ahead_positiveContext ctx) {

    }

    @Override
    public void exitLook_ahead_positive(PCREParser.Look_ahead_positiveContext ctx) {

    }

    @Override
    public void enterLook_ahead_negative(PCREParser.Look_ahead_negativeContext ctx) {

    }

    @Override
    public void exitLook_ahead_negative(PCREParser.Look_ahead_negativeContext ctx) {

    }

    @Override
    public void enterLook_behind_positive(PCREParser.Look_behind_positiveContext ctx) {

    }

    @Override
    public void exitLook_behind_positive(PCREParser.Look_behind_positiveContext ctx) {

    }

    @Override
    public void enterLook_behind_negative(PCREParser.Look_behind_negativeContext ctx) {

    }

    @Override
    public void exitLook_behind_negative(PCREParser.Look_behind_negativeContext ctx) {

    }

    @Override
    public void enterEmbedded_code(PCREParser.Embedded_codeContext ctx) {

    }

    @Override
    public void exitEmbedded_code(PCREParser.Embedded_codeContext ctx) {

    }

    @Override
    public void enterDefine_group(PCREParser.Define_groupContext ctx) {

    }

    @Override
    public void exitDefine_group(PCREParser.Define_groupContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSubroutine_reference(PCREParser.Subroutine_referenceContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSubroutine_reference(PCREParser.Subroutine_referenceContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConditional(PCREParser.ConditionalContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConditional(PCREParser.ConditionalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBacktrack_control(PCREParser.Backtrack_controlContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBacktrack_control(PCREParser.Backtrack_controlContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNewline_convention(PCREParser.Newline_conventionContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNewline_convention(PCREParser.Newline_conventionContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCallout(PCREParser.CalloutContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCallout(PCREParser.CalloutContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAtom(PCREParser.AtomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAtom(PCREParser.AtomContext ctx) {
    }

    @Override
    public void enterAnchor(PCREParser.AnchorContext ctx) {

    }

    @Override
    public void exitAnchor(PCREParser.AnchorContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCc_atom(PCREParser.Cc_atomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCc_atom(PCREParser.Cc_atomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterShared_atom(PCREParser.Shared_atomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitShared_atom(PCREParser.Shared_atomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLiteral(PCREParser.LiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLiteral(PCREParser.LiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCc_literal(PCREParser.Cc_literalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCc_literal(PCREParser.Cc_literalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterShared_literal(PCREParser.Shared_literalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitShared_literal(PCREParser.Shared_literalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNumber(PCREParser.NumberContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNumber(PCREParser.NumberContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOctal_char(PCREParser.Octal_charContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOctal_char(PCREParser.Octal_charContext ctx) {
    }

    @Override
    public void enterHex_char(PCREParser.Hex_charContext ctx) {

    }

    @Override
    public void exitHex_char(PCREParser.Hex_charContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOctal_digit(PCREParser.Octal_digitContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOctal_digit(PCREParser.Octal_digitContext ctx) {
    }

    @Override
    public void enterHex_digit(PCREParser.Hex_digitContext ctx) {

    }

    @Override
    public void exitHex_digit(PCREParser.Hex_digitContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDigits(PCREParser.DigitsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDigits(PCREParser.DigitsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDigit(PCREParser.DigitContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDigit(PCREParser.DigitContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterName(PCREParser.NameContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitName(PCREParser.NameContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAlpha_nums(PCREParser.Alpha_numsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAlpha_nums(PCREParser.Alpha_numsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNon_close_parens(PCREParser.Non_close_parensContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNon_close_parens(PCREParser.Non_close_parensContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNon_close_paren(PCREParser.Non_close_parenContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNon_close_paren(PCREParser.Non_close_parenContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLetter(PCREParser.LetterContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLetter(PCREParser.LetterContext ctx) {
    }

    @Override
    public void enterBlock_quoted(PCREParser.Block_quotedContext ctx) {

    }

    @Override
    public void exitBlock_quoted(PCREParser.Block_quotedContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        saveData(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }

}