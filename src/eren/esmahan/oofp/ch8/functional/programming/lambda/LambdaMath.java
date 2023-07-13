package eren.esmahan.oofp.ch8.functional.programming.lambda;

public class LambdaMath {

	public static void main(String[] args) {
		Math adder=(double arg1,double arg2)->{return arg1+arg2;};
		doMath(adder,8,2);
		
		Math diveder=(double arg1,double arg2)->{return arg1-arg2;};
		doMath(diveder,8,2);
		
		doMath((double arg1,double arg2)->{return arg1/arg2;},8,2);
		
		doMath((double arg1,double arg2)->{return arg1*arg2;},8,2);

	}

	
	
	public static void doMath(Math math,double arg1,double arg2) {
		System.out.println(math.calculate(arg1, arg2));
		
		
		
	}
}
