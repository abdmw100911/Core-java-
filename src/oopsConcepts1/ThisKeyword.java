package oopsConcepts1;
class Student{
	private String name;
	private int rno;
	private int marks;
	
	//method to assign value to instance variable
	public void setName(String n) {
	//here we know that "name" is instance variable and "n" is a local variable
		name = n;
	}
	
	public void setRno(int rno,Student s) {
		//here we dont know which "rno" is instance variable and which is local variable 
		//rno = rno;
		//in such situations preference is given to local varaiale 
		//both rno are considered to be local variables , thus the instance rno is not getting assigned any value
		//thus we have to explicitly specify the instance variable 
		//this is done by passing the object itself as a parameter and using it to specify the instance variable
		s.rno = rno;
	}
	
	public void setMarks(int marks) {
		//java says , you dont need to explicitly pass the object and then use it to specify the instance variable 
		//instead we can use "this" keyword
		//"this" keyword will refer to the object being instantiated , so we can directly specify the instance variable without
		// manually passing the object 
		
		this.marks = marks;
	}
	
	//defining getters to print the output
	
	public String getName() {
		return name;
	}
	
	public int getRno() {
		return rno;
	}
	
	public int getMarks() {
		return marks;
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Abdullah");
		s.setRno(29,s);
		s.setMarks(100);
		
		System.out.println(s.getName());
		System.out.println(s.getRno());
		System.out.println(s.getMarks());
	}
}
