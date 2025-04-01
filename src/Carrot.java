public class Carrot {
    private float weight;
    private int length;

    public Carrot(float weight, int length) {
        this.weight = weight;
        this.length = length;
    }


    public float getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void dipslay() {
        System.out.println("Carrot : [" + weight + "kg - " + length + "cm]");
    }
}

