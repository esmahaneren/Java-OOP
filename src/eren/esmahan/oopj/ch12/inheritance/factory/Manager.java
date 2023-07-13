package eren.esmahan.oopj.ch12.inheritance.factory;

public class Manager extends Employee {
	

	protected String departmentManaged;
	
	public static final int MANAGED_SALARY=5000;
	
	public Manager(int no,String name,int year,String department,String departmentManaged) {
		super(no,name,year,department);
		this.departmentManaged=departmentManaged;
		
	}

}
