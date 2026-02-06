package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a standard UNO deck of cards.
 * Supports creating the full 108-card deck, shuffling, drawing,
 * and checking if the deck is empty
 */
public class Deck {
    private List<Card> cards;

    /**
     * Constructor: Builds a full UNO deck with 108 cards and shuffles it.
     */
    public Deck() {
        cards = new ArrayList<>();

        // Build and add normal colored cards
        for (Color color : Color.values()) {
            if (color != Color.WILD) {
                for (Value value : Value.values()) {
                    if (value != Value.WILD && value != Value.WILD_DRAW_FOUR) {
                        int copies = (value == Value.ZERO) ? 1 : 2;
                        for (int i = 0; i < copies; i++) {
                            cards.add(new Card(color, value));
                        }
                    }
                }
            }
        }

        // Build and add Wild cards
        for (int i = 0; i < 4; i++) {
            cards.add(new Card(Color.WILD, Value.WILD));
            cards.add((new Card(Color.WILD, Value.WILD_DRAW_FOUR)));
        }

        shuffle();
    }

    /**
     * Returns the list of cards in the deck.
     * @return List
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Shuffles the deck randomly.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Draws the top card from the deck.
     * Removes the card from the deck and returns it.
     * @return the drawn card, or refill deck if deck is empty
     */
    public Card drawCard(DiscardPile discardPile) {
        if (isEmpty()) {
            refillFromDiscard(discardPile); // no cards left in deck
        }
        return cards.remove(0);
    }

    /**
     * Refills the deck using cards from the discard pile when the deck is empty.
     * Leaves the top card in the discard pile.
     * @param discardPile the discard pule to take cards from
     */
    public void refillFromDiscard(DiscardPile discardPile) {
        List<Card> refillCards = discardPile.removeAllExceptTop(); //get all cards except top card

        cards.addAll(refillCards);
        shuffle();
    }

    /**
     * Checks if the deck is empty.
     * @return true if there are no cards left, false otherwise.
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Returns the number of cards remaining in the deck.
     * @return int value.
     */
    public int size() {
        return cards.size();
    }
}