package eren.esmahan.oopj.ch12.inheritance.factory;

public class Test {

	public static void main(String[] args) {
	
		Employee employee1=new Employee(1,"Ali",5,"Production");
		employee1.printInfo();
		System.out.println("Salary:"+employee1.calculateSalary());
		
		Manager manager1=new Manager(2, "Ayşe", 3, "Production", "Production");
		manager1.printInfo();
		System.out.println("Salary:"+manager1.calculateSalary());
		
		
		Director director1=new Director(3, "Esma", 8, "Management", "Management" ,1000.0);
		director1.printInfo();
		System.out.println("Salary:"+director1.calculateSalary());
		
	//	accessStaticMembers(employee1,manager1,director1);
		
	}
	public static void accessStaticMembers(Employee employee1,Manager manager1,Director director1) {
		
		System.out.println(Employee.BASE_SALARY);
		System.out.println(Manager.BASE_SALARY);
		System.out.println(Director.BASE_SALARY);
		System.out.println();
		System.out.println(Employee.getBaseSalary());
		System.out.println(Manager.getBaseSalary());
		System.out.println(Director.getBaseSalary());
		System.out.println();
		System.out.println(Manager.MANAGED_SALARY);
		System.out.println(Director.MANAGED_SALARY);
		
	}

}
				