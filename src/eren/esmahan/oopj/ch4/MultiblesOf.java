package eren.esmahan.oopj.ch4;

public class MultiblesOf {

	public static void main(String[] args) {
		
        int multibles=0;
      
       for(int i=3;i<1000;i++) {
    	   if(i%3==0 || i%5==0) {
    		   multibles+=i;
       }
       }
       System.out.println(multibles);
	 }

}
