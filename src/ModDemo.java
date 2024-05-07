// Demonstrate teh % operator.
public class ModDemo {
	public static void main(String[] args) {
		int iresult, irem;
		double dresult, drem;
		int x;
		int y;
		
		iresult = 10 / 3;
		irem = 10 % 3;
		
		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;
		
		System.out.println("Result and remainder of 10 /3: " +
				iresult + " " + irem);
		System.out.println("Result and remainder of 10.0 /3.0: " +
				dresult + " " + drem);
		
		for(x=0; x < 10; x++) {
			y = x++;
			System.out.println("x: " + x + " y: " + y);
		}
	}

}
