package Vozic;
/**
 * Class Circle extends ComplexBody
 * contains radius of circle 'r', area and extent of rectangle as methods
 * @author Amra
 *
 */
public class Circle extends ComplexBody {
	
	private double r;
	
	/**
	 * Constructor for circle
	 * @param r = radius of circle
	 */
	public Circle(double r){
		super();
		this.r=r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/**
	 * Method 'toString' convert all parameters of class  String and return String
	 */
	@Override
	public String toString() {
		return "Circle [r=" + r + "] \n";
		
	}
	
	/**
	 * Method for Area of circle
	 * @param r= radius of circle
	 * @return Area of circle
	 */
	@Override
	public double areaBody(){
		return this.r*this.r*Math.PI;
		
	}
	
	/**
	 * Method for Extent/Scope of circle
	 * @param r= radius of circle
	 * @return Extent/Scope of circle
	 */
	@Override
	public double extentBody (){
		return 2*this.r*Math.PI;
	}

}
