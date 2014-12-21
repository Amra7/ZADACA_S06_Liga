package StudentiZadaca;

/*
 * Zadacai za samostalni rad
 * Clasa Studenti koja sadrzi samo ime i prezime studenata
 */

public class Student {

	private String ime;
	private String prezime;
	
	public Student() {
		this.ime = "ime";
		this.prezime = "prezime";

	}

	public Student(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String toString() {
		String str = "";
		str += ime + prezime;
		return str;
	}

}
