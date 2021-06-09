package lab1;

public class Item {
    private String name;
    private Integer weight;
    private Integer price;

    public Item(String name, Integer weight, Integer price){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getDescription(){
        return "Наименование: " + this.getName() + "\n" +
                "Цена: " + this.getPrice() + " руб.\n" +
                "Вес: " + this.getWeight() + " г";
    }
}
