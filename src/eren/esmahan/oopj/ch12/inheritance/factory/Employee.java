package eren.esmahan.oopj.ch12.inheritance.factory;

public class Employee {

	
    protected int no;
	protected String name;
	protected int year;
	protected String department;
	
    public static final int BASE_SALARY=500;
	
	public Employee(int no,String name,int year,String department) {
		
		this.department=department;
		this.name=name;
		this.no=no;
		this.year=year;
	}
	
	public static int getBaseSalary() {
		return BASE_SALARY;
	}
	public double calculateSalary() {
		return BASE_SALARY*year;
	}
	public void printInfo() {
		System.out.println("\nNo: "+no);
		System.out.println("Name: "+name);
		System.out.println("Year:"+year);
		System.out.println("Department:"+department);
	
	}
	public void work() {
		System.out.println("Employee is working right now.");
	}
}
