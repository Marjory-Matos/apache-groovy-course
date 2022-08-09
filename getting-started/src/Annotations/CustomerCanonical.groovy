import groovy.transform.Canonical

//transforma os hash para que possamos criar um outro cliente
@Canonical
class CustomerConical{
    String first, last
    int age
    Date since
    Collection favItems = ['Food']
    def object

}

def d = new Date()
def anyObject = new Object()
def c1 = new Customer(first: 'Tom', last: 'Jones', age: 21, since: d, favItems: ['Books', 'Games'], object: anyObject)
def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'], anyObject)

