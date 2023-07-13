package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;

public class RegistrationOfficeTest {

	public static void main(String[] args) {


		RegistrationOffice register=new RegistrationOffice();
		Student student1=register.getAStudent();
		student1.register();
		System.out.println();
		Student student2=register.getAStudent();
		student2.register();
		System.out.println();
	
		Student student4=new MasterStudent(3, "Sefa", 2, "09.09.1998", "Faculty of Law", "Erdoğan Eren","Crown Law" );
		student4.study();
		
		MasterStudent student5=new MasterStudent(3, "Sefa", 2, "09.09.1998", "Faculty of Law", "Erdoğan Eren","Crown Law" );
		student5.meetWithAdvisor();
	}

}
