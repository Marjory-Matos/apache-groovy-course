import java.io.Serializable;
//Este eh o bean do Java

//Beans sao classes com padroes
/*
 * - Todas as propriedades devem ser privadas e usando os getters e setters para obter os dados
 * - Deve conter um construtor publico sem argumento
 * - Deve implementar o serializable
 *
 * */


public class EmployeeBean implements Serializable {

    //private properties
    private String first;
    private String last;
    private String email;

    // public no-arg constructor
    public EmployeeBean(){

    }

    //getters and setters

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
