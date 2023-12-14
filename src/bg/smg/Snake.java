package bg.smg;

public class Snake extends Animal{
    private double length;

    public Snake() {
        this.length = 0;
    }
    public Snake(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "a Snake that is " + length + " meters long";
    }
}
