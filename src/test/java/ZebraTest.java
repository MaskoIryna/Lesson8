import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ZebraTest {
    ZooAnimal[] animal = ZooAnimal.values();


    @Test
    public void FoodZebraTest() {
        for (ZooAnimal zooAnimal : animal) {
            if (zooAnimal.getNameRus() == "зебра"){
                String result = new Zebra().Food();
                String expectedFood  = Food.food_covenfooter;
                assertEquals(result,expectedFood,String.format(result,expectedFood));
            }
        }
    }
    @Test
    public void FoodnoZebraTest(){
        String noZebra = Food.food_covenfooter;
        boolean result = noZebra.contains("мясо");
        assertFalse(result);
    }

        @Test
    public void HoovesZebraTest(){
        int result = Zebra.hooves;
        int expectedHooves = new Zebra().Hooves();
            assertEquals(result,expectedHooves,String.format("Зебра",result,expectedHooves));
    }
        @Test
    public void zebraGrowlsTest(){
        String grows = Zebra.zebraGrows;
        boolean result = grows.contains("мяукает");
        assertTrue(result,String.format("zebra not мяукает ",result));
    }
}

