package lab1.Items;

import lab1.Item;

public class Roll extends Item {
    private Boolean isOpen;
    private String filling;

    public Roll(String name, Integer weight, Integer price, Boolean isOpen, String filling)
    {
        super(name, weight, price);
        this.isOpen = isOpen;
        this.filling = filling;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\n" +
                "Начинка: " + this.filling + "\n" +
                (this.isOpen ? "Открытый": "Закрытый");
    }
}
