package oopsConcepts3;
class A{
	
	A(){
		//calling second constructor
		this(1);
		System.out.println("default constructor");
	}
	A(int a){
		//a constructor calling a constructor : constructor chaining
		System.out.println("new constructor called by default");
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		A obj = new A();
	}
}
