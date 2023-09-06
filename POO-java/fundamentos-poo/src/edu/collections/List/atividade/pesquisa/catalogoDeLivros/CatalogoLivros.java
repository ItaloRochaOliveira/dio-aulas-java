package edu.collections.List.atividade.pesquisa.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> conjuntoDelivros;

    public CatalogoLivros(){
        this.conjuntoDelivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);

        conjuntoDelivros.add(livro);
    }

    public void pesquisarPorAutor(String autor){
        List<String> resultadoDaPesquisa = new ArrayList<>();

        for (Livro livro : conjuntoDelivros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                resultadoDaPesquisa.add(livro.getTitulo());
            }
        }

        System.out.println("Livros encontrados com o nome desse autor: " + resultadoDaPesquisa);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> resultadoDaPesquisa = new ArrayList<>();

        for (Livro livro : conjuntoDelivros) {
            if(livro.getAnoPublicacao() > anoInicial && livro.getAnoPublicacao() < anoFinal){
                resultadoDaPesquisa.add(livro);
            }
        }

        System.out.println("Livros encontrados entre os anos de " + anoInicial + " a " + anoFinal + ": " + resultadoDaPesquisa);

    }

    public void pesquisarPorTitulo(String titulo){
        List<Livro> resultadoDaPesquisa = new ArrayList<>();

        for (Livro livro : conjuntoDelivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                resultadoDaPesquisa.add(livro);
            }
        }

        System.out.println("Livros encontrados com esse titulo é: " + resultadoDaPesquisa);

    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("A filha do reverendo", "George Orwell", 1935);

        catalogo.adicionarLivro("A Revolução dos bichos", "George Orwell", 1945);

        catalogo.adicionarLivro("JavaScript - O guia definitivo", "David Flanagan", 2012);

        catalogo.pesquisarPorAutor("George Orwell");

        catalogo.pesquisarPorIntervaloAnos(1944, 2013);

        catalogo.pesquisarPorTitulo("A Revolução dos bichos");
    }
}
