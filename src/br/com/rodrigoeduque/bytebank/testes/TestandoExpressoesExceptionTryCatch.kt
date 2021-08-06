package br.com.rodrigoeduque.bytebank.testes

import br.com.rodrigoeduque.bytebank.modelos.Endereco
import java.lang.ClassCastException

private fun TestandoExpressoesExceptionTryCatch() {
    try {
        val endereco = Any()
        endereco as Endereco
    } catch (exception: ClassCastException) {
        println("Peguei a exception")
        exception.printStackTrace()
    }
}
