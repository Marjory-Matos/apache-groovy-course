import groovy.transform.Canonical
import groovy.transform.Sortable

//ele ira classificar com base nas propriedades que colocamos, primeiro nome e depois segundo nome
@Canonical
@Sortable( includes = ['last', 'first'] )
class Person {

    String first
    String last

}
