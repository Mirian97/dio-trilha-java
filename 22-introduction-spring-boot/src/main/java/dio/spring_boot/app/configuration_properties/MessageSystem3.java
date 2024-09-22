package dio.spring_boot.app.configuration_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MessageSystem3 implements CommandLineRunner {
    @Autowired
    public Sender2 sender;

    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + sender.getName()
				+ "\nE-mail:" + sender.getEmail() + "\nCom telefones para contato: "
				+ sender.getTelephones());

		System.out.println("Seu cadastro foi aprovado");
    }
    
}
