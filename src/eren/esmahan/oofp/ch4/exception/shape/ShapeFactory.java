package eren.esmahan.oofp.ch4.exception.shape;

import java.util.Random;

public class ShapeFactory {
	private static Random random=new Random();

	public static Shape produceShape() throws NegativeArgumentException {
		Shape shape=null;
		int i=random.nextInt()%100;
		if(i%2==0) {
			shape=new Circle(i);
		}
		else {
			shape=new Rectangle(i,i*2);
		}
		
		return shape;
	}
	
}
