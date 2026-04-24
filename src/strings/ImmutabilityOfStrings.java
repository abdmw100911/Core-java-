package strings;

public class ImmutabilityOfStrings {
	public static void main(String[] args) {
		String name = "abdullah";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		name = name + "mewawala";
		//this doesnt change the old object created 
		//instead a new object is created and reference to new object is given in "name"
		
		System.out.println(name);
		System.out.println(name.hashCode());
		
		//here only one object is created to store "abdullah" and reference of that object is given to 
		//both s1 and s2
		String s1 = "abdullah";
		String s2 = "abdullah";
		if(s1 == s2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}
}
