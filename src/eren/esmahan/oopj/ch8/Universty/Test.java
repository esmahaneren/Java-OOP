package eren.esmahan.oopj.ch8.Universty;

public class Test {
public static void main(String[] args) {
		
		Department department1=new Department();
	    department1.setName("Software Engineering");
	    Department department2=new Department();
	    department2.setName("Philosophy");
	    
	    Professor professor1=new Professor();
	    Professor professor2=new Professor();
	    Professor professor3=new Professor();
	    professor1.setName("Akın Kaldıroğolu");
	    professor2.setName("Ali Veli");
	    professor3.setName("Ayşe Zeynep");
	    
	    Course course1=new Course();
	    course1.setName("Int. to Software Engineering");
	    Classroom classroom1=new Classroom();
	    classroom1.setName("M401");
	    course1.setClassroom(classroom1);
	    classroom1.setCourse(course1);
	 
	    Course course2=new Course();
	    course2.setName(" Ethics");;
	    Classroom classroom2=new Classroom();
	    classroom2.setName("S101");
	    course2.setClassroom(classroom2);
	    classroom2.setCourse(course2);
	    
	    Course course3=new Course();
	    course3.setName("Ontology");;
	    Classroom classroom3=new Classroom();
	    classroom3.setName("C101");
	    course3.setClassroom(classroom3);
	    classroom3.setCourse(course3);
	    
	    Student student1=new Student();
	    student1.setName("Esmahan Eren");
	    Student student2=new Student();
	    student2.setName("Zeynep Nilüfer");
	    Student student3=new Student();
	    student3.setName("Anıl Baş");
	    
	    
	    department1.head=professor1;      
	    professor1.department=department1; 
	    department2.head=professor2;      
	    professor2.department=department2; 
	    professor3.department=department2; 
	    
	
	    department1.courses=new Course[100];
	    department1.courses[0]=course1;
	    course1.department=department1;
	  
	    department2.courses=new Course[100];
	    department2.courses[0]=course2;
	    department2.courses[1]=course3;
	    course2.department=department2;
	    course3.department=department2;
	  
	    
	    course1.teacher=professor1;
	    professor1.coursesGiven=new Course[5];
	    professor1.coursesGiven[0]=course1;
	    
	    course2.teacher=professor2;
	    professor2.coursesGiven=new Course[5];
	    professor2.coursesGiven[0]=course2;
	    
	    course3.teacher=professor3;
	    professor3.coursesGiven=new Course[5];
	    professor3.coursesGiven[0]=course3;
	    
	    
	    professor1.advisee=new Student[20];
	    professor1.advisee[0]=student1;
	    student1.advisor=professor1;
	    
	    professor2.advisee=new Student[20];
	    professor2.advisee[0]=student2;
	    student2.advisor=professor2;
	    
	    professor3.advisee=new Student[20];
	    professor3.advisee[0]=student3;
	    student3.advisor=professor3;
	    
	    student1.coursesTaken=new Course[7];
	    student1.coursesTaken[0]=course1;
	    course1.students=new Student[100];
	    course1.students[0]=student1;
	    
	    student2.coursesTaken=new Course[7];
	    student2.coursesTaken[0]=course2;
	    course2.students=new Student[100];
	    course2.students[0]=student2;
	    
	    student3.coursesTaken=new Course[7];
	    student3.coursesTaken[0]=course3;
	    course3.students=new Student[100];
	    course3.students[0]=student3;
	    
	    
	    
	    
	   
	    System.out.println("Name of the "+student1.getName()+"'s first course is:"+student1.coursesTaken[0].getName());
	    System.out.println("Name of the "+student1.getName()+"'s first course's professor is:"+student1.coursesTaken[0].teacher.name);
	    System.out.println("Name of the "+student1.getName()+" first course's professor's department is:"+student1.coursesTaken[0].teacher.department.name);  
	    System.out.println("Name of the students2's first course is:"+student2.coursesTaken[0].name);
	    System.out.println("Name of the students2's first course's professor is:"+student2.coursesTaken[0].teacher.name);
	    System.out.println("Name of the students2's first course's professor's department is:"+student2.coursesTaken[0].teacher.department.name);  
	    System.out.println("Name of the students3's first course is:"+student3.coursesTaken[0].name);
	    System.out.println("Name of the students3's first course's professor is:"+student3.coursesTaken[0].teacher.name);
	    System.out.println("Name of the students3's first course's professor's department is:"+student3.coursesTaken[0].teacher.department.name);  
	    
	    
	  
	    
	  
	  
	    
	    
	    
	    
	    
	    
	    

	}
}
