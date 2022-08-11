//expressoes condicionais

if( true ){
    println "true"
}

//boolean
assert true
assert !false //oposto de falso

//Matcher
assert ('a' =~ /a/) //esta procurando por uma correspondencia
assert !('a' =~ /b/)


//Collection
assert [1]
assert ![]

//Map
assert [1:'one']
assert ![:]

//String
assert 'a'
assert !''

//Number
assert 1
assert 3.5
assert !0

//Nome of the above
assert new Object()
assert !null