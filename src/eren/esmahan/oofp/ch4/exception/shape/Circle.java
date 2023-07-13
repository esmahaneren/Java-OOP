package eren.esmahan.oofp.ch4.exception.shape;

public class Circle implements Shape{

	private double radius;
	
	
	public Circle(double radius) throws NegativeArgumentException{
		
		if(radius<0) {
			throw new NegativeArgumentException("radius can't be a negative number");
		}
		this.radius=radius;
	}

    @Override   
	public void draw() {
		System.out.println("Drawing the circle");
	}

	@Override
	public void erase() {
		System.out.println("Erasing the circle");
	}


	@Override
	public double calculateArea() {
		return radius * 2 *Math.PI;
	}


	@Override
	public double calculateCircumference() {
       return Math.pow(radius, 2)*Math.PI;
	}
	
	
	
}
