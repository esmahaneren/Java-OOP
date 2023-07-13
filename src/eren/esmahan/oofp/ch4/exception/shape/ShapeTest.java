package eren.esmahan.oofp.ch4.exception.shape;

public class ShapeTest {
	
	public static void main(String[]args) {
		ShapeTest test=new ShapeTest();
		
		Shape shape=null;
		try {
			shape=ShapeFactory.produceShape();
		}
		catch(NegativeArgumentException e){
			processNegativeArgument(e);
			
		}
		if(shape!=null) {
			
			test.start(shape);
		}
	}

	public void start(Shape shape) {
		shape.draw();
		System.out.println("Area: "+shape.calculateArea());
		System.out.println("Circumference: "+shape.calculateCircumference());
       		
	}
	
	private static void processNegativeArgument(NegativeArgumentException e) {
	  
		System.err.println(e.getMessage());
		
	}
	
}
