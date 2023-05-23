package compilador;
import java_cup.runtime.Symbol;// Java cup utiliza simbolos en lugar de tokens
%% //Inico de todas las declaraciones a ocupar
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{

private Symbol symbol (int type, Object value){
return new Symbol (type, yyline, yycolumn, value);
}
private Symbol symbol (int type) {
return new Symbol (type, yyline, yycolumn);
}
%}
%%//Final de todas las declaraciones que vamos a ocupar
int  {return new Symbol (sym.Int, yychar, yyline, yytext ());}
class  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
if  {return new Symbol (sym.If, yychar, yyline, yytext ());}
else {return new Symbol (sym.Class, yychar, yyline, yytext ());}
while {return new Symbol (sym.Class, yychar, yyline, yytext ());}
abstract {return new Symbol (sym.Class, yychar, yyline, yytext ());}
assert {return new Symbol (sym.Class, yychar, yyline, yytext ());}
boolean {return new Symbol (sym.Boolean, yychar, yyline, yytext ());}
break  {return new Symbol (sym.Break, yychar, yyline, yytext ());}
byte  {return new Symbol (sym.Byte, yychar, yyline, yytext ());}
case  {return new Symbol (sym.Case, yychar, yyline, yytext ());}
catch {return new Symbol (sym.Class, yychar, yyline, yytext ());}
char  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
const  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
continue  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
default  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
do {return new Symbol (sym.Class, yychar, yyline, yytext ());}
double  {return new Symbol (sym.Boolean, yychar, yyline, yytext ());}
enum {return new Symbol (sym.Class, yychar, yyline, yytext ());}
extends  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
final  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
finally  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
float  {return new Symbol (sym.Boolean, yychar, yyline, yytext ());}
for {return new Symbol (sym.For, yychar, yyline, yytext ());}
goto  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
implements  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
import  {return new Symbol (sym.Import, yychar, yyline, yytext ());}
instanceof  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
interface  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
long  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
native  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
new  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
package  {return new Symbol (sym.Package, yychar, yyline, yytext ());}
private  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
protected {return new Symbol (sym.Class, yychar, yyline, yytext ());}
public  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
return {return new Symbol (sym.Return, yychar, yyline, yytext ());}
short  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
static  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
strictfp {return new Symbol (sym.Class, yychar, yyline, yytext ());}
super {return new Symbol (sym.Class, yychar, yyline, yytext ());}
switch  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
synchronized  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
this  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
throw  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
transient  {return new Symbol (sym.Class, yychar, yyline, yytext ());}
try {return new Symbol (sym.Class, yychar, yyline, yytext ());}
void {return new Symbol (sym.Class, yychar, yyline, yytext ());}
volatile {return new Symbol (sym.Class, yychar, yyline, yytext ());}
{espacio} {/*Ignore*/}
"=" {return new Symbol (sym.Igual, yychar, yyline, yytext ());}
"+" {return new Symbol (sym.Suma, yychar, yyline, yytext ());}
"-" {return new Symbol (sym.Resta, yychar, yyline, yytext ());}
"*" {return new Symbol (sym.Multiplicacion, yychar, yyline, yytext ());}
"/" {return new Symbol (sym.Division, yychar, yyline, yytext ());}
"(" {return new Symbol (sym.Parentesis_a, yychar, yyline, yytext ());}
")" {return new Symbol (sym.Parentesis_c, yychar, yyline, yytext ());}
"{" {return new Symbol (sym.Llave_a, yychar, yyline, yytext ());}
"}" {return new Symbol (sym.Llave_c, yychar, yyline, yytext ());}
"main" {return new Symbol (sym.Main, yychar, yyline, yytext ());}
";" {return new Symbol (sym.P_coma, yychar, yyline, yytext ());} 
{L} ({L} | {D}) * {return new Symbol (sym.Identificador,yychar, yyline, yytext ());} //Regla sintaxtica que permite analizar identificadores 
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
. {return new Symbol (sym.ERROR,yychar, yyline, yytext ());} //No regresar error en caso de que no se encuentre ninguna de las anteriores.
