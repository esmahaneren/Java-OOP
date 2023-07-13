package eren.esmahan.oofp.ch3.Interface.calculator1;

public class CalculatorT1 implements Calculator{
	
	private int functionCount;
	private int currentCount=0;
	
	private MathFunction[] functions;
	private double arg;
	
	public CalculatorT1(int functionCount) {
		this.functionCount=functionCount;
		functions=new MathFunction[functionCount];
		
	}
	
	@Override
	public void addFunction(MathFunction function) {
		functions[currentCount]=function;
		currentCount++;
	}
	
	@Override
	public double doCalculation(String functionName, double arg) {
	 double result=0.0;
	 boolean isFunctionFound=false;
	 for(MathFunction function :functions) {
		 if(functionName.equalsIgnoreCase(function.getName())) {
			 result=function.calculate(arg);
			 isFunctionFound=true;
			 } }
	 if(!isFunctionFound) {
		 System.out.println("No such a function found");
	 }
		return result;
	}
	
	@Override
	public void listMathFunction() {
		for(MathFunction function:functions) {
		System.out.println(function.getName());
		}
		
	}

	

	
}
