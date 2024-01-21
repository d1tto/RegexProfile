// Generated from D:/MyWorkDir/RegexProfile/src/main/java/grammar/antlr4\PCRE.g4 by ANTLR 4.12.0
package grammar.antlr4;
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
	 * Enter a parse tree produced by the {@code quantifier1}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier1(PCREParser.Quantifier1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier1}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier1(PCREParser.Quantifier1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifier2}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier2(PCREParser.Quantifier2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier2}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier2(PCREParser.Quantifier2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifier3}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier3(PCREParser.Quantifier3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier3}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier3(PCREParser.Quantifier3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifier4}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier4(PCREParser.Quantifier4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier4}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier4(PCREParser.Quantifier4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifier5}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier5(PCREParser.Quantifier5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier5}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier5(PCREParser.Quantifier5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifier6}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier6(PCREParser.Quantifier6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifier6}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier6(PCREParser.Quantifier6Context ctx);
	/**
	 * Enter a parse tree produced by {@link PCREParser#quantifier_type}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_type(PCREParser.Quantifier_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PCREParser#quantifier_type}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_type(PCREParser.Quantifier_typeContext ctx);
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
	 * Enter a parse tree produced by the {@code backreference1}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference1(PCREParser.Backreference1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference1}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference1(PCREParser.Backreference1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference2}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference2(PCREParser.Backreference2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference2}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference2(PCREParser.Backreference2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference3}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference3(PCREParser.Backreference3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference3}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference3(PCREParser.Backreference3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference4}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference4(PCREParser.Backreference4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference4}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference4(PCREParser.Backreference4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference5}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference5(PCREParser.Backreference5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference5}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference5(PCREParser.Backreference5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference6}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference6(PCREParser.Backreference6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference6}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference6(PCREParser.Backreference6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference7}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference7(PCREParser.Backreference7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference7}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference7(PCREParser.Backreference7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference8}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference8(PCREParser.Backreference8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference8}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference8(PCREParser.Backreference8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code backreference9}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference9(PCREParser.Backreference9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code backreference9}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference9(PCREParser.Backreference9Context ctx);
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
	 * Enter a parse tree produced by the {@code capture1}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture1(PCREParser.Capture1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code capture1}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture1(PCREParser.Capture1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code capture2}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture2(PCREParser.Capture2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code capture2}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture2(PCREParser.Capture2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code capture3}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture3(PCREParser.Capture3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code capture3}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture3(PCREParser.Capture3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code capture4}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture4(PCREParser.Capture4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code capture4}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture4(PCREParser.Capture4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code non_capture1}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture1(PCREParser.Non_capture1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code non_capture1}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture1(PCREParser.Non_capture1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code non_capture2}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture2(PCREParser.Non_capture2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code non_capture2}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture2(PCREParser.Non_capture2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code non_capture3}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture3(PCREParser.Non_capture3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code non_capture3}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture3(PCREParser.Non_capture3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code non_capture4}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture4(PCREParser.Non_capture4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code non_capture4}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture4(PCREParser.Non_capture4Context ctx);
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
	 * Enter a parse tree produced by the {@code lookaround1}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void enterLookaround1(PCREParser.Lookaround1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lookaround1}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void exitLookaround1(PCREParser.Lookaround1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lookaround2}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void enterLookaround2(PCREParser.Lookaround2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lookaround2}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void exitLookaround2(PCREParser.Lookaround2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lookaround3}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void enterLookaround3(PCREParser.Lookaround3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lookaround3}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void exitLookaround3(PCREParser.Lookaround3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lookaround4}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void enterLookaround4(PCREParser.Lookaround4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lookaround4}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 */
	void exitLookaround4(PCREParser.Lookaround4Context ctx);
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
	 * Enter a parse tree produced by the {@code cc_atom1}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom1(PCREParser.Cc_atom1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cc_atom1}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom1(PCREParser.Cc_atom1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cc_atom2}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom2(PCREParser.Cc_atom2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cc_atom2}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom2(PCREParser.Cc_atom2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cc_atom3}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom3(PCREParser.Cc_atom3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cc_atom3}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom3(PCREParser.Cc_atom3Context ctx);
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
}