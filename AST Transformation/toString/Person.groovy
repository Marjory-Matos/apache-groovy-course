import groovy.transform.ToString

//estamos determinando que queremos que os nomes das propriedades apareca e que queremos que o campo email seja excluido
@ToString(includeNames = true, excludes = ["email"])
class Person {

    String first
    String last
    String email

}
