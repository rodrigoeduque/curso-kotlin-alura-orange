package br.com.rodrigoeduque.bytebank.modelos

import br.com.rodrigoeduque.bytebank.modelos.Conta

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

    override fun autentica(senha: Int): Boolean {
    return titular.autentica(senha)
    }
}