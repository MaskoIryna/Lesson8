public enum ZooAnimal {
    ZEBRA(1,"зебра"),
    PUMA(2,"пума"),
    OWL(3,"сова");

    private int num;
    private String nameRus;


    ZooAnimal(int num, String nameRus) {
        this.num = num;
        this.nameRus = nameRus;
    }


    public int getNum() {
        return num;
    }
    public String getNameRus() {
        return nameRus;
    }
}
