package one.JUnit.assertionsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import one.JUnit.assertions.Pessoa;

public class PessoaTest {

    @Test
    void seRetornaAlgoDaClasse(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2001, 07, 07));

        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarClculoDePessoa(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2001, 07, 07));

        int idade = pessoa.getIdade();

        Assertions.assertEquals(22, idade);
    }

    @Test
    void seRetornaSeEhMaiorIdade(){
        Pessoa luiz = new Pessoa("Luiz", LocalDate.of(2003, 10, 11));

        boolean maiorIdade = luiz.eMaiorIdade();

        Assertions.assertTrue(maiorIdade);

        Pessoa joao = new Pessoa("joao", LocalDate.of(2020, 10, 11));

        boolean menorIdade = joao.eMaiorIdade();

        Assertions.assertFalse(menorIdade);
    }
}
