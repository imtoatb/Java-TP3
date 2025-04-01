package Soup1;

public class Carrot {
    private double weight;
    private int length;

    public Carrot(double weight, int length) {
        this.weight = weight;
        this.length = length;
    }


    public double getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void dipslay() {
        System.out.println("Carrot : [" + weight + "kg - " + length + "cm]");
    }

}


