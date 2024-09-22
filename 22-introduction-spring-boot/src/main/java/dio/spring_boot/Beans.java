package dio.spring_boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.gson.Gson;

import dio.spring_boot.app.singleton_or_prototype.Sender;

@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }

    /*
     * Toda vez que for solicitado um Sender, o Spring criará uma nova instância, 
     * já que o escopo foi definido como prototype.
     * Quando o método sender() for chamado, um novo objeto Sender será criado com o e-mail 
     * noreply@dio.com.br e o nome Digital Innovation One.
     */
    @Bean
    @Scope("prototype")
    public Sender sender(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Sender remetente = new Sender();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
