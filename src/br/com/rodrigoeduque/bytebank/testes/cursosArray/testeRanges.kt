package br.com.rodrigoeduque.bytebank.testes.cursosArray

fun testeRanges() {
    val series = 1.rangeTo(10)
    for (serie in series) {
        print("$serie ")
    }

    println()
    val seriesPares = 0.rangeTo(100) step 2
    for (serie in seriesPares) {
        print("$serie ")
    }

    println()
    val seriesParesOutraForma = 0..100 step 2
    for (serieParOutraForma in seriesParesOutraForma) {
        print("$serieParOutraForma ")
    }

    println()

    val serieReversa = 10 downTo 1
    for (s in serieReversa) {
        print("$s ")
    }

    println()
    val seriesParesReversa = 100 downTo 0 step 2
    for (s in seriesParesReversa) {
        print("$s ")
    }

    println()
    val intervaloSalario = 1000.0..5000.00
    val salarioVerificacao = 13000.0

    if (salarioVerificacao in intervaloSalario) {
        print("Salário : R$ $salarioVerificacao está dentro do nosso intervalo")
    } else {
        print("Salário esta fora do Intervalo")
    }
}
