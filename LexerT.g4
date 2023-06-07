lexer grammar LexerT;

BEGIN: 'Pikascript{';
END: '}';
PRINT: 'pika!';

VAR : [a-z]+; //nombre de variable
INT : [0-9]+ ; //int
STR : '"' [a-z]+ '"'; //string
FLT : [0-9]+','[0-9]+; //float
DECLARAR : 'PIKA';
IGUAL : 'CHU';

OR: 'pi|';
AND : 'pi&';

WS : [ \t\r\n]+ -> skip ;
