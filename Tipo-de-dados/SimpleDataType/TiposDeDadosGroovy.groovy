//tudo em Groovy eh um objeto, nao precisamos colocar o tipo primitivo como int, float
byte b = 10
b.getClass().getName()

short s = 1000
s.class

float f = 1.25
f.class

3.class

//digitacao opcional

/* opcao de declarar explicitamente um tipo de variavel, mas tambem temos a opcao
de nao declarar nenhum tipo e ai que usamos a palavra reservada def, ou seja
 nao ha um tipo bean declarado */
def x = 10
x.getClass().getName()

x = 'Marjory'
x.getClass().getName()