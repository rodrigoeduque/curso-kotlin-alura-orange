package br.com.rodrigoeduque.bytebank.testes

import br.com.rodrigoeduque.bytebank.modelos.Endereco
import java.lang.IllegalStateException

fun testeNullSafe() {
    var endereco: Endereco? = Endereco(logradouro = "Rua Teste")
    var logradouronovo: String? = endereco?.logradouro

    println(endereco?.logradouro)
    println(endereco?.logradouro?.length)


    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)

    }
}
