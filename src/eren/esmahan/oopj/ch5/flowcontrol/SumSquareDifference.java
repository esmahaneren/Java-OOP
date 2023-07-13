package eren.esmahan.oopj.ch5.flowcontrol;


public class SumSquareDifference {

	public static void main(String[] args) {

		SumSquareDifference difference=new SumSquareDifference();
		
		int numberUpTo=100;
	//	difference.sumOfTheSquares(numberUpTo);
	//	difference.squaresOfTheSum(numberUpTo);
	    int differenceBetween=0;
	    differenceBetween=(difference.squaresOfTheSum(numberUpTo))-(difference.sumOfTheSquares(numberUpTo));
	   System.out.println("The Difference Between:"+differenceBetween);
	}

	public static int sumOfTheSquares(int numberUpTo) {
		
		int sum=0;
		for(int i=1; i<=numberUpTo; i++) {
			
			sum=sum+(i*i);
		}
		
		System.out.println("Sum of the Squares:"+sum);
		
		return sum;
	}
	public static int squaresOfTheSum(int numberUpTo) {
		
		int sum=0;
		int square=0;
		for(int i=1; i<=numberUpTo; i++) {
			sum+=i;
		}
		square=sum*sum;
		System.out.println("Squares of the Sum:"+square);
		return square;
	}
	
	
}