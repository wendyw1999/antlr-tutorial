grammar xquery;

/*
 * ==================
 * XQuery
 * ==================
 */

//@header {
//package edu.ucsd.cse232b.project.xpathParsers;
//}

/*Rules*/
//xpath :	(ap)+ EOF;



ap :
  DOC LPR QUOTE fileName QUOTE RPR SLASH rp       #ChildRoot //1
| DOC LPR QUOTE fileName QUOTE RPR DOUBLESLASH rp   #DescRoot  //2
;
//
rp:
  ID     #TAG_NAME    //3
| '*'       #STAR   //4
| '.'       #SELF_AXIS   //5
| '..'       #PARENT_AXIS        //6
| TXT LPR RPR #TEXT_AXIS //7
| attname #ATTR_AXIS //8
| LPR rp RPR #PARENTHESIS   //9
| rp SLASH rp #CHILD_RP  //10
| rp DOUBLESLASH rp #DESC_RP //11
| rp LB filter RB #FILTER_RP //12
| rp COMMA rp #TWO_RP //13
;

filter:
  rp          #FILTER_EXIST  //14
| rp ('=' | 'eq') rp  #FILTER_EQ  //15
| rp ('==' | 'is') rp #FILTER_IS  //16
| rp '=' STRING #FILTER_EQ_STRING //17
| LPR filter RPR #FILTER_PARENT  //18
| filter 'and' filter #FILTER_AND    //19
| filter 'or' filter #FILTER_OR  //20
| 'not' filter      #FILTERNOT  //21
;
// TODO: define the classes and look at programBuilder and listener update
xq:
  var
| STRING
| ap
| LPR xq RPR
| xq COMMA xq
| xq SLASH rp
| xq DOUBLESLASH rp
| a = startTag '{' xq '}' b = endTag
  {$a.getID().getText().equals($b.getID().getText());}
;

forClause: 'for' var 'in' xq ( COMMA var 'in' xq )*;

letClause: 'let' var ':=' xq ( COMMA var ':=' xq )*;

whereClause: 'where' cond;

returnClause: 'return' xq;

cond:
  xq ('=' | 'eq') xq
| xq ('==' | 'is') xq
| 'empty' LPR xq RPR
| 'some' var 'in' xq (COMMA var 'in' xq)* 'satisfy' cond
| (cond)
| cond 'and' cond
| cond 'or' cond
| 'not' cond

startTag: '<' ID '>';

endTag: '</' ID '>';

var: '$' ID;

fileName: ID'.xml';

attname: '@' ID;

/*Tokens*/


QUOTE: ["|'];
DOC: 'doc';
TXT:'text';
LB: '[';
RB: ']';
ID: [a-zA-Z][a-zA-Z_0-9]+;
SLASH:'/';
DOUBLESLASH:'//';
DOTDOT:'..';
DOT:'.';
COMMA:',';

LPR: '(';
RPR: ')';

STAR: '*';
STRING: QUOTE [0-9a-zA-Z]+ QUOTE;

// ignore whitespace
Whitespace: [ \t\n\r]+ -> skip;