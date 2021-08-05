package br.com.rodrigoeduque.bytebank.modelos

import br.com.rodrigoeduque.bytebank.modelos.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco : Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

    override fun toString(): String {
        return "\n" +
                "nome='$nome'\n" +
                "cpf='$cpf'\n" +
                "Endereço=$endereco\n"
    }


}