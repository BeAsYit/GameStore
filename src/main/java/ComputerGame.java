public class ComputerGame {
    private int serialNumber;
    private double price;
    private String name;
    private int year;
    private Genre genre;
    private Engine engine;
    private static int counter = 1;

    public ComputerGame(double price, String name, int year, Genre genre, Engine engine){
        this.serialNumber = counter++;
        this.price = price;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.engine = engine;
    }


    public int getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }


    public Engine getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }


}
