package eren.esmahan.oofp.ch2.Abstract;

 public abstract class Student {
	 
     	protected int no;
		protected String name;
		protected int year;
		protected String dob;
		protected String major;
			
			
		public Student(int no,String name,int year,String dob,String major) {
			this.no=no;
			this.name=name;
			this.year=year;
			this.dob=dob;
			this.major=major;
			}
		public abstract void study() ;
		
		public abstract void register();
		
		
		
}
