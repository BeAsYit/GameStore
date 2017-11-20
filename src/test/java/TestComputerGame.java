import junit.framework.TestCase;
import org.junit.Assert;

public class TestComputerGame extends TestCase{

    ComputerGame game1 = new ComputerGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
    public void testgetSerialNumber(){
        Assert.assertTrue(game1.getSerialNumber()==3);
    }

    public void testgetPrice(){
        Assert.assertTrue(game1.getPrice() == 50);
    }
    public void testgetName(){
        Assert.assertTrue(game1.getName().equals("Just Cause"));
    }
    public void testgetYear(){
      Assert.assertTrue(game1.getYear() == 2009);
    }
    public void testgetGenre(){
       Assert.assertTrue(game1.getGenre().toString().equals("shooter"));
    }

    public void testgetEngine(){
     Assert.assertTrue(game1.getEngine().toString().equals("Unreal Engine"));
    }

}
