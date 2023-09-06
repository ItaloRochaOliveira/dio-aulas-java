package edu.collections.List.atividade.atividadeListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas{
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); 
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Tamanho da lista é de: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Primeira descrição.");
        listaTarefas.adicionarTarefa("Segunda descrição.");
        listaTarefas.adicionarTarefa("Terceira descrição.");
        listaTarefas.adicionarTarefa("Quarta descrição.");

        System.out.println("Tamanho da lista é de: " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.removerTarefa("Primeira descrição.");
        
        System.out.println("Tamanho da lista é de: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefas();
    }
}
