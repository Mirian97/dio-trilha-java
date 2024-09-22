package dio.gof.strategy;

public class MovimentNormal implements Strategy {

    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
