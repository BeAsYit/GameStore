package shop.delivery;

import shop.game.ComputerGame;

import java.util.List;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("You choose Nova Poshta's delivery");
        return true;
    }
}
