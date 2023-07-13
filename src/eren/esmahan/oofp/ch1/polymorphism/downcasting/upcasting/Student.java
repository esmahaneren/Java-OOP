package eren.esmahan.oofp.ch1.polymorphism.downcasting.upcasting;



public class Student {

	protected int no;
	protected String name;
	protected int year;
	protected String dob;
	protected String major;
	
	
	public Student(int no,String name,int year,String dob,String major) {
		this.no=no;
		this.name=name;
		this.year=year;
		this.dob=dob;
		this.major=major;
	}
	public void study() {
	
	}
	public void register() {
		System.out.println("The registration of the student whose information is given below has been completed.");
		String s=toString();
		System.out.println(s);
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	
}
