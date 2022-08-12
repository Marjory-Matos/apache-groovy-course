//Este eh o bean em Groovy

/*
* O proprio groovy faz o construtor e os gettrs and setters
*
*/

@groovy.transform.ToString
class Employee implements Serializable{
    String first, last, email

    String fullName
    //se escrevermos nossos proprios getters e setters ele nao ira sobrescrever o que proprio cria
    void setFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full Name: ${fullName}"
    }
}
