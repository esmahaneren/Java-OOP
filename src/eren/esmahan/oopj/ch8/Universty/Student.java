package eren.esmahan.oopj.ch8.Universty;

public class Student {
	 String no;
	 String name;
	 String dob;
	 Department department;
	 Professor advisor;
	 Course[] coursesTaken;
	 
	 
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Professor getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	public Course[] getCoursesTaken() {
		return coursesTaken;
	}
	public void setCoursesTaken(Course[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
	 
}
