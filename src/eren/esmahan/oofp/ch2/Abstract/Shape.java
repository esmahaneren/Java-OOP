package eren.esmahan.oofp.ch2.Abstract;

import eren.esmahan.oofp.ch1.binding.*;

public abstract class Shape {

	protected String name;
	
      public Shape(String name) {
	    this.name=name;
 }
	
	public void draw() {
	System.out.println("Drawn shape is:"+name);	
		
	}
	public void erase() {
		System.out.println("Erase the "+name);
		
	}
	public abstract void calculateArea();
	
	public abstract void calculateCircumference(); 
	
	public String getName() {
		
		return name;
	}

	
}
