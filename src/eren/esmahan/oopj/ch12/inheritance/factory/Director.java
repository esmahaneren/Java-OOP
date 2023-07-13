package eren.esmahan.oopj.ch12.inheritance.factory;

public class Director extends Manager {
	
	protected double bonus;
	
	public Director(int no,String name,int year,String department,String departmentManaged,double bonus) {
		super(no,name,year,department,departmentManaged);
		this.bonus=bonus;
		
	}

}
