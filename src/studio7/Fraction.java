package studio7;

public class Fraction {

	private int num;
	private int denom;
	
	/**
	 * creates an empty object
	 */
	public Fraction()
	{
		num = 0;
		denom = 0;
	}
	
	/**
	 * creates a Fraction object
	 * 
	 * @param initNum		numerator of the fraction
	 * @param initDenom		denominator of the fraction
	 */
	public Fraction(int initNum, int initDenom)
	{
		num = initNum;
		denom = initDenom;
	}
	
	/**
	 * gets the numerator of the Fraction
	 * 
	 * @return the numerator of the Fraction
	 */
	public int getNum()
	{
		return num;
	}
	
	/**
	 * gets the denominator of the Fraction
	 * 
	 * @return the denominator of the Fraction
	 */
	public int getDenom()
	{
		return denom;
	}
	
	/**
	 * adds two Fractions
	 * 
	 * @param other		the Fraction being added
	 * @return the sum of the Fractions
	 */
	public Fraction add(Fraction other)
	{
		if (denom == other.getDenom()) {
				Fraction result = new Fraction(num + other.getNum(), denom); 
				return result;
		} else {
			Fraction result = new Fraction((num * other.getDenom()) + (other.getNum() * denom), denom * other.getDenom());
			return result;
		}	
	}
	
	/**
	 * multiplies two Fractions
	 * 
	 * @param other		the Fraction being multiplied
	 * @return the product
	 */
	public Fraction multiply(Fraction other)
	{
			Fraction result = new Fraction((num * other.getNum()), denom * other.getDenom());
			return result;
	}
	
	/**
	 * Calcultaes the reciricol
	 * 
	 * @return the recipricol of the Fraction
	 */
	public Fraction recipricol()
	{
			Fraction result = new Fraction(denom, num);
			return result;
	}
	
	public String toString()
	{
		return num + "/" + denom;
	}
	
	public Fraction simplify()
	{
		int simpN = num;
		int simpD = denom;
		for (int i = denom; i > 2; i--) {
			if (denom%i == 0 && num%i == 0) {
				simpN = num / i;
				simpD = denom / i;
			}
		}
		Fraction simplified = new Fraction(simpN, simpD);
		return simplified;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Fraction third = new Fraction(1, 3);
		Fraction half = new Fraction(1, 2);
		Fraction big = new Fraction(12, 16);
		Fraction sum = third.add(half);
		System.out.println("sum: " + sum.toString());
		Fraction product = third.multiply(half);
		System.out.println("product: " + product.toString());
		Fraction recip = third.recipricol();
		System.out.println("recipricol: " + recip.toString());
		Fraction simp = big.simplify();
		System.out.println("simplified: " + simp.toString());
	}

}
