
public class Player {

	private String name;
	private String surname;
	private int num;
	
	/**
	 * Konstruktor koji prima ime, prezime i broj igraca i fromira igraca
	 */
	public Player (String name, String surname, int num){
		this.name=name;
		this.surname=surname;
		this.num=num;
	}

	/**
	 * Getter koji vraca ime
	 * @return = novo ime
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter koji posavlja novo ime
	 * @param name = novo ime
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter koji vraca prezime
	 * @return novo prezime
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Setter koji postavlja novo prezime
	 * @param surname = novo prezime
	 */

	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Getter koji postavlja broj igraca
	 * @return
	 * @throws Exception ako je broj igraca manji od 0
	 */
	public int getNum() throws Exception{
		if ( num<=0){
			throw new IllegalAccessException("Broj ne moze biti manji od nula!");
		} else {
			this.num=num;
		}
		return num;
	}

	/**
	 * Setter koji postavlja broj igraca
	 * @param num = postavlja broj igraca
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * Metoda koja vraca sve vrijednosti iz kalse u string
	 */
	public String toString(){
		String str="";
		str+= "Ime igraca: " + name;
		str+= "Prezime igraca: " + surname;
		str+= "Broj: " + num;
		return str;
	}
	
	/**
	 * Metoda koja provjerava da li su svi atributi klase jednaki, tj. da li je objekat jedank drugom objektu
	 */
	public boolean equal(Player other){
		if (this.name==other.name && this.surname==other.surname && this.num==other.num){
			return true;
		}
		return false;
	}
	
	public Player copy(Player other){
		this.name=other.name;
		this.surname=other.surname;
		this.num=other.num;
		
		return this;
	}
	
	
}
