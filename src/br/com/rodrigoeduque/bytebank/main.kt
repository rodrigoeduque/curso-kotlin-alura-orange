import br.com.rodrigoeduque.bytebank.modelos.Cliente
import br.com.rodrigoeduque.bytebank.modelos.ContaPoupanca

fun main() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa Mensal : $taxaMensal")

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Rodrigo",
            cpf = "123.123.123-33",
            senha = 123
        ), 1001
    )
    contaPoupanca
        .run {
            deposita(400000.00)
            println(saldo)
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println("Rendimento Mensal : $rendimentoMensal")
        }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(1) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Simulação Rendimento Anual : $rendimentoAnual")
}














