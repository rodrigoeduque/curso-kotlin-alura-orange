import br.com.rodrigoeduque.bytebank.modelos.Endereco

fun main() {

    val endereco1 = Endereco(logradouro = "Rua A",numero = 1,bairro = "Centro",cidade = "Udia",estado = "MG",cep = "123",complemento = "casa")
    val endereco2 = Endereco(logradouro = "Rua B",numero = 1,bairro = "Centro",cidade = "Udia",estado = "MG",cep = "123",complemento = "casa")

    println()
    println("HashCode Endereço 1 = ${endereco1.hashCode()}")
    println()
    println("HashCode Endereço 2 = ${endereco2.hashCode()}")
    println()
    println("Equals (Endereço1 é igual Endereço2 ?) = ${endereco1.equals(endereco2)}")
    println()
    println("ToString = ${endereco1.toString()}")
    println()
    println("ToString = ${endereco2.toString()}")

}
