package lab6;

import java.util.ArrayList;

public class RollComponentsFactory implements ComponentsFactory {
    public String CreateName(){
        return "Ролл " + (int)(Math.random()*100);
    }
    public Integer CreateWeight(){
        return (int)(Math.random() * 100 + 70);
    }
    public Integer CreatePrice(){
        return (int)(Math.random() * 300 + 200);
    }
    public String CreateFilling(){
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
        return filling;
    }
    public Boolean CreateOpen(){
        return Math.random() > 0.3;
    }
}
