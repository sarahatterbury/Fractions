package fractions;

public class Fraction {
	private int numerator, denominator;
	
	public Fraction(int num, int denom){
		this.numerator = num;
		this.denominator = denom;
	}
	
	public int getNum(){
		return numerator;
	}
	public int getDenom(){
		return denominator;
	}
}
