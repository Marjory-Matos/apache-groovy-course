
//Pode intercetar o acesso de escrever a propriedades sobressaltando o método setProperty()

class POGO {
    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'overridden'
    }
}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'overridden'
