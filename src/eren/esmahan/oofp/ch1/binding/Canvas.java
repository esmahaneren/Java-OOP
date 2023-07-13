package eren.esmahan.oofp.ch1.binding;

public class Canvas {

	public void drawShape(Shape s) {
		
		if(s instanceof Circle) { //downcasting exmp.
			Circle c=(Circle) s;
			c.draw();
			System.out.println(c.toString());
		}
		else if(s instanceof Rectangle) {
			Rectangle r=(Rectangle) s;
			r.draw();
			System.out.println(r.toString());
		}
		else if(s instanceof Square) {
			Square sq=(Square) s;
			sq.draw();
			System.out.println(sq.toString());
		}
		else  {
			 Triangle t=( Triangle) s;
			 t.draw();
			 System.out.println(t.toString());
		}
		
	}
     	public void eraseShape(Shape s) {
		s.erase();
	}
}
