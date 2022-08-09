//Groovy Number Defaults
def number = 10
println number.class

def decimal = 5.50
println decimal.class

//:: Convertendo Data Types //podendo ser implicito ou explicito
//-----------------------------------------------------------
//Explicit - casting
def myFloat = (float) 1.0 //estamos dizendo ao compilador que por mais que ele diga q isso eh bigdecimal estamos dizendo a ele que eh float
println myFloat.class

//Implit - Coercion

//Rules for +, -, *
//------------------------------------------
//Se um dos operandos for float ou double o resultado sera um double
//em Java se apenas floats estiverem envolvidos, o resultado sera float, em Groovy sera Double
Float f = 5.25
Double d = 10.50

def result = d / f
println result
println result.class

Float a = 10.75
Float b = 53.75
def result2 = b / a
println result2
println result2.class

//Se um dos operandos for big decimal ele sera bigDecimal
def x = 34.5 //bigDecimal
def y = 15
def bigResult = x / y
println bigResult
println bigResult.class

//Se um dos operandos for um BigInteger, o resultado sera BigInteger
//Se for Long o resultado sera Long
//Se for Integer, o resultado sera Integer

//Divisao dupla
println 5.0d  - 4.1d //dera um resultado inesperado
println 5-4.1 //dara o resultado que estamos procurando

//Divisao inteira
def intDiv = 1 / 2
println intDiv //isso eh muito diferente de Java onde obteriamos e imprimiamos 0
println intDiv.getClass().getName()
println 1.intdiv(2)


//GDK Methods
//-----------------------------------------
assert 2 == 2.5.toInteger() //conversao
assert 2 == 2.5 as Integer // conversao forcada
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber() //informando que esta string eh um numero
assert 5 == '5'.toInteger() //informando que esta string eh um numero do tipo inteiro

//Times / upto/  downto / step

20.times { print '-'} //estamos dizendo que queremos que ele escreva 20 vezes o -

1.upto(10){ num -> println num} //Estamos dizendo que queremos que ele va do um ate o 10

10.downto(1){ num -> println num} //Estamos dizendo que queremos que ele va do 10 ao 1

0.step(1, 0.1){ num -> println num} //Estamos indo de 0 a 1, sendo 0.1, 0.2 ...