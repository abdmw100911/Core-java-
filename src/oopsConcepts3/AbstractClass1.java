package oopsConcepts3;
abstract class Tumbad{	//abstract class
	
	void fly() {		//concrete method
		System.out.println("flying..");
	}
	
	abstract void kill();	//abstract method
}

class PK{
	void dance() {	//concrete method
		System.out.println("wrong number");
	}
	
	//abstract void kill(); //error
}


public class AbstractClass1 {
	/*
	 concrete method : 
	 	returnType methodName(){
	 		//method body
	 	}
	 
	 abstract method :
	 	abstract returnType methodName();
	 	
	 	//abstract method doesnot have a body
	 
	 concrete class can have only concrete methods
	 
	 abstract class can have both concrete and abstract method
	
	 #abstract method and class can be defined using "abstract" keyword
	 */
	public static void main(String[] args) {
		PK obj = new PK();
		obj.dance();
		
		//Tumbad obj1 = new Tumbad();//error 
		//we cannot instantiate abstract class
	}
}
