package eren.esmahan.oopj.ch4;

public class FootballPlayerTest {

	public static void main(String[] args) {
	
     FootballPlayer alex=new FootballPlayer();
     
           alex.no=10;
           alex.name="Alex de Souza";
           alex.inPlay=true;
           alex.minutes=0;
           alex.numberOfGoals=0;
           
           alex.play(90);
           alex.goals();
           alex.goals();
           
           
           System.out.println("Alex'in attığı toplam gol sayısı:"+ alex.numberOfGoals);
           System.out.println("Alex'in oynadığı toplam süre:"+alex.minutes);
           
	
		
	}

}


