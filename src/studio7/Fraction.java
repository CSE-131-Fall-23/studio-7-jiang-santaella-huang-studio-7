package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(){
		this.numerator = 0;
		this.denominator = 0;
	}
	
	public Fraction(int initnumerator, int initdenominator)
	   {
	      // 2. set the instance variables to the init parameter variables
		   this.numerator = initnumerator;
		   this.denominator = initdenominator;
	  	   
	   }
	   
	public double number () {
		return ((double)numerator/denominator);
		
	}
	public double product(Fraction frac) {
		System.out.println((double) (this.number() * frac.number()));
		return this.number() * frac.number();
		   
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction1 = new Fraction(1,3); //second constructor
	      Fraction fraction2 = new Fraction (3, 2);
	  
	      fraction1.product(fraction2);
	}

}
