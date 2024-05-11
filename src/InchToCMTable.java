/* Create a table shows Inch to cm converstion
 * from range 1 inch to 20 inches
 * 1 inch = 2.54 cm
 */
public class InchToCMTable {
	public static void main(String[] args) {
		double inch, cm;
		int count = 0;
		
		for(inch = 0; inch <= 20; inch ++) {
			cm = inch * 2.54;
			System.out.println(inch + " inches = " + cm + " cm");
			
			if (count == 10) {
				System.out.println();
				count = 0;
			}
			
			count++;
		}
	}

}

//Encapsulation: combine logic and data. Provide on interface
//Polymorphism: specific implementation can change
//Inheritance: acquire properties of another object
//Engineering is problem solving
//Eng apply to software
//follow engineering design process
//Criteria/requirement + analysis/design + build/development + 
//testing + deployment/maintenance