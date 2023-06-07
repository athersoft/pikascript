// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull ParserTParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull ParserTParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull ParserTParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull ParserTParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull ParserTParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull ParserTParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(@NotNull ParserTParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(@NotNull ParserTParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull ParserTParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#igualigual}.
	 * @param ctx the parse tree
	 */
	void enterIgualigual(@NotNull ParserTParser.IgualigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#igualigual}.
	 * @param ctx the parse tree
	 */
	void exitIgualigual(@NotNull ParserTParser.IgualigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull ParserTParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull ParserTParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 */
	void enterDistinto(@NotNull ParserTParser.DistintoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 */
	void exitDistinto(@NotNull ParserTParser.DistintoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(@NotNull ParserTParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(@NotNull ParserTParser.LogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(@NotNull ParserTParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(@NotNull ParserTParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ParserTParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ParserTParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull ParserTParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull ParserTParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(@NotNull ParserTParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(@NotNull ParserTParser.ComparacionContext ctx);
}