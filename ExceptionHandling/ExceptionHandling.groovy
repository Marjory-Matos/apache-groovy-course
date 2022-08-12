//Exceptions
//------------------------

//Java
public void foo() throws Exception{
    throw new Exception()
}

//groovy nao precisamos acrescentar a assinatura no metodo
def foo1(){
    throw new Exception("Foo exception")
}

List log = []
try {
    foo1()
}catch ( Exception e){
    log << e.message
} finally {
    log << 'finally '
}

println log 
