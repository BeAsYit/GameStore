package shop.delivery;

import shop.game.ComputerGame;

import java.util.List;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("You choose DHL delivery");
        return true;
    }
}
