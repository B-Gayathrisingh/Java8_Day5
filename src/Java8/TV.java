package Java8;

// Interface
interface Device {
    void turnOn();
    void turnOff();
}

// Implementation class
public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    // Main method to test
    public static void main(String[] args) {
        Device tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}
