package dio.gof.strategy;

public class Robot {
    Strategy behavior;

    public void setBehavior(Strategy behavior) {
        this.behavior = behavior;
    }

    public void move(){
        behavior.move();
    }
}
