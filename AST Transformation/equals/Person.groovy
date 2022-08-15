
import groovy.transform.EqualsAndHashCode

//aqui iremos considerar somente nome e sobrenome, estamos excluindo a comparacao dos dois objetos email
@EqualsAndHashCode( excludes = ["email"] )
class Person {

    String first
    String last
    String email
}
