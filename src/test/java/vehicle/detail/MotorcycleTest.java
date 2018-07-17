package vehicle.detail;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MotorcycleTest{
    @Test
    public void sampleTest(){
        Motorcycle myMotorcycle=new Motorcycle("Motorcycle");
        myMotorcycle.wheelShape="triangle";
        myMotorcycle.wheelNum=2;
        myMotorcycle.seatShape="customized";
        myMotorcycle.pedalNum=4;
        myMotorcycle.gasTank="front";
        myMotorcycle.motor="electric";
        myMotorcycle.print();
        assertEquals(myMotorcycle.gasTank, "front");
    }
}