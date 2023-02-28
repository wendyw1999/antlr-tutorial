grammar xquery;
@header {
package edu.ucsd.cse232b.project.xqueryParsers;
}
xq : var                                                   #varXQ
   | StringConstant                                        #scXQ
   | ap                                                    #apXQ
   | '(' xq ')'                                            #braceXQ
   | xq ',' xq                                             #commaXQ
   | startTag '{' xq '}' endTag                            #tagXQ
   | xq '/' rp                                             #singleSlashXQ
   | xq '//' rp                                            #doubleSlashXQ
   | forClause letClause? whereClause? returnClause        #FLWR
   | letClause xq                                          #letXQ
   ;

forClause : 'for' var 'in' xq (',' var 'in' xq)* ;
letClause : 'let' var ':=' xq (',' var ':=' xq)* ;
whereClause : 'where' cond ;
returnClause : 'return' rt ;

rt : xq                                                  #xqReturn
   | rt ',' rt                                           #commaReturn
   | startTag rt endTag                                  #tagReturn
   ;

cond : xq EQ xq                                                  #eqCond
     | xq IS xq                                                  #isCond
     | 'empty' '(' xq ')'                                           #emptyCond
     | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond    #satisfyCond
     | '(' cond ')'                                              #braceCond
     | cond 'and' cond                                           #andCond
     | cond 'or' cond                                            #orCond
     | 'not' cond                                                #notCond
     ;
startTag: '<' tagName '>';
endTag: '<' '/' tagName '>';
var: '$' ID;
idList : '[' ID (',' ID)* ']' ;
StringConstant: '"'+[a-zA-Z0-9,.!?; ''""-]+'"';
ap: doc  '//' rp    #doubleAP
  | doc  '/' rp     #singleAP
  ;
doc: 'doc("' filename '")' | 'document("' filename '")';
//relative path
rp : tagName                   #tagRP
   | '*'                       #childrenRP
   | '.'                       #selfRP
   | '..'                      #parentRP
   | 'text()'                  #textRP
   | '@' attName               #attRP
   |  rp ',' rp                #commaRP
   | '(' rp ')'                #braceRP
   | rp '/' rp                 #singleSlashRP
   | rp '//' rp                #doubleSlashRP
   | rp '[' f ']'              #filterRP
   ;

//path filter
f : rp                         #rpFilter
  | rp EQ StringConstant       #rpEqString
  | rp EQ rp                   #eqFilter
  | rp IS rp                   #isFilter
  | '(' f ')'                  #braceFilter
  | f 'and' f                  #andFilter
  | f 'or' f                   #orFilter
  | 'not' f                    #notFilter
  ;

tagName:  ID;
attName:  ID;

EQ: '=' | 'eq';
IS: '==' | 'is';
ID: [a-zA-Z0-9_-]+ ;

filename: FILENAME;
FILENAME: [a-zA-Z0-9._]+;

WHITESPACE:[ \t\n\r]+ -> skip;