import groovy.transform.ToString
import groovy.transform.builder.Builder

//construtores
@Builder
@ToString(includeNames = true)
class Developer {

    String firstName
    String lastName
    String middleInitial
    String email
    Date hireDate
    List languages

}