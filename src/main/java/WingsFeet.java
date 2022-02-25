public interface WingsFeet {
    int feet = 4;
    int wings = 2;

    default int haveWings() {
        System.out.print(" Крылья шт - ");
        return wings;
    }
    default int haveFeet() {
        System.out.print(" Лапы шт - ");
        return feet;
    }
}
