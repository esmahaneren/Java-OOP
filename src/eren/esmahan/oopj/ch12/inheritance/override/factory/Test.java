package eren.esmahan.oopj.ch12.inheritance.override.factory;
import eren.esmahan.oofp.ch1.polymorphism.*;
public class Test {

	public static void main(String[] args) {
	
		Employee e1=new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
	    System.out.println("Salary:"+e1.calculateSalary());
		e1.work();
		
		Manager m1=new Manager(2, "Ayşe", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Salary:"+m1.calculateSalary());
		m1.work();
		
		
		Director d1=new Director(3, "Esma", 2, "Management", "Management", 2000);
		d1.printInfo();
		System.out.println("Salary:"+d1.calculateSalary());
		d1.work();
		
		PayrollOffice payrollOffice=new PayrollOffice();
		
		payrollOffice.paySalary(e1); 
		payrollOffice.paySalary(m1); //Polymorphism and upcasting  => Employee employee=m1(new Manager())
		payrollOffice.paySalary(d1); //Polymorphism and upcasting 
		
		
		Employee e2=new Manager(5, "Kübra", 1, "IT", "IT");
		e2.work(); // working as a manager
		e2.printInfo();
		payrollOffice.paySalary(e2);

	}

}
