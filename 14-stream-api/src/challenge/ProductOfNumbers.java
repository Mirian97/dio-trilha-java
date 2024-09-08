package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfNumbers {
    
    public static List<Integer> product(List<Integer> numbers){
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        System.out.println(product(numbers));
    }
}
