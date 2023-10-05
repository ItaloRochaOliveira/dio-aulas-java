package one.JUnit.exceptionsTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import one.JUnit.exceptions.Conta;
import one.JUnit.exceptions.TranferenciaEntreContas;

public class ExceptionTest {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta(0, 12345);
        Conta contaDestino = new Conta(100, 187216);

        TranferenciaEntreContas transfContas = new TranferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transfContas.transfere(contaOrigem, contaDestino, -1);
        });

        Assertions.assertDoesNotThrow(() -> {
            transfContas.transfere(contaOrigem, contaDestino, 20);
        });
    }
}
