public class Game {

    private Deck deck;
    private PlayerHand player1;
    private PlayerHand player2;

    public Game() {
        this.deck = new Deck();
        this.player1 = new PlayerHand();
        this.player2 = new PlayerHand();
    }

    public void dealCards(PlayerHand player1, PlayerHand player2) {
        deck.fillDeck();
        deck.dealRandomCard(player1);
        deck.dealRandomCard(player2);
    }
}
