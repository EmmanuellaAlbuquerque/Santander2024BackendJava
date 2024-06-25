package list.catalogo_de_livros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicao;

    public Livro(String titulo, String autor, int anoPublicao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicao = anoPublicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicao() {
        return anoPublicao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicao=" + anoPublicao +
                '}';
    }
}
