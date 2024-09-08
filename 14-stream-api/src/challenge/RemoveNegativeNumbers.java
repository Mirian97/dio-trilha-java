package challenge;

import java.util.Arrays;
import java.util.List;

public class RemoveNegativeNumbers {

    public static List<Integer> removeAllNegativeNumbers(List<Integer> numbers){
        return numbers.stream().filter(n -> n >= 0).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, -3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(removeAllNegativeNumbers(numbers));
    }
}