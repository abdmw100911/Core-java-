package oopsconcepts2;

public class TypeCasting {
	/*
	 Typecasting:
	   casting one form of data into another is typecasting 
	   
	 2 Types of Typecasting : 1.primitive 2.nonprimitive typecasting
	 
	 1.Primitive typecasting:
	    when data is changed from a primitive dataype to another 
	    primitive data type
	    there are 2 types of primitive typecasting
	    
	    a. widening: changing from a smaller primitive datatype to a learger 
	    			 primitive datatype
	    			 Eg. int->double, short->int
	    			 
	    			 double a = (double)10;
	    			 
	    			 widening can be doen implicitly(automatically)
	    			 as well as explicitly(we have to specify it)
	    			 
	    			 double a = (double)10; ->explicitly
	    			 double a = 10; ->implicitly
	    			 
	    b. narrowing: changing a larger primitive datatype to a smaller 
	    		      primitive datatype
	    		      Eg. double->int, double->float
	    		      
	    		      narrowing has to be done explicitly only
	    		      
	    		      int a = (int)99.99;	
	    		      
	    		      narrowing can lead to data loss , 99.99 -> int -> 99
	    		      0.99 data lost
	   */
	
	
	public static void main(String[] args) {
		//widening
		double a = 10;
		System.out.println(a);
		
		//narrowing
		int b = (int)89.97;
		System.out.println(b);
	}
	
}
