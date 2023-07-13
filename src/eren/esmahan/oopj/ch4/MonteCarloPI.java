package eren.esmahan.oopj.ch4;
import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of points to be assigned in the circle:");
		int pointNumber=sc.nextInt();
		int numberInCircle=0;
		
		long startTime=System.currentTimeMillis();
		
		 for(int i=0;i<pointNumber; i++) {
			  double x=Math.random();
			  double y=Math.random();
			  double distance=(x*x +y*y);
			   if(distance<=1) {
				   numberInCircle++;
			   }  }
		 
		  long stopTime=System.currentTimeMillis();
		  long time=stopTime-startTime;
		  
          double myPI=4.0* numberInCircle/pointNumber;
          System.out.println("My PI is:"+ myPI);
          System.out.println("JAVA's PI is:"+ Math.PI);
          System.out.println("Time: "+time+ "ms.");
		  
	}

}
