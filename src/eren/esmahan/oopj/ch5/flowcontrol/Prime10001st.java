package eren.esmahan.oopj.ch5.flowcontrol;

public class Prime10001st {

	public static void main(String[] args) {
	
		boolean prime=true;
		
		for(int i=2;i>0; i++) {
			for(int j=2; j<=i; j++) {
				if(j%i==0) {
					prime=false;
					break ;
				}}
			if(prime) {
				System.out.println(i);
			}
		}
			

	}

}
