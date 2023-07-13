package eren.esmahan.oopj.ch5.flowcontrol;

public class Shapes {

	public static void main(String[] args) {
		Shapes shapes=new Shapes();
		
		System.out.println("---Filled Rectangle---");
		//shapes.drawAFilledRectangle(10, 8);
		System.out.println("---Void Rectangle---");
	//	shapes.drawAVoidRectangle(10, 8);
		System.out.println("---Right Triangle---");
		shapes.drawARightTriangle(10);
		

	}

	public void drawAFilledRectangle(int weight,int height) {
		
		for(int i=1; i<=weight; i++) {
			for(int j=1; j<=height; j++) {
				System.out.print("*");
			}
			    System.out.println();
		    }
	 }
	
	public void drawAVoidRectangle(int weight,int height) {
		
		for(int i=1; i<=weight; i++) {
			for(int j=1; j<=height; j++) {
                   if(i==1 | i==weight) {
                	   System.out.print("*");
                   }	
                   else{
                	   if(j==1 |j==height) {
                		   System.out.print("*");
                	    }
                	   else {
                		   System.out.print(" ");
                	    } } }
			 System.out.println();
		  }
	 }
	
	public void drawARightTriangle(int height) {
		
	    for(int i=1; i<=height; i++) { // for loop
	    	for(int j=height; j>=0; j--) { // for blank
	    		for(int k=1; k<=height; k++) { // for stars
	    			System.out.print(" ");
	    		}
	    		System.out.print("*");
	    		System.out.println();
	    		
	    	}
	               System.out.println();    	
	    }
	}
	
	
	
}
