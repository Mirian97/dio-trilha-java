import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scaner = new Scanner(System.in).useLocale(Locale.US);

       try{
           System.out.println("Digite o seu nome:");
           String nome = scaner.next();
    
           System.out.println("Digite seu sobrenome:");
           String sobrenome = scaner.next();
    
           System.out.println("Digite sua idade:");
           int idade = scaner.nextInt();
    
           System.out.println("Digite sua altura:");
           double altura = scaner.nextDouble();
       }
       catch(InputMismatchException e){
        System.err.println("Os campos idade e altura precisam ser numéricos");
       }
    }
}
