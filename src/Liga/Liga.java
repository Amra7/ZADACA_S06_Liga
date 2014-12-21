package Liga;
import java.util.Arrays;

/**
 * Klasa Liga ima odredjeni broj timova (x timova) U ligu se mogu dodavati
 * timovi i mogucnost simuliranja lige je npr. metoda zapocni ligu. Prvi clan
 * lige je prvi tim igra utaksmicu sa jos nekim clanom lige i pobjeda se racuna
 * na osnovu sposobnosti igraca
 * 
 * @author Amra
 *
 */
public class Liga {

	private Team[] liga;

	public Liga(Player[] tim, String nameTeam) {
		liga = new Team[tim.length];
	}

	public Team[] getLiga() {
		return liga;
	}

	public void setLiga(Team[] liga) {
		this.liga = liga;
	}

	public double fortuneCookie(Player[] tim) {
		int min = (int) Math.random() * 3; // min = od 0 do 3
		int max = (int) (5 + Math.random() * 10 - (5 - 1)); // max = od 5 do 10
		double luck = (max - min) * palyersRatings(tim);
		return luck;
	}

	@Override
	public String toString() {
		return "Liga [liga=" + Arrays.toString(liga) + ", getLiga()="
				+ Arrays.toString(getLiga()) + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
