package dio.gof.strategy;

/**
 * MovimentDefense
 */
public class MovimentDefense implements Strategy {

    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}