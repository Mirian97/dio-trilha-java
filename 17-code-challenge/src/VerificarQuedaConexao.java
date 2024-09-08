import java.util.Arrays;
import java.util.Scanner;

public class VerificarQuedaConexao {
    public static String verificarQuedaConexao(String[] velocidades) {
        boolean houveQueda = Arrays.stream(velocidades).mapToInt(Integer::parseInt).anyMatch(v -> v == 0);
        
        return houveQueda ? "Queda de Conexao" : "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades separadas por virgula ','");
        String input = scanner.nextLine();

        String[] velocidades = input.split(",");
        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);
        scanner.close();
    }
}