package br.com.rodrigoeduque.bytebank.modelos

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}