package oopsConcepts;

class Student3{
	String name;
	int rollNo;
	static String school = "marys";
	
	static void display() {
		System.out.println("this is a static method");
	}
	
	/*static void display1() {
		System.out.println("name: "+name+", rollNo: "+rollNo+" school: "+school);
	}
	
	here error will come , because name and roll no value is different for different objects 
	static display will not know those values unless the object , whose values is to be displayed is passed
	*/
	
	static void display1(Student3 s2) {
		System.out.println("name: "+s2.name+", rollNo: "+s2.rollNo+" school: "+school);
	}
}
public class StaticMethods7 {
	public static void main(String[] args) {
		/*
		 static method : the method belongs to the class , rather than a object 
		 
		 note : static method is shared by all the objects 
		 we can use a static variable inside a static method 
		 but we cannot use a non static variable in a static method 
		 
		 we will learn why
		 */
		
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		
		//value for object 1 
		s1.name = "abdullah";
		s1.rollNo = 29;
		
		s2.name = "husain";
		s2.rollNo = 22;
		
		//calling static display method though its class name 
		//no issues here
		Student3.display();
		
		//calling static display1 and passing object s2 to display its values 
		Student3.school = "peters";
		Student3.display1(s2);
	}
}
