import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        int allowance = 50;

        while(allowance <=50){
            int candyValue = randomValue();
            if (allowance - candyValue <= 0) 
                break;
            allowance = allowance - candyValue;
            System.out.println("John bought a candy with value: U$ " + candyValue);
        }
        System.out.println("U$ " + allowance + " left over from allowance");
    }

    public static int randomValue(){
        return ThreadLocalRandom.current().nextInt(5,15);
    }
}
