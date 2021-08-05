package br.com.rodrigoeduque.bytebank.testes

import br.com.rodrigoeduque.bytebank.modelos.*

fun testaObjects_companion_objects() {
    val endereco = Endereco(
        logradouro = "Rua Anibal Pereira",
        numero = 86,
        bairro = "Centro",
        cidade = "Romaria",
        estado = "Minas Gerais",
        cep = "38520-000",
        complemento = "Casa"
    )

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        endereco = endereco,
        senha = 123
    )

    val contaPoupanca = ContaPoupanca(alex, 1001)
    val contaCorrente = ContaCorrente(alex, 1002)
    val contaCorrente1 = ContaCorrente(
        Cliente(
            nome = "Rodrigo",
            cpf = "555.555.555-22",
            endereco = endereco,
            senha = 123
        ), 1003
    )
    val conta4 = ContaPoupanca(alex, 1003)


    println("Total de Contas : ${Conta.totalContas}")
}