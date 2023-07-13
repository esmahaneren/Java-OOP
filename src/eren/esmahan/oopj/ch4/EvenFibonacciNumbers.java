package eren.esmahan.oopj.ch4;
import java.util.Scanner;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		EvenFibonacciNumbers fn=new EvenFibonacciNumbers();
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("Please enter the number:");
		long number=sc.nextLong();
	
		fn.fibonacciNumbers(number);
	}

	  public void fibonacciNumbers(long number) {
		  long sum=0;
		  long number1=1;
		  long number2=1;
		  //System.out.println(number1);
		for(long i=1; i<number; i++) { 
		
			long number3=number1+number2;
			number1=number2;
			number2=number3;
			if(number3>=4000000) {
				break;
			}
			System.out.println(number3);
			if(number3%2==0) {
				//System.out.println(number3);
				sum+=number3;
				
			}
			
		}System.out.println("Sum:"+sum);
		  
		      
		  }
		
			   
		   }
		  
		  
	  
	
	

