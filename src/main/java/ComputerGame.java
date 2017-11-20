public class ComputerGame {
    private int serialNumber;
    private GameProperties prop;
    private static int counter = 1;


    public ComputerGame(GameProperties prop){
        this.serialNumber = counter++;
        this.prop = prop;
    }


    public int getSerialNumber() {
        return serialNumber;
    }


    public GameProperties getProp(){
        return prop;
    }
}
