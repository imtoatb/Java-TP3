package Soup1;


public class MainSoup1 {
    public static void main(String[] args) {

        Carrot carrot1 = new Carrot(0.4, 25);
        Carrot carrot2 = new Carrot(1, 20);
        carrot1.dipslay();

        Potatoe potatoe1 = new Potatoe(0.2, 3);
        Potatoe potatoe2 = new Potatoe(0.9, 8);
        //potatoe1.display();
        potatoe1.nbGermByKg(potatoe1);
        potatoe2.nbGermByKg(potatoe2);

    }
}