package oopsconcepts2;

class Abba{
	
}
class Beta extends Abba{
	
}
class Beti extends Abba{
	
}

public class NonPrimitiveTypecasting2 {
	/*
	 Class cast exception :
	 	A ClassCastException occurs when you try to downcast an object 
	 	to a subclass that it is not actually an instance of.
	*/
	public static void main(String[] args) {
		
		//an object of Beta is created and referenced by superclass type reference a1
		Abba a1 = new Beta();
		
		//upcasted beta object can be downcasted to a beta object only
		//but you are downcasting it to a Beti object 
		//thus class cast excetpion occurs 
		//Beta b1 = (Beta)a1; this will be valid downcasting
		Beti b1 = (Beti)a1;
		
		
	}
}
