package edu.collections.List.atividade.carrinhoOnline;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
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

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(){
        return "{" + nome + "," + preco + "," + quantidade + "}";
    }

    // public static void main(String[] args) {
    //     Item produto = new Item("mouse", 12.2, 1);

    //     System.out.println(produto);
    // }
}
