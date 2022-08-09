import groovy.transform.Sortable
import groovy.transform.ToString

@ToString
@Sortable
class Person2 {
    String first
    String last
}

def p1 = new Person2(first: "Marjory", last: "Matos")
def p2 = new Person2(first: "Yhuri", last: "Gross")

def people = [p1, p2]
print(people)

def sorted = people.sort(false)
println sorted