public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Is it turn on? "+ smartTv.isOn);
        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Current volume: " + smartTv.volume);

        smartTv.turnOn();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.increaseChannel();
        smartTv.changeChannel(15);
        smartTv.increaseChannel();
        smartTv.turnOff();

        System.out.println("New Status");
        System.out.println("Is it turn on? "+ smartTv.isOn);
        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Current volume: " + smartTv.volume);
    }
}
