package oopsConcepts1;

class A1{
	public A1() {
		System.out.println("A1 object created");
	}
	public void show() {
		System.out.println("showing A1");
	}
}
public class AnonymousObjects {
	public static void main(String[] args) {
		//a object with no variable to reference it is a anonymous object 
		//anonymous objects , once created , cannot be reused 
		
		A1 obj;	//reference variable	
		obj = new A1();	//referenced object 
		
		//referenced object can be reused any number of times 
		obj.show();
		obj.show();
		//everytime show() is called , new object is not created (this is when using referenced object)
		
		new A1();	//anonymous object
		new A1().show(); 
		new A1().show();
		//everytime show() is called , a new object is created (this is when using anonymous object)
		
	}
}
