package one.JUnit.assumptionsTestesCondicionais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionalTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Italo")
    void validarAlgoSomenteNoUserItalo(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
