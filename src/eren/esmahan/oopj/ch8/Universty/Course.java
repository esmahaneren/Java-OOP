package eren.esmahan.oopj.ch8.Universty;

import java.sql.Date;

public class Course {
	String name;
	String code;
	Department department;
	Professor teacher;
	Student[] students;
	String[] day;
	Date time;
	Classroom classroom;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Professor getTeacher() {
		return teacher;
	}
	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public String[] getDay() {
		return day;
	}
	public void setDay(String[] day) {
		this.day = day;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

}
