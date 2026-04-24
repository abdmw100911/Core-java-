package strings;

public class StringBufferExp {
	public static void main(String [] args) {
		StringBuffer sb = new StringBuffer("abdullah");
		
		System.out.println(sb.hashCode());
		sb.append(" mewawala");
		
		sb.insert(8, " farooque");
		System.out.println(sb);
		
		System.out.println(sb.hashCode());
		
	}
}
