package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsPrime {
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(n -> number % n != 0);
    }

    public static List<Integer> filterPrimes(List<Integer> numbers) {
        return numbers.stream()
                      .filter(IsPrime::isPrime) 
                      .collect(Collectors.toList());     
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 ,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 17, 21, 5, 4, 3);

        System.out.println(filterPrimes(numbers));
    }
}
