package eren.esmahan.oofp.ch1.polymorphism;

import eren.esmahan.oopj.ch12.inheritance.override.factory.*;

public class PayrollOffice {

	
	public void paySalary(Employee employee) {
		
		double salary=employee.calculateSalary();
		System.out.println("Paying a salary of "+salary+" to "+employee.getName());
		
		
	}
	
	
	
}
