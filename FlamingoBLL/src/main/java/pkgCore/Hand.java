package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;


public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
	
	int NumOfAces = 0;	// initialize the variable to count the number of aces in the hand
	int NonAceTotal = 0; // initialize the variable that holds the sum of the non ace cards
		
	Collections.sort(cards);  // sort the cards based on the enum eRank 
	
	for (Card c: cards)
	{
		if (c.geteRank()==pkgEnum.eRank.ACE) NumOfAces++; // If the card is an ace, increase the ace counter by 1
		else if (c.geteRank().getiRankNbr()>10) NonAceTotal+=10; // if the card is a face card add 10 to the running sum of the non Ace cards
		else NonAceTotal+=c.geteRank().getiRankNbr(); // if the card is a number card add its value to the running sum of the non Ace cards
	}
	
	int [] iScore = new int[NumOfAces+1];  // create an array of the length of the # of possible scores
		
	for (int i=0; i<=NumOfAces; i++) // populate the score array calculating the values with the formula 
	{
		iScore[i]=NonAceTotal+(i*10)+NumOfAces;
	}
	return iScore; // return the array of score values
	

		}
	
	public void Draw(Deck d)
	{
		AddCard(d.draw());
		
	}

	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
	
	
}
