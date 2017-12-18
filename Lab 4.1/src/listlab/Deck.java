package listlab;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private static ArrayList<Card> unDealt;
	private static ArrayList<Card> Dealt;
	
	public Deck(String[]suit,String[]rank,int[]pointValue)
	{
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<=pointValue.length;j++)
			{
				Card selectedCard = new Card(suit[i],rank[j],pointValue[j]);
				unDealt.add(selectedCard);
			}
		}
	}
	
	public static boolean isEmpty()
	{
		return getUnDealt().size()==0;
	}
	public static int size()
	{
		return getUnDealt().size();
	}
	public static Card deal(Deck deck)
	{
		if(!getUnDealt().isEmpty())
		{
			Card dealtCard=unDealt.get(0);
			Dealt.add(dealtCard);
			unDealt.remove(dealtCard);
			return dealtCard;
		}
		return null;
	}
	public static void shuffle()
	{
		int r=0;
		for(int k=51;k>=1;k--)
		{
			
			
		}
	}
	private static ArrayList<Card> getUnDealt()
	{
		return unDealt;
	}
}
