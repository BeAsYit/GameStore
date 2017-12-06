package shop.decorators;

import shop.Cart;
import shop.delivery.DeliveryStrategy;
import shop.game.ComputerGame;
import shop.payment.PaymentStrategy;

import java.util.ArrayList;

public class CartDecorator extends Cart {
    public Cart newCart;

    public CartDecorator(Cart currentCart) {
            this.newCart = currentCart;
    }

    @Override
    public double computeTotalPrice() {
        return this.newCart.computeTotalPrice();
    }

    @Override
    public void addToCart(ComputerGame game) {
        this.newCart.addToCart(game);
    }

    @Override
    public ArrayList<ComputerGame> getGames() {
        return this.newCart.getGames();
    }

    @Override
    public void setGames(ArrayList<ComputerGame> games) {
        this.newCart.setGames(games);
    }

    @Override
    public DeliveryStrategy getDeliveryStrategy() {
        return this.newCart.getDeliveryStrategy();
    }

    @Override
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.newCart.setDeliveryStrategy(deliveryStrategy);
    }

    @Override
    public PaymentStrategy getPaymentStrategy() {
        return this.newCart.getPaymentStrategy();
    }

    @Override
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.newCart.setPaymentStrategy(paymentStrategy);
    }

    @Override
    public boolean ship() {
        this.newCart.ship();
        return true;
    }
}
