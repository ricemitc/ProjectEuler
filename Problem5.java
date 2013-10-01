/*	Mitchell Rice
 * 	Project Euler Problem 5
 * 	Solution(s):
 * 	1)I included the iterative step, but it's far to slow and unrefined. It is
 * 		basically just a brute force way of finding it (starting from the lowest
 * 		product of #1-10 so it doesn't have to check the first few thousand numbers.
 * 	2)This way uses math to weed out any redundancy. As you can see by my list of terms,
 * 		I factored out each of the numbers 1-20 so it consists of nothing but primes.
 * 		After this, I take all of the primes in the range 1-20 and find whatever number
 * 		in the range 1-20 contains the most multiples of that prime. The higher primes (19, etc)
 * 		were easy to see, but some of the other primes (like 2 or 3) that contain the most redundancy
 * 		were a little harder to think about. Alas, the multiplication yeilds the solution in an
 * 		extremely short amount of time and I run a loop to check if it's correct. 
 * 
 */


public class Problem5 {

	
	public static void main(String[] args) {

		
		//Iterative Version
		/*
		boolean smallestMultiple = false;
		boolean currentMultiple = true;
		long counter = 2520;
		
		//Continually loop until the smallest multiple of 1-20 is found
		while (smallestMultiple == false) {
			currentMultiple = true;
			//System.out.println("Checking: "+counter);

			//Check each of the 20 divisors
			for(int i=1; i<=20; i++) {
				if(counter%i!=0) {
					currentMultiple = false;
				}
			}

			//If smallestMultiple found
			if(currentMultiple == true) {
				smallestMultiple = true;
				System.out.println("Found! "+counter);
			}
			
			counter++;
		}
		*/
		
		/*The point of the math version is to weed out redundancy when you multiply
		 * everything out. Basically you take all primes 1-20 and find the numbers in 1-20
		 * that are made up of the most of that prime. The higher primes are easy to see (13,19, etc)
		 * but 2 or 3 for example you see that 18 contains the most 3's, and 20 contains the most
		 * 2s and 5s.
		 */
		
		/*		Math Version	
		 *		Factors:
		 * 
		 * 1-1*1				XXX
		 * 2-2*1				XXX
		 * 3-3*1				XXX
		 * 4-2*2				XXX
		 * 5-5*1				XXX
		 * 6-3*2				XXX
		 * 7-7*1				XXX
		 * 8-2*2*2				XXX
		 * 9-3*3				XXX
		 * 10-5*2				XXX
		 * 11-11*1				<---	(Prime)
		 * 12-3*2*2				XXX
		 * 13-13*1				<---	(Prime)
		 * 14-7*2				<---	(Contains most 7s of any #1-20)
		 * 15-5*3				XXX
		 * 16-2*2*2*2			XXX
		 * 17-17*1				<---	(Prime)
		 * 18-3*3*2				<---	(Contains most 3s of any #1-20)
		 * 19-19*1				<---	(Prime)
		 * 20-5*2*2				<---	(Contains most 5s of any #1-20)
		 * 
		 * 
		 */
		long answer = 1L;
		answer = answer*11*13*14*17*18*19*20;
		System.out.println(answer+"\n");
		//Check each of the 20 divisors
		for(int i=1; i<=20; i++) {
			System.out.println("Checking "+i+" divisor: ");
			if(answer%i==0) {
				System.out.println("Answer divisible by: "+i);
			}
			else {
				System.out.println("     Answer NOT divisible by: "+i);
			}
		}
		
	}

}
