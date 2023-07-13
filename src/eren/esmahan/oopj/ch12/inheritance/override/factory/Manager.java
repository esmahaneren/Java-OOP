package eren.esmahan.oopj.ch12.inheritance.override.factory;

public class Manager extends Employee{

	protected String managedDepartment;
	public static final int MANAGED_SALARY=6000;
	
	
	public Manager(int no,String name,int year,String department,String managedDepartment) {
		super(no,name,year,department);
		this.managedDepartment=managedDepartment;
	}
	
	@Override
	public double calculateSalary() {
		
		//return (BASE_SALARY*year)+MANAGED_SALARY;
		return super.calculateSalary()+MANAGED_SALARY;
	}
	
	public void work() {
		System.out.println("Manager is working!");
		manage();
	}
	
	public void manage() {
		System.out.println("Manager is maneges department "+managedDepartment);
		
	}
	@Override 
	public void printInfo() {
		//System.out.println("\nNo:"+no);
		//System.out.println("Name:"+name);
		//System.out.println("Year:"+year);
		//System.out.println("Department:"+department);
		super.printInfo();
		System.out.println("Managing Department:"+managedDepartment);
		
	}
}
