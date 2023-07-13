package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;



public class UndergraduateStudent extends Student {
	
	protected String minor;
	
	
	public UndergraduateStudent(int no,String name,int year,String dob,String major,String minor) {
		super(no,name,year,dob,major);
		this.minor=minor;
	}

	public void study() {
		System.out.println("Didn't graduate from universty continues to study");
		System.out.println("Student's major branch is "+major+"and minor branch is "+minor);
		
	}
	@Override
	public void register() {
		System.out.println("The registration of our student has been successfully completed.");
		String s=toString();
		System.out.println(s);
		
	}
	@Override
	public String toString() {
		return "UndergraduateStudent [minor=" + minor + ", no=" + no + ", name=" + name + ", year=" + year + ", dob="
				+ dob + ", major=" + major + "]";
	}
	

}
