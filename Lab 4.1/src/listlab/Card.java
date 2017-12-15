package listlab;

public class Card {

	private static String rank;
	private static String suit;
	private static int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank=rank;
		this.suit=suit;
		this.pointValue=pointValue;
	}
	public static String getRank()
	{
		return rank;
	}
	public static String getSuit()
	{
		return suit;
	}
	public static int getPointValue()
	{
		return pointValue;
	}
	public boolean equals(Card otherCard)
	{
		return this.getPointValue()==Card.getPointValue();
	}
	public String toString()
	{
		return this.getRank()+"of"+" "+this.getSuit();
	}
}
