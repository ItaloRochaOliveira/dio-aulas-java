package edu.collections.Set.atividade.operacoesBasicas.pesquisa.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> agenda;

    public AgendaContatos(){
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        Contato contato = new Contato(nome, numero);

        agenda.add(contato);
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public void pesquisarPorNome(String nome){
        Set<Contato> resultadoDaPesquisa = new HashSet<>();

        for (Contato contato : agenda) {
            if(contato.getNome().startsWith(nome)){
                resultadoDaPesquisa.add(contato);
            }
        }

        System.out.println(resultadoDaPesquisa);
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
         Contato resultadoDaPesquisa = null;

        for (Contato contato : agenda) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                resultadoDaPesquisa = contato;
                break;
            }
        }

        System.out.println("Contato atualizado: " + resultadoDaPesquisa);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agenda = new AgendaContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agenda.exibirContatos();
    
        // Adicionando contatos à agenda
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Maria Fernandes", 55555555);
        agenda.adicionarContato("Ana", 88889999);
        agenda.adicionarContato("Fernando", 77778888);
        agenda.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agenda.exibirContatos();
    
        // Pesquisando contatos pelo nome
        agenda.pesquisarPorNome("Maria");
    
        // Atualizando o número de um contato
        agenda.atualizarNumeroContato("Carolina", 44443333);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agenda.exibirContatos();
      }
}
