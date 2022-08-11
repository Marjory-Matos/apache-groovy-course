/* Closures eh um encerramento, eh como um metodo, mas ele eh uma parte de primeira
classe da linguagem. Quando se tem um metodo em uma classe, nos damos um nome a ele,
leva alguns argumentos e executa algumas acoes. um closure fara a mesma coisa mas ao
contrario do metodo, ele sera um objeto e pode ser usado ou passado em torno do programa.
O closures servira para:
- Iteradores: uma boa maneira de iterar mapas de listas e outros objetos
- Callbacks: retornos de chamadas nao precisam mais de classes internas anonimas como fazemos em Java, apenas criamos callbacks
- Higher-order function: funcoes de funcoes de ordem superior que sao chamadas em outras funcoes de estrutura de controle especializada
- Specialized Control Structure: Pode criar o seu proprio construtores de estruturas de controle
- Builders: maneiras diferentes de construir estruturas de HVMs ou Exham
- Resource allocation: Nao precisamos nos preocupar em fechar arquivos abertos
- Threads: metodo estatico de uma classe de thread.
- DSLs: Construir nossas proprias celulas -D
- Fluent Interfaces: limpa um programa poluido, e nos retorna um codigo muito facil de entender
*/

def c = {}

println c.class.name
//instancia do fechamento de classe
println c instanceof Closure

//o bloco eh uma funcao anonima, o name eh o argumento que podemos utilizar nesta funcao
def sayHello = { name ->
    println "Hello, $name"
}
sayHello('Marjory')

//palavra reservada it faz com que consigamos acessar os indices da lista
List nums = [1, 2, 3, 7, 4, 2]
nums.each { println it }

//podemos tambem fazer isto passando por um argumento
List nums1 = [1, 2, 4, 56, 4]
nums1.each { num ->
    println num
}

//closures sao objetos e parametros
def timesTen(num, closure){
    closure(num * 10)
}
timesTen(10, {println it })
timesTen(2, {println it})

10.times{
    println it
}

//imprimindo um numero aleatorio 3 vezes
import java.util.Random
Random rand = new Random()
3.times{
    println rand.nextInt()
}



