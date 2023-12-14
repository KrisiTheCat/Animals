package bg.smg;

public class Main {

    public static void main(String[] args) {
        AnimalHouse<Fish> house1 =new AnimalHouse<Fish>(new Fish("Nemo"));
        AnimalHouse<Snake> house2 =new AnimalHouse<Snake>(new Snake(1.7));

        System.out.println(house1.toString());
        System.out.println(house2.toString());
    }
}
