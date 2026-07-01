package oopsConcepts4;
interface shivam{	//interface
	//all methods in interface are public and abstract
	public abstract void love();
					void party();
}
interface amol{
	void love();
	void party();
}
interface suresh{
	void love();
	void party();
	void drive();
}
class darshan{
	void bunglow() {
		System.out.println("big bunglow");
	}
	void gold() {
		System.out.println("10kg gold");
	}
}
//9. a class can implement any number of interfaces
//	 (multiple inheritance)
class kadambari implements shivam,amol,suresh{

	@Override
	public void drive() {
		System.out.println("kadambari decides drive to marine lines");
		
	}

	@Override
	public void love() {
		System.out.println("kadambari maintaining love");
		
	}

	@Override
	public void party() {
		System.out.println("kadambari deciding where to party");
	}
	
}
/*10. a class can extend one class and implement any number
	 	 of interfaces*/
class deepika extends darshan implements shivam,suresh,amol{

	@Override
	public void drive() {
		System.out.println("deepika decides drive to manali");
		
	}

	@Override
	public void love() {
		System.out.println("deepika maintains love");
		
	}

	@Override
	public void party() {
		System.out.println("deepika manages party");
		
	}
	@Override
	void bunglow(){
		System.out.println("deepika owns buglow now");
	}
	@Override
	void gold() {
		System.out.println("deepika owns 10kg gold");
	}
	
}
public class InterfaceExp1 {
	/*
	 9. a class can implement any number of interfaces
	  	(multiple inheritance)
	 10. a class can extend one class and implement any number
	 	 of interfaces
	 11. interface cannot be instantiated 
	 12. interface doesnot contain a constructor
	  */
	public static void main(String[] args) {
		shivam s1 = new kadambari(); //upcasting
		s1.love();
		s1.party();
		
		System.out.println("-------");
		
		amol a1 = new kadambari();
		a1.love();
		a1.party();
		
		System.out.println("-------");
		
		suresh sr1 = new kadambari();
		sr1.love();
		sr1.drive();
		sr1.party();
		
		System.out.println("-------");
		
		//can access all methods of the implemented interfaces
		kadambari k1 = new kadambari();
		k1.love();
		k1.party();
		k1.drive();
		
		System.out.println("-------");
		
		shivam s2 = new deepika();
		s2.love();
		s2.party();
		
		System.out.println("-------");
		
		amol a2 = new deepika();
		a2.love();
		a2.party();
		
		System.out.println("-------");
		
		suresh sr2 = new deepika();
		sr2.drive();
		
		System.out.println("-------");
		
		darshan d1 = new deepika();
		d1.bunglow();
		d1.gold();
		
		System.out.println("-------");
		
		//shivam s3 = new shivam();
		//Cannot instantiate the type shivam(interface) error
		
		
	}
}
