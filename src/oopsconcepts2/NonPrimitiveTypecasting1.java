package oopsconcepts2;

class Animal{
	void eat() {
		System.out.println("eating food");
	}
	void drink() {
		System.out.println("drinking water");
	}
	void sound() {
		System.out.println("making animal sound");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("making woof woof sound");
	}
	void type() {
		System.out.println(" a dog");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("making meow meow sound");
	}
	
	void type() {
		System.out.println("A cat");
	}
}
public class NonPrimitiveTypecasting1 {
	/*
	 Non primitive typecasting with methodoverriding :
	 		
	 	when a sublass overrides a method, even if the subclass is upcasted
	 	the overriden method will still execute
	 	
	 	normal behaviour -> when subclass is upcasted
	 						all methods of subclass will be hidden
	 	
	 	overriden behavious -> when subclass is upcasted 
	 						   overriden methods of subclass can still execute
	 */
	
	public static void main(String[] args) {
		//upcasting
		Animal a1 = new Dog();
		
		//method overriden in Dog subclass will still execute
		a1.sound();
		
		//Dog subclass'es own method will be hidden 
		//a1.type();->error
		
		System.out.println("--------");
		
		//upcasting Cat class
		Animal a2 = new Cat();
		
		//method overriden in Cat subclass will still execute
		a2.sound();
		
		//Cat subclass'es own method will be hidden 
		//a2.type();->error
	}
}
