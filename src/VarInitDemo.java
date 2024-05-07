// Demonstrate lifetime of a variable.
public class VarInitDemo {
	public static void main(String[] args) {
		int x;
		int z = 0;
		
		System.out.println("z is: " + z);
		
		for(x = 0; x < 3; x++) {
			int y = -1; // y is initialized each time block is entered
			System.out.println("y is: " + y);
			y = 100;
			System.out.println("y is now : " + y);
			z++;
		}
		
		System.out.println("z is now: " + z);
	}

}
