package eren.esmahan.oopj.ch9.Tree;

public class Tree {

	String type;
	float height;
	
	Tree(String type,float height){
		this.type=type;
		this.height=height;
    }
	Tree(float height){
		this("Pine",height);
    }
	Tree(String type){
		this(type,2.2f);
    }
	Tree(){
		this("Oak",1.4f);
    }
	
	Tree copy() {
		
		Tree copyTree=new Tree(type,height);
		return copyTree;
		
	}
	Tree grow() {
		height++;
		return this;
		
	}
	
	
	void printInfo() {
		
		System.out.println("\nTree Info");
		System.out.println("Type:"+type);
		System.out.println("Height:"+height);
	}
	
	
	public static void main(String[] args) {
		 
		Tree tree=new Tree("Oak",4.0f);
	    tree.printInfo();
	    
	   Tree copyTree=tree.copy(); //Metotun döndürdüğü değere ulaşabilmek için değer aynı türden bir değişkene atadık
	   copyTree.printInfo();
		
		if(tree==copyTree) {
			
			System.out.println("the same object");
		}
		else {
			System.out.println("different object ");
		}
		
		tree.grow().grow().printInfo();
		
		Tree grow=tree.grow(); //Metotun döndürdüğü değere ulasabilmek için değer aynı türden bir değişkene atadık
		
		if(grow==tree) {
			System.out.println("the same object");
		}
		else {
			System.out.println("the different object");
		}
	}

}
