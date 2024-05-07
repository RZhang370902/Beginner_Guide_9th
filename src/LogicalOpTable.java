// Try This 2-2: a truth table for the logical operators.
public class LogicalOpTable {
	public static void main(String[] args) {
		
		boolean p, q;
		int p_state, q_state, VAND, VOR, VXOR, VNOT;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");

		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		System.out.println();
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		p_state = q_state = VAND = VOR = VXOR = VNOT = 0;
		if(p) p_state = 1;
		if(q) q_state = 1;
		if(p&q) VAND = 1;
		if(p|q) VOR = 1;
		if(p^q) VXOR = 1;
		if(!p) VNOT = 1;
		System.out.print(p_state + "\t" + q_state + "\t");
		System.out.print(VAND + "\t" + VOR + "\t");
		System.out.println(VXOR + "\t" + VNOT + "\t");
		
		p = true; q = false;
		p_state = q_state = VAND = VOR = VXOR = VNOT = 0;
		if(p) p_state = 1;
		if(q) q_state = 1;
		if(p&q) VAND = 1;
		if(p|q) VOR = 1;
		if(p^q) VXOR = 1;
		if(!p) VNOT = 1;
		System.out.print(p_state + "\t" + q_state + "\t");
		System.out.print(VAND + "\t" + VOR + "\t");
		System.out.println(VXOR + "\t" + VNOT + "\t");
		
		p = false; q = true;
		p_state = q_state = VAND = VOR = VXOR = VNOT = 0;
		if(p) p_state = 1;
		if(q) q_state = 1;
		if(p&q) VAND = 1;
		if(p|q) VOR = 1;
		if(p^q) VXOR = 1;
		if(!p) VNOT = 1;
		System.out.print(p_state + "\t" + q_state + "\t");
		System.out.print(VAND + "\t" + VOR + "\t");
		System.out.println(VXOR + "\t" + VNOT + "\t");
		
		p = false; q = false;
		p_state = q_state = VAND = VOR = VXOR = VNOT = 0;
		if(p) p_state = 1;
		if(q) q_state = 1;
		if(p&q) VAND = 1;
		if(p|q) VOR = 1;
		if(p^q) VXOR = 1;
		if(!p) VNOT = 1;
		System.out.print(p_state + "\t" + q_state + "\t");
		System.out.print(VAND + "\t" + VOR + "\t");
		System.out.println(VXOR + "\t" + VNOT + "\t");
		
	}

}
