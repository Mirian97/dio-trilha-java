package one.digitalinovation;

import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {
    
    @Test
    void validarGeracaoDeNumerosComTamanhoDefinido(){
        MockedStatic<GeradorDeNumeros> mockedStatic = mockStatic(GeradorDeNumeros.class);
    }
}
