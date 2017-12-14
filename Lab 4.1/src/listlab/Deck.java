package listlab;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	String[] suit= {"Diamonds","Hearts","Spades","Clubs"};
	String[] rank= {"Jack","King","Queen"};
	int[] pointValue= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13};
	
	
	public Deck(String[]suit,String[]rank,int[]pointValue)
	{
		for(int i=0;i<suit.length;i++)
		{
			for(int j=1;j<=pointValue.length;j++)
			{
				Card selectedCard = unDealt.get(j);
				selectedCard.pointValue=pointValue[j];
				selectedCard.suit=suit[i];
			}
		}
	}
	
	public static boolean isEmpty(List<Card>deck)
	{
		return deck.size()==0;
	}
	public static int size(List<Card>deck)
	{
		return deck.size();
	}
	public static Card deal(List<Card>deck)
	{
		
	}
	public static void shuffle()
	{
		
	}
	public static Card generateRandomCard()
	{
		
	}
}
