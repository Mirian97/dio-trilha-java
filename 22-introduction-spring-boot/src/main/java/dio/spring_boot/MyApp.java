package dio.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.spring_boot.app.first_steps.Calculator;

/*
 * Essa anotação transforma a classe MyApp em um componente do Spring. 
 * Isso significa que o Spring gerencia o ciclo de vida dessa classe. 
 * Podendo criar uma instância dela e injetar suas dependências automaticamente.
 * 
 * A classe MyApp implementa a interface CommandLineRunner, que tem o método run(). 
 * O Spring Boot executa qualquer classe que implemente CommandLineRunner assim que a aplicação é iniciada. 
 * Esse método é utilizado para executar qualquer lógica que você queira rodar ao início do aplicativo.
 * 
 * Fluxo:
 * 1. O Spring cria uma instância de MyApp (porque está anotada com @Component).
 * 2. O Spring injeta o Calculator na variável calculator.
 * 3. O método run é executado, e ele imprime o resultado da soma dos números 7 e 8.
 */
@Component
public class MyApp implements CommandLineRunner {

    /*
     * A anotação @Autowired é usada para injetar automaticamente a instância da classe Calculator no campo calculator. 
     * O Spring cuida da criação do objeto Calculator e o injeta aqui.
     * A ideia de injeção de dependência é permitir que o Spring gerencie as dependências entre classes, facilitando o desacoplamento entre elas.
     */
    @Autowired 
    private Calculator calculator;

    /*
     * Método run: Dentro desse método, uma vez que o Calculator foi injetado, 
     * ele é usado para somar dois números (7 e 8), e o resultado é impresso no console.
     */
    public void run(String... args) throws Exception {
        System.out.println("The result of sum is "+ calculator.sum(7, 8));
    }
}
