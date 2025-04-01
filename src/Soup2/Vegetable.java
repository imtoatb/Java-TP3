package Soup2;

public class Vegetable {
    private double weight;

    public Vegetable(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "Vegetable : [" + weight + "kg]";
    }

}
