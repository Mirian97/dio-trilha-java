package challenge;

import java.util.Arrays;
import java.util.List;

/**
 * GroupOddMultiplesOf3And5
 */
public class GroupOddMultiplesOf3And5 {

    public static List<Integer> groupNumbers(List<Integer> numbers){
        return numbers.stream().filter(n -> ((n % 3 == 0 || n % 5 == 0) && n % 2 != 0)).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        System.out.println(groupNumbers(numbers));
    }
}