package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	/**
	 * creates empty object
	 */
	public Rectangle() 
	{
		length = 0;
		width = 0;
	}
	
	/**
	 * creates rectangle object
	 * 
	 * @param initLength length of rectangle
	 * @param initWidth	 width of rectangle
	 */
	public Rectangle(int initLength, int initWidth)
	{
		length = initLength;
		width = initWidth;
	}
	
	/**
	 * calculates the area of the Rectangle
	 * 
	 * @return area
	 */
	public double area()
	{
		return length * width;
	}
	
	/**
	 * calculates the perimeter of the Rectangle
	 * 
	 * @return perimeter
	 */
	public double perimeter()
	{
		return length * 2 + width * 2;
	}
	
	/**
	 * Compares the area of two Rectangle
	 * 
	 * @param other	the Rectangle being compared
	 * @return	if the Rectangle is smaller than the other
	 */
	public boolean smallerThan(Rectangle other)
	{
		return (length * width) < other.area();
	}
	
	/**
	 * Compares a Rectangle to a square
	 * 
	 * @return if the Rectangle is a square
	 */
	public boolean isSquare()
	{
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * draws the Rectangle
	 * 
	 * @param x x coordinate of the center of the Rectangle
	 * @param y y coordinate of the center of the Rectangle
	 */
	public void draw(double x, double y)
	{
		StdDraw.rectangle(x, y, width / 2, length / 2);
	}

	/**
	 * returns a description of the Rectangle
	 */
	public String toString()
	{
		return "length: " + length + "width: " + width;
	}
	
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle (3,4);
		Rectangle square = new Rectangle (3,3);
		System.out.println("area: " + rect.area());
		System.out.println("perimeter: " + rect.perimeter());
		System.out.println("rect smaller than square? " + rect.smallerThan(square));
		System.out.println("is square? " + square.isSquare());
		System.out.println("is square? " + rect.isSquare());
	}
}

	
