package eren.esmahan.oopj.ch9.Point;

public class Point {

	int x;
	int y;
	
		
	public Point(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	double calculateDistanceToOrijin(int x,int y) {

		double distance=Math.sqrt((x*x)+(y*y));
		return distance;
		
	}
	double  calculateDistanceTo(int x,int x1,int y,int y1) {

		double distance=Math.sqrt(((double)(x1-x)*(x1-x))+((double)(y1-y)*(y1-y)));
		return distance;
		
	}	
	
	int  move(int a) {
		
		int newDistance=x+a;
				
		return newDistance;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 
	public Point cloneTo() {
		
		Point clone1=new Point(x,y);
	 
	     return clone1;
	}
	
}
