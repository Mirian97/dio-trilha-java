package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderTest {

    // @Order(4)
    @DisplayName("4")
    @Test
    void validarFluxoA(){
        assertTrue(true);
    }

    // @Order(3)
    @DisplayName("3")
    @Test
    void validarFluxoB(){
        assertTrue(true);
    }

    // @Order(2)
    @DisplayName("2")
    @Test
    void validarFluxoC(){
        assertTrue(true);
    }

    // @Order(1)
    @DisplayName("1")
    @Test
    void validarFluxoD(){
        assertTrue(true);
    }
}
