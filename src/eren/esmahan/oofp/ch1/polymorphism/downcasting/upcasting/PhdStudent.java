package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;



public class PhdStudent extends GraduateStudent{

	protected boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, String dob, String major, String advisor, String thesis,boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		 this.qualifyingExamTaken=qualifyingExamTaken;
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	@Override
	public void study() {
     	System.out.println("Studying for the Php degree.");
	}

	@Override
	public void register() {
		if(isQualifyingExamTaken()) {
			System.out.println("The registration of the student whose information is given below has been completed.");
		    String s=toString();
		    System.out.println(s);
		}
		else {
			System.out.println("You can't register without passing the qualifying exam");
		}
	}

	public void writePaper() {
		
		System.out.println(name+ "writing a akademic paper about "+major);
	}

	@Override
	public String toString() {
		return "PhdStudent [qualifyingExamTaken=" + qualifyingExamTaken + ", advisor=" + advisor + ", thesis=" + thesis
				+ ", no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	
	
	
	
}
