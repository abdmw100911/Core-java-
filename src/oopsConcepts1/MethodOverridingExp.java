package oopsConcepts1;

class A2{
	public void show() {
		System.out.println("Showing A2");
	}
}

class B2 extends A2{
	//B2 inherits A2
	//B2 thus has access to 2 show() methods 
	//one of its own and one of its parent class 
	//more preference is given to its own method
	public void show() {
		System.out.println("showing B2");
	}
}
public class MethodOverridingExp {
	public static void main(String[] args) {
		/*
		 method overriding : when a child class has the same method name as the parent class 
		 					 and when object of child class is created 
		 					 then , more preference is given to method of the child class 
		 					 
		 therefore , child class method overrides the method of the parent class
		 */
		
		B2 obj = new B2();	//object of class B2 is created 
		
		obj.show();
	}
}
