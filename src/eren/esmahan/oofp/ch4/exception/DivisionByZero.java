package eren.esmahan.oofp.ch4.exception;

public class DivisionByZero {

	public static void main(String[] args) {
		
		try{
			divide(20,0);
		}
		catch(ArithmeticException e) {// if there is a not exception this block dosent work 
			System.out.println("Message: " + e.getMessage());//handling in here
			divide(20, 5);
			
		}
		
		
	}

	public static void divide(int number1,int number2)  throws ArithmeticException{// or not throws(unchecked exp.)
		System.out.println("in divide() with arguments: " + number1 + " and " + number2);
		if(number2==0) {
			throw new ArithmeticException("You can not enter zero as a divisior"); //raising
			
		}
		else {
			int division = number1 / number2;
			System.out.println(number1 + "/" + number2 + " = " + division);
			}	
	
	}
}
