package pkgCore;

import java.util.Collections;
import java.util.ArrayList;

import pkgEnum.eSuit;
import pkgEnum.eRank;

public class Deck {

private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

public Deck(int NumberOfDecks)
	{
		/* The number of decks is passed to Deck.  For each deck, add 52 cards to the arraylist, cards.*/
		for (int deck = 1; deck <=NumberOfDecks; deck++) {
			/* Loop through the defined enumerated list of suits */
			for (eSuit eSuit : eSuit.values()) {
				/* Loop through the defined enumerated list of ranks */
				for (eRank eRank : eRank.values()) {
					/* create a card with the current rank and suit and add it to the deck */
					cardsInDeck.add(new Card(eSuit, eRank));		
					
				}
	
			}	
			
	}
		Collections.shuffle(cardsInDeck);
}


public Card draw() {
	return cardsInDeck.remove(0);	
}

public int deckSize() {
	return cardsInDeck.size();
}

}
