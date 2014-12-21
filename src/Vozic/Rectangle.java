package Vozic ;
/**
 * Class Rectangle extends ComplexBody
 * contains sides of rectangle 'a' and 'b', area and extent of rectangle as methods
 * @author Amra
 *
 */
public class Rectangle extends ComplexBody {

	private double a;
	private double b;
	
	/**
	 * Constructor for rectangle
	 * @param a = first side of  rectangle
	 * @param b = second side of  rectangle
	 */
	
	public Rectangle (double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	/**
	 * Method 'toString' convert all parameters of class int String and return String
	 */
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]  \n";
	}
	
	/**
	 * Method for Extent/Scope of rectangle
	 * @param a= first side of  rectangle
	 * @param b= second side of  rectangle
	 * @return Extent/Scope of rectangle
	 */
	@Override
	public double extentBody(){
		return (2*this.a) + (2*this.b);
	}
	/**
	 * Method for Area of rectangle
	 * @param a= first side of  rectangle
	 * @param b= second side of  rectangle
	 * @return Area of rectangle
	 */
	@Override
	public double areaBody(){
		return this.a*this.b;
	}
	
}
