import groovy.transform.Immutable

//transformando a clase como imutavel

@Immutable
class Customer {

    String first, last
    int age
    Date since
    Collection favItems
}
