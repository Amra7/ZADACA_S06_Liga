package Liga;
/**
 * Klasa Person(osoba) predstavlja ljude koji rade u timu
 * Sastoji se od ime osobe, preszime osobe, kontakt( email) i uloge koju radi u timu
 * @author Amra
 *
 */
public class Person {

	private String name;
	private String surname;
	private String contact;
	private String roleInTeam;
	
	/**
	 * Konstruktor koji pravi osobu ( clan Stuff-a) dodjeljujuci ime, prezime, kontakt te osobe i ulogu u timu
	 */
	public Person (String name, String surname, String contact, String roleInTeam){
		this.name=name;
		this.surname=surname;
		this.contact=contact;
		this.roleInTeam=roleInTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRoleInTeam() {
		return roleInTeam;
	}

	public void setRoleInTeam(String roleInTeam) {
		this.roleInTeam = roleInTeam;
	}
	
	/**
	 * Metoda koja vraca u String sve atribute klase
	 */
	public String toString (){
		String str="";
		str +="Osoba: ";
		str +="Ime: " +name;
		str +="Prezime: " +surname;
		str +="Kontakt: " +contact;
		str +="Uloga: " +roleInTeam;
		
		return str;
		}
	/**
	 * Metoda koja poredi atribute jednog objekta sa atributima drugog objekta
	 * @param other = drugi objekat
	 * @return vrada 'true' ako su objekti (atributi) jednaki i 'false' ako nisu
	 */
	public boolean equlas(Person other){
		if ( this.name==other.name && this.surname==other.surname && this.roleInTeam==other.roleInTeam && this.contact==other.contact)
			return true;
		return false;
	}
}
