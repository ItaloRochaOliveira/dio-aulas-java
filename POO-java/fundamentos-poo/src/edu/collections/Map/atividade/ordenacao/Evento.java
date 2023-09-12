package edu.collections.Map.atividade.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<String> atracao;
    private String nome;

    public Evento(String nome) {
        this.atracao = new ArrayList<>();
        this.nome = nome;
    }

    public List<String> getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao.add(atracao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Evento [atracao=" + atracao + ", nome=" + nome + "]";
    }

}
