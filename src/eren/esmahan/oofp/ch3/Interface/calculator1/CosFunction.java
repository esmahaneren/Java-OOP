package eren.esmahan.oofp.ch3.Interface.calculator1;

public class CosFunction implements MathFunction{

	private static String name="Cos";
	
	public String getName() {
		return name;
	}
	public double calculate(double args) {
		return Math.cos(args);
	}
}
