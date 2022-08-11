
//parametro implicito, nada eh passado como parametro e estamos esperando algo
def foo = {
    println it
}
foo('Marjory')

//diferente daqui que estamos passando um parametro e chamando ele no println
def foo1 = { name ->
    println name
}
foo1('Marjory')

//da para fazer sem parametros, podem se adicionarmos um parametro na chamada ele nao ira considerar
def noparams = {
    println "no params"
}
noparams()

//dois parametros
def sayHello = { first, last ->
    println "Hello, $first $last"
}
sayHello("Marjory", "Matos")

//default values, passando parametros padroes
def greet = {String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}
greet( "Marjory", "Hello")
greet("Joe")

// var-arg, nao importa quantos argumentos passamos ele ira realizar
def concat = { String... args ->
    args.join('')
}
println concat('abc', 'def')
println concat('abc', 'def', '12')

def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y ->
    x + y
}

someMethod(someClosure)
