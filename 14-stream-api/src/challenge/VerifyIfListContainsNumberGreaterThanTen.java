package challenge;

import java.util.Arrays;
import java.util.List;

public class VerifyIfListContainsNumberGreaterThanTen {
    public static boolean verifyIfHasNumberGreaterThanTen(List<Integer> numbers){
        // AnyMatch()
        // return numbers.stream().anyMatch(n -> n> 10);

        // Filter() and Count()
        // return numbers.stream().filter(n -> n> 10).count() > 0;

        // Filter, FindFirst() e isPresent()
        // return numbers.stream().filter(n -> n> 10).findFirst().isPresent();

        // NoneMatch() - inverso de AnyMatch()
        return numbers.stream().noneMatch(n -> n <= 10);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(verifyIfHasNumberGreaterThanTen(numbers));
    }
}
