public class Owl extends AllZooAnimal implements Food, WingsFeet,Growls {
    @Override
    public String Food() {
        System.out.print("Еда - ");
        return food_birds;
    }
    @Override
    public String birdsGrowls(){
        System.out.print(" Могут ");
        return birdsGrows;
    }

    @Override
    public int haveWings() {
        return WingsFeet.super.haveWings();
    }
}
