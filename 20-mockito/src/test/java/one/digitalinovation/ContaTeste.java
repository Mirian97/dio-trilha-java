package one.digitalinovation;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {
    
    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrderDeChamadasEmMetodo(){
        InOrder inOrder = Mockito.inOrder(conta);
        conta.pagaBoleto(400);

        inOrder.verify(conta).pagaBoleto(400);
        inOrder.verify(conta).validaSaldo(400);
        inOrder.verify(conta).debita(400);
        inOrder.verify(conta).enviaCreditoParaEmissor(400);
    }

    @Test 
    void validarQuantidadeDeChamadas(){
        conta.validaSaldo(300);
        conta.validaSaldo(400);
        conta.validaSaldo(1000);

        Mockito.verify(conta, times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }

    @Test
    void facaNadaNoValidaSaldo(){
        doNothing().when(conta).validaSaldo(anyInt());
        conta.validaSaldo(3500);
    }
}
