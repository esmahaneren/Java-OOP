package eren.esmahan.oofp.ch3.Interface.calculator2;

public class SinFunction extends  AbstractMathFunction{
	
	public SinFunction() {
		super("Sin");
	}
   
   @Override
   public double calculate(double arg) {
	  return Math.sin(arg);
   }
}
