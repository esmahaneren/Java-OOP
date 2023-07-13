package eren.esmahan.oofp.ch6.classdesign;

public class ElevatorTest {

	public static void main(String[] args) {
	
		Elevator elevator=new Responsibility();
		
		elevator.openDoor();
		elevator.go(Floor.FIFTH);
		elevator.go(Floor.SECOND);
		
		

	}

}
