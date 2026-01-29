package uno;

/**
 *  Represents the color of an UNO card.
 *  Possible values:
 *  - RED, GREEN, BLUE, YELLOW: standard colors
 *  - WILD: used for wild and wild draw four cards
 *
 *  toString() is overridden to provide a human-readable string for each value.
 */
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