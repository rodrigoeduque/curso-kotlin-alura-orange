package br.com.rodrigoeduque.livro.utils

import br.com.rodrigoeduque.livro.Livro

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "-> ${it.titulo} de ${it.autor} (${it.anoPublicacao}) | Editora : ${it.editora ?: "Não Conhecida"}"
    }
    println("#######-LISTA LIVROS-#######\n\n$textoFormatado\n\n")
}