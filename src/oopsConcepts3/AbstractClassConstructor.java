package oopsConcepts3;


abstract class A1{
	A1(){
		System.out.println(" in A constructor");
	}
}

class B extends A1{
	B(){
		System.out.println("in B constructor");
	}
}

public class AbstractClassConstructor {
	/*
	 //can abstract class have a constructor
	    yes abstract class have a constructor , but it is invoked by subclass 
	    using super() either implcitly or explicitly
	 */
	public static void main(String[] args) {
		B obj = new B();
	}
}
