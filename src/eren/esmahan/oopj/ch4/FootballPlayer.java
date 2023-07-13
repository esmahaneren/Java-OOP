package eren.esmahan.oopj.ch4;

public class FootballPlayer {
	
	public int no;
	 public String name;
	 public boolean inPlay;
	 public int minutes;
	 public int numberOfGoals;
	 
	 public void play(int newMinutes) {
		 
		 minutes+=newMinutes;
	 }
	  
	 public void goals() {
		 
		   numberOfGoals++;
		 
	 }

}
