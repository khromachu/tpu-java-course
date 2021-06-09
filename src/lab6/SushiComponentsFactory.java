package lab6;

public class SushiComponentsFactory implements ComponentsFactory{
    public String CreateName(){
        return "Суши " + (int)(Math.random()*100);
    }
    public Integer CreateWeight(){
        return (int)(Math.random() * 80 + 50);
    }
    public Integer CreatePrice(){
        return (int)(Math.random() * 200 + 100);
    }
}
