// A promotion surprise!
public class PromDemo {
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 8;
		i = b * b ; // OK, not cast needed
		
		b = 8;
		b = (byte) (b*b); // cast needed!!
		
		System.out.println("i and b: " + i + " " + b);
		
	}

}
