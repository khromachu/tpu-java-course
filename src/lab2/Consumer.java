package lab2;

public class Consumer extends Thread {
    private Stock stock;
    private Integer speed;

    public Consumer(Stock stock, Integer speed){
        this.stock = stock;
        this.speed = speed;
        this.stock.addConsumer(this);
        System.out.println("Потребитель зарегестрирован. Скорость = " + (1000 / (float)speed));
    }

    @Override
    public void run() { // Этот метод будет вызван при старте потока
        while (true) { // Бесконечный цикл
            try {
                this.stock.takeGood(); // Берём товар со склада
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                sleep(this.speed + (int)(Math.random() * 100)); // Задержка согласно скорости
            } catch (Exception e) {}
        }
    }
}
