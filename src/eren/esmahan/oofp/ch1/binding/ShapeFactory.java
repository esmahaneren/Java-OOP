package eren.esmahan.oofp.ch1.binding;

public class ShapeFactory {

	
	public Shape createShape() {
		
		Shape s=null;
		
		int i = (int) (4 * Math.random());
		
		switch (i) {
		
		case 0:
			s=new Circle("Circle", 4);
		break;
		
		case 1: 
			s=new Rectangle("Rectangle", 2, 4);
		break;
		
		case 2:
			s=new Square("Square",4);
			break;
		case 3:
			s=new Triangle("Triangle",3,4);
			break;
		}
		
		return s;
	}
	
}
