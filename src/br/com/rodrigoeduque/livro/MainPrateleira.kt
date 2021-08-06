package br.com.rodrigoeduque.livro

import br.com.rodrigoeduque.livro.utils.imprimeComMarcadores
import br.com.rodrigoeduque.livro.utils.listaLivros

fun main() {
    val novaPrateleira = Prateleira("Romance", listaLivros)

    val organizaLivrosPorAnoPublicacao = novaPrateleira.organizaLivrosPorAnoPublicacao()
    val organizaLivrosPorAutor = novaPrateleira.organizaLivrosPorAutor()

    organizaLivrosPorAnoPublicacao.imprimeComMarcadores()
    organizaLivrosPorAutor.imprimeComMarcadores()
}