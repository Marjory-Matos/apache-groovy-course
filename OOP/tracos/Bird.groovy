package groovy
//diferente da heranca eu nao preciso implementar os metodos da classe
class Bird implements FlyingAbility{

    //como ela foi definida como abstrata, temos que implentar ela aqui
    @Override
    String foo() {
        return null
    }
}
