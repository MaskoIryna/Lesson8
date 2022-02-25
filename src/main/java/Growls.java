public interface Growls{
    String catsGrowls = "рычать.";
    String zebraGrows = "мычат.";
    String birdsGrows = "ухать.";

    default String catsGrowls() {
        System.out.print(" Могут страшно мяукать и ");
        return catsGrowls;
    }
    default String birdsGrowls() {
        return birdsGrows;
    }

    default String zebraGrowls() {
        System.out.print(" Наверное громко  ");
        return zebraGrows;
    }
}