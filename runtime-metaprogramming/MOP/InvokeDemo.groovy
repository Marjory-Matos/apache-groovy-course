
//Este metodo eh chamado quando o metodo que chamamos nao esta presente em GroovyObject

class InvokeDemo1 {

    def invokeMethod(String name,Object args){
        return "called invokeMethod $name $args"
    }

    def test() {
        return "method exists"
    }

}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == 'method exists'
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'