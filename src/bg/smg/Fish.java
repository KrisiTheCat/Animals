package bg.smg;

public class Fish {
    private String name;

    public Fish() {
        this.name = "";
    }
    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "the Fish " + name;
    }
}
