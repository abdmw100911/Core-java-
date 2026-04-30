package oopsConcepts1;

/*
 Every constructor of a class has a "super" method by default(whether you define it or not)
  this method calls the constructor of the parent class
 If we pass value in the supermethod , it will call the paremeterized constructor ,
  and if no value is passed then default constructor is called
 super() is the first thing that executes by a constructor
 */

//every class extends Object Class by default (whether mentioned or not)
//if some other parent class is extended by child class , then child class will not extend Object Class 
//for eg class B only extends A, not A and Object together

class A extends Object
{
	public A() {	//default constructor
		
		super();	//will call default constructor of Object Class
		System.out.println("in A default");
		
	}
	
	public A(int n) {	//Parameterized constructor
		
		super();	//will call default constructor of Object Class
		System.out.println("in A Parameter");
		
	}
}

class B extends A
{
	//A is a parent class and B is a subclass 
	
	
	public B() {	//default constructor
		
		super();	//will call default constructor of A
		System.out.println("in B default");
	}
	
	
	public B(int n){	//Parameterized constructor
		
		super(n);		//will call default constructor of A
		System.out.println("in B parameter");
	}
	
}

public class ThisAndSuperMethods {
	public static void main(String[] args) {
		B obj = new B(5);
	}
}
