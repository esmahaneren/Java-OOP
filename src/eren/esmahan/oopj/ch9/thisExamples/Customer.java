package eren.esmahan.oopj.ch9.thisExamples;

public class Customer {

	int id;
	String name;
	CreditCard cc;
	
	
	public Customer(int id,String name) {
		
		this.id=id;
		this.name=name;
		
	}
	public void setCreditCard(CreditCard cc) {
		
		this.cc=cc;
	}
}
