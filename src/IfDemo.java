/*
 * Demonstrate the if.
 * 
 * Call this file IfDemo.java.
 */
public class IfDemo {
	public static void main(String[] args) {
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a is less than b");
		// this won't display anything
		if(a == b) System.out.println("yong won't see this");
		
		System.out.println();
		
		c = a - b; // c contains -1
		
		System.out.println("c contains -1");
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a; // c contains 1
		
		System.out.println("c contains 1");
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
	}

}
