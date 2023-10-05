package one.JUnit.ordenarTestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {
    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);        
    }

    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);        
    }

    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
