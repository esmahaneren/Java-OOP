package eren.esmahan.oopj.ch8.Universty;

public class Professor {
	 String no;
	 String name;
	 String dob;
	 String rank;
	 Department department;
	 Course[] coursesGiven;
	 Student[] advisee;
	 
	 
	 
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Course[] getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(Course[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	public Student[] getAdvisee() {
		return advisee;
	}
	public void setAdvisee(Student[] advisee) {
		this.advisee = advisee;
	}
	 
}
