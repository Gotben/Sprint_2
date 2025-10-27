package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if(Colour.RED.equals(colour)){
            return Discount.RED_APPLE;
        }
        return 0;
    }

    public String getColor() {
        return colour;
    }
}
