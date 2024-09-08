package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOddAndEvenNumbers {
    
     public static Map<String, List<Integer>> groupOddAndEvenNumbers(List<Integer> numbers){
          Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = groupedNumbers.get(true); 
        List<Integer> oddNumbers = groupedNumbers.get(false);

        return Map.of(
            "evenNumbers", evenNumbers,
            "oddNumbers", oddNumbers
        );
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 ,2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(groupOddAndEvenNumbers(numbers));
    }
}
