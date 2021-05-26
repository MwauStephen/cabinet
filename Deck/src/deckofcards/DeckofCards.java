package deckofcards;

public class DeckofCards {
  public static void main(String[] args) {
	  int[] deck=new int[52];//creates array deck
	  String[] suits= {"Spades","Hearts","Diamonds","Clubs"};//array of strings
	  String[]ranks= {"Ace","2" ,"3","4","5","6","7","8","9","10","Jack","Queen","King"};//at ray of strings for ranksr
 //initialize the cards 
	  for(int i=0; i<deck.length; i++)
		  deck[i]=i;//initialize deck
		  
	  //shuffle the cards 
	  for(int i=0; i<deck.length; i++) {
		  //Generate an index randomly
		  int index=(int)(Math.random()*deck.length);
		  int temp=deck[i];
		  deck[i]=deck[index];
		  deck[index]=temp;
	  }
	  //dispaly the first four cards
	  for(int i=0; i<4; i++) {
		  String suit=suits[deck[i] /13];
		  String rank=ranks[deck[i] %13];
		  System.out.println("Card number " + deck[i] + ";" + rank  + " of " +  suit);
	  }
  }

}
