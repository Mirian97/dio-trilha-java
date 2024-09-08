package challenge;

import java.util.Arrays;
import java.util.List;

public class FilterNumbersInInterval {
     public static List<Integer> filterInInterval(List<Integer> numbers, int start, int end){
        return numbers.stream().filter(n -> n >= start && n <= end).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        System.out.println(filterInInterval(numbers, 5, 10));
    }
}
