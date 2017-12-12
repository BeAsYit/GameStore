package shop.users;

import org.junit.Assert;
import org.junit.Test;

public class TestCustomer {

    private Customer testCustomer = new Customer("Mike", 19);


    @Test
    public void testGetName() throws Exception {
        Assert.assertTrue("Mike".equals(testCustomer.getName()));
    }

    @Test
    public void testSetName() throws Exception {
        testCustomer.setName("Dilan");
        Assert.assertTrue("Dilan".equals(testCustomer.getName()));
    }

    @Test
    public void testGetAge() throws Exception {
        Assert.assertTrue(19 == testCustomer.getAge());
    }

    @Test
    public void testSetAge() throws Exception {
        testCustomer.setAge(21);
        Assert.assertTrue(21 == testCustomer.getAge());
    }



}
