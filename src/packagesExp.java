
/*
 packages are like folders that store all the classes
 
 we can create objects of classes belonging to different sourcefiles withing the same package
 
 but to create an object of a class belonging to different package , we have to import the class and then use it
 import packagename.classname
 */
import tools.Calc;
import tools.AdvCalc;
import java.lang.*; // this is always done by default,
					//due to this we can use System.out.println() without explicitly importing java.lang.*;

public class packagesExp {
	public static void main(String[] args) {
		Calc obj = new Calc();
		AdvCalc obj1 = new AdvCalc();
	}
}
