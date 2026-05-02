
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
	//therefoe here AdvCalc "is" Calc
	//at this stage the inheritance is called "single level inheritance"
	
	public int multi(int n1, int n2) {
		return n1*n2;
	}
	
	public int div(int n1, int n2) {
		return n1/n2;
	}
}

class SciCalc extends AdvCalc{
	//scientific calc should have all the functions of calc and advcalc
	//therefore it will extend AdvCalc 
	//at this stage AdvCalc is inheriting from Calc and SciCalc is inheritiing from AdvCalc
	//such type of inheritance is called "multilevel inheritance"
	
	// it has a new power(n1,n2) operation
	double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
	
}
public class InheritanceExp {
	/*
	 inheritance is a concept where a child class has access to all the properties and methods of
	 the parent class 
	 
	  suppose we want to make 3 different calc 
	  one basic calc with add() and sub() for 10$
	  one adv calc with all basic calc function and    multi() and div()
	  one scientificn calc with all functions of adv calc woth additional power() 
	 */
	public static void main(String[] args) {
		
		Calc obj = new Calc();
		AdvCalc aobj = new AdvCalc();
		SciCalc sobj = new SciCalc();
		
		int add = sobj.add(1,2);
		int sub = sobj.sub(5,4);
		int multi = sobj.multi(2,3);
		int div = sobj.div(10,2);
		double power = sobj.power(4,2);
		
		System.out.println("addition: "+add);
		System.out.println("subtraction: "+sub);
		System.out.println("multiplication: "+ multi);
		System.out.println("subtraction: "+ div);
		System.out.println("power: "+ power);
	}
	
}
