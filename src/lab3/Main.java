package lab3;

import lab1.Items.Roll;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Roll> rolls = new ArrayList<>();
        Integer n = 20;
        for (int i = 0; i < n; i++) {
            ArrayList<String> fillings = new ArrayList<>();
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
            Roll roll = new Roll("Ролл "+i,
                    (int)(Math.random() * 500),
                    200,
                    Math.random() > 0.5,
                    filling);
            for (int j = 0; j < (int)Math.floor(Math.random()*3); j++) {
                roll = new RollWithMazik(roll);
            }
            for (int j = 0; j < (int)Math.floor(Math.random()*3); j++) {
                roll = new RollWithCaviar(roll);
            }
            for (int j = 0; j < (int)Math.floor(Math.random()*3); j++) {
                roll = new RollWithMango(roll);
            }
            rolls.add(roll);

        }

        for(Roll roll: rolls){
            System.out.println("============");
            System.out.println(roll.getDescription());
        }
    }
}
