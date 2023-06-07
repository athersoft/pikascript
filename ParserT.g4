grammar ParserT;
import LexerT;

program   : BEGIN statement+ END;
          
variable : entero | string | decimal; 
declaracion : DECLARAR variable ;
entero : VAR IGUAL INT ;        
string : VAR IGUAL STR;
decimal : VAR IGUAL FLT;

asignacion: VAR IGUAL (operacion);
operacion : suma|resta|division|multiplicacion;
suma : VAR 'pikapika' VAR;
resta : VAR 'pikapi' VAR;
division : VAR 'PIKAPI' VAR;
multiplicacion : VAR 'PIKAPIKA' VAR;
        
statement : print|declaracion|operacion|asignacion;

print : PRINT '('VAR')' ;

mientras : 'piii' logica 'kaaa' statement* 'CHUUU';

logica: comparacion ((OR|AND) comparacion)*;
comparacion : mayor|menor|igualigual|distinto;
mayor : VAR '>' VAR;
menor : VAR '<' VAR;
igualigual : VAR '==' VAR;
distinto : VAR '!=' VAR;