//if
if( true )
    println "Values is true"

// false | null | empty strings | empty collections
if( !false )
    println "Value is false"

String name = "Marjory"
if (name)
    println "name has a value"

//nenhuma string vazia eh tratado como falsa
String last = ""
if (last)
    println "las has a value"

//if/else
def x = 11
if( x == 10){
    println "x is 10"
} else {
    println "x is not 10"
}

//classic while
def i = 1
while( i <= 10){
     println i
    i++
}

//for in list
def list = [1, 2, 3, 4]
for( num in list ){
    println num
}

//closure podemos usar para fazer um fechamento
def list2 = [1,2,3,4]
list2.each {println it }

//switch
def myNumber = 10
switch (myNumber){

    case 1 :
        println "number is 1"
        break
    default:
        println "we hit the default case"
}