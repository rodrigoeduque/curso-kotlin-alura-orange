package br.com.rodrigoeduque.bytebank.modelos

abstract class Conta(


    var titular: Cliente,
    val numero: Int
) {
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

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}