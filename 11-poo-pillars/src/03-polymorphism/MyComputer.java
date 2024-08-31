public class MyComputer {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();
        System.out.println("MSN Messenger");
        msn.sendMessage();
        msn.receiveMessage();
    
    
        FacebookMessenger facebook = new FacebookMessenger();
        System.out.println("Facebook Messenger");
        facebook.sendMessage();
        facebook.receiveMessage();
    
    
        Telegram telegram  = new Telegram();
        System.out.println("Telegram");
        telegram.sendMessage();
        telegram.receiveMessage();
    }
}
