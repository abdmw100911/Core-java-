package oopsConcepts;

class Student2{
	String name;
	static String schoolName = "St.Marys";
	//will be shared by all objects of student
	
	public void display() {
		System.out.println("Student Name - "+name+", School - "+schoolName);
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		/*
		 static keyword is used to define members (variables, methods) that belong to the class 
		 rather than any specific object 
		 they are shared by all the objects of that class
		 */
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		s1.name = "abdullah";
		s2.name = "husain";
		
		s1.display();
		s2.display();
		
		//static keyword can be accessed through class name , rather than object
		Student2.schoolName = "St.peters";
		
		s1.display();
		s2.display();
		
	}
}
