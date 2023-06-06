// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ParserTParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ParserTParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogica(ParserTParser.LogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ParserTParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(ParserTParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(ParserTParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinto(ParserTParser.DistintoContext ctx);
}