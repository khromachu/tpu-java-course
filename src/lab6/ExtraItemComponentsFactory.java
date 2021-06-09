package lab6;

public class ExtraItemComponentsFactory implements ComponentsFactory{
    public String CreateName(){
        return "Палочки " + (int)(Math.random()*100);
    }
    public Integer CreateWeight(){
        return (int)(Math.random() * 50 + 20);
    }
    public Integer CreatePrice(){
        return (int)(Math.random() * 70 + 30);
    }
}
