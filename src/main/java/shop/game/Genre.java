package shop.game;

public enum Genre {
    SHOOTER, STRATEGY;

    @Override
    public String toString() {
        switch (this){
            case SHOOTER: return "shooter";
            case STRATEGY: return "strategy";
            default: return "";
        }
    }
}
