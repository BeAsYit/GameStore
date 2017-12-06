package shop.decorators;
import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.delivery.DeliveryDHL;
import shop.game.ComputerGame;
import shop.game.Engine;
import shop.game.GameProperties;
import shop.game.Genre;
import shop.payment.Privat24Payment;

public class TestBonusDecorator {
    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testShip() throws Exception{
        GameProperties whatErikLikes = new GameProperties(50, "JUst Cause", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        testCart.setDeliveryStrategy(new DeliveryDHL());
        testCart.setPaymentStrategy(new Privat24Payment());
        testCart.addToCart(new ComputerGame(whatErikLikes));
        Assert.assertTrue(testCart.ship());
    }
}
