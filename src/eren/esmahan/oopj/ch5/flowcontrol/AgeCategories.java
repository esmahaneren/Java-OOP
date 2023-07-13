package eren.esmahan.oopj.ch5.flowcontrol;

import java.util.Scanner;

public class AgeCategories {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of family members:");
		int numberOfMembers=sc.nextInt();
		int counter=0;
		int numberOfBaby=0;
		int numberOfChild=0;
		int numberOfTeenager=0;
		int numberOfYoung=0;
		int numberOfMiddleAge=0;
		int numberOfOld=0;
	
		 while(counter<numberOfMembers) {
			 	System.out.println("Please enter family member's age:");
			 	int ageOfMember=sc.nextInt();
			
			 		if(ageOfMember<=0 |ageOfMember>120) {
			 			System.out.println("Please re-enter the age with proper number!:");
			 			ageOfMember=sc.nextInt();
			 		}
			 		if(ageOfMember<=3) {
			 			System.out.println("BABY");
			 			numberOfBaby++;
			 		}
			 		else if(ageOfMember<=12) {
			 			System.out.println("CHILD");
			 			numberOfChild++;
			 		}
			 		else if(ageOfMember<=19) {
			 			System.out.println("TEENAGER");
			 			numberOfTeenager++;
			 		}
			 		else if(ageOfMember<=30) {
			 			System.out.println("YOUNG");
			 			numberOfYoung++;
			 		}			
			 		else if(ageOfMember<=59) {
			 			System.out.println("MIDDLE-AGE");
			 			numberOfMiddleAge++;
			 		}
			 		else if(ageOfMember<=120) {
			 			System.out.println("OLD");
			 			numberOfOld++;
			 		}	
			 			counter++;
		  }
		  System.out.println("*****************");
		  System.out.println("Distribution of the entered ages by categories...");
		  System.out.println("BABY: "+numberOfBaby);
		  System.out.println("CHILD: "+numberOfChild);
		  System.out.println("TEENAGER: "+numberOfTeenager);
		  System.out.println("YOUNG: "+numberOfYoung);
		  System.out.println("MIDDLE-AGE: "+numberOfMiddleAge);
		  System.out.println("OLD: "+numberOfOld);
	}
}
