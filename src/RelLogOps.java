// Demonstrate teh relational and logical operator.
public class RelLogOps {
	public static void main(String[] args) {
		int i, j;
		boolean b1, b2;
	
		i = 10;
		j = 11;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("this won't execute");
		if(i >= j) System.out.println("this won't execute");
		if(i > j) System.out.println("this won't execute");
	
		b1 = true;
		b2 = false;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		if(b1 & b2) System.out.println("this won't execute");
		if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
		if(b1 | b2) System.out.println("b1 | b2 is true");
		if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
		
	
	}
}
