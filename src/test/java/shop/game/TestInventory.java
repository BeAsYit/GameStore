package shop.game;

import org.junit.Assert;
import org.junit.Test;


public class TestInventory {

    @Test
    public void testAddGame() throws Exception{
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 1);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 2);

    }
    @Test
    public void testGetGame()throws Exception{
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.getGame(4) != null);
        Assert.assertTrue(inventory.getGame(5) == null);
    }
    @Test
    public void testSearch()throws Exception{
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        GameProperties searchGame = new GameProperties(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertFalse(inventory.search(searchGame).isEmpty());
        searchGame = new GameProperties(50, "Just Something", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.search(searchGame).isEmpty());

    }
}
