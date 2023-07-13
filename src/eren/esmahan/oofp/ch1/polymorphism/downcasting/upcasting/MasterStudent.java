package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;



public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		
	}

	@Override
	public void study() {
		System.out.println("Student "+name+" studying for the master degree");
	}

	@Override
	public void register() {
		
		System.out.println("The registration of the student whose information is given below has been completed.");
		String s=toString();
		System.out.println(s);
	}

	@Override
	public void meetWithAdvisor() {
		
		super.meetWithAdvisor();
	}

	@Override
	public String toString() {
		return "MasterStudent [advisor=" + advisor + ", thesis=" + thesis + ", no=" + no + ", name=" + name + ", year="
				+ year + ", dob=" + dob + ", major=" + major + "]";
	}
 
	
}
