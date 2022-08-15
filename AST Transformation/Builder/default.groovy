Developer mar = Developer
        .builder()
        .firstName("Marjory")
        .lastName("Matos")
        .middleInitial("M")
        .email("marjory@gmail.com")
        .hireDate(new Date())
        .langugages(["Java","Groovy"])
        .build()

println dan
assert dan.firstName == "Marjory"
assert dan.lastName == "Matos"
assert dan.langugages.size() == 2
