package oopsConcepts1;

/*
 Super Method : super()
 
 Every constructor of a class has a "super" method by default(whether you define it or not)
  this method calls the constructor of the parent(super) class
 If we pass value in the supermethod , it will call the paremeterized constructor ,
  and if no value is passed then default constructor is called
 super() is the first thing that executes by a constructor
 */

/*
 This Method : this();
 
 this() executes the constructor of the same class
 if no values is passed , then it executes the default constructor of the same class
 if a parameter is passed , then it executes the parameterized constructor of the same class
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
		
		this();			//will call default constructor of same Class (class B)
		//super(n);		//will call default constructor of A
		System.out.println("in B parameter");
	}
	
}

public class ThisAndSuperMethods {
	public static void main(String[] args) {
		B obj = new B(5);
		//execution flow after creating obj and passing value
		//1. first parameter constructor of class B will be called
		//2. default constructor of Class A is called and "in A default" is printed 
		//3. this() executes and calls default constructor of same class (class B) and "in B default" is printed 
		//4. finally "in B Parameter is printed"
	}
}
