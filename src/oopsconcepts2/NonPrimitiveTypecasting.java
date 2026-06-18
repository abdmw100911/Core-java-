package oopsconcepts2;

class father{
	int father_age = 50;
	
	void work() {
		System.out.println("father is working");
	}
}

class son extends father{
	int son_age = 20;
	
	void study() {
		System.out.println("son is studying java");
	}
}

public class NonPrimitiveTypecasting {
	/*
	 Non primitive Type casting: 
	 	it includes typecasting of userdefined objects
	 	it has 2 types: upcasting and downcasting
	 	
	 	1. upcasting:
	 		superclass reference = subclass object;
	 		
	 		the subclass object is given a superclass reference , thus it is upcasted
	 		
	 		upcasting can be done implicitly as well as explicitly
	 		
	 		upcasting hides the property of the subclass, thus properties of only
	 		superclass are accessible
	 	
	    2. downcasting: 
	    	
	    	subclass reference = superclass upcasted object reference
	    	
	    	sublcass type reference is given to a superclass upcasted object, thus that
	    	objects is now downcasted
	    	
	    	downcasting has to be done explicitly
	    	
	    	downcasting can only be done on objects that have been previously upcasted 
	    	else it causes error(class cast exception)
	 */
	public static void main(String[] args) {
		//upcasting 
		father f1 = new son();
		
		//son class properties are hidden
		//f1.study();->error
		
		System.out.println(f1.father_age);
		f1.work();
		
		System.out.println("-------");
		
		//downcasting
		son s1 = (son)f1;
		
		//now both properties can be accessed
		System.out.println(s1.father_age);
		s1.work();
		
		System.out.println(s1.son_age);
		s1.study();
	}
}
