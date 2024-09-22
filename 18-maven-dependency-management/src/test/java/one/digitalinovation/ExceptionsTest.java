package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcecao(){
        Conta contaOrigem = new Conta("287362", 100);
        Conta contaDestino = new Conta("237782", 120);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        assertThrows(IllegalArgumentException.class, ()-> transferencia.transfere(contaOrigem, contaDestino, -100));
    }

    @Test
    void validarCenarioSemExcecao(){
        Conta contaOrigem = new Conta("287362", 100);
        Conta contaDestino = new Conta("237782", 120);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        assertDoesNotThrow(()-> transferencia.transfere(contaOrigem, contaDestino, 10));
    }
}
