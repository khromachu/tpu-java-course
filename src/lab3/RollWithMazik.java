package lab3;

import lab1.Items.Roll;

public class RollWithMazik extends Roll {
    private Roll decoratedRoll;

    public RollWithMazik(Roll roll){
        super(
                roll.getName(),
                roll.getWeight(),
                roll.getPrice(),
                roll.getOpen(),
                roll.getFilling()
                );
        this.decoratedRoll = roll;
    }

    @Override
    public Integer getWeight() {
        return super.getWeight() + 20;
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getFilling(){
        return super.getFilling() + " + шапочка из майонеза";
    }
}
