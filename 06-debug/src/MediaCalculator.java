import java.util.Locale;
import java.util.Scanner;

public class MediaCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String [] students = { "MIRIAN", "EVAIR", "IAGO", "HAMED"};

        double media = mediaCalculatorClass(students, scan);
        System.out.printf("The class media is %.1f", media);

    }

    static double mediaCalculatorClass(String [] students, Scanner scanner){
        double sum = 0;
        for(int index=0; index < students.length; index ++){
            System.out.println("Type the degree from " +  students[index]);
            sum = sum + scanner.nextDouble();
        }
        return sum / (students.length);
    }
}
