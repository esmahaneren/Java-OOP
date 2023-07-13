package eren.esmahan.oofp.ch1.binding;

public class Rectangle extends Shape {

	protected int lenght;
	protected int width;
	
	
	public Rectangle(String name,int lenght,int width) {
		super(name);
		this.lenght=lenght;
		this.width=width;
		
	}
	@Override
	public void calculateArea() {
		
		int area=lenght*width;
		System.out.println(super.getName()+"'s area :"+area);
	}
	@Override
	public void calculateCircumference() {
		int circumference=2*(lenght+width);
		System.out.println(super.getName()+"'s circumference :"+circumference);
	}
	@Override
	public String toString() {
		return "lenght=" + lenght + ", width=" + width ;
	}
}
