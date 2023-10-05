package one.JUnit.assumptionsTestesCondicionais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    //Hiposteses, suposição. Assumir uma condição.
    //fazer um teste com uma condição.
    @Test
    void validarAlgoSomenteNoUserItalo(){
        Assumptions.assumeTrue("Italo".equals(System.getenv("USER")));

        Assertions.assertEquals(10, 5 + 5);
    }
}
