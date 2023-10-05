package one.JUnit.afterBeforeTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import one.JUnit.afterBefore.BancoDeDados;

public class ConsultatDadosDePessoaTest {

    //antes de iniciar os métodos do banco de dado, podemos indicar 
    //o que faremos antes de testar seus métodos, no caso abri e fechar conexão dom o DB.
    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configurar conexão.");
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void fecharConfiguracao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizando conexão.");
    }
}
