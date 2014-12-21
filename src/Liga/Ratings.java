package Liga;
/**
 * Klasa Ratings(Ocjene) koja u sebi ima brzinu igraca, spospbnost dodavanja, udaranje glavom lopte te brzinu igraca
 * Sadrzi i metodu 'faktor srece' koji odlucuje  o pobjedi
 * @author Amra
 *
 */
public class Ratings {

	private double speed;
	private double pass;
	private double headHitting;
	private double shooting;
	
	/**
	 * Konstruktor koji pravi ocjene igraca
	 * @param speed = brzina igraca
	 * @param pass = sposobnost dodavanja lopte
	 * @param headHitting = sposobnost udaranja glavom
	 * @param shootin = sposobnost dodavanje loptom
	 */
	public Ratings (){
		this.speed= (double)(1+Math.random() *50);
		this.pass=(double)(1+Math.random() *100);
		this.headHitting=(double)(1+Math.random() *10);
		this.shooting=(double)(1+Math.random() *20);
	}
	
	public double sumRatings(){
		double sumRatings = this.speed + this.pass + this.headHitting + this.shooting;
		return sumRatings;
	}
	
	/**
	 * Metoda koja vraca random vrijednosti srece atributa klase
	 * @return vraca nasumicne vrijednosti brzine, sposbnosti dodavanja, udaraca glavom i dodavanja lopte
	 */
//	public Ratings playerLuck (){
//		int min = (int)Math.random()*3;                // min = od 0 do 3
//		int max = (int)(5 + Math.random()*10-(5-1));   // max = od 5 do 10
//		this.speed = (max - min)* speed;
//		this.pass= (max - min)* pass;
//		this.headHitting= (max - min)* headHitting;
//		this.shooting= (max - min)* shooting;
//		
//		return this;
//	}
	/**
	 * Metoda koja vraca u String sve atribute klase
	 */
	public String toString(){
		String str="";
		str+= "Brzina: " +speed;
		str+= "Broj dodavanja: " +pass;
		str+= "Udarci glavom: " +headHitting;
		str+= "Shooting: " +shooting;
		
		return str;
		
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPass() {
		return pass;
	}

	public void setPass(double pass) {
		this.pass = pass;
	}

	public double getHeadHitting() {
		return headHitting;
	}

	public void setHeadHitting(double headHitting) {
		this.headHitting = headHitting;
	}

	public double getShooting() {
		return shooting;
	}

	public void setShooting(double shooting) {
		this.shooting = shooting;
	}

	/**
	 * Metoda koja vraca dali su atributi klase jednaki sa atributima druge klase tj. da li su objekti jednaki
	 * @param other = drugi objekat sa kojim vrsimo poredjenje
	 * @return vraca 'da' ako su objekti jednaki i li 'ne' ako objekti nisu jednaki
	 */
	public boolean equals (Ratings other){
		if (this.speed==other.speed && this.pass==other.pass && this.headHitting==other.headHitting && this.shooting==other.shooting)
			return true;
		return false;
		
	}
	
}
