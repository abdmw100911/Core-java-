package tools;

public class AdvCalc extends Calc {
	int modulo(int n1,int n2) {
		return n1%n2;
	}
	
	public static void main(String[] args) {
		AdvCalc obj = new AdvCalc();
		
		System.out.println(obj.add(1,2));
		System.out.println(obj.modulo(10, 2));
	}
}
