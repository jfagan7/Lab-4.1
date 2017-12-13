package listlab;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String[] suit= {"Diamonds","Hearts","Spades","Clubs"};
	private String[] rank;
	private int[] pointValue;
	
	public Deck(String[]suit,String[]rank,int[]pointValue)
	{
		this.suit=suit;
		this.rank=rank;
		this.pointValue=pointValue;
	}
	
}
