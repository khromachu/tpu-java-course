package lab2;

import java.util.ArrayList;

public class Stock {
    private Integer size, goods = 0;
    private ArrayList<Vendor> vendors = new ArrayList<Vendor>();
    private ArrayList<Consumer> consumers = new ArrayList<Consumer>();

    public Stock(Integer size){
        this.size = size;
        System.out.println("Склад создан. Размер = " + size);
    }

    public void addConsumer(Consumer consumer){ // Запоминаем потребителя склада
        consumer.start();
        this.consumers.add(consumer);
    }

    public void addVendor(Vendor vendor){ // Запоминаем производителя на складе
        vendor.start();
        this.vendors.add(vendor);
    }

    public Integer getSize(){
        return this.size;
    }

    public Integer checkGoods(){
        return this.goods;
    }

    public Integer putGood() throws Exception { // Добавляем вещь на склад
        int goods = this.goods;
        if (this.goods >= this.size) { // Если склад переполнен
            for (Vendor vendor : this.vendors) { // Приказываем всем производителям остановиться
                vendor.suspend();
            }
            throw new Exception("Недостаточно места на складе."); // Выбрасываем ошибку о переполнении
        }
        // Если всё нормально
        this.goods += 1; // Увеличиваем количество вещей на складе
        for (Consumer consumer: this.consumers){
            // Говорим потребителям, что можно продолжить брать со склада,
            // если они были приостановлены
            consumer.resume();
        }
        System.out.println("+ товар. Количество товара на складе " + (goods + 1)); // Выводим отчёт
        return this.goods;
    }

    public Integer takeGood() throws Exception { // Берем вещь со склада
        int goods = this.goods;
        if (this.goods <= 0) { // Если вещей нет
            for (Consumer consumer: this.consumers){ // Приказываем потребителям приостановить работу
                consumer.suspend();
            }
            throw new Exception("Мало товара для потребления"); // Выбрасываем ошибку об отсутствии вещей
        }
        // Если всё нормально
        this.goods -= 1; // Уменьшаем количество вещей на складе
        for (Vendor vendor : this.vendors) {
            // Говорим производителям, что можно продолжить добавлять на склад вещи,
            // если они были приостановлены
            vendor.resume();
        }
        System.out.println("- товар. Количество товара на складе " + (goods - 1)); // Выводим отчёт
        return this.goods;
    }
}
