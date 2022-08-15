import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

//compilacao estatica
@CompileStatic
class SomeClass {

    String foo(){
        "foo"
    }

    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void noReturn(){

    }

}