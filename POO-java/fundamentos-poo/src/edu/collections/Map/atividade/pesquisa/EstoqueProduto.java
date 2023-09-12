package edu.collections.Map.atividade.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, preco, quantidade);

        estoqueProdutoMap.put(cod, produto);
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double totalDeEstoque = 0d;

        if(!estoqueProdutoMap.isEmpty()){
            for (Produto produto : estoqueProdutoMap.values()) {
                totalDeEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }

        return totalDeEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            for (Produto produto : estoqueProdutoMap.values()) {
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            for (Produto produto : estoqueProdutoMap.values()) {
                if(produto.getPreco() < menorPreco){
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto totalDeEstoque = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            for (Produto produto : estoqueProdutoMap.values()) {
                if(produto.getQuantidade() > maiorPreco){
                    totalDeEstoque = produto;
                    maiorPreco = produto.getQuantidade();
                }
            }
        }

        return totalDeEstoque;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}
