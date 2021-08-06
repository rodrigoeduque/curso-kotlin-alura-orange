package br.com.rodrigoeduque.livro.teste

import br.com.rodrigoeduque.livro.Livro
import br.com.rodrigoeduque.livro.utils.imprimeComMarcadores

fun testeImprimeOrdenacaoSorted() {
    println()
    println()
    println()

    val livro1 = Livro(
        titulo = "O senhor da guerra (Vol. 13 Crônicas Saxônicas)",
        autor = "Bernard Cornwell",
        anoPublicacao = 2021,
        editora = "Record"
    )
    val livro2 = Livro(
        titulo = "Escravidão – Volume 1",
        autor = "Laurentino Gomes",
        anoPublicacao = 2019,
        editora = "Globo Livros"
    )
    val livro3 = Livro(
        titulo = "Uma terra prometida",
        autor = "Barack Obama",
        anoPublicacao = 2020,
        editora = "Companhia das Letras"
    )
    val livro4 = Livro(
        titulo = "Lincoln",
        autor = "Doris Kearns Goodwin",
        anoPublicacao = 2013
    )

    val livros = mutableListOf(livro1, livro2, livro3, livro4)

    livros.imprimeComMarcadores()

    val livrosOrdenadosPorDataComparable = livros.sorted()

    livrosOrdenadosPorDataComparable.imprimeComMarcadores()

    val livrosOrdenadosAutor = livros.sortedBy { ordemlivro -> ordemlivro.autor }

    livrosOrdenadosAutor.imprimeComMarcadores()

    (livros.sortedBy { ordemLivro -> ordemLivro.titulo }).imprimeComMarcadores()

    livros.sortedByDescending { it.autor }.imprimeComMarcadores()
}
