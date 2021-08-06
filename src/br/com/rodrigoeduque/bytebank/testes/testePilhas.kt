package br.com.rodrigoeduque.bytebank.testes

fun principal(){
    println("Entrei no main")
    funcao1()
    println("Sai do main")
}

fun funcao3() {
    println("entrei na função 3")

    for (i in 1..3) {
        println(i)
        throw ArithmeticException("Lancei a braba da ArithmeticException")
    }
    println("Saí da Função 3")
}

fun funcao2() {
    println("Entrei na Função 2")
    funcao3()
    println("Sai da Função 2")
}

fun funcao1() {
    println("Entrei na Função 1")
    funcao2()
    println("Saí da Função 1")
}