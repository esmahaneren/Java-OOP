package eren.esmahan.oopj.ch4.stack;
import java.util.Arrays;

public class Stack {
	  
	      public static final int MAX_STACK_SİZE=5;
	      boolean empty=true;
	      boolean full=false;
	
	      String[] array=new String[MAX_STACK_SİZE];
	       int pointer=0; //Point to first empty cell
	
	      //Put element on the top
	      public boolean push(String newElement) {
	    	
              if(!full) {
            	  array[pointer]=newElement;
            	  pointer++;
            	  empty=false;
            	  if(pointer==MAX_STACK_SİZE) {
            		  full=true;
            	  }
            	  return true;
               }	    	  
               else {
            	  return false;
              }  }
	          
	
	      //Pop element on the top
	      public String pop() {
	    	   
	    	   String lastItem=null;
	    	   if(!empty) { 
	    	   lastItem=array[pointer-1];
	    	    array[pointer-1]=null;
	    	    pointer--;
	    	    if(pointer!=MAX_STACK_SİZE) {
	    	    	full=false;
	    	    }
	    	    if(pointer==0) {
	    	    	empty=true;
	    	    }
	    	   }
	    	   return lastItem;
	    	   }
	      //Remove all elements on the stack
		   public void clear() {
			  Arrays.fill(array, null);
			  pointer=0;
			  empty=true;
			  full=false;
			  
		  }
		  //Stack status operations
		  
		  
		  //Is stack empty?
		   public boolean isEmpty() {
			  
			   return empty;
		  }
		  //Is stack full?
		   public boolean isFull() {
			  return full;
		  }

	       public int size() {
	    	   return pointer;
	    	  
	      }
	      // Capacity of stacks
	       public int getCapacity() {
	    	   
	    	   return MAX_STACK_SİZE;
	    	  
	      }
	       //Outputs the elements in the size
	       public void showElements() {
	    	   
	    	   System.out.println("***Elements in the stack:***");
	    	   if(!empty) {
	    		   for(String s:array) {
	    			   System.out.println(s);
	    		   }  }
	    	   else {
	    		   System.out.println("Nothing in the stack");
	    	   }
	       }
	
}
