import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    PlayerHand player1;
    PlayerHand player2;

    @Before
    public void before() {
        game = new Game();
        player1 = new PlayerHand();
        player2 = new PlayerHand();
    }

    @Test
    public void canDealCardsToPlayers() {
        game.dealCards(player1, player2);
        assertEquals(1, player1.getCards().size());
        assertEquals(1, player2.getCards().size());
    }

//    @Test
//    public void gameCanComparePlayerCards() {
//        assertEquals("Player 1 wins!", game.compareCards(player1, player2));
//    }
}
