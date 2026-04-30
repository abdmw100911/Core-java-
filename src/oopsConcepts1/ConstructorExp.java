package oopsConcepts1;

class Human1{
	
	/*constructor : accessSpecifier constructorName(){
	 * 
					}
					
	note: constructor name should be same as class name
	*/
	
	private String name;
	private int age;
	
	//default constructor ->(no parameters)
	//to initialize instance variables with default values during object creation
	public Human1() {
		name = "abdullah";
		age = 20;
	}
	
	//parameterized constructor
	//to initialize instance variables with personalized values during object creation itself
	public Human1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//parameterized constructor
	public Human1(int age) {
		name = "abdullah";
		this.age = age;
	}
	
	
	//getters 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class ConstructorExp {
	public static void main(String[] args) {
		Human1 obj = new Human1(); //will use default constructor
		
		Human1 obj1 = new Human1(12,"husain");// will use parameterized constructor
		
		Human1 obj2 = new Human1(40); // will use parameterized constructor
		
		System.out.println(obj.getName() + " : "+ obj.getAge());
		
		System.out.println(obj1.getName() + " : "+ obj1.getAge());
		
		System.out.println(obj2.getName() + " : "+ obj2.getAge());
		
		
	}
}
