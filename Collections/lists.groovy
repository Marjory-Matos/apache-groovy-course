//array list
List nums = [1, 2, 3, 4, 6, 2]
println nums
println nums.class.name

//para vincular a uma lista do java util, como linkedlist
List nums1 = [1, 2, 3, 4, 6, 2] as LinkedList
println nums1
println nums1.class.name

//add | remove | get | clear

//empurrando conteudos para dentro do array, sera inserido no comeco
nums.push(99)
println nums

//adiciona um valor em um indice especifico, aqui no caso foi o indice 1
nums.putAt(1, 77)
println nums

//troca o valor no indice especifico
nums[1] = 78
println nums

//adicionar valores nos ultimos indices da lista e nao altera a lista original
println nums + [3, 4, 6]
println nums

//adiciona o valor ao ultimo e altera a original
nums << 66
println nums

//remove o primeiro indice
nums.pop()
println nums

//remove um indice especifico
nums.removeAt(1)
println nums

//mostra os indices do 0 ao 3
println nums.getAt(0..3)

//for para percorrer os indices da lista
for (x in nums){
    println x
}

//nivela as listas dentro de uma lista
nums << [3, 5, 6]
nums << [1, 2, 4]
println nums.flatten()

//mostra os elementos existentes sem unificalos
println nums.unique()

//nao mostrar conteudos duplicados inserindo a lista set
def numbers = [1, 2, 2, 3, 4, 5, 1, 4,] as Set
println numbers
println numbers.class.name

//Treeset
def numbers1 = [1, 2, 2, 3, 4, 5, 1, 4,] as SortedSet
println numbers1
println numbers1.class.name
