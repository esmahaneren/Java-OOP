package eren.esmahan.oofp.ch1.binding;

public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		Shape s=factory.createShape();
		Shape s2=factory.createShape();
	    s.draw();
	    s.calculateArea(); // upcasting
	 	s.calculateCircumference();
	  	System.out.println(s.toString());
		
	//	Canvas canvas=new Canvas();
	//	canvas.drawShape(s);  //downcasting
	//	canvas.drawShape(s2);
	//	s2.calculateArea();
		

	}

}
