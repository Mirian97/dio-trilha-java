import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro");
        int parametro1 = scan.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametro2 = scan.nextInt();

        try{
            contar(parametro1, parametro2);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O primeiro parametro deve ser maior que o segundo");
        }

    }

    public static void contar( int parametro1, int parametro2 ) throws ParametrosInvalidosException{
        int quantidadeAContar = parametro1 - parametro2;
        int indice = 1;

        if(quantidadeAContar < 0) 
            throw new ParametrosInvalidosException();
        

        while(indice <= quantidadeAContar){
            System.out.println("Imprimindo o número " + indice);
            indice++;
        }
    }
}
