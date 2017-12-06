package shop.decorators;

import shop.Cart;

public class BonusDecorator extends CartDecorator {


    public BonusDecorator(Cart currentCart) {
        super(currentCart);
    }

    @Override
    public boolean ship() {
        super.ship();
        System.out.println("Added bonus gift");
        return true;
    }
}
