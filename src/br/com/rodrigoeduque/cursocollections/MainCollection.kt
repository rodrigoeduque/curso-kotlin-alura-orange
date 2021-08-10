package br.com.rodrigoeduque.cursocollections

fun main() {
    pulaLinha()
    val nomes: Iterable<String> = listOf("Rodrigo", "Ana Camila", "Rogério", "Célia", "Rafaella", "Henrique", "Maria Clara")

for (nome in nomes){
    println(nome)
}

    print("Existe um nome 'Rodrigo' ? ==> ${nomes.contains("Célia")}")
}

fun pulaLinha(){
    println()
    println()
    println()
    println()
}