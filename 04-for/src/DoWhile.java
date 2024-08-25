import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Dialing...");
        do{
            System.out.println("Playing the phone!");
        } while(playing());
        System.out.println("Hello...");
    }


    public static boolean playing(){
        boolean attend = new Random().nextInt(3)== 1;
        System.out.println("Attend? " + attend);
        return !attend; 
    }
}
