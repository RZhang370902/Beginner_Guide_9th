/*
 * This program attempts to declare a variable
 * in an inner scope with the same name as one
 * defined in an outer scope.
 * 
 * *** This program will not compile. ***
 */
public class NestVar {
	public static void main(String[] args) {
		int count;
		int count2;
		
		for(count = 0; count < 10; count = count + 1) {
			System.out.println("This is count: " + count);
			
			//int count2 = 0;// illegal!!!
				for(count2 = 0; count2 < 2; count2++) {
				System.out.println("count2: " + count2);
			}
			 System.out.println("This program is in error!");
			
		}
	}

}
