import br.com.rodrigoeduque.bytebank.modelos.Cliente
import br.com.rodrigoeduque.bytebank.modelos.ContaCorrente
import br.com.rodrigoeduque.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(
        nome = "João",
        cpf = "333.333.333-33",
        senha = 123
    )

    val maria = Cliente(
        nome = "Maria",
        cpf = "444.444.444-44",
        senha = 123
    )

    val contaJoao = ContaCorrente(
        titular = joao,
        numero = 1002
    )
    contaJoao.titular = joao
    var contaMaria = ContaPoupanca(
        titular = maria,
        numero = 1003
    )
    contaMaria.titular = maria
    contaJoao.titular = joao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}