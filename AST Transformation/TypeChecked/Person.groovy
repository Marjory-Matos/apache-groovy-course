import groovy.transform.TypeChecked


//tudo nesta classe sera verificado ou podemos adiciona-los em metodos indivuais ou propriedades
@TypeChecked
class Person {

    String firstName
    String lastName

    String getFullName(){
        "$firstName $lastName"
    }
}