package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
    
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao endereco = new DadosLocalizacao("SP", "Guarulhos", "Rua M", "Casa", "Bairro das Oliveiras");
        when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(endereco);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Mirian", "28743823", LocalDate.of(1997, 5, 15), "7637182");

        assertEquals("Mirian", pessoa.getNome());
        assertEquals("Guarulhos", pessoa.getEndereco().getCidade());
        assertEquals("Bairro das Oliveiras", pessoa.getEndereco().getBairro());
    }

    @Test
    void lancarExcecaoQuandoChamarApiDosCorreios(){
        when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);

        assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Mirian", "28743823", LocalDate.of(1997, 5, 15), "7637182"));
    }

    @Test
    void lancarExcecaoQuandoChamarApiDosCorreios2(){
        doThrow(IllegalArgumentException.class)
            .when(apiDosCorreios)
                .buscaDadosComBaseNoCep(anyString());

        assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Mirian", "28743823", LocalDate.of(1997, 5, 15), "7637182"));
    }

    @Test
    void retornarEnderecoNulo(){
        when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Mirian", "28743823", LocalDate.of(1997, 5, 15), "7637182");

        assertNull(pessoa.getEndereco());
    }

}
