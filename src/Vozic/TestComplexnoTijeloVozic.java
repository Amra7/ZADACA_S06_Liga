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
public class TestComplexnoTijeloVozic {

public static void main(String[] args) {
	
	
	
ComplexBody lokomotiva = new ComplexBody();
	
	lokomotiva.addPart(new Rectangle(30,100));
	lokomotiva.addPart(new Square(40));
	lokomotiva.addPart(new Square(50));
	lokomotiva.addPart(new Circle(40));
	lokomotiva.addPart(new Circle(40));
	lokomotiva.addPart(new Circle(40));
	
	
	System.out.println("Lokomotiva: \n" + lokomotiva.toString());
	
	System.out.printf("Povrsina svih elemnata lokomotive je: %f cm.",  lokomotiva.getSumArea());
	//System.out.printf("Obim svih elemnata lokomotive je: %f cm.",  lokomotiva.getSumExtent());
	
	ComplexBody vagon = new ComplexBody();
		
	vagon.addPart(new Circle(40));
	vagon.addPart(new Circle(40));
	vagon.addPart(new Square(60));
	vagon.addPart(new Square(10));
	vagon.addPart(new Square(60));
	
	System.out.println("Vagon: \n" +vagon.toString());
	
	System.out.printf("Povrsina svih elemnata vagona je: %f cm.",  vagon.getSumArea());
	//System.out.printf("Obim svih elemnata vagona je: %f cm.",  vagon.getSumExtent());
	
	ComplexBody putnickiVagon = new ComplexBody();
	
	putnickiVagon.addPart(new Circle(40));
	putnickiVagon.addPart(new Circle(40));
	putnickiVagon.addPart(new Square(60));
	putnickiVagon.addPart(new Square(10));
	putnickiVagon.addPart(new Square(60));
	
	System.out.println("Putnicki vagon: \n" + putnickiVagon.toString());
	
	System.out.printf("Povrsina svih elemnata putnickog vagona je: %f cm.",  putnickiVagon.getSumArea());
	//System.out.printf("Obim svih elemnata putnickog vagona je: %f cm.",  putnickiVagon.getSumExtent());
	
	ComplexBody vozic = new ComplexBody();
	vozic.addPart(lokomotiva);
	vozic.addPart(vagon);
	vozic.addPart(putnickiVagon);
	
	System.out.println("Vozic: \n" +vozic.toString());
	System.out.printf("Povrsina svih elemnata vozica je: %f cm.",  vozic.getSumAreaComplexBodys());
	
	
	
	
	
}
}
