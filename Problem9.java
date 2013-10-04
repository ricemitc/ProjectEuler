/*
 * Mitchell Rice
 * projecteuler.net Problem 9
 * 
 * Problem Description: 
 * 			A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

			a2 + b2 = c2
			For example, 32 + 42 = 9 + 16 = 25 = 52.
	
			There exists exactly one Pythagorean triplet for which a + b + c = 1000.
			Find the product abc.
	
 *
 *
 *Solution:
 *
		 * a + b + c = 1000.
		 * a^2 + b^2 = c^2
		 * 
		 * c = sqrt (a^2 + b^2)
		 * 
		 * 1000 = sqrt (a^2 + b^2) + a + b
		 * (1000 -a -b)^2 = a^2 + b^2
		 * 
		 * Solve for a
		 * a = (500000-1000*b) / (1000-b)
		 * 
		 * 
		 * c > b > a		 * 
		 * c likely at least 333
		 * b must be at most 499
 *
 */


public class Problem9 {

	
	public static void main(String[] args) {
	
		
		double a, c;
		int product;
		
		for(int b=1; b<500; b++) {
			//System.out.println("Checking B: "+b);
			
			a = (500000.0-1000*b)/(1000-b);
			
			//Find a B such that A is a natural number
			if(a%1==0) {
				c = 1000-b-a;
				product = (int) (a*b*c);
				System.out.println("A is: "+a);
				System.out.println("B is: "+b);
				System.out.println("C is: "+c);
				System.out.println("Product: "+product);
				System.exit(0);
			}
		}
	}

}
