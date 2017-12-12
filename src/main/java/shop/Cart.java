package shop;

import shop.delivery.DeliveryStrategy;
import shop.game.ComputerGame;
import shop.payment.PaymentStrategy;

import java.util.ArrayList;

public class Cart extends Observable {
    public ArrayList<ComputerGame> games = new ArrayList<>();
    public DeliveryStrategy deliveryStrategy;
    public PaymentStrategy paymentStrategy;
    public double price;

    public Cart() {
        this.price = 0;
    }

    public void addToCart(ComputerGame game){
        games.add(game);
    }

    public ArrayList<ComputerGame> getGames() {
        return games;
    }

    public void setGames(ArrayList<ComputerGame> games) {
        this.games = games;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public boolean ship(){
        deliveryStrategy.deliver(games);
        paymentStrategy.pay(price);
        return true;
    }


    public double computeTotalPrice() {
        for (ComputerGame game: games){
            this.price+= game.getProp().getPrice();
        }
        return this.price;
    }


}
