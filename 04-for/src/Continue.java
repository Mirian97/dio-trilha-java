public class Continue {
    public static void main(String[] args) {
        for(int number = 1; number <=5; number ++){
            
            if(number == 3)
                continue;
            
            System.out.println("The current number: " + number);
        }
    }
}
