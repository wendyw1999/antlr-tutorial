grammar TestGrammar ;

@header {
package edu.ucsd.cse232b.parsers;
}

/*Rules*/
prog :	xpath EOF;


xpath:
| DOC LPR FILE RPR     //doc(file)
| DOC LPR FILE RPR xpath    // doc(file)/xyz
| LPR xpath RPR     // (xpath)
| AP xpath      //  /path
| RP xpath      // //path
| DOT           //Siblings
| DOTDOT        //Parent
| STAR          //Children
| TXT LPR RPR   //Text
| TAGNAME       //Element Tag
| ATTNAME       //AttrName
| TAGNAME xpath //ElementTag
;

/*Tokens*/

AP:'/';
RP:'//';
DOTDOT:'..';
DOT:'.';
FILE: [a-zA-Z][a-zA-Z_0-9]*'.xml';

TXT:'text';
LPR: '(';
RPR: ')';
DOC: 'doc';
STAR: '*';
NUM :  '0' | '-'?[1-9][0-9]* ;
TAGNAME: [a-zA-Z][a-zA-Z_0-9]*;
ATTNAME: '@'[a-zA-Z][a-zA-Z_0-9]*;
