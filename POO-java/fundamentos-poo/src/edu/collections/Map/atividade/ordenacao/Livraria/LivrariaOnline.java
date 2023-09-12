package edu.collections.Map.atividade.ordenacao.Livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline(){
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);

        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        if(!livrosMap.isEmpty()){
            for(Map.Entry<String, Livro> livro: livrosMap.entrySet()){
                if(livro.getValue().getTitulo() == titulo){
                    livrosMap.remove(livro.getKey());
                    break;
                }
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenadoPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosOrdenadoPorPreco, new ComparatorOrdenarPorPreco());

        Map<String, Livro> livrosOrdenadosMap = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry: livrosOrdenadoPorPreco){
            livrosOrdenadosMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livrosOrdenadosMap);
    }

    public void pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        if(!livrosMap.isEmpty()){
            for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
                if(livro.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.put(livro.getKey(), livro.getValue());
                }
            }
        }

        System.out.println("Livro do autor " + autor + ": " + livrosPorAutor);
    }

    public void obterLivroMaisCaro(){
        String livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        Livro livroComparado = null;

        if(!livrosMap.isEmpty()){
            for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
                livroComparado = livro.getValue();
                if(livroComparado.getPreco() > maiorPreco){
                    maiorPreco = livroComparado.getPreco();
                    livroMaisCaro = livroComparado.getTitulo();
                    
                }
            }
        }

        System.out.println("Livro mais caro: " + livroMaisCaro);
    }

    public void exibirLivroMaisBarato(){
        String livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        Livro livroComparado = null;

        if(!livrosMap.isEmpty()){
            for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
                livroComparado = livro.getValue();
                if(livroComparado.getPreco() < menorPreco){
                    menorPreco = livroComparado.getPreco();
                    livroMaisBarato = livroComparado.getTitulo();
                }
            }
        }

        System.out.println("Livro mais barato: " + livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6","Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk","Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);
    
        // Exibe todos os livros ordenados por preço
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    
        //Exibe todos os livros ordenados por autor
        // livrariaOnline.exibirLivrosOrdenadosPorAutor();
    
        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);
    
        // Obtém e exibe o livro mais caro
         livrariaOnline.obterLivroMaisCaro();
    
        // Obtém e exibe o livro mais barato
        livrariaOnline.exibirLivroMaisBarato();
    
        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");

        System.out.println(livrariaOnline.livrosMap);

        livrariaOnline.pesquisarLivrosPorAutor("George Orwell");
      }
}
