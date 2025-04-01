package Soup2;

public class MainSoup2 {
    public static void main(String[] args) {
        Vegetable pdt = new Potatoe(0.3, 10);
        Vegetable c = new Carrot(0.25, 30);

        System.out.println(pdt);
        System.out.println(c);

        Soup s = new Soup();
        s.add(new Potatoe(0.3, 10));
        s.add(new Carrot(0.25, 30));
        System.out.println(s);

        s.add(new Potatoe(0.500, 3));
        s.add(new Potatoe(0.150, 4));
        s.add(new Carrot(0.20, 25));

        System.out.println("Total peeling weight: " + s.getPeelingWeight() + " kg");

        // Changement du % de perte
        Vegetable.setPeelingPercentage(0.05);
        System.out.println("Total peeling weight after 5% rule: " + s.getPeelingWeight() + " kg");

    }
}