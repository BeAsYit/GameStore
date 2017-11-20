import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGameProperties {
    GameProperties tests = new GameProperties(50,"Test Game",2017,Genre.STRATEGY, Engine.UNITY);

    @Test
    public void getName() throws Exception {
        Assert.assertTrue(tests.getName().equals("Test Game"));
    }

    @Test
    public void getYear() throws Exception {
        Assert.assertTrue(tests.getYear() == 2017);
    }

    @Test
    public void getPrice() throws Exception {
        Assert.assertTrue(tests.getPrice() == 50);
    }

}