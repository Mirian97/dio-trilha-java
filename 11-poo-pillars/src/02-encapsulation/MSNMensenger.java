public class MSNMensenger {
    public void sendMessage(){
        checkAvailabilityInternet();
        System.out.println("Sending a new message...");
        saveMessageInTheHistory();
    }

    public void receiveMessage(){
        checkAvailabilityInternet();
        System.out.println("Receveing a new message...");
    }

    // Nem todos os metodos de uma classe devem ser visivies, pois nao é interessante!
    private void saveMessageInTheHistory(){
        System.out.println("Save the message in history");
    }

    private void checkAvailabilityInternet(){
        System.out.println("Checking the internet");
    }
}
