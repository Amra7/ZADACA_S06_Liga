package Liga;
import java.util.Arrays;
/**
 * Klasa Team(Tim) koja u sebi sadrzi tim igraca,  ime tima, grad iz kojeg je tim
 * @author Amra
 *
 */

public class Team {

	private Player [] tim;
	private String nameTeam;
	private String cityOfTeam;
	private Person [] staff;
	private int numStaff;
	
	public Team (String nameTeam,String cityOfTeam){
		tim = new Player [11];
		this.nameTeam=nameTeam;
		this.cityOfTeam=cityOfTeam;
		this.staff= new Person [2];
		this.numStaff=0;
				
	}
	/**
	 * Konstruktor koji pravi tim
	 * @param tim = niz igraca koji su u timu
	 * @param nameTeam = ime tima
	 */
	public Team ( Player [] tim, String nameTeam,String cityOfTeam,String name, String surname, String contact, String roleInTeam){
		super();
		tim = new Player [11];
		this.nameTeam=nameTeam;
		this.cityOfTeam=cityOfTeam;
		this.staff= new Person [2];
		this.numStaff=0;
				
	}
	/**
	 * Metoda kojom dodajemo igraca u tim
	 * @param name = ime igraca
	 * @param surname = prezime igraca
	 * @param num = broj igraca
	 */
	public void addPlayer ( Player other){
		for( int i=0; i<11; i++){
			tim [i] = new Player (other);	
		}
		
	}
	
	public double palyersRatings(Player [] tim){
		double sumRatInTeam = 0;
		for ( int i=0; i < tim.length; i++){
			sumRatInTeam+= tim[i].sumRating();
		}
		return sumRatInTeam;
	}

	@Override
	public String toString() {
		return "Team [tim=" + Arrays.toString(tim) + ", nameTeam=" + nameTeam
				+ ", cityOfTeam=" + cityOfTeam + ", staff="
				+ Arrays.toString(staff) + ", numStaff=" + numStaff
				+ ", getTim()=" + Arrays.toString(getTim())
				+ ", getNameTeam()=" + getNameTeam() + ", getCityOfTeam()="
				+ getCityOfTeam() + ", getStaff()="
				+ Arrays.toString(getStaff()) + ", getNumStaff()="
				+ getNumStaff() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Player[] getTim() {
		return tim;
	}

	public void setTim(Player[] tim) {
		this.tim = tim;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public String getCityOfTeam() {
		return cityOfTeam;
	}

	public void setCityOfTeam(String cityOfTeam) {
		this.cityOfTeam = cityOfTeam;
	}

	public Person[] getStaff() {
		return staff;
	}

	public void setStaff(Person[] staff) {
		this.staff = staff;
	}

	public int getNumStaff() {
		return numStaff;
	}

	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}

	/**
	 * Metoda koja prosiruje niz 
	 * u ovom slucaju pri dodavanju osobblja u niz, ako broj osoblja predje broj 2 povecava se niz
	 */
	private void resizePerson(){
		int newLenght= staff.length*2;
		Person[] temp = new Person[newLenght];
		for ( int i=0; i<temp.length; i++){
			temp[i]=staff[i];
		}
		staff=temp;
		
	}
	
	/**
	 * Funkcija koja dodaje osobu u niz osoblja koji su u timu
	 * @param name = ime osobe koju dodajemo
	 * @param surname =  prezime osobe koju dodajemo
	 * @param contact = kontakt osobe -email
	 * @param roleInTeam = uloga osobe u timu
	 */
	private void addPerson (String name, String surname, String contact, String roleInTeam){
		staff[numStaff] = new Person(name,surname,contact,roleInTeam);
		numStaff++;
		if( numStaff == staff.length){
			resizePerson();
		}
		
	}
}
