grammar PLATA;

//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- SENTENCIAS -----------
sentencia
		: avanzar 
		| girar 
		| girar_izquierda
		| girar_derecha
		| frenar 
		| retroceder
		| mostrar
		| irA
		| ajustar_velocidad
		| iniciarTarea
		| finalizarTarea
		| girar_sentido_contrario
		| irOrigen
		| asignacion 
		| if_sentencia 
		| bucle_while 
		| expr_aritmeticas
		;


// ----------- ACCIONES ------------
avanzar: (AVANZAR|ADVANCE) '(' expr_aritmeticas ',' expr_aritmeticas ')';
ajustar_velocidad: (AJUSTAR_VELOCIDAD | SET_SPEED) '(' expr_aritmeticas ')';
retroceder: (RETROCEDER | REVERSE) '(' expr_aritmeticas ',' expr_aritmeticas ')';
frenar: FRENAR|BRAKE;
irA: (IR_A | GO_TO) '(' expr_aritmeticas ',' expr_aritmeticas ',' expr_aritmeticas')';
irOrigen: IR_ORIGEN | GO_TO_ORIGIN;
girar: (GIRAR|TURN) '(' expr_aritmeticas ')';
girar_derecha: (GIRAR_DERECHA | TURN_RIGHT);
girar_izquierda: (GIRAR_IZQUIERDA | TURN_LEFT);
girar_sentido_contrario: GIRAR_SENTIDO_CONTRARIO | TURN_OPPOSITE_DIRECTION;
iniciarTarea: (INICIAR_TAREA | STAR_TASK) '(' expr_aritmeticas ')';
finalizarTarea: (FINALIZAR_TAREA | FINISH_TASK) '(' expr_aritmeticas ')';
mostrar: (MOSTRAR | SHOW) '(' atomico ')';

// ---------------- SENTENCIAS ESPECIALES --------------
//asignacion
asignacion: ID '=' expr;

// if
if_sentencia: 	(SI|IF) '('expr_logica')' bloque 
				((SI_NO_SI | ELSE_IF) '('expr_logica')' bloque)* 
				( (SI_NO |ELSE) bloque)?;


// while
bucle_while: (MIENTRAS | WHILE) '('expr_logica')' bloque;

// ------------------ BLOQUES ------------------
bloque: '{' sentencia+ '}';

// --- EXPRESIONES ---
expr
	: expr_aritmeticas
	| expr_relacionales
	| expr_logica
	;
expr_aritmeticas
	: MENOS expr_aritmeticas 	#MenosExprAritmetica
	| expr_aritmeticas op=(MULTIPLICACION | DIVISION | MODULO) expr_aritmeticas	# MultiplicacionExprAritmetica
	| expr_aritmeticas op=(SUMA | MENOS) expr_aritmeticas	# SumaExprAritmetica
	| atomico		#AtomicoExprAritmetica 
	| '(' expr_aritmeticas ')'	# ParentesisExprAritmetica
	;

// operadores relacionales (de comparacion: <,>,>=,<=, == ,!=), operan numero operado con numero = (true o false)
expr_relacionales
	: expr_aritmeticas op=(MAYOR_IGUAL | MENOR_IGUAL | MENOR | MAYOR) expr_aritmeticas # RelacionesExprRelacionales
	| expr_aritmeticas op=(IGUAL_QUE | DISTINTO) expr_aritmeticas #IgualdadesExprRelacionales 
	| '(' expr_relacionales ')' #ParentesisExprRelacionales
	;

// operares logicos (AND , OR, NOT), estos operan logico con logico y el resultado es logico(true o false).
expr_logica
	: NOT expr_logica	#NotExpr
	| expr_logica AND expr_logica # AndExprLogica
	| expr_logica OR expr_logica	# ORExprLogica // Menor precedencia
	| expr_relacionales #LogicaExprRelacionales
	| ((VERDAD | TRUE) | (FALSO|FALSE)) #BoolExprLogica
	| ID #IdExprLogica
	| '(' expr_logica ')' #ParentesisExprLogica
	;


atomico
	: (INT | FLOAT) #numeroAtomico 
	| ((VERDAD | TRUE) | (FALSO|FALSE))	#booleanAtomico
	| ID	# idAtomico //atomo
	| STRING	#stringAtomico
	;

// ----------- LEXER / TOKENS ----------

//  PALABRAS RESERVADAS ACCIONES EN ESPAÑOL
AVANZAR: [Aa] 'vanzar';
AJUSTAR_VELOCIDAD: [Aa] 'justarVelocidad';
RETROCEDER: [Rr] 'etroceder';
FRENAR: [Ff] 'renar';
IR_A: [Ii] 'rA';
IR_ORIGEN: [Ii]'rOrigen';
GIRAR: [Gg] 'irar';
GIRAR_DERECHA: [Gg] 'irarDerecha';
GIRAR_IZQUIERDA: [Gg] 'irarIzquierda';
GIRAR_SENTIDO_CONTRARIO: [Gg]'irarSentidoContrario';
INICIAR_TAREA: [Ii]'niciarTarea';
FINALIZAR_TAREA: [Ff]'inalizarTarea';
MOSTRAR: [Mm]'ostrar';

//  PALABRAS RESERVADAS ACCIONES EN INGLÉS
ADVANCE: [Aa] 'dvance';
SET_SPEED: [Ss] 'etSpeed';
REVERSE: [Rr] 'everse';
BRAKE: [Bb] 'rake';
GO_TO: [Gg] 'oTo';
GO_TO_ORIGIN: [Gg] 'oToOrigin';
TURN: [Tt] 'urn';
TURN_RIGHT: [Tt] 'urnRight';
TURN_LEFT: [Tt] 'urnLeft';
TURN_OPPOSITE_DIRECTION: [Tt] 'urnOppositeDirection';
STAR_TASK: [Ss] 'tartTask';
FINISH_TASK: [Ff] 'inishTask';
SHOW: [Ss] 'how';



//  PALABRAS RESERVADAS DEL LENGUAJE ESPAÑOL
MIENTRAS: [Mm] 'ientras';
SI_NO_SI : [Ss]'iNoSi';
SI_NO    : [Ss]'iNo';
SI      : [Ss]'i';
VERDAD: [Vv]'erdadero';
FALSO: [Ff]'also';
NULO: [Nn]'ulo';

//  PALABRAS RESERVADAS DEL LENGUAJE INGLES
WHILE: [Ww] 'hile';
ELSE_IF: [Ee]'lseIf';
ELSE: [Ee]'lse';
IF: [Ii]'f';
TRUE: [Tt] 'rue';
FALSE: [Ff] 'alse';
NULL: [Nn] 'ull';

//OPERADORES ARITMETICOS
MENOS: '-';
MULTIPLICACION: '*';
DIVISION: '/';
MODULO: '%';
SUMA: '+';

//CONDICIONALES
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
MAYOR: '>';
MENOR: '<';
DISTINTO: '!=';
IGUAL_QUE: '==';
NOT: '!';
AND: '&&';
OR: '||';


INT: DIGITO+;
FLOAT: (DIGITO)+ '.' DIGITO+; 
fragment DIGITO: [0-9];


STRING: '"' (~["\r\n] | '""')* '"';

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; 

