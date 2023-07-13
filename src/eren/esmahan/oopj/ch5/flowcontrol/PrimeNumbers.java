package eren.esmahan.oopj.ch5.flowcontrol;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	    PrimeNumbers pn=new PrimeNumbers();
	    Scanner sc=new Scanner(System.in);
	    
	   System.out.println("Please enter positive integer:");
	    long number=sc.nextLong();
	   
	     
	      pn.isPrime(number);
	 //  System.out.println(pn.isPrime(number));
	   // pn.countNumberOfPrimesUpTo(number);
	      pn.largestPrime(number);
	    
	   	  }
    		 
	     void countNumberOfPrimesUpTo(long number) {
	    	 
	    	long sum=0;
	    	 for(long i=2; i<number;i++) {
	    		 boolean prime=isPrime(i);
	    		 if(prime) {
	    			 System.out.println(i);
	    			    sum+=i;
	    	 }	 }
	    	
	    	 System.out.println("Prime number's sum up to number:"+sum);
	     }
	    boolean isPrime(long number) {
	    	
	    	boolean prime=true;
	    	   for(long i=2; i<number; i++) {
	    		   if(number%i==0) {
	    			   prime=false;
	    			   break;
	    	   }  }	
	    	 return prime; 
	     
	    }   
	
	    public void largestPrime(long number) {
	    	long factors=1;
	    	for(long i=2; i<number; i++) {
	    		boolean prime=isPrime(i);
	    		if(number%i==0) {
	    			System.out.println(i);
	    			  factors=factors*i;
	    			  if(factors==number) {
	    				  System.out.println("factors: "+factors);
	    				  break;
	    				}
	    			  }
	    			 
	    				}
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    		
	    	
	    	
	    }
	     

	    	 
	    	 
	     

