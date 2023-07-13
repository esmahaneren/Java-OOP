package eren.esmahan.oofp.ch6.classdesign;

public class Responsibility implements Elevator{
	private boolean doorOpen=false;
	private boolean stopped=true;
	private Floor currentFloor=Floor.ENTRANCE;
	private int currentWeight=0;
	
	private final int CAPACITY=1000;
	

	
	private void goUp() {
		if(doorOpen) {
			closeDoor();
		}
		if(currentFloor.compareTo(Floor.FIFTH)<0) { // get negative integer  for less then
			System.out.println("Going up");
			currentFloor=currentFloor.increase();
			System.out.println(currentFloor);
		}
		else {
			System.out.println("Already on top floor");
			stopped=true;
			openDoor();
	     }
		}
	
	private void goDown() {
		if(doorOpen) {
			closeDoor();
		}
		if(currentFloor.compareTo(Floor.ENTRANCE)>0) {//   positive integer for greater then
			System.out.println("Going down");
			currentFloor=currentFloor.decrease();
			System.out.println(currentFloor);
		}
		else {
			System.out.println("Already on bottom floor");
			stopped=true;
			openDoor();
		}
		
	}
	
	@Override
	public void go(Floor desiredFloor) {
		int compare=currentFloor.compareTo(desiredFloor);
		while(compare!=0) {  // get zero for equality 
			if(compare<0) {
				goUp();
			}
			else {
				goDown();
			}
			compare=currentFloor.compareTo(desiredFloor);
		}
		stopped=true;
		openDoor();
		
	}

	@Override
	public void openDoor() {
		if(stopped) {
			doorOpen=true;
			System.out.println("Door is open");
		}
		
	}

	@Override
	public void closeDoor() {
		calculateWeight();
		if(currentWeight<=CAPACITY) {
			doorOpen=false;
			stopped=true;
			System.out.println("Door is closed");
		}
		else {
			System.out.println("The elevator has exceeded capacity, doors will remain open until someone exits!");
		}
	}

	  private void calculateWeight() {
		currentWeight=(int)(Math.random()*100);
		System.out.println("The weight is:"+currentWeight);
		
	}
}
