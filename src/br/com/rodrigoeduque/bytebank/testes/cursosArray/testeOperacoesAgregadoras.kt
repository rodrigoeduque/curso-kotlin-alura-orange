package br.com.rodrigoeduque.bytebank.testes.cursosArray

fun testeOperacoesAgregadoras() {
    val idades = intArrayOf(18, 10, 12, 33, 40, 57, 15)
    val maiorIdade = idades.max()
    val menorIdade = idades.min()
    val mediaIdades = idades.average()
    val saoTodosMaiores = idades.all { it >= 18 }
    val existeMaiorIdade = idades.any { it >= 18 }
    val listaMaiores = idades.filter { it >= 18 }
    /*
    find traz o primeiro resultado, ou seja >= 18 irá trazer 18 ou > 18 irá trazer o próximo maior que 18 que no nosso caso é 33
     */
    val idadeBusca = idades.find { it == 18 }


    println("Maior idade do Array é : $maiorIdade ")
    println("Menor idade do Array é : $menorIdade ")
    println("Média das Idades : $mediaIdades ")
    println("Todos presentes tem mais de 18 anos ? $saoTodosMaiores")
    println("Verificação se existe algum com idade maior ou igual a 18 : $existeMaiorIdade")
    println("Quais tem idade maior ou igual a 18 : $listaMaiores")
    println("Apenas com 18 anos : $idadeBusca")
}
