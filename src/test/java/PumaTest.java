import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;


public class PumaTest {
    @Test(groups = "positive")
    public void FoodPumaTest(){
        String foodCats = Puma.food_cats;
        boolean result = foodCats.contains("мясо");
        assertTrue(result,foodCats);
    }
    @Test(groups = "positive")
    public void CatsGrowlsTest(){
        String result = Growls.catsGrowls;
        assertEquals(result,"рычать.");
    }
    @Test(groups = "negative")
    public void HaveFeetTest(){
        int feetPuma = Puma.feet;
        assertEquals(feetPuma,3,String.format("Puma lost 1 feet"));
    }

}
