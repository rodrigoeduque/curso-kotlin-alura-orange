package br.com.rodrigoeduque.bytebank.exceptions

class SaldoInsuficienteException(mensagem: String = "Saldo insuficiente para concluir operação") : Exception(mensagem)