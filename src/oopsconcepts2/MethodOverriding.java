package oopsconcepts2;
class Father{
	void house() {
		System.out.println("3 bhk wallace house");
	}
}

class Son extends Father{
	@Override
	void house() {
		System.out.println("1 buglow in a quiet place");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		/*
		 MethodOverriding:
		   inheriting method from superclass and changing its implementation in the subclass
		   as per subclass specification is called as method overriding
		   
		   we can override the method by using the same declaration as done in the 
		   superclass 
		   
		   also before overriding we have to use @Override , to indicate that the method 
		   is overriden and prevent accidental creation of a new method
		   
		   
		   we can override only non static methods , coz static methods are not inherited by 
		   subclass
		   
		   also we cannot override non static methods with "private" access modifier 
		   coz private access specifier restricts the access of that method to only that class
		 */
		Father f1 = new Father();
		Son s1 = new Son();
		
		s1.house();
		f1.house();
	}
}
