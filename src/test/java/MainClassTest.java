import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;




public class MainClassTest {

    @Test(groups = {"positive"})
    public void FirstTest() {
        String[] animalAll = {"зебра", "пума", "сова"};
        String[] result = new String[3];
        ZooAnimal[] animal = ZooAnimal.values();
        for (ZooAnimal zooAnimal : animal) {
            String nameRus = zooAnimal.getNameRus();
            int i = zooAnimal.getNum() - 1;
            result[i] = nameRus;
        }
        assertEquals(animalAll,result);
    }
}


