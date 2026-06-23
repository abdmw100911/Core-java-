package oopsConcepts3;
//when a class extends abstract class

//1. when a class inherits a abstract class, we have to override all the 
//	 abstract methods and give them a implementation/body
abstract class Swarg{	//abstract class
	
	abstract void menka();		//abstract methods
	abstract void urvashi();
	abstract void nora();
	
	void narad() {				//concrete method
		System.out.println("naarayan naarayan");
	}
}

abstract class Indra extends Swarg{

	@Override
	void menka() {
		System.out.println("menka method");
		
	}

	@Override
	void urvashi() {
		System.out.println("urvashi method");
	}

}

class Abd extends Indra{
	@Override
	void nora() {
		System.out.println("abd nora");
	}
}

public class ContractOfAbstractClass {
	/*
	 1. when a class inherits a abstract class, we have to override all the 
	 	abstract methods and give them a implementation/body
	 
	 2. when a class inherits a abstract class and we dont want to override 
	 	the inherited abstract method , then that subclass has to be turned into a 
	 	abstract class
	 */
	public static void main(String[] args) {
		
		//Swarg s1 = new Indra(); //upcasting, when indra overrides all methods of abstract class 
		
		//when indra doesnot override certain method , it has to be converted into abstract class itself
		//and we cannot instantiate abstract class 
		
		//so we create a class "Abd" that extends indra and instantiate Abd
		
		Swarg s1 = new Abd();
		//this is abstraction , where the main implementation is hidden and cannot be accessed
		
		//through this we can access all methods of abstract class
		s1.menka();
		s1.urvashi();
		s1.nora();
		s1.narad();
	}
}
