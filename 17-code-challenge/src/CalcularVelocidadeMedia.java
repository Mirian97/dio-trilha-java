import java.util.Arrays;
import java.util.Scanner;

public class CalcularVelocidadeMedia {
    public static double calcularVelocidadeMedia(String[] velocidades) {
        // int total = 0;
        // for (String v : velocidades) {
        //     total += Integer.valueOf(v);
        // }
        // return total/velocidades.length;

        int total = Arrays.stream(velocidades).mapToInt(Integer::parseInt).sum();

        return total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades separadas por virgula ','");
        String input = scanner.nextLine();

        String[] velocidades = input.split(",");
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);
        System.out.println((int)velocidadeMedia + " Mbps");
        scanner.close();
    }
}