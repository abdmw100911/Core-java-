package oopsConcepts3;

import java.nio.channels.Pipe.SourceChannel;

import javax.swing.plaf.synth.SynthGraphicsUtils;

class Person{
	String name;
	int age;
	char gen;
	boolean indian;
	
	//constructor
	public Person(String name, int age, char gen, boolean indian) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.indian = indian;
	}
	
	void info() {
		System.out.println("Person name is "+name+" age is "+age+" gender is "+gen);
	}
	
}

class Student extends Person{
	int rollno;
	double percentage;
	String clgname;
	public Student(String name, int age, char gen, int rollno, double percentage, String clgname, boolean indian) {
		super(name, age, gen,indian);
		this.rollno = rollno;
		this.percentage = percentage;
		this.clgname = clgname;
	}
	
	@Override
	void info() {
		System.out.println("Student name is "+name+" age is "+age+" gender is "+gen+
				"roll no is "+rollno+" percentage is "+percentage+" college name is "
				+clgname);
	}
}


class Employee extends Person{
	int empid;
	int sal;
	String role;
	
	public Employee(String name, int age, char gen, int empid, int sal, String role, boolean indian) {
		super(name, age, gen, indian);
		this.empid = empid;
		this.sal = sal;
		this.role = role;
	}
	
	@Override
	void info() {
		System.out.println("Employee name is "+name+" age is "+age+" gender is "+gen+
				"emp id is "+empid+" salary is "+sal+" role is "
				+role);
	}
	
}

class Government{
	//generalized method
	void aadhaar(Person p) {
		if(p.indian == true) {
			System.out.println(p.name+" is eligible to get aadhar card");
		}
		else {
			System.out.println(p.name+" is not eligible to get aadhar card");
		}
	}
	
	//specialized method
	
	void scholarship(Student s) {
		if(s.percentage >= 80.0) {
			System.out.println(s.name+" is eligible to get a scholarship");
		}
		else {
			System.out.println(s.name+" is not eligible to get a scholarship");
		}
	}
	
	void taxPayment(Employee e) {
		if(e.sal*12>=1200000) {
			System.out.println(e.name+" should pay tax");
			System.out.println("tax payable: "+(0.18*e.sal*12)+"/rs Only");
		}
		else {
			System.out.println(e.name+" doesnt need to pay tax");
		}
	}
}
public class Election {
	
	public static void main(String[] args) {
		Government g1 = new Government();
		
		//i can create an object of a person , emp and std 
		
		//aadhar is a generalized method , so it will operate for all the three 
		//objects
		
		//scholarship is a specialized method that will operate only for student object
		//taxpayment is also a specialized method for Employee object only
		
		Person p1 = new Person("abdullah", 20,'M',true);
		Employee e1 = new Employee("husain",12,'M',2013,100000,"dev",true);
		Student s1 = new Student("hasnain",12,'M',26,90,"IIT",false);
		
		//generalized method works for all object types
		g1.aadhaar(p1);
		g1.aadhaar(s1);
		g1.aadhaar(e1);
		
		System.out.println("----------");
		
		//specialized method for Student object only
		g1.scholarship(s1);
		//g1.scholarship(e1); //error
		//g1.scholarship(p1); //error
		
		System.out.println("----------");
		
		//specialized method for Employee only
		g1.taxPayment(e1);
		//g1.taxPayment(s1); //error
		//g1.taxPayment(p1); //error
		
		System.out.println("---------");
		
		//we can call any method and pass their objects as parameters 
		//as well
		g1.aadhaar(new Person("farooque",50,'M',true));
	}
}
