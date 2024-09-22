package dio.spring_boot.app.properties_values;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem2 implements CommandLineRunner {
    @Value("${nome:No-reply-Dio}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${telephones}")
    private List<String> telephones;

    @Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + name
				+ "\nE-mail:" + email
				+ "\nCom telefones para contato: " + telephones);

		System.out.println("Seu cadastro foi aprovado");
	}
}
