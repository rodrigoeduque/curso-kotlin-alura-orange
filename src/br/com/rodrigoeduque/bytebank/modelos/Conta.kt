package br.com.rodrigoeduque.bytebank.modelos

import br.com.rodrigoeduque.bytebank.exceptions.FalhaAutenticacaoException
import br.com.rodrigoeduque.bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(


    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContas = 0
            private set
    }

    init {
        println("Conta instanciada com sucesso !")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Seu Saldo é insuficiente para prosseguir com a transferencia. \nSaldo atual de : R$ $saldo\nTentativa de transferencia no valor de: R$ : $valor")
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException(mensagem = "Falha na autenticação do usuário para realizar esta transferencia!")
        }

        saldo -= valor
        destino.deposita(valor)
    }
}