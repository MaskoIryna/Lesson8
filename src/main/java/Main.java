import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         ZooAnimal[] animal = ZooAnimal.values();
        System.out.println("В наше зоопарке живут ");
        for (ZooAnimal zooAnimal : animal) {
            System.out.println(zooAnimal.getNum() + "-" + zooAnimal.getNameRus());
        }

            System.out.println("Введите номер ");
            int enterScan = scanner.nextInt();

        while (enterScan > 0){
            switch (enterScan) {
                case 1:
                    Zebra zebra = new Zebra();
                    System.out.print(zebra.Zoo("Зебра : "));
                    System.out.print(zebra.Food());
                    System.out.print(zebra.Hooves());
                    System.out.println(zebra.zebraGrowls());
                    enterScan = 4;
                    break;
                case 2:
                    Puma puma = new Puma();
                    System.out.print(puma.Zoo("Пума : "));
                    System.out.print(puma.Food());
                    System.out.print(puma.haveFeet());
                    System.out.print(puma.catsGrowls());
                    enterScan = 4;
                    break;
                case 3:
                    Owl owl = new Owl();
                    System.out.print(owl.Zoo("Сова : "));
                    System.out.print(owl.Food());
                    System.out.print(owl.haveWings());
                    System.out.println(owl.birdsGrowls());
                    enterScan = 4;
                    break;
                case 4:
                    System.out.println(" Введите номер или 0 для выхода");
                    enterScan = scanner.nextInt();
                default:
                    if (enterScan > animal.length) {
                        System.out.println("У нас нет столько зверей");
                        enterScan = 4;
                        break;
                    }
                    if (enterScan == 0)
                        System.out.println("Приходите к нам еще.");
                    break;
            }
        }
    }

}