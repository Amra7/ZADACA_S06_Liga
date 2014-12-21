package Vozic;

/**
 * Zadacai za samostalni rad
 * 
 * Napraviti klasni model za racunanje povrsine i obima jednostavnih i kompleksnih geometrijskih tijela. 
Osnovna geometrijska tijela koja bi se trebala podrzati su krug, pravougaonik i kvadrat. 
Kompleksno tijelo treba imati mogucnost da se dodaje proizvoljan broj drugih geometrijskih tijela,
 i treba imati mogucnost ispisa i liste dijelova i njihovih povrsina. Implementacija treba da drzi dijelove u nizu, 
 ali tako da niz ne ogranicava maksimalni broj dijelova.
Svaka od klasa bi trebala overridati i toString metodu, npr. "Krug{r=10}".

Napraviti i glavni program koji koristi ovaj model. 
Program bi trebao da napravi kompleksno tijelo "vozic" koje se sastoji od kompleksnih tijela lokomotiva,
 teretni vagon i putnicki vagon (vidi sliku).

Implementacija treba minimizirati dupliranje koda.

Primjer kako bi kod za kreriranje vagona i voza mogao izgledati:

// kod za kreiranje lokomotive i putnickog vagona
....
// kod za kreiranje vagona
KompleksnoTijelo vagon = new KompleksnoTijelo()
vagon.dodajDio(new Krug(10));
vagon.dodajDio(new Krug(10));
vagon.dodajDio(new Pravougaonik(100, 60))

Kompleksno tijelo voz = new KompleksnoTijelo();
voz.dodajDio(lokomotiva);
voz.dodaDio(putnickiVagon);
voz.dodajDio(vagon);

System.out.println("Povrsina voza je " + voz.povrsina())
System.out.println(voz);
 * @author Amra
 *
 */

public class ComplexBody {

	private ComplexBody[] shapes;
	private int size;

	public ComplexBody() {
		shapes = new ComplexBody[2];
		this.size = 0;
	}

	/**
	 * Method for Area of circle
	 * 
	 * @param r
	 *            = radius of circle
	 * @return Area of circle
	 */

	public double areaCircle(double r) {
		return r * r * Math.PI;
	}

	@Override
	public String toString() {
		String str="";
		for ( int i=0; i<shapes.length; i++){
			str+= shapes[i];
		}
		System.out.println();
		return str;
	}
	
	/**
	 * Method for adding Circles in array of ComplexBody
	 * @param newCircle = object Circle that we are adding
	 */

	public void addPart(Circle newCircle) {
		shapes[size] = newCircle;
		size++;

		if (size == shapes.length) {
			resizeShapes();
		}
		
	}
	
	/**
	 * Method for adding Square in array of ComplexBody
	 * @param newSquare = object Square that we are adding
	 */

	public void addPart(Square newSquare) {
		shapes[size] = newSquare;
		size++;
		if (size == shapes.length) {
			resizeShapes();
		}
	}

	/**
	 *  Method for adding Rectangle in array of ComplexBody
	 * @param newRectangle = object Rectangle that we are adding
	 */
	public void addPart(Rectangle newRectangle) {
		shapes[size] = newRectangle;
		size++;
		if (size == shapes.length) {
			resizeShapes();
		}
	}

	/**
	 * Method of resizeing arry
	 */
	private void resizeShapes() {
		int newLength = 2* shapes.length;
		ComplexBody[] temp = new ComplexBody[newLength];
		for (int i = 0; i < shapes.length; i++) {
			temp[i] = shapes[i];

		}
		shapes = temp;

	}
	
	/**
	 *Method for extent of body (object of subclass)
	 * @return override from subclass extentBody
	 */
	public double extentBody(){
		return 0;
	}
	
	/**
	 *Method for area of body (object of subclass)
	 * @return override from subclass extentBody
	 */
	public double areaBody(){
		return 0;
	}
	
	/**
	 * Method for sum of area of different object that are in array ComplexBody
	 * @return = sum of area of different object
	 */
	public double getSumArea() {
		double sumArea=0;
		for (int i = 0; i < shapes.length; i++) {
			sumArea += shapes[i].areaBody();
		}
		return sumArea;
	}
	
	/**
	 * Method for sum of extent of different object that are in array ComplexBody
	 * @return = extent of area of different object
	 */
	public double getSumExtent() {
		double sumExtent=0;
		for (int i = 0; i <= shapes.length; i++) {
			sumExtent += shapes[i].extentBody();
		}
		return sumExtent;
	}
	
	

}
