package oopsconcepts2;

//multiple method with same name but different parameter length,type and sequence
class example1{
	void dance() {
		System.out.println("samba");
	}
	void dance(int a) {
		System.out.println("breakdance");
	}
	//different parameter type
	void dance(double a) {
		System.out.println("bhangda");
	}
	//different parameter length
	void dance(int a, double b) {
		System.out.println("lavni");
	}
	//different parameter sequence
	void dance(double b, int a) {
		System.out.println("hiphop");
	}
}

//in one class we can overload both static and nonstatic method
class example2{
	static void name() {
		System.out.println("abdullah");
	}
	static void name(int a) {
		System.out.println("messi");
	}
	
	void country() {
		System.out.println("india");
	}
	void country(int a) {
		System.out.println("argentina");
	}
}

//we can overload subclass with the inherited method as well
class example3 extends example1{
	//dance() is inherited from example 1 , overloading that method
	void dance(int a , int b) {
		System.out.println("bharatnatyanm");
	}
}
public class MehthodOverloading {
	public static void main(String[] args) {
		/*
		 Method Overloading: 
		 	One class defining multiple methods with the same name but different:
		 	a. parameter type
		 	b. parameter length (number of parameters)
		 	c. parameter sequence
		 	
		 	in one class we can overload both static and nonstatic method
		 	
		 	we can overload subclass with the inherited method as well
		 	
		 	Q.Can we overload main method?
		 		yes we can overload main method , but execution will start from (String[] args)
		 		main method only , we can call other overloaded main methods from string array
		 		main method for their execution
		 */
		
		example1 obj1 = new example1();
		
		obj1.dance();//samba
		obj1.dance(1);//breakdance
		obj1.dance(1.1);//bhangda
		obj1.dance(1,1.1);//lavni
		obj1.dance(1.1,1);//hiphop
		
		System.out.println("--------");
		
		example2 obj2 = new example2();
		//calling static method
		example2.name();
		example2.name(10);
		
		//calling non static method
		obj2.country();
		obj2.country(10);
		
		System.out.println("-------");
		
		example3 obj3 = new example3();
		
		obj3.dance(1,2); //bharatnatyam
		
		System.out.println("---------");
		//overloading main method 
		main(1);
	}
	
	//overloading main method
	public static void main(int a) {
		System.out.println("int main method");
	}
}
