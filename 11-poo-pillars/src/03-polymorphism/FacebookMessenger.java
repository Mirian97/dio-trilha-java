public class FacebookMessenger extends InstantMessagingService {
    public void sendMessage() {
        checkAvailabilityInternet();
        System.out.println("Sending message by Facebook Messenger");
        saveMessageInTheHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message by Facebook Messenger");
    }
}
