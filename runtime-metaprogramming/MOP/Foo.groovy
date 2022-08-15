
//Groovy apoia o conceito de propriedadeMissing para intercetar tentativas de resolução de propriedade de outra forma falhadas.

class Foo {

    def propertyMissing(String name) {
        "caught missing property: $name"
    }
}

println new Foo().bar
