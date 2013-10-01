/* ProjectEuler.net
 * Problem 10 Solution
 * Mitchell Rice
 * 
 * Problem Description: 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * 
 * Solution:
 * Solution is to iterate i through the numbers 1-2,000,000. Do a preliminary test to speed up
 * process and see if i is composite of several common numbers (2, 3, 5, 7, 11, etc.). Added condition
 * for this that i must be greater than those numbers because that list includes several primes.
 * If fails preliminary test (i is immediately found composite) continue to next i. Else,
 * iterate through all possible divisors of sqrt(i). If finds a divisor, break out of loop and go to 
 * next i. If gets to end of iterator and no j divides i evenly, it's prime and add to total.
 * Print total.
 */

import java.lang.Math.*;

public class Problem10 {

	
	public static void main(String[] args) {

		long sumOfPrimes = 0;
		boolean isPrime;
		
		//Start at 2 because 1 is composite (avoids an extra comparison by starting at 1)
		for(int i=2; i<=2000000; i++) {
			//i assumed to be prime until proved composite
			isPrime = true;
			
				//Only need to loop up to square root of i
				for(int j=2; j<=Math.sqrt(i); j++){
					
					if(i%j == 0 && i!=j) {
						//i not prime. Can exit loop
						isPrime = false;
						break;
					}	
				}
				if(isPrime == true) {
					//System.out.println(i+ " ");
					sumOfPrimes += i;
				}
			}
		
			System.out.println("Sum of primes: "+sumOfPrimes);
		}
	}

