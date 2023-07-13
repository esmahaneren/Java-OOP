package eren.esmahan.oopj.ch5.flowcontrol;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		RockPaperScissors game=new RockPaperScissors();
		Scanner sc=new Scanner(System.in);
		 
		  System.out.println("Please enter the number of the option you selected");
     	  
     	  while(true) {
     		 System.out.println("1=Rock\n"
	  		                   + "2=Paper\n"
	  		                   + "3=Scissors\n"
	  		                   + "4= EXİT");
     		                  
	  
		   int usersChoice=sc.nextInt();
		   int computersChoice=(int) Math.random()*3;
		   
		   if(usersChoice==1) {
			   if(computersChoice==1) {
				   System.out.println("TIE");
			      }
				   else {
					   System.out.println("You WİN");
				   } }
		   else if(usersChoice==2) {
			     if(computersChoice==1) {
			    	 System.out.println("You WİN");
			     }
			     else if(computersChoice==2) {
			    	 System.out.println("TIE");
			     }
			     else {
			    	 System.out.println("You LOOSE");
			     }    }
		   else if(usersChoice==3) {
			     if(computersChoice==1) {
			    	System.out.println("You LOOSE");
			     }
			     else if(computersChoice==2) {
			    	System.out.println("You WİN");
			     }
			     else {
			    	 System.out.println("TIE");
			    }  } 
		   else {
			   break;
		   }
		   
     	  }
		   
		   
		   
		   
			
	  }

}
