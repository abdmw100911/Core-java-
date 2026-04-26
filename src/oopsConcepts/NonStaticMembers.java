package oopsConcepts;

class College{
	String clgName = "saboo siddik"; //non static global variable
	String studentName = "Abdullah";
	
	void study() {					//non static method
		String branch = "iot"; 		//local variable
		System.out.println(studentName+" studying in "+clgName+" in branch "+branch);
	}
}
public class NonStaticMembers {
	String className = "qspiders";
	
	void skilling() {
		System.out.println("upskilling in Qspiders");
	}
	public static void main(String[] args) {
		//accessing non static members in the same class 
		//requires creating an object of it using the new Keyword
		
		System.out.println(new NonStaticMembers().className);
		new NonStaticMembers().skilling();
		System.out.println("---------");
		
		//accessing non static members from different class in the same source file
		System.out.println(new College().clgName);
		System.out.println(new College().studentName);
		new College().study();
		System.out.println("---------");
		
		//accessing non static members in different class and different source file
		//accessing "name" from Student2 class of StaticKeyword.java sourcefile
		
		System.out.println(new Student2().name = "abdullah");
	}
}
