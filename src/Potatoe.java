public class Potatoe {
    private float weight;
    private int eyes;

    public Potatoe(float weight, int eyes) {
        this.weight = weight;
        this.eyes = eyes;
    }

    public float getWeight() {
        return weight;
    }

    public int getEyes() {
        return eyes;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void display() {
        System.out.println("Potatoe : [" + weight + "kg - " + eyes + "eyes]");
    }
}
