// Cada acesso lido a uma propriedade pode ser intercetado sobrepondo-se ao método getProperty () do objeto atual.


class PropertyDemo {


    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name){
        println "getProperty() called with argument $name"

        if( metaClass.hasProperty(this,name) ) {
            return metaClass.getProperty(this,name)
        } else {
            println "lets do something fun with this property"
            return "party time..."
        }

    }
}

def pd = new PropertyDemo()

println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4

