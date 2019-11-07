import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canFillDeck() {
        deck.fillDeck();
        assertEquals(48, deck.getCards().size());
    }
}
