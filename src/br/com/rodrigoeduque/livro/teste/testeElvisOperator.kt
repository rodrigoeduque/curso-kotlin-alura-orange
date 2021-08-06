package br.com.rodrigoeduque.livro.teste

import br.com.rodrigoeduque.livro.Livro
import br.com.rodrigoeduque.livro.utils.listaLivros

fun testeElvisOperator() {
    listaLivros
        .groupBy { it.editora ?: "Desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}
