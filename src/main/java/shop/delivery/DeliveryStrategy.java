package shop.delivery;

import shop.game.ComputerGame;

import java.util.List;

public interface DeliveryStrategy {
    boolean deliver(List<ComputerGame> games);
}
