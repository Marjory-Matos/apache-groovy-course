//looping
//-------------------------

//while
List numbers = [1,2,3]
while( numbers ){
    numbers.remove(0)
}
assert numbers == []

//for
for(variable in iterable ){

}

List nums = [1,2,3]
for(Integer i in nums){
    println i
}

for ( i in 1..5){

}
Closure c = {}
//return/break/continue

//nao precisamos dizer explicitamente return, o programa ja entende
String getFoo(){
    "foo"
}

Integer a = 1
while (true){ //infinit loop
    a++
    break
}
assert a == 2

for( String s in 'a'..'z'){
    if( s == 'a') continue
    println s
    if ( s > 'b') break
}
