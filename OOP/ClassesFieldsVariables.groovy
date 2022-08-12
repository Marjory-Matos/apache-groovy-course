//para criar uma classe eh igual o Java, colocamos a palavra reservada class e logo apos informamos o nome da classe
/* Toda classe eh publica em Grovvy, entao nao definimos ela antes da classe como faziamos em Java */

class Person {
    String firstName //variavel privada ela ja entende mesmo sem o modificador de acesso (aqui eh gerado os get e set automaticamente)
    //private String firstName //variavel privada com modificador de acesso declarado (aqui nao eh gerado nada)

    //podemos declarar varios tipos na mesma linha:
    String firstName1, lastName
    def dob
    //private | protected | public
    protected String f1, f2, f3
    private Date createdOn = new Date()

    static welcomeMsg = "HELLO"
    public static final String WELCOME_MSG = 'HELLO'
    //significa que ela nao podera ser alterada e podemos acessar sem criar uma instancia

    //local variable
    def foo(){
        String msg = "Hello" //variavel local
        String firstName = 'Marjory'
        println "$msg, $firstName"
    }

}
def person = new Person()
println person.foo()
//Normalmente teriamos que fazer isso, mas como eh um campo estatico podemos ja adicona-lo sem criar um novo objeto
//Person p = new Person()
//p.welcomeMsg

println Person.welcomeMsg
println Person.WELCOME_MSG