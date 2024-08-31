import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o servico que quer verificar:");
        String servico = scanner.nextLine().trim();
        
        System.out.println("Digite o nome do cliente e os serviços por este contratado separado por ','");
        String entradaCliente = scanner.nextLine().trim();
        
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (String parte: partes){
          if (parte.equals(servico)){
            contratado = true;
            break;
          }
        }
        scanner.close();
        System.out.print(contratado ? "Sim": "Nao");
    }
}
