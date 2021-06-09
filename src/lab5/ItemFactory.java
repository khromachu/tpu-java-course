package lab5;

import lab1.Item;
import lab1.Items.ExtraItem;
import lab1.Items.Roll;
import lab1.Items.Sushi;

public class ItemFactory {
    public Item CreateItem(ItemTypes type,
                           String name,
                           Integer weight,
                           Integer price,
                           String filling,
                           Boolean isOpen){
        switch (type){
            case ROLL:
                return new Roll(name, weight, price, isOpen, filling);
            case EXTRA:
                return new ExtraItem(name, weight, price);
            case SUSHI:
                return new Sushi(name, weight, price);
            default:
                return null;
        }
    }
}
