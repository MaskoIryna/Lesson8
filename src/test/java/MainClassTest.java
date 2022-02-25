import com.sun.source.tree.AssertTree;
import org.testng.Assert;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MainClassTest {

    @Test
    public void FirstTest(){
        Zebra zebra = new Zebra();
        String food = zebra.Food();
        assertEquals(food,"трава.");

    }
}
