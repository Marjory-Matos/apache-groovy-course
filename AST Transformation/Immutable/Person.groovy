import groovy.transform.Immutable
import groovy.transform.ToString


//imutavel, algo que nao se pode alterar
@ToString
@Immutable
class Person {

    String first
    String last

}

