package uno;

/**
 * Represent the value or type of an UNO card.
 * Possible values:
 * - ZERO to NINE: standard numbered cards
 * - SKIP, REVERSE, DRAW_TWO: action cars
 * - WILD, WILD_DRAW_FOUR: special wild cards
 *
 * toString() is overridden to provide a human-readable string for each value
 */
public enum Value {
    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    SKIP,
    REVERSE,
    DRAW_TWO,
    WILD,
    WILD_DRAW_FOUR;

    @Override
    public String toString() {
        // Replace underscores with spaces and capitalize each word
        String[] words = name().split("_");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
}
