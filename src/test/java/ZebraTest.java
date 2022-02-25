import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ZebraTest {
    ZooAnimal[] animal = ZooAnimal.values();

    @Test
    public void FoodZebraTest() {
 //       ZooAnimal[] animal = ZooAnimal.values();
        for (ZooAnimal zooAnimal : animal) {
            if (zooAnimal.getNameRus() == "зебра"){
                String result = new Zebra().Food();
                String expectedFood  = Food.food_covenfooter;
                assertEquals(result,expectedFood,String.format(result,expectedFood));
            }
        }
    }

        @Test
    public void HoovesZebraTest(){
        int result = Zebra.hooves;
        int expectedHooves = new Zebra().Hooves();
            assertEquals(result,expectedHooves);
    }
    }

