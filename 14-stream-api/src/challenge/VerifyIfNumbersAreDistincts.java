package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerifyIfNumbersAreDistincts {

     public static boolean verifyNumbersAreDistints(List<Integer> numbers){
        // Criando Hash set vazio e depois adicionando com add
        // Set<Integer> seen = new HashSet<>();
        // return numbers.stream().allMatch(seen::add);

        // Criando Hash set de numeros e comparando os tamanhos
        // Set<Integer> numberSet = new HashSet<>(numbers);
        // return numberSet.size() == numbers.size();

        // Distinct() and count()
        // return numbers.stream().distinct().count() == numbers.size();

        // Transformar a lista original em um Set e compará-la à lista original
        return numbers.size() == numbers.stream().collect(Collectors.toSet()).size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(verifyNumbersAreDistints(numbers));
    }
}
