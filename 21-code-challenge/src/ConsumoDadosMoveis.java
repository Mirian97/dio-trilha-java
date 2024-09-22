import java.util.Arrays;
import java.util.Scanner;

public class ConsumoDadosMoveis {

    public static int calcularConsumoTotal(String[] consumoSemanal) {
        return Arrays.stream(consumoSemanal).mapToInt(Integer::parseInt).sum();
    }

    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo / numeroDeSemanas;
    }

    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;
        for (int i = 0; i < consumoSemanal.length; i++) {
          int consumo = Integer.parseInt(consumoSemanal[i].trim());
          if(consumo > maiorConsumo){
            maiorConsumo = consumo;
            semanaDeMaiorConsumo = i;
          }
        }
        return semanaDeMaiorConsumo + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o consumo do mes em cada semana");
        String input = scanner.nextLine();

        String[] consumoSemanal = input.split(",");
        int totalConsumo = calcularConsumoTotal(consumoSemanal);
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        System.out.println("Total mensal: " + totalConsumo + " MB");
        System.out.println("Media semanal: " + mediaSemanal + " MB");
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);
        scanner.close();
    }
}