/* ProjectEuler.net
 * Problem 1 Solution
 * Mitchell Rice
 * 
 * Problem Description: 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */


public class Problem1 {

	
	public static void main(String[] args) {

		int sumMultiples = 0;
		
		//Loop through first 1000 integers
		for(int i=1; i<1000; i++){
			
			//If 3 or 5 evenly divides i, add to total
			if(i%3==0 || i%5==0)
				sumMultiples+=i;
		}
		
		System.out.println("Sum of multiples 3 or 5: "+sumMultiples);
		
		
	}
}
