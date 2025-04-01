package Soup2;

public class Soup {
    private Vegetable[] ingredients;
    private int count;

    public Soup() {
        ingredients = new Vegetable[10];
        count = 0;
    }

    public void add(Vegetable v) {
        if (count < 10) {
            ingredients[count++] = v;
        } else {
            System.out.println("Soup is full, cannot add more vegetables!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Soup\n- - - - - -\n");
        for (int i = 0; i < count; i++) {
            sb.append(ingredients[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
