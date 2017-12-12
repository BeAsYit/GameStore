package shop;

import org.junit.Assert;
import org.junit.Test;
import shop.users.Customer;

public class TestObservable {

    Observable testObservable = new Observable();
    private Customer testCustomer = new Customer("Mike", 19);

    @Test
    public void testAddObservable() throws Exception {
        testObservable.addObserver(testCustomer);
        Assert.assertTrue(1 == testObservable.getObservers().size());
    }

    @Test
    public void testRemoveObservable() throws Exception {
        testObservable.removeObserver(testCustomer);
        Assert.assertTrue(0 == testObservable.getObservers().size());
    }

}
