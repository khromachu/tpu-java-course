package lab3;

import lab1.Items.Roll;

public class RollWithCaviar extends Roll {
    private Roll decoratedRoll;

    public RollWithCaviar(Roll roll) {
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
        return super.getWeight() + 40;
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 200;
    }

    @Override
    public String getFilling() {
        return super.getFilling() + " + шапочка из икры";
    }
}