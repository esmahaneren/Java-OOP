package eren.esmahan.oopj.ch5.flowcontrol;


public class GeometricalShapes {

	public static void main(String[] args) {
		
	   GeometricalShapes rectangle=new GeometricalShapes();
	   GeometricalShapes triangle=new GeometricalShapes();
       
       
           rectangle.drawFilledRectangle(15,20);
           System.out.println();
           rectangle.drawVoidRectangle(15,20);
           System.out.println();
	       triangle.drawFilledTriangle();
	       System.out.println();
	       triangle.drawFilledUpSideDownTriangle();
	       System.out.println();
	       triangle.drawTriangle();
	       System.out.println();
	       triangle.drawUpSideDownTriangle();
    
          
	}
	
      public void drawFilledRectangle(int raw,int column) {
           for(int i=0;i<raw;i++) {
        	   for(int j=0;j<column;j++) {
        		    System.out.print("*");	   
        		      if(j==column-1) {
        		    	  System.out.println();
        		      }}}}
      
       public void drawVoidRectangle(int raw,int column) {
    	   for(int i=0;i<raw;i++) {
        	   for(int j=0;j<column;j++) {
        		    if(i==0 | i==raw-1) {
        		    	System.out.print("*");
        		  	}	    	
        		    else {
                        	if(j==0 | j==column-1) {
                   		     System.out.print("*");
                        	} 
                        	else {
                        		System.out.print(" ");
                        	}  }  }
	    		System.out.println(); }}    
       
       
        public void drawFilledTriangle() {
        	
        	int counter=1;
        	
        	for(int i=0; i<15; i++) {//how many times the loop continue
        		
        		for(int j=0; j<counter; j++) { //we use an a
        			System.out.print("*");	
        		}
        		System.out.println("");
        		counter++;
        	}   }
        

             public void drawFilledUpSideDownTriangle() {
            	 
            	 int counter=15;
            	 
            	 for(int i=0;i<15; i++) {
            		 for(int j=counter; j>0; j--) {
            			 System.out.print("*");
            		 }
            		 System.out.println("");
            		 counter--;
            	 }       }
        	
             public void drawTriangle() {
        
            	 for(int i=1; i<10;i++) { // loop number's two separate loop  work same time with order
            	    	for(int j=i; j<10; j++) { //gap number's
            	    		System.out.print(" ");
            	    	}
            	    	for(int k=1;k<=i; k++) { // stars numbers
            	    		System.out.print("*");
            	    		System.out.print(" ");
            	    	}
            	    	System.out.println(" ");
            	    }  }
             
               public void drawUpSideDownTriangle() {
            	   
            	    for(int i=10; i>0;i--) { //loop number
            	    	for(int j=i;j<10;j++) { // stars numbers
            	    		System.out.print(" ");
            	    	}
            	    	for(int k=1;k<=i;k++) {
            	    		System.out.print("*");
            	    		System.out.print(" ");
            	    	}
            	    	    System.out.println(" ");
            	    }
            	   
               }
             
        	    }
      
  
	


