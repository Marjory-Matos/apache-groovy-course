//HashMap, o [:] define que isso representa um mapa
def map = [:]
println map
println map.getClass().getName()

def person = [first:"Marjory", last:"Matos", email:"marjorymatos@com"]
println person
println person.first

//para adicionar
person.twitter = "@therealmarjorymatos"
println person

def twitter = [username:"@therealmarjorymatos", email:"marjory@com"]

//pra utilizarmos variaveis como chaves podemos inclui-las dentro de parenteses
def emailKey = "EmailAddress"
def twitter1 = [username: "@username", (emailKey):"Marjory@com"]
println twitter1


//descobrir as chaves que temos dentro do map
println person.size()

//para classificarmos as chaves alfabeticamente
println person.sort()

//looping through person (loop percorrendo o map pessoa) ira imprimir um par de valores chaves para cada um em particular
for(entry in person){
    println entry
}

//uma chave chamando o valor
for( key in person.keySet()){
    println "$key:${person[key]}"
}

