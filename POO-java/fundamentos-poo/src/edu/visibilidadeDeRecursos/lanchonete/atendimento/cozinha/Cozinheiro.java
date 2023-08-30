package edu.visibilidadeDeRecursos.lanchonete.atendimento.cozinha;

import edu.visibilidadeDeRecursos.lanchonete.atendimento.Atendente;

public class Cozinheiro{
    public void adicionarLanche(){
        System.out.println("Adicionando lanche");
    }

    public void atender(){
        System.out.println("Atendendo cliente");
    }

    private void fazerLanche(){
        System.out.println("Fazendo lanche;");
    }

    public void pedirIngredientes(Almoxarife almoxerife){
        almoxerife.entregarIngredientes();
    }

    public void pedirParaTrocarGas(Atendente atendente ){
        //Ele não consegue porque não está no mesmo pacote, ele é apenas default 
        atendente.trocarGas();
    }
}