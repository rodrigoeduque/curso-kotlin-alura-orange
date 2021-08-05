package br.com.rodrigoeduque.bytebank.modelos

import br.com.rodrigoeduque.bytebank.modelos.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}