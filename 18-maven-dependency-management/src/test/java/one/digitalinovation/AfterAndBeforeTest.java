package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfterAndBeforeTest {
    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void adicionarPessoa(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Mirian", LocalDate.of(1997,5,15)));
    }

    @AfterEach
    void removerPessoa(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Mirian", LocalDate.of(1997,5,15)));
    }

    @AfterAll
    static void removerConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }

    @Test
    void inserirDadosParaTeste(){
        assertTrue(true);
    }

    @Test
    void validarDadosNulos(){
        assertNull(null);
    }
}
