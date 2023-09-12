package edu.collections.Map.atividade.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        } else {
            throw new NoSuchElementException("A lista está vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap.toString());
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPesquisado = null;

        if(!agendaContatoMap.isEmpty()){
            numeroPesquisado = agendaContatoMap.get(nome);
        }

        return numeroPesquisado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println(numeroPesquisaNaoExistente == null ? "Número de telefone de " + nomePesquisaNaoExistente + ": " + "Não possui cadastro" : "Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente );
      }
}
