package Soup2;

public class Carrot extends Vegetable {
    private int length;

    public Carrot(double weight, int length) {
        super(weight);
        this.length = length;
    }


    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Carrot : [" + getWeight() + "kg - " + length + "cm]";
    }

}


