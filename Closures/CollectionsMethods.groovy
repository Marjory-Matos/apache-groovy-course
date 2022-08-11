//closures e listas

/* closures nos ajuda a reduzir um codigo cerimonial e limpa as coisa */

//each e eachWithIndex
List favNums = [2, 3, 44, 355, 8, 4]
for(num in favNums){
    println num
}
favNums.each{ println it}

for( int i = 0; i < favNums.size(); i++){
    println "$i:${favNums[i]}"
}
//faz o mesmo processo de cima so que em poucas linhas
favNums.eachWithIndex{ num, idx ->
    println "$idx:$num"
}

//findAll encontra tudo o que leva o mais proximo do que foi passado
List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
List weekend = days.findAll{it.startsWith("S")}

println days
println weekend

// collect, vamos criar uma nova lista com base nas condicoes que iremos passar
List nums = [1, 2, 2, 7, 2, 8, 2, 4, 6]
List numsTimesTen = []
nums.each { num ->
    numsTimesTen << num * 10
}

//responsavel pelas acoes de coletar e manipular dados
List newTimesTen = nums.collect{num -> num * 10}

println nums
println numsTimesTen
println newTimesTen

