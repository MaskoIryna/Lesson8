import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
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
    @Test
    public void HaveFeetTest(){
        int feetPuma = Puma.feet;
        assertNotEquals(feetPuma,3,String.format("Puma lost 1 feet"));
    }

}
