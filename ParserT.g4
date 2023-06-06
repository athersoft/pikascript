grammar ParserT;
import LexerT;

program   : BEGIN statement+ END;
          
declaracion : entero | string | decimal;  
entero : 'PIKA' INT VAR ;        
string : 'PIKA' STR VAR;
decimal : 'PIKA' FLT VAR;

suma : VAR 'pikapika' VAR;
resta : VAR 'pikapi' VAR;
division : VAR 'PIKAPI' VAR;
multiplicacion : VAR 'PIKAPIKA' VAR;
        
statement : print ;

print     : PRINT '('VAR')' ;

mientras : 'piii' logica 'kaaa' statement* 'CHUUU';

logica: comparacion ((OR|AND) comparacion)*;
comparacion : mayor|menor|igual|distinto;
mayor : VAR '>' VAR;
menor : VAR '<' VAR;
igual : VAR '==' VAR;
distinto : VAR '!=' VAR;