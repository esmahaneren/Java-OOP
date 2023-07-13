package eren.esmahan.oopj.ch9.Static;

public class Counter {

	 static int counter=0;
	 // int counter=0; 
	
	public Counter() {
		
		counter++;
		System.out.println(counter);
		
		
	}
	
	public static void main(String[] args) {
	
         Counter x1=new Counter();
         Counter x2=new Counter();
       

		
	}


}
