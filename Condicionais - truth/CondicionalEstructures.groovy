// if (boolean expression) { //logic }

if( true ){
    println "true"
}

if ( true ){
    println true
}

def age = 35
if ( age >= 35 ){
    println "can run for president"
}

if(true){
    println "true"
}else {
    println "false"
}

def yourage = 18
if ( yourage >= 21){
    println "buy beer"
}else {
    println "no beer for you"
}

def someage = 37

if ( someage= 21 ){
    println "buy some beer"
} else if(someage >= 35) {
    println "run for president"
}else {
    println "under 21..."
}

//------------------------------
// ternary operator (expression) ? true : false
def name = 'Marjory'
def isitMar = (name.toUpperCase() == 'MARJORY') ? 'YES' : 'NO'
println isitMar

def msg
def output = ( msg != null ) ? msg: 'default message...'
def elvisOutput = msg ?: 'default message...'

println msg
println output
println elvisOutput

//---------------------------------------
//switch

def num = 3

switch (num){
    case 1:
        println "1"
        break
    case 2:
        println "2"
        break
    case 1..3:
        println "in range 1..3"
        break
    case [1, 2, 3]:
        println "num is in list"
        break
    case Integer:
        println "num is an Integer"
        break
    case Float:
        println "num is a float"
    default:
        println "default ..."
}

//in
def valiAges = 18..35
def someAge = 19
println someAge in valiAges