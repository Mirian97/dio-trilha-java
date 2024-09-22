package one.digitalinovation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {
    
    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servicoDeEmail;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){
        String email = "teste@email.com.br";
        String mensagemDoEmail = "Olá do servico de email mockado";
        boolean ehFormatoHtml = false;

        servicoDeEmail.enviaEmail(email, mensagemDoEmail, ehFormatoHtml);
        Mockito.verify(plataformaDeEnvio).enviaEmail(captor.capture());
        Email emailCapturado = captor.getValue();

        assertEquals(email, emailCapturado.getEnderecoEmail());
        assertEquals(mensagemDoEmail, emailCapturado.getMensagem());
        assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}
