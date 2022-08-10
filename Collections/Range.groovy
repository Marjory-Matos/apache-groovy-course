
//os pontos indicam o intervalo
Range r = 1..10
println r
//indicara todos o tipo de dado
println r.class.name

//indicara de onde comeca
println r.from

//indicara onde termina
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false

//contar entre os dias
Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

//de letras
Range letters = 'a'..'z'
println letters