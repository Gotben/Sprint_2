package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    //получить общую сумму товаров в корзине без скидки
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].getAmount() * items[i].getPrice();
        }
        return totalPrice;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            double price = items[i].getAmount() * items[i].getPrice();
            double discount = 0;
            if(items[i] instanceof Discountable) {
                discount = ((Discountable) items[i]).getDiscount();
            }
            totalPrice += price * (1 - discount / 100);
        }
        return totalPrice;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i].isVegetarian()){
                totalPrice += items[i].getAmount() * items[i].getPrice();
            }
        }
        return totalPrice;
    }

}
