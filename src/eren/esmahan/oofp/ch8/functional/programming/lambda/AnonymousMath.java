package eren.esmahan.oofp.ch8.functional.programming.lambda;

public class AnonymousMath{

	public static void main(String[]args) {
		

		Math adder=new Math() {
		@Override
		public double calculate(double arg1, double arg2) {
			
			return arg1+arg2;
		}
		};
		doMath(adder,1.2,2.3);
	
	// only difference is  	
		doMath(new Math(){
			@Override
			public double calculate(double arg1,double arg2) {
				return arg1*arg2;
			}
			},2,3);
		
		
		doMath(new Math() {
			
			@Override
			public double calculate(double arg1,double arg2) {
				return arg1/arg2;
			}
			},4,1.2);
		
		doMath(new Math() {
			@Override
			public double calculate(double arg1,double arg2) {
				return arg1-arg2;
			}
			},10,3);
		
	}

	
	public static void doMath(Math math,double arg1,double arg2) {
		System.out.println(math.calculate(arg1, arg2));
		
	}
	
	

}
