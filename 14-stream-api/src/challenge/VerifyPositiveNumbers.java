package challenge;

import java.util.Arrays;
import java.util.List;

public class VerifyPositiveNumbers {

    public static boolean verifyAllNumbersArePositive(List<Integer> numbers){
        return numbers.stream().filter(n -> n < 0).count() >= 1;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(verifyAllNumbersArePositive(numbers));
    }
}
