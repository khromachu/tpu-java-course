package lab1;

import lab1.Items.Roll;
import lab1.Items.Rolls.HotRoll;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> Items = new ArrayList<>();
        Integer n = 20;
        for (int i = 0; i < n; i++) {
            ArrayList<String> fillings = new ArrayList<String>();
            fillings.add("Огурец");
            fillings.add("Рыба");
            fillings.add("Сыр");
            fillings.add("Креветка");
            fillings.add("Авокадо");
            String filling = "";
            for (String f: fillings) {
                if (Math.random() > 0.5)
                    filling += f + " ";
            }
            switch ((int)Math.floor(Math.random() * 3)){
                case 0:
                    Items.add(
                            new Item("Товар "+i, 
                                    (int)(Math.random() * 500), 
                                    (int)(Math.random() * 500))
                    );
                    break;
                case 1:
                    Items.add(
                            new Roll("Ролл "+i,
                                    (int)(Math.random() * 500),
                                    (int)(Math.random() * 500),
                                    Math.random() > 0.5,
                                    filling)
                    );
                    break;
                case 2:
                    Items.add(
                            new HotRoll("Ролл "+i,
                                    (int)(Math.random() * 500),
                                    (int)(Math.random() * 500),
                                    Math.random() > 0.5,
                                    filling,
                                    Math.random() > 0.5)
                    );
                    break;
            }
        }

        for(Item item: Items){
            System.out.println("============");
            System.out.println(item.getDescription());
        }
    }
}
