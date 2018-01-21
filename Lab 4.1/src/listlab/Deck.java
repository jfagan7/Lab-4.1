package listlab;

import java.util.ArrayList;

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
				System.out.print(selectedCard.toString());
			}
		}
	}
	
	public boolean isEmpty()
	{
		return getUnDealt().size()==0;
	}
	public static Card deal(Deck deck)
	{
		if(!deck.isEmpty())
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
		
		for(int k=51;k>=1;k--)
		{
			int r=(int)(Math.random()*52)+1;
			Card cardToSwap=unDealt.get(k);
			Card randomCard=unDealt.get(r);
			
			Card temp=cardToSwap;
			cardToSwap=randomCard;
			randomCard=temp;
		}
	}

	public static ArrayList<Card> getUnDealt() {
		return unDealt;
	}

	public static void setUnDealt(ArrayList<Card> unDealt) {
		Deck.unDealt = unDealt;
	}

	public static ArrayList<Card> getDealt() {
		return Dealt;
	}

	public static void setDealt(ArrayList<Card> dealt) {
		Dealt = dealt;
	}
}
