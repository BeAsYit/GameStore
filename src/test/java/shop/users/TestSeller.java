package shop.users;

import org.junit.Assert;
import org.junit.Test;

public class TestSeller {

    private Seller testSeller = new Seller("Mike", 19);


    @Test
    public void testGetName() throws Exception {
        Assert.assertTrue("Mike".equals(testSeller.getName()));
    }

    @Test
    public void testSetName() throws Exception {
        testSeller.setName("Dilan");
        Assert.assertTrue("Dilan".equals(testSeller.getName()));
    }

    @Test
    public void testGetAge() throws Exception {
        Assert.assertTrue(19 == testSeller.getAge());
    }

    @Test
    public void testSetAge() throws Exception {
        testSeller.setAge(21);
        Assert.assertTrue(21 == testSeller.getAge());
    }

}
