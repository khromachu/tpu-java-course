package lab2;

public class Vendor extends Thread {
    private Stock stock;
    private Integer speed;

    public Vendor(Stock stock, Integer speed){
        this.stock = stock;
        this.speed = speed;
        this.stock.addVendor(this);
        System.out.println("Производитель зарегестрирован. Скорость = " + (1000 / (float)speed));
    }

    @Override
    public void run() { // Этот метод будет вызван при старте потока
        while (true) { // Бесконечный цикл
            try {
                this.stock.putGood(); //Кладём товар на склад
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                sleep(this.speed + (int)(Math.random() * 100)); // Задержка согласно скорости
            } catch (Exception e) {}
        }
    }
}
