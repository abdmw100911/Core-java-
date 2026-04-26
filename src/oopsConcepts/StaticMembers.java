package oopsConcepts;

class Football{ //different class , same source file
	static String name  = "Champions league"; //static global variable
	
	static void play() {		//static method
		System.out.println("Playing champions league football");
	}
}
public class StaticMembers { //same class , same sourcefile
	
	static String name = "laliga"; //static global variable
	
	static void play() {			//static method
		System.out.println("Playing laliga football");
	}
	
	public static void main(String[] args) {
		//accessing members of same class(where main method is present)
		//two ways to access it 
		//1.
		System.out.println(name);
		play();
		System.out.println("---------");
		
		//2.
		System.out.println(StaticMembers.name);
		StaticMembers.play();
		System.out.println("---------");
		
		//accessing members of different class in same source file
		System.out.println(Football.name);
		Football.play();
		System.out.println("---------");

		//accessing members of different class and different source file
		//members of class Student2 in StaticKeywords.java source file
		System.out.println(Student2.schoolName);
	}
}
