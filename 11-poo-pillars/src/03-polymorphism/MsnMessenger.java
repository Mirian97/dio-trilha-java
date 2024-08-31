public class MsnMessenger extends InstantMessagingService {
    public void sendMessage() {
        checkAvailabilityInternet();
        System.out.println("Sending message by MSN Messenger");
        saveMessageInTheHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message by MSN Messenger");
    }
}
