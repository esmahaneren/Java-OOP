package eren.esmahan.oopj.ch9.Point;

public class PointTest {

	public static void main(String[] args) {
	
		Point point1=new Point(3,5);
		Point point2=new Point(1,7);
		
		
		System.out.println("Point1:"+point1.getX()+","+point1.getY());
		double distance1=point1.calculateDistanceToOrijin(point1.getX(), point1.getY());
		System.out.println("Point1's distance to Orijin is:"+distance1);
		double distance2=point2.calculateDistanceTo(point1.getX(), point2.getX(), point1.getY(), point2.getX());
		System.out.println("Point1's and Point2's distance to each others: "+distance2);
		
		point1.setX(point1.move(5));
		System.out.println("New Point1:"+point1.getX()+", "+point1.getY());
		
	    
	    point1.cloneTo();
	    point1.cloneTo();
	   
		
		
		
	}


		
	


}
