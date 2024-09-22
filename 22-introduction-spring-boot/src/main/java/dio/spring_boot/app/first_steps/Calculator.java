package dio.spring_boot.app.first_steps;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int sum(int number1, int number2){
        return number1 + number2;
    }
}
