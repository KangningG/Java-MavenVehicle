package vehicle.detail;

public class Bicycle extends Bike {
    public int pedalNum;

    public Bicycle(String wheelShape) {
        super(wheelShape);
    }
    public void setPedalNum(int pedalNum){
        this.pedalNum = pedalNum;
    }

    public void print() {
        super.print();
        System.out.println("Pedal Number:" + pedalNum);
    }
}