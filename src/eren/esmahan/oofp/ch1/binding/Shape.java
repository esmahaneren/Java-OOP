package eren.esmahan.oofp.ch1.binding;

public class Shape {

	protected String name;
	
      public Shape(String name) {
	    this.name=name;
 }
	
	public void draw() {
	System.out.println("Drawn shape is:"+getName());	
		
	}
	public void erase() {
		System.out.println("Erase the "+getName());
		
	}
	public void calculateArea() {
		
		
	}
	public void calculateCircumference() {
		
		
	}
	public String getName() {
		
		return name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
}
