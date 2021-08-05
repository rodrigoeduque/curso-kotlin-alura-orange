package br.com.rodrigoeduque.bytebank.testes.extracurricular

import br.com.rodrigoeduque.bytebank.modelos.Cliente
import br.com.rodrigoeduque.bytebank.modelos.Endereco

fun testeObjetoAnonimoObjectExpressions() {
    //Objeto Anonimo
    val contaRodrigo = object {
        val numero = 10123

        val titular = Cliente(
            nome = "Rodrigo",
            cpf = "123.444.567-88",
            endereco = Endereco(
                logradouro = "Rua A",
                numero = 78,
                bairro = "Centro",
                cidade = "Uberlandia",
                estado = "Minas",
                cep = "38501879",
                complemento = "Apto 1"
            ), senha = 1
        )

        override fun toString(): String = "Olá. Testando meu objeto anonimo." +
                "\n" +
                "Conta : $numero" +
                "\n" +
                "Dados Titular: ${titular.toString()}"
    }
    println("--------------------------------------------")

    println(contaRodrigo.toString())

    println("--------------------------------------------")
}