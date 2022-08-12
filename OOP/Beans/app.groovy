
Employee emp = new Employee(first: "Marjory", last: "Matos", email: "marjory@com")
println emp

//nao precisamos chamar o get ou set como metodo por exemplo:
//emp.setFirs = "Marjory"
emp.first = "Marjory"

println emp.first

DoubleBean db = new DoubleBean()
db.value = 100
println db.value

//para acessarmos sem precisar do get
println db.@value

