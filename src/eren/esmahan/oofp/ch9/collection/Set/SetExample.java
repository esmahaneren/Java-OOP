package eren.esmahan.oofp.ch9.collection.Set;


import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import eren.esmahan.oofp.ch9.collection.CollectionUtil;

public class SetExample {
	
	
	public static void main(String[]args) {
		
		processSet();
		addSetToSet();
		
		
	}
	
	public static void processSet() {
		
		Set set=CollectionUtil.getEmptySet();
		System.out.println(set.add("Ali"));
		System.out.println(set.add(4));
		System.out.println(set.add("Ayşe"));
		System.out.println(set.add("Ayşe"));
		System.out.println(set.add("5"));
		System.out.println(set.add("1"));
		System.out.println(set.add("TC"));
		System.out.println(set.add(new Date()));
		
		System.out.println("Contains Ali? "+set.contains("Ali"));
		System.out.println("Contains 3? "+set.contains(3));
		set.add("Esma");
	
		
		System.out.println();
		
	//	System.out.println("Iterating forward through iterator:");
	//	Iterator it=set.iterator();
	//	while(it.hasNext()) {
	//		System.out.println(it.next());
	//	}
			System.out.println("Iterating forward through forEach:");// more practical,use this
		set.forEach(System.out::println);
		
	}
	public static void addSetToSet() {
		Set set1 = CollectionUtil.getEmptySet(); 
		
		System.out.println(set1.add("Ali"));
		System.out.println(set1.add(3));
		System.out.println(set1.add("Ayşe"));
		System.out.println(set1.add("Ayşe"));
		System.out.println(set1.add("5"));
		System.out.println(set1.add("1"));
		System.out.println(set1.add("TC"));
		System.out.println(set1.add(new Date()));
		
		
		Set set2 = CollectionUtil.getEmptySet();
		System.out.println(set2.add("Mehmet"));
		System.out.println(set2.add(8));
		System.out.println(set2.add("Kübra"));
		System.out.println(set2.add("Ayşe"));
		System.out.println(set2.add("Kitap"));
		System.out.println(set2.add(4.5));
		System.out.println(set2.add(new Date()));
		
		System.out.println("\nAdding set2 to the set1");
		System.out.println(set1.addAll(set2));
	//	System.out.println(set1.add(set2)); //  if we used add(), set2 acts like new variable
		
		System.out.println("\nSet");
		set1.forEach(System.out::println);
	}

}
