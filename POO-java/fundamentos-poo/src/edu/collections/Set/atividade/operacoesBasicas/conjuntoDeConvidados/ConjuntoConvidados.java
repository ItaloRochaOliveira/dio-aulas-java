package edu.collections.Set.atividade.operacoesBasicas.conjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado convidado = new Convidado(nome, codigoConvite);

        convidadosSet.add(convidado);
    }

    //Os nomes podem repetir, apenas o código do convite será únivo.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado convidado : convidadosSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }

        convidadosSet.remove(convidadoParaRemover);
    }

    public void contarConvidados(){
        System.out.println("Total de convidado: " + convidadosSet.size());;
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.adicionarConvidado("Nome1", 1);
        conjuntoConvidados.adicionarConvidado("Nome2", 2);
        conjuntoConvidados.adicionarConvidado("Nome3", 3);
        conjuntoConvidados.adicionarConvidado("Nome4", 4);
        //Para gerar "erro"
        conjuntoConvidados.adicionarConvidado("CodigoRepetido", 4);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();



    }
}
