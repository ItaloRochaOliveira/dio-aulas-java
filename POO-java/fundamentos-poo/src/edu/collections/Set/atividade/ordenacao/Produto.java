package edu.collections.Set.atividade.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return "Pessoa{" + "nome= " + nome + " cod= " + cod + " preco= " + preco + " quantidade= " + quantidade + "}";
    }

    @Override
    public int compareTo(Produto produto){
        return nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
     public int compare(Produto produto1, Produto produto2){
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}