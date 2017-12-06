package shop.game;

public enum Engine {
    UNREALENGINE, UNITY;


    @Override
    public String toString() {
        switch (this) {
            case UNREALENGINE:
                return "Unreal Engine";
            case UNITY:
                return "Unity";
            default:
                return "";
        }
    }
}
