package eren.esmahan.oofp.ch3.Interface.calculator2;

public class CosFunction extends  AbstractMathFunction{

	
	public CosFunction() {
		super("Cos");
	}
	
	public double calculate(double args) {
		return Math.cos(args);
	}
}
