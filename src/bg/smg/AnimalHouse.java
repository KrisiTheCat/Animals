package bg.smg;

public class AnimalHouse <T>{
    public T animal;

    public AnimalHouse(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "The House of " + animal.toString();
    }
}
