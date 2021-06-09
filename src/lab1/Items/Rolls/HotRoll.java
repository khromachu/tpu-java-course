package lab1.Items.Rolls;

import lab1.Items.Roll;

public class HotRoll extends Roll {
    private Boolean isFried;

    public HotRoll(String name, Integer weight, Integer price, Boolean isOpen, String filling, Boolean isFried)
    {
        super(name, weight, price, isOpen, filling);
        this.isFried = isFried;
    }

    public void setFried(Boolean fried) {
        isFried = fried;
    }

    public Boolean getFried() {
        return isFried;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\n" +
                (this.getFried() ? "Жареный": "Запеченый");
    }
}
