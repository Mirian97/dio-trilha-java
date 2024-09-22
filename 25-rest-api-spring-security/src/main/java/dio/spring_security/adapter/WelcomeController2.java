package dio.spring_security.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController2 {
    @GetMapping
    public String welcome (){
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping
    public String users(){
        return "Authorized User";
    }

    @GetMapping
    public String managers(){
        return "Authorized Manager";
    }
}
