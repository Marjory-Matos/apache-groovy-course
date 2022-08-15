//Groovy apoia o conceito de métodoS de senhormissing. Este método difere de invocar Mehod na medida em que é apenas
//Invocado em caso de despacho de método falhado, quando não for encontrado qualquer método para o nome próprio e/ou os argumentos indicados:

class MyEmployee {

    def methodMissing(String name, def args){

        if( name != 'someMethod' ) {
            throw new MissingMethodException(name,MyEmployee.class,args)
        }

        println "Method Missing called on: $name"
        println "with arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
emp.someOtherMethod(4,5,6)
