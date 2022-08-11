//expressoes lambda
//o conceito de alterar um delegado de fechamento eh o que torna os fechamentos tao exclusivos
//this: corresponde ao objeto que esta sendo referido no momento
//owner: sao closures alinhados, temos que fechar o pai primeiro para fecharmos o filho
//delegate corresponde a um objeto de terceiros, em que as chamadas ou propriedades de metodo
//sempre que o destinatario da mensagem nao esta definido


class ScopeDemo {
    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}
def demo = new ScopeDemo()
demo.outerClosure()

//delegate.groovy alteracao do delegado
def writer = {
    append 'Marjory'
    append 'lives in SP'
}

def append(String s){
  println "append() called with argument of $s"
}

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()