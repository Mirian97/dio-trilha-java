public class Car extends Vehicle {
    @Override
    public void turnOn() {
        checkFuel();
        checkGearbox();
        System.out.println("Car is turn on");
    }

    public void checkFuel(){
        System.out.println("Checking the fuel");
    }

    public void checkGearbox(){
        System.out.println("Checking the gearbox");
    }
 
}
