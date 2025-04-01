package Soup2;

public class Potatoe extends Vegetable {
    private int eyes;

    public Potatoe(double weight, int eyes) {
        super(weight);
        this.eyes = eyes;
    }


    public int getEyes() {
        return eyes;
    }


    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Potatoe : [" + getWeight() + "kg - " + eyes + " eyes]";
    }

    public void nbGermByKg(Potatoe potatoe){
        double kg = getWeight()*10;
        if (eyes <= kg) {
            potatoe.toString();
        }
        else {
            System.out.println("There's to many eyes in this potatoe");
        }
    }
}
