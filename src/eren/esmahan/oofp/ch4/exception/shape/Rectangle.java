package eren.esmahan.oofp.ch4.exception.shape;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class Rectangle implements Shape{

	private double width;
	private double height;
	
	public Rectangle(double width,double height) throws NegativeArgumentException {
		if(width<0 | height<0) {
			throw new NegativeArgumentException("height or withd cant have a negative value ");
		}
		this.height=height;
		this.width=width;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the rectangle");
		
	}

	@Override
	public void erase() {
		System.out.println("Erasing the rectangle");
		
	}

	@Override
	public double calculateArea() {
		
		return width*height;
	}

	@Override
	public double calculateCircumference() {
		
		return 2*(width+height);
	}
	
}
