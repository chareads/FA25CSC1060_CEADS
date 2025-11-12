import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<Card>();
	}
	
	public Card pop() {
		return this.cards.remove(0); //takes the card out of the deck completely, now gonna add it to pile
	}
	
	public void add(Card card) {
		this.cards.add(card);
	}
	
	public boolean isEmpty() { //game over if someone's got no cards
		return this.cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards()) {
			this.cards.add(card);
		}
	}
}
