package studio7;

public class Die {
		
	private int n;
	
	/**
	 * creates empty object
	 */
	public Die(){
		n = 0;
	}
	
	/**
	 * creates Die object
	 * 
	 * @param initN number of sides
	 */
	public Die(int initN) {
		n = initN;
	}
	
	/**
	 * rolls the Die
	 * 
	 * @return the number on the Die
	 */
	public int roll() {
		return (int)(Math.random()*n+1);
	}
	/**
	 * returns a description of the Die
	 */
	public String toString()
	{
		return "Die with " + n + " sides";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		Die crisha = new Die(n);
		int roll = crisha.roll();
		System.out.println("You rolled: " + roll);
	}

}
