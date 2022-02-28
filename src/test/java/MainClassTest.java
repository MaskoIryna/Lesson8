

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class MainClassTest {

    @Test
    public void FirstTest(){
        Zebra zebra = new Zebra();
        String food = zebra.Food();
        assertEquals(food,"трава.");

    }
}
