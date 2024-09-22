package dio.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstStepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepsApplication.class, args);
	}

	/*
	 * O @Bean instrui o Spring a gerenciar esse método como um componente injetável. 
	 * Aqui, o ConversorJson é injetado automaticamente pelo Spring no método run.
	 */
	// @Bean 
	// CommandLineRunner run(ConversorJson conversor) throws Exception{
	// 	return args -> {
	// 		String json = "";
	// 		ViaCepResponse response = conversor.convert(json);
	// 		System.out.println("Cep Data:" + response);
	// 	};
	// }

	// @Bean
	// public CommandLineRunner run(MessageSystem messageSystem) throws Exception {
	// 	return args -> {
	// 		messageSystem.sendConfirmRegistration();
	// 		messageSystem.sendWelcomeMessage();
	// 		messageSystem.sendConfirmRegistration();
	// 	};
	// }
}
