import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PumaTest {
    @Test
    public void FoodPumaTest(){
        String foodCats = Puma.food_cats;
        boolean result = foodCats.contains("мясо");
        assertTrue(result,foodCats);
    }
    @Test
    public void CatsGrowlsTest(){
        String result = Growls.catsGrowls;
        assertEquals(result,"рычать.");
    }

}
