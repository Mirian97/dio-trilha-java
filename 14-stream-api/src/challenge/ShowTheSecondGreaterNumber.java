package challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * ShowTheSecondGreaterNumber
 */
public class ShowTheSecondGreaterNumber {

      public static Integer getSecondGreaterNumber(List<Integer> numbers){

        // Sorted(), toList() e get()
        // return numbers.stream().sorted((n1, n2) -> n2-n1).toList().get(1);
        
        return numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new NoSuchElementException("List has fewer than two elements"));

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(getSecondGreaterNumber(numbers));
    }
}