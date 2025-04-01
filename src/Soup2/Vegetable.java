package Soup2;

public class Vegetable {
    protected double weight;
    protected static double peelingPercentage = 0.10;

    public Vegetable(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }


    public double getPeelingWeight() {
        return weight * peelingPercentage;
    }


    public static void setPeelingPercentage(double newPercentage) {
        peelingPercentage = newPercentage;
    }

    @Override
    public String toString(){
        return "Vegetable : [" + weight + "kg]";
    }

}
