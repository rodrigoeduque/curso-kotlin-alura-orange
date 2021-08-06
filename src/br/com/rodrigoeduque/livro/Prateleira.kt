package br.com.rodrigoeduque.livro

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizaLivrosPorAutor(): List<Livro> {
        return this.livros.sortedBy { it.autor }

    }

    fun organizaLivrosPorAnoPublicacao(): List<Livro> {
//        this.livros.sortBy { it.anoPublicacao } --> para usar assim, alterar o tipo do retorno para mutable.
        return this.livros.sortedBy { it.anoPublicacao }
    }
}
