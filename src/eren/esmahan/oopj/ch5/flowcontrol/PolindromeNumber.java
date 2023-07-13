package eren.esmahan.oopj.ch5.flowcontrol;

public class PolindromeNumber {

	public static void main(String[] args) {
		
		PolindromeNumber polindrome1=new PolindromeNumber();
		polindrome1.threeDigitNumbers();
		
	}

	 void threeDigitNumbers() {
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 
	 here: for(int i=999_999; i>=100_000; i--) {
		
			a=(i/100_000);
			b=(i/10_000)%10;
			c=(i/1000)%10;
			d=(i/100)%10;
			e=(i/10)%10;
			f=i%10;
			
			   if(a==f && b==e && c==d) {
			    	
			   	 for(int j=999;j>=100; j-- ) {
			    	for(int k=999;k>=100; k--) {
			    		if(j*k==i) {
			    		  System.out.println(i);
			    		  System.out.println(j+"*"+k);
			    		  break here;
			    			}}	}  }
		
			  
			    
	 }
			
	 }
		 
		 
} 
		 
	 