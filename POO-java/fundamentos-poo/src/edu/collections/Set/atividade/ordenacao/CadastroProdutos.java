package edu.collections.Set.atividade.ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        Produto produto = new Produto(cod, nome, preco, quantidade);

        produtosSet.add(produto);
    }

    public void exibirProdutosPorNome(){
        Set<Produto> produtosOrdenadosPorNome = new TreeSet<>(produtosSet);

        System.out.println("Lista ordenada por nome: " + produtosOrdenadosPorNome);
    }

    public void exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenadosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosOrdenadosPorPreco.addAll(produtosSet);

        System.out.println("Lista ordenada por preco: " + produtosOrdenadosPorPreco);
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        cadastroProdutos.exibirProdutosPorNome();
    
        // Exibindo produtos ordenados por nome
       cadastroProdutos.exibirProdutosPorNome();
    
        // Exibindo produtos ordenados por preço
       cadastroProdutos.exibirProdutosPorPreco();
      }
}
