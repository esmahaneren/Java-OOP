package eren.esmahan.oopj.ch5.flowcontrol;

public class FizzBuzz {



	public static void main(String[] args) {
		
       fizzBuzz();
	}
      public static void fizzBuzz() {
    	  
    	  for(int i=1; i<=100; i++) {
    		  
    		  if((i%3==0) && (i%5==0)){
				  System.out.println("i=" +i +"FizzBuzz");
    			  }
    		  	  else if(i%5==0) {
    				  System.out.println("i="+i+"Buzz");
    			  } 
    				  else if(i%3==0){
    					  
    					  System.out.println("i="+i+"Fizz");
    				  }
    				  else{
    					  System.out.println("i="+ i );
    				  }  }	} }
    	  
    	  
    	  
    		  


