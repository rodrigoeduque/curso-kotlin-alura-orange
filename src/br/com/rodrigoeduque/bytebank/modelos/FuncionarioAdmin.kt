package br.com.rodrigoeduque.bytebank.modelos

import br.com.rodrigoeduque.bytebank.modelos.Autenticavel
import br.com.rodrigoeduque.bytebank.modelos.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}