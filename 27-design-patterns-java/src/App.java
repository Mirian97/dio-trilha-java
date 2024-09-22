import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.MovimentAgressive;
import dio.gof.strategy.MovimentDefense;
import dio.gof.strategy.MovimentNormal;
import dio.gof.strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy
        MovimentAgressive movimentAgressive = new MovimentAgressive();
        MovimentDefense movimentDefense = new MovimentDefense();
        MovimentNormal movimentNormal = new MovimentNormal();
        Robot robot = new Robot();

        robot.setBehavior(movimentNormal);
        robot.move();
        robot.move();
        robot.setBehavior(movimentAgressive);
        robot.move();
        robot.setBehavior(movimentDefense);
        robot.move();
        robot.move();
        robot.move();

        // Facade
        Facade facade = new Facade();
        facade.migrateCustomer("Mirian", "2987323");
    }
}
