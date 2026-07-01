package oopsConcepts4;

interface Backrooms{
	void kill();		//public and abstract
	
	static void thrill() {	//static concrete method
		System.out.println("thriller movie");
	}
	
	default void suspense() {	//default conrete method
		System.out.println("alien invasion");
	}
}

class abd implements Backrooms{
	@Override
	public void kill() {
		System.out.println("killing in movie");
	}
	
	//default method can be overriden
	@Override
	public void suspense() {
		System.out.println("black magic");
	}
	
	//static method cannot be overriden
	
}
public class InterfaceExp2 {
	/*
	 13. in interface , we can write concrete methods(give body to
	 	 method) using 2 ways 
	 	 1. static keyword -> cannot be inherited and overriden
	 	 2. default keyword-> can be inherited and overriden
	 */
	public static void main(String[] args) {
		Backrooms b1 = new abd();
		
		b1.kill();
		b1.suspense();
		
		//calling static method
		Backrooms.thrill();
	}
}
