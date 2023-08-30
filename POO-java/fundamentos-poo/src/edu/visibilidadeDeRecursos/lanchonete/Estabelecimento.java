package edu.visibilidadeDeRecursos.lanchonete;

import edu.visibilidadeDeRecursos.lanchonete.area.cliente.Cliente;
import edu.visibilidadeDeRecursos.lanchonete.atendimento.cozinha.Almoxarife;
import edu.visibilidadeDeRecursos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    Cozinheiro cozinheiro = new Cozinheiro();
    Almoxarife almoxarife = new Almoxarife();
    Cliente cliente = new Cliente();
    
    public void acoes(){
        //ações que não precisa estar disponivel a todos
        cozinheiro.fazerLanche();

         //ações que o estabelecimento precisa ter ciência;
        cozinheiro.atender();
        
        //ações que não precisam estar disponíveis p/ todo app.
        almoxarife.controlarEntradeESaida();

        //ações que só a pacote cozinha precisa saber (default):
        //dando erro, que, ao tirar o public, nossas class não consegue ter acesso a esse método... só apenas quem estar no mesmo pacote...
        almoxarife.entregarIngredientes();

        //ações sigilosas
        cliente.ConsultarSaldoDaConta();

        cozinheiro.pedirParaTrocarGas();
    }


   


    
}
