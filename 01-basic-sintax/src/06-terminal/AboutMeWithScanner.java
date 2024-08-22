import java.util.Locale;
import java.util.Scanner;

public class AboutMeWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String firstName = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String lastName = scanner.next();

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double height = scanner.nextDouble();

        System.out.println("Olá, me chamo "+ firstName + " "+ lastName);
        System.out.println("Tennho " + age + " anos");
        System.out.println("Tenho altura de: " + height);
    }
}
