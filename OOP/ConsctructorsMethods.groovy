@groovy.transform.ToString
class Person {
    String first, last

    //consctructor
   /* Person(String first, last){
        this.first = first
        this.last = last
    } */

    //contrutor sofisticado
    Person(String fullName){
        List parts = fullName.split(' ')
        first = parts[0]
        last = parts [1]

    }

    // methods
    public void foo(String b){

    }
    String getFullName(){
        "$first $last"
    }
    def bar (){

    }

    static String doGoodWork(){
        println "doing good work ..."
    }

    //argumentos nos metodos
    List someMethod(List numbers = [1, 2, 3], Boolean canAccessAll = false){

    }

    def concat(String... args){
        println args.length
    }
}
//construtor padrao que tem em Groovy, nao precisamos instanciar igual em cima, apenas passar os valores
//Person p = new Person(first: 'Marjory', last: 'Matos')
//println p

//Person p = new Person("Marjory Matos")
//println p

//Person.doGoodWork()

Person p = new Person("Marjory Matos")
p.concat('a', 'b', 'c', 'd')