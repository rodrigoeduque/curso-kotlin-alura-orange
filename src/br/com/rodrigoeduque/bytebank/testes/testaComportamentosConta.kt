import br.com.rodrigoeduque.bytebank.exceptions.FalhaAutenticacaoException
import br.com.rodrigoeduque.bytebank.exceptions.SaldoInsuficienteException
import br.com.rodrigoeduque.bytebank.modelos.Cliente
import br.com.rodrigoeduque.bytebank.modelos.ContaCorrente
import br.com.rodrigoeduque.bytebank.modelos.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 123
    )

    val contaAlex = ContaCorrente(alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 123
    )
    val contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")


    try {
        contaFran.transfere(
            destino = contaAlex,
            valor = 150.0,
            senha = 123
        )
        println("Transferencia bem sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na Transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na Transferencia")
        println("Senha Inválida")
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)

    println()
    println("------------------------------------------------------------------------------------------------")
    println("Finalizou o teste")
}