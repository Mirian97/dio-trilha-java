package challenge;

import java.util.Arrays;
import java.util.List;

public class CalculateMediaNumberGreaterThanFive {

    public static Integer calculateMedia(List<Integer> numbers){
        return numbers.stream().filter(n -> n > 5).reduce(0, (Integer n1, Integer n2) -> n1 + n2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(calculateMedia(numbers));
    }
}