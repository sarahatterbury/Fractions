package fractions;

public class TestFractions{

	public static String add(Fraction frac1, Fraction frac2){
		
		int comdenom = frac1.getDenom() * frac2.getDenom();
		int numer = frac1.getNum() * frac2.getDenom() + frac2.getNum()*frac1.getDenom();
		
		return Integer.toString(numer) + "/" + Integer.toString(comdenom);
	}
	public static void main(String[] args) {
		Fraction x = new Fraction(2, 3);
		Fraction y = new Fraction(5, 8);
		System.out.println(add(x,y));
	}

}
