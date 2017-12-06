package shop.decorators;

import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.delivery.DeliveryDHL;
import shop.game.ComputerGame;
import shop.game.Engine;
import shop.game.GameProperties;
import shop.game.Genre;

public class TestDiscountDecorator {
    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testComputeTotalPrice() throws Exception {
        GameProperties whatErikLikes = new GameProperties(50, "JUst Cause", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        testCart.setDeliveryStrategy(new DeliveryDHL());
        testCart.addToCart(new ComputerGame(whatErikLikes));
        double discount = 10;
        Assert.assertTrue((testCart.computeTotalPrice() - discount)==40);
    }
}
