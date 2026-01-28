package uno;

public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    WILD;

    @Override
    public String toString() {
        // returns the name with first letter uppercase rest lowercase
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}