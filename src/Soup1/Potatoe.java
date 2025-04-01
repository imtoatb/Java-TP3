package Soup1;

public class Potatoe {
    private double weight;
    private int eyes;

    public Potatoe(double weight, int eyes) {
        this.weight = weight;
        this.eyes = eyes;
    }

    public double getWeight() {
        return weight;
    }

    public int getEyes() {
        return eyes;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void display() {
        System.out.println("Potatoe : [" + weight + "kg - " + eyes + " eyes]");
    }

    public void nbGermByKg(Potatoe potatoe){
        double kg = weight*10;
        if (eyes <= kg) {
            potatoe.display();
        }
        else {
            System.out.println("There's to many eyes in this potatoe");
        }
    }
}
