package tools;


public class Calc {
	int add(int n1, int n2) {
		return n1+n2;
	}
	int sub(int n1, int n2) {
		return n1-n2;
	}
	int mul(int n1, int n2) {
		return n1*n2;
	}
	int div(int n1, int n2) {
		return n1/n2;
	}
	
	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(1, 2));
	}
	
}
