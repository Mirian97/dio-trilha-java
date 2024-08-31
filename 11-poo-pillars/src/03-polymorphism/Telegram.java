public class Telegram extends InstantMessagingService {
    public void sendMessage() {
        checkAvailabilityInternet();
        System.out.println("Sending message by Telegram");
        saveMessageInTheHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message by Telegram");
    }
}
