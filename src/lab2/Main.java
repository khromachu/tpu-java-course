package lab2;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(20);
        new Consumer(stock, 5000);
        new Consumer(stock, 3000);
        new Vendor(stock, 3000);
        new Vendor(stock, 6000);
        new Vendor(stock, 7000);
    }
}
