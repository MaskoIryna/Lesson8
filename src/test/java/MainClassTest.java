

//import com.sun.jdi.ArrayType;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;


public class MainClassTest {

    @Test
    public void FirstTest(String nameRus) {
   //     String[] animalAll = {"зебра", "рума", "сова"};


        ZooAnimal[] animal = ZooAnimal.values();

        for (ZooAnimal zooAnimal : animal) {
            nameRus = zooAnimal.getNameRus();

        }
    }
}


