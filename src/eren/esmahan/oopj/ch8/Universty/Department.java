package eren.esmahan.oopj.ch8.Universty;

public class Department {
	String name;
	Professor head;
	Course[] courses;
	Student[] students;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor getHead() {
		return head;
	}
	public void setHead(Professor head) {
		this.head = head;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
}
