
package oopsConcepts1;
class Calc{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class AdvCalc extends Calc{
	//through the "extends" keyword , now the AdvCalc has access to all the methods of Calc
	//AdvCalc can perform all the operations of Calc
	//even if nothing is written here , an instance of this class will still be able to perform add and sub operations
	
	public int multi(int n1, int n2) {
		return n1*n2;
	}
	
	public int div(int n1, int n2) {
		return n1/n2;
	}
}
public class InheritanceExp {
	/*
	 inheritance is a concept where a child class has access to all the properties and methods of
	 the parent class 
	 
	  suppose we want to make 2 different calc 
	  one basic calc with add() and sub() for 10$
	  one adv calc with all basic calc function and addtionla multi() and div()
	 */
	public static void main(String[] args) {
		
		Calc obj = new Calc();
		AdvCalc aobj = new AdvCalc();
		
		int add = aobj.add(1,2);
		int sub = aobj.sub(5,4);
		int multi = aobj.multi(2,3);
		int div = aobj.div(10,2);
		
		System.out.println("addition: "+add);
		System.out.println("subtraction: "+sub);
		System.out.println("multiplication: "+ multi);
		System.out.println("subtraction: "+ div);
	}
	
}
