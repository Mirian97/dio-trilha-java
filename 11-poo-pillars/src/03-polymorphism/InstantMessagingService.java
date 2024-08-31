public abstract class InstantMessagingService {
    public abstract void sendMessage();

    public abstract void receiveMessage();

    protected void saveMessageInTheHistory(){
        System.out.println("Save the message in history");
    }

    protected void checkAvailabilityInternet(){
        System.out.println("Checking the internet");
    }
}
