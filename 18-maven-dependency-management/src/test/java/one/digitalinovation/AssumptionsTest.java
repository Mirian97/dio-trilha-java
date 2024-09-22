package one.digitalinovation;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    
    @Test
    void validarParaUsuarioLogado(){
        // Assumptions.assumeTrue("Mirian".equals(System.getenv("USER")));

        Assumptions.assumeFalse("Mirian".equals(System.getenv("USER")));
    }
}
