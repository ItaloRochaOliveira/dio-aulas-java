package edu.collections.List.atividade.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        listaDePessoas.add(pessoa);
    }

    public void ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);

        Collections.sort(pessoasPorIdade);

        System.out.println("Lista ordenada: " + pessoasPorIdade);
    }

    public void ordenarPorAltura(){
         List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        System.out.println("Lista por Altura: " + pessoasPorAltura);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.listaDePessoas);

        ordenacaoPessoas.ordenarPorIdade();

        ordenacaoPessoas.ordenarPorAltura();
    }
}
