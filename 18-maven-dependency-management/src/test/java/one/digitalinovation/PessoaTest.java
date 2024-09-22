package one.digitalinovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * PessoaTest
 */
public class PessoaTest {

    @Test
    void deveCalcularIdade(){
        Pessoa mirian = new Pessoa("Mirian", LocalDate.of(1997, 5, 15));
        Assertions.assertEquals(27, mirian.getIdade());
    }

    @Test
    void deveVerificarSeEhMaiorDeIdade(){
        Pessoa mirian = new Pessoa("Mirian", LocalDate.of(1997, 5, 15));
        Assertions.assertTrue(mirian.ehMaiorDeIdade());

        Pessoa tommy = new Pessoa("Tommy", LocalDate.of(2014, 5, 10));
        Assertions.assertFalse(tommy.ehMaiorDeIdade());
    }
}