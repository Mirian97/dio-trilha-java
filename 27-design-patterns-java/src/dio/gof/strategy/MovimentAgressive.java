package dio.gof.strategy;

public class MovimentAgressive implements Strategy {

    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }
}
