package compilador;
import static compilador.Tokens.*;
%% 
%class Lexer
%type Tokens 
L= [a-zA-Z]+
D= [0-9]+
espacio=[ ,\t, \r]+
%{
public String lexeme;
%}
%%
int {lexeme=yytext (); return Int;} 
if {lexeme=yytext (); return If;} 
else {lexeme=yytext (); return Else;} 
abstract {lexeme=yytext (); return Asbstract;} 
assert {lexeme=yytext (); return Assert;} 
boolean {lexeme=yytext (); return Boolean;} 
break {lexeme=yytext (); return Break;} 
byte {lexeme=yytext (); return Byte;} 
case {lexeme=yytext (); return Case;} 
catch {lexeme=yytext (); return Catch;} 
char {lexeme=yytext (); return Char;} 
class {lexeme=yytext (); return Class;} 
const {lexeme=yytext (); return Const;} 
continue {lexeme=yytext (); return Continue;} 
default {lexeme=yytext (); return Default;} 
do {lexeme=yytext (); return Do;}
double {lexeme=yytext (); return Double;} 
enum {lexeme=yytext (); return Enum;} 
extends {lexeme=yytext (); return Extends;} 
final {lexeme=yytext (); return Final;} 
finally {lexeme=yytext (); return Finally;} 
float {lexeme=yytext (); return Float;} 
for {lexeme=yytext (); return For;} 
goto {lexeme=yytext (); return Goto;} 
implements {lexeme=yytext (); return Implementes;} 
import {lexeme=yytext (); return Import;} 
instanceof {lexeme=yytext (); return Instanceof;} 
interface {lexeme=yytext (); return Interface;} 
long {lexeme=yytext (); return Long;} 
native {lexeme=yytext (); return Native;} 
new {lexeme=yytext (); return New;} 
package {lexeme=yytext (); return Package;} 
private {lexeme=yytext (); return Private;} 
protected {lexeme=yytext (); return Protected;} 
public {lexeme=yytext (); return Public;} 
return {lexeme=yytext (); return Return;} 
short {lexeme=yytext (); return Short;} 
static {lexeme=yytext (); return Static;} 
strictfp {lexeme=yytext (); return Strictfp;}
super {lexeme=yytext (); return Super;} 
switch {lexeme=yytext (); return Switch;} 
synchronized {lexeme=yytext (); return Synchronized;} 
this {lexeme=yytext (); return This;} 
throw {lexeme=yytext (); return Throw;} 
transient {lexeme=yytext (); return Transient;} 
try {lexeme=yytext (); return Try;} 
void {lexeme=yytext (); return Void;} 
volatile {lexeme=yytext (); return Volatile;} 
while {lexeme=yytext (); return While;} 
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {return Linea;}
"=" {lexeme=yytext (); return Igual;}
"+" {lexeme=yytext (); return Suma;}
"-" {lexeme=yytext (); return Resta;}
"*" {lexeme=yytext (); return Multiplicacion;}
"/" {lexeme=yytext (); return Division;}
"(" {lexeme=yytext (); return Parentesis_a;}
")" {lexeme=yytext (); return Parentesis_c;}
"{" {lexeme=yytext (); return Llave_a;}
"}" {lexeme=yytext (); return Llave_c;}
"main" {lexeme=yytext (); returnMain;}
";" {lexeme=yytext (); return P_coma;} 
"import" {lexeme=yytext (); return ;}
{L} ({L} | {D}) * {lexeme=yytext (); return Identificador;} //Regla sintaxtica que permite analizar identificadores 
("(-" {D}+")") | {D} {lexeme=yytext (); return Numero ;}
. {return Error;} //No regresar error en caso de que no se encuentre ninguna de las anteriores.
