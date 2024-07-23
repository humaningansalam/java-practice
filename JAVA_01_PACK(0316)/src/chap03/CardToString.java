package chap03;

class Card{
	String kind;
	int number;
	
	public Card() {
		this("C", 1);
	}
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
}
public class CardToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c2.toString());

	}

}
