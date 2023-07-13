package eren.esmahan.oofp.ch1.binding;

public class Circle extends Shape {

	protected double radius;
	
	public Circle(String name,double radius) {
		super(name);
		this.radius=radius;
	}

	@Override
	public void calculateArea() {
		
		double area=Math.PI*radius*radius;
		System.out.println(super.getName()+"'s area :"+area);
	}

	@Override
	public void calculateCircumference() {
		double circumference=2*Math.PI*radius;
		System.out.println(super.getName()+"'s circumference :"+ circumference);
	}

	@Override
	public String toString() {
		return "radius=" + radius ;
	}
	
	
}
