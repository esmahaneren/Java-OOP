package eren.esmahan.oofp.ch3.Interface.calculator2;

public abstract class AbstractMathFunction implements MathFunction {

	protected String name;
	
	  public AbstractMathFunction(String name) {
		this.name=name;
	}
	  @Override
	public String getName() {
		return name;
	}

	@Override
	 public abstract double calculate(double arg);

	
}
