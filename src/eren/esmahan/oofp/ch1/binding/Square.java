package eren.esmahan.oofp.ch1.binding;

public class Square extends Shape {

	protected int lenght;
	
	public Square(String name,int lenght) {
		super(name);
		this.lenght=lenght;
		
	}

	@Override
	public void calculateArea() {
		int area=lenght*lenght;
		System.out.println(super.getName()+"'s area:"+area);
		
	}

	@Override
	public void calculateCircumference() {
		int circumference=4*lenght;
		System.out.println(super.getName()+"'s circumference:"+circumference);
	}

	@Override
	public String toString() {
		return "lenght=" + lenght ;
	}
	
}
