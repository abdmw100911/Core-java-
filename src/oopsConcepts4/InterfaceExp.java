package oopsConcepts4;
interface Vehicle{ //interface
	
	/*
	 #interface can have variables but those variables are
	 	automatically public static and final
	 */
	public static final int n = 10;
						int g = 20;
	
	/*
	 interface allows only abstract methods and defined methods 
	 	are automatically public and abstract
	 */
    public abstract void race();
    					void drift();
    					
	
}
/*
#interface can achieve Is a relationship with a class 
(inheritance) using "implements" keyword instead of 
"extends"
*/
class Car implements Vehicle{

	@Override
	public void race() {
		System.out.println("Racing");
		
	}

	@Override
	public void drift() {
		System.out.println("drifting..");
		
	}
	
}
public class InterfaceExp {
	/*
	 in abstract class we can create concrete method as well as 
	 abstract method , thus we cannot achieve 100 percent abstraction
	 
	 to achieve 100% abstract we use "INTERFACE"
	 
	 1. interface is a javatype definition which is declared using 
	 	interface keyword
	 	
	 2. it acts as a medium between 2 systems 
	 	client and object with services 
	 
	 3. #interface can have variables but those variables are
	 	automatically public static and final
	 
	 4. #interface can achieve Is a relationship with a class 
	 	(inheritance) using "implements" keyword instead of 
	 	"extends"
	 
	 5. interface allows only abstract methods and defined methods 
	 	are automatically public and abstract
	 
	 6. when a class implements interface then mandatorily 
	 	we have to override the abstract method of interface
	 
	 7. while overriding the method , access specifier should be
	 	same or of higher visibilty
	 	like public --- public 		is ok
	 		 public --- private 		not ok
	 */
	public static void main(String[] args) {
		
		
		//Vehicle v1 = new Vehicle(); //error
		//we cannot instantiate a interface
		
		Vehicle v1 = new Car(); //upcasting
		
		v1.race();
		v1.drift();
		
	}
}
