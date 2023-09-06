package edu.collections.List.atividade.pesquisa.catalogoDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String toString(){
        return "{ titulo: '" + titulo + '\'' + ", autor:" + autor + ", ano_de_publicacao: " + anoPublicacao + "}";
    }

    public static void main(String[] args) {
        Livro livro = new Livro("null", "null", 0);

        System.out.println(livro);
    }
}
