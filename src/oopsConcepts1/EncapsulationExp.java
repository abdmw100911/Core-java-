package oopsConcepts1;
/*
 encapsulation is a core oops principle where data and methods are bind together in a single class 
 
 it restricts direct access of instance variables, instead it allows indirect access of instance variables 
 through methods 
 
 this is done using the "private" keyword
 */

class Human{
	//human has many data in his mind 
	//but this data should not be accessed directly 
	//if someone wants this data , they should ask for it 
	//and if human wants they can give the information either by talking , writing, or handsignals(methods)
	
	private int age = 20;
	private String name = "abdullah";
	private String color;
	
	//instace variables can be accessed through this method
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	//instance variables can be assigned values using the following method 
	public void setColor(String c) {
		color = c;
	}
}
public class EncapsulationExp {
	public static void main(String[] args) {
		//creating an object of class human
		Human obj = new Human();
		
		//System.out.println(obj.name);			//this is direct accessing of object variables
		//										encapsulation doesnot allow this
		
		//indirectly accessing instance variables through methods 
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		//indirectly assigning values to instance variables 
		obj.setColor("brown");
		
		System.out.println(obj.getColor());
		
		//here we made the instance variables private , and the only way to access them is through methods 
		//thus we binded variables(data) and methods together
		//this is called encapsulation
	}
}
