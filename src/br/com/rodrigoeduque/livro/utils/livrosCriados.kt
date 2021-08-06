package br.com.rodrigoeduque.livro.utils

import br.com.rodrigoeduque.livro.Livro

val listaLivrosComNull: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "O senhor da guerra (Vol. 13 Crônicas Saxônicas)",
        autor = "Bernard Cornwell",
        anoPublicacao = 2021,
        editora = "Record"
    ),
    Livro(
        titulo = "Escravidão – Volume 1",
        autor = "Laurentino Gomes",
        anoPublicacao = 2019,
        editora = "Globo Livros"
    ),
    null,
    null,
    Livro(
        titulo = "Uma terra prometida",
        autor = "Barack Obama",
        anoPublicacao = 2020,
        editora = "Companhia das Letras"
    ),
    null,
    Livro(
        titulo = "Lincoln",
        autor = "Doris Kearns Goodwin",
        anoPublicacao = 2013
    ),
    null
)

val listaLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "O senhor da guerra (Vol. 13 Crônicas Saxônicas)",
        autor = "Bernard Cornwell",
        anoPublicacao = 2021,
        editora = "Record"
    ),
    Livro(
        titulo = "Escravidão – Volume 1",
        autor = "Laurentino Gomes",
        anoPublicacao = 2019,
        editora = "Globo Livros"
    ),
    Livro(
        titulo = "Uma terra prometida",
        autor = "Barack Obama",
        anoPublicacao = 2020,
        editora = "Companhia das Letras"
    ),
    Livro(
        titulo = "Lincoln",
        autor = "Doris Kearns Goodwin",
        anoPublicacao = 2013
    )
)
