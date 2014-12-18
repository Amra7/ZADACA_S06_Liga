
public class Team {

	private Player [] tim;
	private String nameTeam;
	private String cityOfTeam;
	private Person [] staff;
	
	
	public Team (Player [] tim, String nameTeam){
		tim = new Player [11];
		this.nameTeam=nameTeam;
		this.cityOfTeam=cityOfTeam;
		this.staff= new Person [2];
				
	}
	
    public void addPerson(){
    	
    }
	private void resizePerson(){
		int newLenght= staff.length*2;
		Person[] temp = new Person[newLenght];
		for ( int i=0; i<temp.length; i++){
			temp[i]=staff[i];
		}
		staff=temp;
		
	}
	
	private void addPerson (Person newPerson){
		
	}
}
