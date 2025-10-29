package model;

public class Meat extends Food {

    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false;
    }

    // Базовая реализация скидки (по умолчанию 0%)
    @Override
    public double getDiscount() {
        return 0;
    }
}
