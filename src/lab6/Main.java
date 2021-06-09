package lab6;

import lab1.Item;
import lab6.ItemFactory;
import lab5.ItemTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        ItemFactory itemFactory = new ItemFactory();
        Integer n = 20;
        for (int i = 0; i < n; i++) {
            ItemTypes type;
            switch ((int)Math.floor(Math.random() * 3)){
                case 0:
                    type = ItemTypes.SUSHI;
                    break;
                case 1:
                    type = ItemTypes.ROLL;
                    break;
                case 2:
                    type = ItemTypes.EXTRA;
                    break;
                default:
                    type = ItemTypes.ROLL;
                    break;
            }
            items.add(itemFactory.CreateItem(type));
        }

        for(Item item: items){
            System.out.println("============");
            System.out.println(item.getDescription());
        }
    }
}
