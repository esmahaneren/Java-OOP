package eren.esmahan.oopj.ch9.Bank;

public class CreditCard {

	String no;
	double balance;
	Customer owner;
	
	
	CreditCard(String no,double balance,Customer owner){
		this.no=no;
		this.balance=balance;
		this.owner=owner; //cc1.setOwner(c1)==>cc1.owner=c1
		owner.setCC(this);//c1.setCC(cc1)==>c1.cc=cc1
		
	}

		
		
		
	
}
