package edu.collections.List.atividade.carrinhoOnline;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);

        listaDeItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> ItensARemover = new ArrayList<>();

        for (Item item : listaDeItens) {
            if(item.getNome().equalsIgnoreCase(nome)){
                ItensARemover.add(item);
            }
        }

        listaDeItens.removeAll(ItensARemover);
    }

    public void calcularValorTotal(){
        double total = 0;

        for (Item item : listaDeItens) {
            double preco = item.getPreco();
            int quantidade = item.getQuantidade();

            total += preco * quantidade;
        }

        System.out.println("Total do valor do carrinho: " + total);
    }

    public void exibirItens(){
        System.out.println(listaDeItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItens("controle de video game", 200.20, 2);
        carrinhoDeCompras.adicionarItens("mouse", 199.99, 1);
        carrinhoDeCompras.adicionarItens("jogo", 130.00, 4);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("jogo");

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        
    }
}
