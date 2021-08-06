package br.com.rodrigoeduque.bytebank.testes.cursosArray

fun testeCriacaoArrayEIteracao() {
    /**
     * Padrão
     */
//    val idades = IntArray(5)
//    idades[0] = 15
//    idades[1] = 55
//    idades[2] = 19
//    idades[3] = 13
//    idades[4] = 20

    /**
     * Padrão 2 - utilizando o intArray onde não preciso passar o tamanho do meu array
     */
    val idades: IntArray = intArrayOf(15, 55, 69, 13, 20, 61, 99, 15)

    /*
    Percorrendo os meus arrays com for simples (Padrão 1 e 2)
     */

//    var maiorIdade = Int.MIN_VALUE
//    for (idade in idades) {
//        if (idade > maiorIdade) {
//            maiorIdade = idade
//        }
//    }
//    println(maiorIdade)


    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}
