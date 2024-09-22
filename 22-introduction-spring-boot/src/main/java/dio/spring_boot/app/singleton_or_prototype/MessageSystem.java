package dio.spring_boot.app.singleton_or_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem {
    @Autowired
    private Sender noreply;

    @Autowired
    private Sender techTeam;

   public void sendConfirmRegistration(){
       System.out.println(noreply);
       System.out.println("Seu cadastro foi aprovado");
   }
    public void sendWelcomeMessage(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
    }
}