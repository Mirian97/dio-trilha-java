package dio.spring_security.simple_auth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController1 {
    @GetMapping
    public String welcome (){
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('MANAGERS', 'USERS')")
    public String users(){
        return "Authorized User";
    }

    @GetMapping
    @PreAuthorize("hasRole('MANAGERS')")
    public String managers(){
        return "Authorized Manager";
    }
}
