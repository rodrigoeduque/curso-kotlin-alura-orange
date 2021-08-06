package br.com.rodrigoeduque.bytebank.testes.cursosArray

private fun testeAlterandoElementosDoArrayUsandoFor() {
    var salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 4000.0, 8000.0, 16000.00)

    val aumento = 1.1
/*
Usando for para iterar manualmente -> lembrete .indices é palavra reservada não foi criada por mim :)
 */
//    for (i in salarios.indices) {
//        salarios[i] = salarios[i] * aumento
//    }

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}
