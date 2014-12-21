package StudentiZadaca;

/*
 * Zadaci za samostalni rad
 * Ucionica BitCampa
 */


public class StudentBITCamp {
	public static void main(String[] args) {
		
		
		
		Student s1 = new Student("Jesenko"," Gavric");
		Student s2 = new Student("Sanela", " Grcic");
		Student s3 = new Student("Amra", " Poprzanovic");
		Student s4 = new Student("Gorjan", " Kalauzovic");
		Student s5 = new Student("Davor", " Stankovic");
		Student s6 = new Student("Emir", " Imamovic");
		Student s7 = new Student("Nedzad", " Hamzic");
		Student s8 = new Student("Haris", " Arifovic");
		Student s9 = new Student("Selma", " Tabakovic");
		Student s10 = new Student("Adnan", " Spahic");
		Student s11= new Student("Neldin", " Dzeko");
		Student s12 = new Student("Nermin", " Graca");
		Student s13 = new Student("Haris", " Krkalic");
		Student s14 = new Student("Gordan", " Sajevic");
		Student s15 = new Student("Edib", " Imamovic");
		Student s16 = new Student("Mustafa", " Admerovic");
		Student s17 = new Student("Nermin", " Vucinic");
		Student s18 = new Student("Mirza", " Becic");
		Student s19 = new Student("Hikmet", " Durgutovic");
		Student s20 = new Student("Nedim", " Omerovic");
		Student s21 = new Student();
		Student s22 = new Student();
		Student s23 = new Student("Vedad", " Zornic");
		Student s24 = new Student("Emina", " Muratovic");
		
		Student [] studenti = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24};

		Student[][] ucionica = new Student[6][4];

		popuniUcionicu(ucionica,studenti);
		print(ucionica);

	}

	/**
	 * Funkcija koja popunjava dvodimenzionalni niz ucionisa sa objektima
	 * student
	 * 
	 * @param ucionica
	 *            = dvodimenzionalni niz ucionza sa imenima i prezimenima
	 *            studenata
	 */

	// ne radi mi ovo kako treba, a ne mogu da skontam gresku

	public static void popuniUcionicu(Student[][] ucionica,Student [] studenti) {
		 int k=0;
		for (int i = 0; i < ucionica.length; i++) {
			for (int j = 0; j < ucionica[i].length; j++) {
                
				ucionica[i][j] = studenti[k];
                k++;
			}
			System.out.println();
		}
	}

	/**
	 * Funkcija koja ispisuje - dvodimenzionalni niz objekata - ucionica
	 * 
	 * @param ucionica
	 */

	public static void print(Student[][] ucionica) {

		for (int i = 0; i < ucionica.length; i++) {
			for (int j = 0; j < ucionica[i].length; j++) {
				System.out.printf("%s   \t|",  ucionica[i][j]);
			}
			System.out.println();
		}
	}

}
