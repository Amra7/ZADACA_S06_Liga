package Vozic;
/**
 * Class Square extends ComplexBody
 * contains side of square 'a' , area and extent of rectangle as methods
 * @author Amra
 *
 */
public class Square extends ComplexBody {

	private double a;
	
	/**
	 * Constructor for square
	 * @param a = side of  square
	 */
	public Square(double a){

		this.a=a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Method 'toString' convert all parameters of class int String and return String
	 */
	@Override
	public String toString() {
		return "Square [a=" + a + "] \n";
	}
	
	/**
	 * Method for Extent/Scope of square
	 * @param a= one side of square
	 * @return Extent/Scope of square
	 */
	@Override
	public double extentBody(){
		return 4*this.a;
	}
	/**
	 * Method for Area of square
	 * @param a= one side of square
	 * @return Area of square
	 */
	@Override
	public double areaBody(){
		return this.a*this.a;
	}
	
	
}
