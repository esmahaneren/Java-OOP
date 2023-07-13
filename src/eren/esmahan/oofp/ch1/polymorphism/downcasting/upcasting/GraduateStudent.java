package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;



public class GraduateStudent extends Student {
	protected String advisor;
	protected String thesis;
	
	public GraduateStudent(int no, String name, int year, String dob, String major,String advisor,String thesis) {
		super(no, name, year, dob, major);
		this.advisor=advisor;
		this.thesis=thesis;
		
	}
	@Override
	public void study() {
		System.out.println("Not studying.Graduate from universty and looking for a job");
	}
   @Override
	public void register() {
		System.out.println("Uneble to register.You are already graduated from univesty");
	}
   
    public void writeThesis() {
	   System.out.println("Student wrote the thesis on "+thesis);
   }
    public void meetWithAdvisor() {
    	System.out.println("Student "+name+"meet with the advisor teacher "+ advisor);
    	
    }
}
