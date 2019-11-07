import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;
    PlayerHand player1;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new PlayerHand();
    }

    @Test
    public void canFillDeck() {
        deck.fillDeck();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canDealRandomCard() {
        deck.fillDeck();
        deck.dealRandomCard(player1);
        assertEquals(1, player1.getCards().size());
    }
}
