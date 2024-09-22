package dio.gof.singleton;

public class SingletonLazyHolder {
    
    public static class HolderInstance {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return HolderInstance.instance;
    }
}
