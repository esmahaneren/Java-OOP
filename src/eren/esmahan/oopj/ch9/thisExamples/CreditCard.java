package eren.esmahan.oopj.ch9.thisExamples;

public class CreditCard {
	
	String no;
	double balance;
	Customer owner;
	

	
	public CreditCard(String no,double balance,Customer owner) {
		this.no=no;
		this.balance=balance;
		this.owner=owner; 
		owner.setCreditCard(this);
	}
	
	public void setOwner(Customer owner) {
		this.owner=owner;
	}
}
