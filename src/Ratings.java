
public class Ratings {

	private int speed;
	private int pass;
	private int headHitting;
	private int shooting;
	
	/**
	 * Konstruktor koji pravi ocjene igraca
	 * @param speed = brzina igraca
	 * @param pass = sposobnost dodavanja lopte
	 * @param headHitting = sposobnost udaranja glavom
	 * @param shootin = sposobnost dodavanje loptom
	 */
	public Ratings (int speed, int pass, int headHitting, int shootin){
		this.speed=speed;
		this.pass=pass;
		this.headHitting=headHitting;
		this.shooting=shooting;
	}
	
	/**
	 * Metoda koja vraca random vrijednosti srece atributa klase
	 * @return vraca nasumicne vrijednosti brzine, sposbnosti dodavanja, udaraca glavom i dodavanja lopte
	 */
	public Ratings playerLuck (){
		int min = (int)Math.random()*3;
		int max = (int)(5 + Math.random()*10-(5-1));
		this.speed = (max - min)* speed;
		this.pass= (max - min)* pass;
		this.headHitting= (max - min)* headHitting;
		this.shooting= (max - min)* shooting;
		
		return this;
	}
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
