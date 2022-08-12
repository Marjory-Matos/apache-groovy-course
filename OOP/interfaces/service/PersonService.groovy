package service

import person.Person

class PersonService implements IPersonService{

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: "Marjory", last:"Matos")
        Person p2 = new Person(first: "Marjory", last:"Matos")
        [p1,p2]
    }
}
