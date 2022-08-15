Expando e = new Expando()

e.first = "Marjory"
e.last  = "Matos"
e.email = "marjoy@gmail.com"

e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first: "Marjory", last: "Matos")
p.metaClass.email = "marjory@gmail.com"
println p
println p.email
