package eren.esmahan.oopj.ch5.flowcontrol;

public class SmallestMultible {

	public static void main(String[] args) {
	
		int counter=0;
	here:	for(int i=10; i>0; i++) {
			for(int j=1; j<=20; j++) {
				if(i%j==0) {
					counter++;
					if(counter==20) {
						System.out.println(i);
						break here;
					}
				}
				else {
					counter=0;
				}
				
			}
		}
		

	}

}
