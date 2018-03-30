package Chapter06;

public class Exercise6_24 {
	public static void main(String[] args) {
		
		final int NUMBER_OF_CARDS = 52;
		
		int  numberOfPicks = 0;
		/*
		 * Subscripts 0 to 12: Spades(♠)
		 * Subscripts 13 to 25: Hearts(♥)
		 * Subscripts 26 to 38: Diamonds(♦)
		 * Subscripts 39 to 51: Clubs(♣)
		 */
		
		int[] deck = new int[NUMBER_OF_CARDS];
		
		// indicates whether a suit has been picked
		int[] numberOfEachSuit = new int[4];
		boolean[] found = new boolean[4];
		
		int selectedCard = 0;
		int i = 0;
		
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		initializeDeck(deck);
		
		while(i<4){
			
			
			shuffleCard(deck);
			selectedCard = deck[selectCard(deck)];
			numberOfPicks++;
/*
 * my solution
			String suit = suits[selectedCard / 13];
			String rank = ranks[selectedCard % 13];
			
			if(suit == "Spades" && numberOfEachSuit[0] < 1){
				numberOfEachSuit[0]++;
				printCard(suit,rank);
				i++;
			}
			else if(suit == "Hearts" && numberOfEachSuit[1] < 1){
				numberOfEachSuit[1]++;
				printCard(suit,rank);
				i++;
			}
			else if(suit == "Diamonds" && numberOfEachSuit[2] < 1){
				numberOfEachSuit[2]++;
				printCard(suit,rank);
				i++;
			}
			else if(suit == "Clubs" && numberOfEachSuit[3] < 1){
				numberOfEachSuit[3]++;
				printCard(suit,rank);
				i++;
			}
*/
		/*
		 * 	The author's solution, More concise
		 */
			if(!found[selectedCard / 13]){
				found[selectedCard / 13] = true;
				String suit = suits[selectedCard / 13];
				String rank = ranks[selectedCard % 13];
				printCard(suit,rank);
				i++;
			}
		};
		
		System.out.println("Number of picks: "+numberOfPicks);
		
		}

		public static void initializeDeck(int[] deck) {
			for(int i=0;i<deck.length;i++)
				deck[i] = i;
		}

		public static int selectCard(int[] deck) {
			
			int index = 0;
			
			return index;
			
		}

		public static void shuffleCard(int[] deck) {
			
			for(int i=0;i<deck.length;i++){
				int index = (int)(Math.random()*deck.length);
				int temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
			}
			
		}

		public static void printCard(String suit, String rank) {
			System.out.println(rank+" of "+suit);
		}
}
