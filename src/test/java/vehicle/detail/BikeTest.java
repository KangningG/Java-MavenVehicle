package vehicle.detail;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BikeTest {

    @Test
    public void sampleTest(){
        Bike myBike = new Bike("Bike");
        myBike.wheelShape = "round";
        myBike.wheelNum = 2;
        myBike.seatShape = "regular";
        myBike.print();
        assertEquals(myBike.seatShape,"regular");
    }
//
//    public static void main(String[] args) {
//
//    }
}