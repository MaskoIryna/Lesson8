public class Zebra extends AllZooAnimal implements Hooves,Food,WingsFeet,Growls{

    @Override
    public String Food() {
        System.out.print("Еда -");
        return food_covenfooter;
    }

    @Override
    public int Hooves() {
        System.out.print(" Количество копыт - ");
        return hooves;
    }



    }