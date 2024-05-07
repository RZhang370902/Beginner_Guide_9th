// Demonstrate automatic conversion from long to double.
public class LtoD {
	public static void main(String[] args) {
		long L;
		double D;
		
		L = 100123285L;
		D = L;
		
		System.out.println("L and D: " + L + " " + D);
		
		// *** This program will not compile. ***
		
		//D = 100123285.0;
		//L = D; // Illegal!!!
		
		System.out.println("L and D: " + L + " " + D);
	}

}
