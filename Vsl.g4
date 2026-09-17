grammar Vsl;

// TASK: add each terminal symbol to list of tokens (PROGRAM | DOT | ...)
tokens: EOF;

// terminal symbols
PROGRAM: 'PROGRAM';
IDENT: LETTER (LETTER | DIGIT)+;
DOT: '.';
LETTER: [a-zA-Z];
DIGIT: [0-9];
WS: [ \n\t\r] ->skip;

// TASK: Add more terminal symbols