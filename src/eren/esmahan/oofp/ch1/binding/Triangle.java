package eren.esmahan.oofp.ch1.binding;

public class Triangle extends Shape {
	protected int height;
	protected int width;

	public Triangle(String name,int height,int width){ 
		super(name);
		this.height=height;
		this.width=width;
	}

	@Override
	public void calculateArea() {
		
		double area=0.5*height*width;
		System.out.println(super.getName()+"'s area:"+area);
	}

	@Override
	public void calculateCircumference() {
		double circumference=height+width+Math.sqrt((height*height)+(width*width));
		System.out.println(super.getName()+"'s circumference:"+circumference);
		
	}

	@Override
	public String toString() {
		return "height=" + height + ", width=" + width ;
	}
	
}
