package br.com.rodrigoeduque.bytebank.modelos


class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        } else
            throw RuntimeException("Verifique o objeto passado como parametro. Para não retornar Exception, basta retirar a condição do else")
    }
}