// Operadores aritmeticos

assert 10 + 1 == 11
assert 10 - 1 == 9
assert 10 * 2 == 20
assert 10 / 5 == 2
assert 10 % 3 == 1
assert 10 ** 2 == 100

//Operadores aritmeticos binarios += -= *= /= %= **=

def a = 10
a += 5 // a = a + 5
assert a == 5

//Operadores relacional
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//Operadores Logicos
assert !false //o que nao eh falso
assert true && true
assert true || false

//Operadores condicionais

    //Operadores tenarios
    String s = ""
    if( s != null && s.length() > 0){
        result = 'Found'
    }else {
        result = 'Not Found'
    }

    String s = ""
    result = ( s!= null && s.length() > 0) ? 'Found' : 'Not Found'

    //Operador Elvis
    displayName = user.name ? user.name : 'Anonymous' //se o nome do usuario existir, usar o nome do usuario, se nao, usar anonymo
    dusplayName = user.name ?: 'Anonymous'

//Operadores Objetos

    //Operador de navegacao segura
    //Java
    /* Nao podemos fazer nada se tivermos uma pessoa, se o endereco dela nao for um objeto */
    Person p = new Person()
    if(p.address != null){
        Address address = p.address
    }

    //Groovy
    /* para verificar a existencia podemos ja inserir o operador de navegacao segura por um ponto,
    * entao ele sempre verifica antes de tentarmos acessar um objeto */
    def address = p?.address
    assert address == null

