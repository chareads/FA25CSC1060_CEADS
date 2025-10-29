
public class War_Driver {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		Card target = new Card(7, 1);
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		//printDeck(cards);
		System.out.println();
		//System.out.println(search(cards, threeClub));
		System.out.println(cards[binSearch(cards, target)]);
	}

	private static int binSearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			System.out.println(low + ", " + high);
			int mid = (low + high) / 2; //split the deck
			int comp = cards[mid].compareTo(target);
			if (comp == 0) {
				return mid;
			} else if (comp < 0) low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}

	private static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if(cards[i].equals(target)) return i;
		}
		return -1;
		
	}

	private static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + ", ");
			if(i %13 == 0 && i != 0) System.out.println();
		}
		
	}

}
