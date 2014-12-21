package Liga;

public class GameTest {
public static void main(String[] args) {
	
	Player p1 = new Player ("Mirza" ,"B", 7);
	Player p2 = new Player ("Adnan" ,"S", 3);
	Player p3 = new Player ("Emir" ,"I", 8);
	Player p4 = new Player ("Davor" ,"S", 11);
	Player p5 = new Player ("Nermin" ,"G", 6);
	Player p6 = new Player ("Jesenko" ,"G", 23);
	Player p7 = new Player ("Edib" ,"I", 15);
	Player p8 = new Player ("Nedzad" ,"H", 7);
	Player p9 = new Player ("Haris" ,"A", 4);
	Player p10 = new Player ("Vedad" ,"V", 17);
	Player p11 = new Player ("Mustafa" ,"A", 14);
	
	p1.getRatings();
	p2.getRatings();
	p3.getRatings();
	p4.getRatings();
	p5.getRatings();
	p6.getRatings();
	p7.getRatings();
	p8.getRatings();
	p9.getRatings();
	p10.getRatings();
	p11.getRatings();
	
	Team BitCamp = new Team ("Campovci", "Sarajevo");
	BitCamp.addPlayer(p1);
	
}
}
