package uno;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents the discard pile in the UNO game.
 * Stores cards that have been played and allows access to the top card.
 */
public class DiscardPile {
    private List<Card> cards;

    public DiscardPile() {
        cards = new ArrayList<>();
    }

    /**
     * Adds a card to the top of the discard pile.
     * @param card the Card to add
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Returns the top card of the discard pule without removing it.
     * @return the top Card, or null if the pile is empty
     */
    public Card getTopCard() {
        if (cards.isEmpty()) {
            return null; // no cards in the pile
        }
        return cards.get(cards.size() - 1);
    }

    /**
     * Removes all cards from the discard pule except the top card.
     * This is used when the deck is empty and needs to be refilled.
     * @return a new List containing all cards except the top card,
     *         in the same order they were in the pile.
     */
    public List<Card> removeAllExceptTop() {
        List<Card> refillCards = new ArrayList<>(cards.subList(0, cards.size() - 1));
        cards.subList(0, cards.size() - 1).clear();

        return refillCards;
    }
}
