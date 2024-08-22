public class SmartTv {
    int channel = 1;
    int volume = 20;
    boolean isOn = false;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void increaseVolume(){
        volume ++;
    }

    public void decreaseVolume(){
        volume --;
    }

    public void increaseChannel(){
        channel ++;
    }

    public void decreaseChannel(){
        channel --;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
}
