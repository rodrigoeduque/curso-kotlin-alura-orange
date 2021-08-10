package br.com.rodrigoeduque.bytebank.testes

import br.com.rodrigoeduque.bytebank.modelos.Endereco

fun testesletLambda() {
    //    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 76)
//    val enderecoEmMaiusculo = "${endereco.logradouro} , ${endereco.numero}".toUpperCase()

//    println(enderecoEmMaiusculo)


    /**
     * Forma 1
     */

//    Endereco(logradouro = "Rua Vergueiro", numero = 76).let { endereco ->
//        "${endereco.logradouro} , ${endereco.numero}".toUpperCase()
//    }.let { enderecoEmMaiusculo -> println(enderecoEmMaiusculo) }


    /**
     * Forma 2
     * Usando a lambda para imprimir o valor
     */

    Endereco(logradouro = "Rua dos Pereiras", numero = 150).let { end ->
        "${end.logradouro} , ${end.numero}".toLowerCase()
    }.let(::println)

    Endereco(
        logradouro = "Rua dos Pereiras",
        numero = 150
    ).let { end -> "${end.logradouro} , ${end.numero}".toLowerCase().let(::println) }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { complApartamento -> complApartamento.complemento.equals("casa") }
        .let(::println)

    listOf(
        Endereco(
            logradouro = "Rua anibal pereira",
            numero = 86,
            bairro = "centro",
            complemento = "casa",
            cidade = "romaria",
            estado = "Minas Gerais"
        ),
        Endereco(
            logradouro = "tomaz martins campos",
            numero = 77,
            bairro = "jardim brasilia",
            complemento = "bloco 1 apto 104",
            cidade = "uberlandia",
            estado = "Minas Gerais"
        )
    ).filter { localizacao -> localizacao.cidade.startsWith("rom") }
        .let(::println)
}