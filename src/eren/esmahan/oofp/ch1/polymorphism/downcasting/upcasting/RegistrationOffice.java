package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;

public class RegistrationOffice {
	

	public Student getAStudent() { //upcasting
		
		Student student=null;
		
		int i=(int)(Math.random()*4);
		
		switch(i) {
		
		case 0:
			student=new UndergraduateStudent(1, "Sadullah", 4, "18.07.2000", "Computer Engineer", "Artificial Intelligence");
		    break;
		
		case 1:
			student=new GraduateStudent(2, "Esmahan", 3, "09.04.1996", "Electrical Engineer", "Akın Kaldıroğlu", " Cybernetics.");
		     break;
		
		case 2:
			student=new MasterStudent(3, "Sefa", 2, "09.09.1998", "Faculty of Law", "Erdoğan Eren","Crown Law" );
			break;
			
		case 3:
			student=new PhdStudent(4, "Anıl", 1, "17.03.1996", "Mechanical Engineer", "Zeynep Nilüfer", "Control systems", true);
			break;
			
		}
		return student;
		
	}
	
	public void registerStudent(Student student) { //downcasting
		
		if(student  instanceof PhdStudent phds) {
			phds.register();
		}
		
		 if(student instanceof MasterStudent ms) {
			ms.register();
		}
		 
		else if(student instanceof GraduateStudent gs) {
				gs.register();
			}
			
	    else if(student instanceof UndergraduateStudent ugs) {
			ugs.register();
		}
		
	}
}
