package lab5;

import lab1.Item;
import lab1.Items.Roll;
import lab1.Items.Rolls.HotRoll;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        ItemFactory itemFactory = new ItemFactory();
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
            ItemTypes type;
            String name;
            switch ((int)Math.floor(Math.random() * 3)){
                case 0:
                    type = ItemTypes.SUSHI;
                    name = "Суши " + i;
                    break;
                case 1:
                    type = ItemTypes.ROLL;
                    name = "Ролл " + i;
                    break;
                case 2:
                    type = ItemTypes.EXTRA;
                    name = "Палочки " + i;
                    break;
                default:
                    type = ItemTypes.ROLL;
                    name = "Предмет " + i;
                    break;
            }
            items.add(itemFactory.CreateItem(
                    type,
                    name,
                    (int)(Math.random() * 500),
                    (int)(Math.random() * 500),
                    filling,
                    Math.random() > 0.5
                    ));
        }

        for(Item item: items){
            System.out.println("============");
            System.out.println(item.getDescription());
        }
    }
}
