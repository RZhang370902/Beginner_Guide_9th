/*
 * Compute your weight on the moon.
 * 
 * Call this file Moon.java.
 */
public class Moon {
	public static void main(String[] args) {
		double earthweight; // weight on earth
		double moonweight; // wight on moon
		earthweight = 180;
		
		moonweight = earthweight * 0.17;
		
		System.out.println(earthweight + " earth-punds is equivalen to "
				+ moonweight + " moon-pounds.");
	}

}
