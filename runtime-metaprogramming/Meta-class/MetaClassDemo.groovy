
// MetaClass Demo


//Expando e = new Expando()
//e.name = 'Marjory'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()


class Developer {

}

// per instance
Developer mar = new Developer()
mar.metaClass.name = 'Mar'
mar.metaClass.writeCode = { -> println "$name loves to write code..."}
mar.writeCode()

// every instance
String.metaClass.shout = { -> toUpperCase() }
println "hello mar".shout()
