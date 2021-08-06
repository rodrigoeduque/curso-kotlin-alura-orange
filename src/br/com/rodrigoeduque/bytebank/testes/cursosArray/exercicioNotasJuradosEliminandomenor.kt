package br.com.rodrigoeduque.bytebank.testes.cursosArray

fun exercicioNotasJuradosEliminandomenor() {
    val notasJurados = intArrayOf(7, 5, 8, 9)

    //media das notas desconsiderando a menor

    val teste = notasJurados.sorted().takeLast(3).average()

    println(teste)
}
