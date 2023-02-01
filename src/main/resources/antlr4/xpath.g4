grammar xpath;

/*
 * ==================
 * XQuery
 * ==================
 */

@header {
package edu.ucsd.cse232b.parsers;
}

/*Rules*/
prog :	xpath EOF;

xpath: ap
;

ap :
DOC LPR fileName RPR SLASH rp            #ChildRoot //1
|DOC LPR fileName RPR DOUBLESLASH rp     #DescRoot  //2
;

rp:
tagname     #TagName    //3
| '*'       #Star   //4
| '.'       #SelfAxis   //5
| '..'       #ParentAxis        //6
| TXT LPR RPR #TextAxis //7
| attname #AttrAxis //8
| LPR rp LPR #Parenthesis   //9
| rp SLASH rp #ChildRp  //10
| rp DOUBLESLASH rp #DescRp //11
| rp LB filter RB #FilterRp //12
| rp COMMA rp #TwoRp //13
;

filter:
rp          #FilterExist  //14
| rp '=' rp  #FilterEq  //15
| rp '==' rp #FilterIs  //16
| rp '=' STRING #FilterEqString //17
| LPR filter RPR #FilterParent  //18
| filter 'and' filter #FilterAnd    //19
| filter 'or' filter #FilterOr  //20
| 'not' filter      #FilterNot  //21
;

fileName: ID '.xml'    #Xml_File
;
tagname: ID;

attname: '@' ID;

/*Tokens*/



DOC: 'doc';
TXT:'text';
LB: '[';
RB: ']';
ID: [a-zA-Z][a-zA-Z_0-9]*;
SLASH:'/';
DOUBLESLASH:'//';
DOTDOT:'..';
DOT:'.';
COMMA:',';

LPR: '(';
RPR: ')';

STAR: '*';
STRING: [0-9a-zA-Z]*;