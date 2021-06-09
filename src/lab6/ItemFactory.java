package lab6;

import lab1.Item;
import lab1.Items.ExtraItem;
import lab1.Items.Roll;
import lab1.Items.Sushi;
import lab5.ItemTypes;

public class ItemFactory {
    public Item CreateItem(ItemTypes type){
        switch (type){
            case ROLL:
                RollComponentsFactory rcf = new RollComponentsFactory();
                return new Roll(
                        rcf.CreateName(),
                        rcf.CreateWeight(),
                        rcf.CreatePrice(),
                        rcf.CreateOpen(),
                        rcf.CreateFilling());
            case EXTRA:
                ExtraItemComponentsFactory ecf = new ExtraItemComponentsFactory();
                return new ExtraItem(ecf.CreateName(), ecf.CreateWeight(), ecf.CreatePrice());
            case SUSHI:
                SushiComponentsFactory scf = new SushiComponentsFactory();
                return new Sushi(scf.CreateName(), scf.CreateWeight(), scf.CreatePrice());
            default:
                return null;
        }
    }
}
