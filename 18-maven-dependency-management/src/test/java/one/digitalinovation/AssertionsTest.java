package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * AssertionsTest
 */
public class AssertionsTest {

    @Test
    void deveValidarLancamentos(){
        int [] primeiroLancamento = {10, 45, 12, 90};
        int [] segundoLancamento = {10, 45, 12, 90};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void naoDeveValidarLancamentos(){
        int [] primeiroLancamento = {10, 45, 12, 90};
        int [] segundoLancamento = {15, 45, 22, 90};

        assertFalse(Arrays.equals(primeiroLancamento, segundoLancamento));
    }

    @Test 
    void deveValidarSeObjetoEstaNull(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Evair", LocalDate.of(1999, 12, 11));
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDoTipoDouble(){
        double valor = 15.0;
        double outroValor = 15.0;

        assertEquals(valor, outroValor);
    }
}