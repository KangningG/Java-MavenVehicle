package vehicle.detail;

public class Motorcycle extends Bike {
    public int pedalNum;
    public String gasTank;
    public String motor;

    public Motorcycle(String wheelShape) {
        super(wheelShape);
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void print() {
        super.print();
        System.out.println("Petal Number:" + pedalNum);
        System.out.println("Gas Tank:" + gasTank);
        System.out.println("Motor:" + motor);
    }
}