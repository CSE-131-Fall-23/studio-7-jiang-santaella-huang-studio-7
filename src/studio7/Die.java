package studio7;

public class Die {

	private int numberofSides;
	
	public Die()
	   {
	      // 1. set the instance variables to default values 
	      this.numberofSides = 0;
	   }
	   
	   // constructor: set instance variables to init parameters
	   public Die(int initNumberOfSides)
	   {
	      // 2. set the instance variables to the init parameter variables
		   this.numberofSides = initNumberOfSides;
	   }
	  
	   public int roll() {
		   int result = (int)(Math.random()*(numberofSides)+1);
		   System.out.println(result);
		   return result;
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(6);
		
		die1.roll();
	}

}
