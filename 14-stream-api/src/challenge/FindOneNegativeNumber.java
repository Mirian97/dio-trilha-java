package challenge;

import java.util.Arrays;
import java.util.List;

public class FindOneNegativeNumber {
    
    public static boolean findOneNegativeNumber(List<Integer> numbers){
        // findAny() e present()
        // return numbers.stream()
        // .filter(n -> n < 0)
        // .findAny()
        // .isPresent();

        return numbers.stream().anyMatch(n -> n< 0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 ,2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(findOneNegativeNumber(numbers));
    }
}
