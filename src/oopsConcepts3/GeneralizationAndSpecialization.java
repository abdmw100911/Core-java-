package oopsConcepts3;
//example of generalization
//upi, netbaking and creditcard are all forms of payment 
//so they are generalized into "payment"

class payment{
	void pay(double amount) {
		System.out.println("payment of "+amount);
	}
}

class upi extends payment{
	@Override
	void pay(double amount) {
		System.out.println("paid "+amount+" using upi");
	}
}

class creditcard extends payment{
	@Override
	void pay(double amount) {
		System.out.println("paid "+amount+" using credit card");
	}
}

class netbanking extends payment{
	@Override
	void pay(double amount) {
		System.out.println("paid "+amount+" using netbanking");
	}
}
public class GeneralizationAndSpecialization {
	/*
	 Generalization : 
	 	is when , method operates on different types of object 
	 	
	 	to achieve generalization , the parameter of methos must be of superclas type
	 	we then pass subclass object to it which automatically get upcasted
	 	to superclass type
	 
	 Specialization : 
	 	here the method operates on only single type of object
	 	
	 	the parameter here is of subclass type, thus we cannot pass different
	 	objects to it
	 	
	 Genralization is used to operate on common properties of objects
	 
	 specialization is used to work on specific properties of object
	 	
	 */
	public static void main(String[] args) {
		//generalization use
		//using the same class type to reference different types of object
		
		payment p1 = new upi();
		payment p2 = new creditcard();
		payment p3 = new netbanking();
		
		p1.pay(100);
		p2.pay(10000);
		p3.pay(100000000);
		
	}
}
