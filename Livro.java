public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    public Livro() {

    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    // Métodos
    public void exibirDetalhes() {
        System.out.println(
                "Titulo: " + titulo + " Autor: " + autor + " Ano de publicação: " + anoPublicacao + " Preço: " + preco);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor +
           ", Ano: " + anoPublicacao + ", Preço: " + preco;
    }
}
