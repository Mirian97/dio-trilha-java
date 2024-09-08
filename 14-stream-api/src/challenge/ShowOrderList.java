package challenge;

import java.util.Arrays;
import java.util.List;

public class ShowOrderList {
    public static List<Integer> orderList(List<Integer> numbers){
        return numbers.stream().sorted().toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(orderList(numbers));
    }
}