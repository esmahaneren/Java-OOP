package eren.esmahan.oopj.ch12.inheritance.override.factory;

public class Director extends Manager {
	
	protected double bonus;
	

	public Director(int no,String name,int year,String department,String managedDepartment,double bonus) {
		super(no,name,year,department,managedDepartment);
		this.bonus=bonus;
	}
	@Override
	public double calculateSalary() {
		//return (BASE_SALARY*year)+MANAGED_SALARY+bonus;
		return super.calculateSalary()+bonus;
	}
	
	public void work() {
		System.out.println("Director is working");
		manage();
	}
	public void manage() {
		System.out.println("Director managing whole factory");
		makeStrategicPlan();
	}
	
	public void makeStrategicPlan() {
		System.out.println("Director is making strategic plans for the factory");
	}
	@Override
	public void printInfo() {
	//	System.out.println("\nNo:"+no);
	//	System.out.println("Name:"+name);
	//	System.out.println("Year:"+year);
	//	System.out.println("Department:"+department);
	//	System.out.println("Managing Department:"+managedDepartment);
		super.printInfo();
		System.out.println("Bonus:"+bonus);
	}
}
