package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple apple = new Apple(10, 50, Colour.RED);
        Apple apple2 = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, apple, apple2};
        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.getTotalPrice());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalPriceWithoutDiscount());
    }
}