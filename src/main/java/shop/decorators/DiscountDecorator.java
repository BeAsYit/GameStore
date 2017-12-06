package shop.decorators;

import shop.Cart;

public class DiscountDecorator extends CartDecorator {
    private double discount;


    public DiscountDecorator(Cart currentCart, double discount) {
        super(currentCart);
        this.discount = discount;
    }

    @Override
    public double computeTotalPrice() {
        return this.newCart.computeTotalPrice() - discount;
    }
}
