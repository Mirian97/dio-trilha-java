package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.condition.JRE.JAVA_21;
import static org.junit.jupiter.api.condition.JRE.JAVA_24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;

public class CondicionaisTest {
    @Test
    // @EnableIfEnvironmentVariable(named = "USERNAME", matches = "SYSTEM")
    // @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "SYSTEM")
    // @EnabledOnOs(OS.WINDOWS)
    // @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    // @EnabledOnJre(JAVA_20)
    @EnabledForJreRange(min = JAVA_21, max = JAVA_24)
    void validarSeACondicionalForVerdadeira(){
        assertEquals(12, 6+6);
    }
}
