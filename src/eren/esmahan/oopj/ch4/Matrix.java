package eren.esmahan.oopj.ch4;


public class Matrix {

	public static void main(String[] args) {
		 
		Matrix m=new Matrix();
		m.randomMatrix();

	}
         public void randomMatrix() {
        	 
           int matrix1[][]=new int[2][2];
    	   int matrix2[][]=new int[2][2];
    	   int matrix3[][]=new int[2][2];
    	      for(int i=0; i<matrix1.length; i++) { // random value assignment for matrix1
    	    	   for(int j=0; j<matrix1[i].length; j++) {
    	    		matrix1[i][j]=(int)(Math.random()*100);
    	    		 System.out.print(matrix1[i][j]);
    	    		 System.out.print(" ");
    	    	   }   
    	    	     System.out.println();
    	    	     }
    	      System.out.println("-----");
    	       
    	      for(int i=0; i<matrix2.length; i++) { // random value assignment for matrix2
   	    	      for(int j=0; j<matrix2[i].length; j++) {
   	    		   matrix2[i][j]=(int)(Math.random() *100);
   	    	       System.out.print(matrix2[i][j]);
    		       System.out.print(" ");
   	    	   }  
   	    	      System.out.println();
   	    	      } 
    	      
               int m1=(matrix1[0][0])*(matrix2[0][0]);
               int n1=(matrix1[0][0])*(matrix2[0][1]);
               int m2=(matrix1[0][1])*(matrix2[1][0]);
               int n2=(matrix1[0][1])*(matrix2[1][1]);
               int m3=(matrix1[1][0])*(matrix2[0][1]);
               int n3=(matrix1[1][0])*(matrix2[0][0]);
               int m4=(matrix1[1][1])*(matrix2[1][1]);
               int n4=(matrix1[1][1])*(matrix2[1][0]);
              
               
               matrix3[0][0]=m1+m2;
               matrix3[0][1]=n1+n2;
               matrix3[1][0]=n3+n4;
               matrix3[1][1]=m3+m4;
              
               System.out.println("-----");
               
               for(int i=0; i<matrix3.length; i++) { 
    	    	      for(int j=0; j<matrix3[i].length; j++) {
    	    		  System.out.print(matrix3[i][j]);
     		          System.out.print(" ");
    	    	   }  
    	    	      System.out.println();
    	    	      } 
               
         }
    	       
    	  
       
	
	
}
