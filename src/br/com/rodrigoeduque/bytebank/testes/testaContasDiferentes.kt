import br.com.rodrigoeduque.bytebank.modelos.Cliente
import br.com.rodrigoeduque.bytebank.modelos.ContaCorrente
import br.com.rodrigoeduque.bytebank.modelos.ContaPoupanca
import br.com.rodrigoeduque.bytebank.modelos.Endereco

fun testaContasDiferentes() {

    val endereco = Endereco(
        logradouro = "Rua Anibal Pereira",
        numero = 86,
        bairro = "Centro",
        cidade = "Romaria",
        cep = "38520-000",
        complemento = "Casa"
    )

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        endereco = endereco,
        senha = 123
    )
    val fran = Cliente(
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 123
    )

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )


    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    println("Titular")
    println("Nome : ${contaCorrente.titular.nome}")
    println("CPF : ${contaCorrente.titular.cpf}")
    println("Endereço : ${contaCorrente.titular.endereco.logradouro} , ${contaCorrente.titular.endereco.numero} - ${contaCorrente.titular.endereco.bairro} / ${contaCorrente.titular.endereco.cidade}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}