// Intercept - Cache - Invoke Pattern

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println "${name}() method was called..."

        if( name.startsWith('write') ) {
            String language = name.split("write")[1]

            if( languages.contains(language) ) {
                def impl = { Object[] theArgs ->
                    println "I like to write code  in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }

}

Developer mar = new Developer()
mar.languages << "Groovy"
mar.languages << "Java"
println mar.metaClass.methods.size()
mar.writeGroovy()
mar.writeGroovy()
mar.writeGroovy()
println mar.metaClass.methods.size()
mar.writeJava()
mar.writeJava()
println mar.metaClass.methods.size()