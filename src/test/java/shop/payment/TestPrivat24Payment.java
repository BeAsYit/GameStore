package shop.payment;

import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.decorators.BonusDecorator;
import shop.delivery.DeliveryDHL;

public class TestPrivat24Payment {

    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testPay() throws Exception{
        testCart.setPaymentStrategy(new Privat24Payment());
        testCart.setDeliveryStrategy(new DeliveryDHL());
        Assert.assertTrue(testCart.ship());
    }
}
