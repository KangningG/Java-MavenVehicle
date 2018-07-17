package vehicle.detail;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BicycleTest{
    @Test
    public void sampleTest() {
        Bicycle myBicycle = new Bicycle("Bicycle");
        myBicycle.wheelShape = "square";
        myBicycle.wheelNum = 2;
        myBicycle.seatShape = "customized";
        myBicycle.pedalNum = 4;
        myBicycle.print();
        assertEquals(myBicycle.pedalNum,4);
    }
}