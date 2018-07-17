package vehicle.detail;

public class Bike {

    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(String wheelShape, int wheelNum, String seatShape) {
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }

    public Bike(String wheelShape) {
        wheelShape = wheelShape;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }


    public void setSeatShape(String seatShape) {
        this.seatShape = seatShape;
    }


    public void print() {
        System.out.println("Wheel Shape:" + wheelShape);
        System.out.println("Wheel Number:" + wheelNum);
        System.out.println("Seat Shape:" + seatShape);
    }

    public static void main(String[] args) {
        Bike myBike = new Bike("round");
        myBike.wheelShape = "round";
        myBike.wheelNum = 2;
        myBike.seatShape = "regular";
        myBike.print();
    }


}

