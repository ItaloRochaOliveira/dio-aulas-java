package one.JUnit.assertionsTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LancamentosTest {
    @Test
    void validadeLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {2, 3, 4, 40, 50};
        int[] terceiroLancamento = {10, 20, 30, 40, 50};
        
        assertArrayEquals(primeiroLancamento, terceiroLancamento);
    }
}
