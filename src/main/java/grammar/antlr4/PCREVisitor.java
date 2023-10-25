// Generated from C:/Users/d1tto/Desktop/RegexFilter/src/main/java/grammar/antlr4\PCRE.g4 by ANTLR 4.12.0
package grammar.antlr4;
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
	 * Visit a parse tree produced by the {@code quantifier1}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier1(PCREParser.Quantifier1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifier2}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier2(PCREParser.Quantifier2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifier3}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier3(PCREParser.Quantifier3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifier4}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier4(PCREParser.Quantifier4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifier5}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier5(PCREParser.Quantifier5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifier6}
	 * labeled alternative in {@link PCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier6(PCREParser.Quantifier6Context ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#quantifier_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_type(PCREParser.Quantifier_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class(PCREParser.Character_classContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backreference1}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference1(PCREParser.Backreference1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code backreference5}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference5(PCREParser.Backreference5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code backreference9}
	 * labeled alternative in {@link PCREParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference9(PCREParser.Backreference9Context ctx);
	/**
	 * Visit a parse tree produced by {@link PCREParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_octal(PCREParser.Backreference_or_octalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code capture1}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture1(PCREParser.Capture1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code capture2}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture2(PCREParser.Capture2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code capture3}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture3(PCREParser.Capture3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code capture4}
	 * labeled alternative in {@link PCREParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture4(PCREParser.Capture4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code non_capture1}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture1(PCREParser.Non_capture1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code non_capture2}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture2(PCREParser.Non_capture2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code non_capture3}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture3(PCREParser.Non_capture3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code non_capture4}
	 * labeled alternative in {@link PCREParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture4(PCREParser.Non_capture4Context ctx);
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
	 * Visit a parse tree produced by the {@code lookaround1}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookaround1(PCREParser.Lookaround1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lookaround2}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookaround2(PCREParser.Lookaround2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lookaround3}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookaround3(PCREParser.Lookaround3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lookaround4}
	 * labeled alternative in {@link PCREParser#lookaround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookaround4(PCREParser.Lookaround4Context ctx);
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
	 * Visit a parse tree produced by the {@code cc_atom1}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom1(PCREParser.Cc_atom1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cc_atom2}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom2(PCREParser.Cc_atom2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cc_atom3}
	 * labeled alternative in {@link PCREParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom3(PCREParser.Cc_atom3Context ctx);
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
	 * Visit a parse tree produced by {@link PCREParser#octal_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_digit(PCREParser.Octal_digitContext ctx);
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
}