package shop.game;

public class GameProperties {
    private String name;
    private int year;
    private Genre genre;
    private Engine engine;
    private double price;

    public GameProperties(double price, String name, int year, Genre genre, Engine engine) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.engine = engine;
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

    public double getPrice() {
        return price;
    }
}
