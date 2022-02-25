public class Puma extends AllZooAnimal implements Food,Growls,WingsFeet {
    @Override
    public String Food() {
        System.out.print("Едят бегающее - ");
        return food_cats;
    }

    @Override
    public String catsGrowls() {
        Growls.super.catsGrowls();
        return catsGrowls;
    }
}

