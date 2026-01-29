package uno;

/**
 *  Represents a single UNO card.
 *  Each card has a Color and a Value.
 *  Provides methods to check if it can be played on another card
 *  and to get a human-readable string for display.
 */
public class Card {
    private Color color;
    private Value value;

    /**
     * Creates a new Card with a specified color and value
     * @param color The color of the card (RED, BLUE, GREEN, YELLOW, WILD)
     * @param value The value of the card (0-9, SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW_FOUR)
     * */
    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    /**
     * Returns the color of this card
     */
    public Color getColor() {
        return color;
    }

    /**
     *  Returns the value of this card.
     */
    public Value getValue() {
        return value;
    }

    /**
     *  Checks if this card can be legally played on top of another card.
     *
     *  Rules:
     *  1. Wild cards can always be played.
     *  2. Cards that match the current color can be played.
     *  3. Cards that match the value of the top card can be played
     *
     * @param topCard The card currently on top of the pile.
     * @param currentColor The active color
     * @return true if this card can be played, false otherwise
     */
    public boolean canPlayOn(Card topCard, Color currentColor) {
        // wild cards can always be played
        if (this.value == Value.WILD || this.value == Value.WILD_DRAW_FOUR) {
            return true;
        }

        // match the current color
        if (this.color == currentColor) {
            return true;
        }

        // match the value of the top card
        if (this.value == topCard.getValue()) {
            return true;
        }

        // no matches cant play card
        return false;

    }

    /**
     * Returns a human-readable string representing this card.
     * Examples:
     *  - "Red Five"
     *  - "Blue Skip"
     *   - "Wild Draw Four"
     */
    @Override
    public String toString() {
        if (this.value == Value.WILD || this.value == Value.WILD_DRAW_FOUR) {
            return this.value.toString();
        }

        return this.color.toString() + " " + value.toString();
    }
}