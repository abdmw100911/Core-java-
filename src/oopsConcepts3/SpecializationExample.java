package oopsConcepts3;
/*
 employee is a generalized class , 
 employee has a name , id , and it has a salary
 
 but dev and tester is a specialized class 
 only dev can code and only tester can test
 */

class emp{
	String name;
	int id;
	int sal;
	
	
	public emp(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}


	void work() {
		System.out.println(name+"is working");
	}
}

class dev extends emp{
	
	
	public dev(String name, int id, int sal) {
		super(name, id, sal);
	}

	void code() {
		System.out.println(name+" is coding");
	}
}

class tester extends emp{
	
	
	
	public tester(String name, int id, int sal) {
		super(name, id, sal);
		// TODO Auto-generated constructor stub
	}

	void test() {
		System.out.println(name + " is testing code");
	}
}
public class SpecializationExample {
	public static void main(String[] args) {
		
		//generalization
		emp e1 = new dev("abdullah",1,1000);
		emp e2 = new tester("bcs", 2, 111);
		
		
		//downcasting + specialization
		dev d1 = (dev)e1;
		d1.work();
		d1.code(); //developer specific
		System.out.println(d1.name+" "+d1.id+" "+d1.sal);
		
		System.out.println("-------");
		
		tester t1 = (tester)e2;
		t1.work();//all emp work
		t1.test();//only tester can test
		
		System.out.println(t1.name+" "+t1.id+" "+t1.sal);
	}
}
