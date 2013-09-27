/* ProjectEuler.net
 * Problem 3 Solution
 * Mitchell Rice
 * 
 * Problem Description: 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Solution Description:
 * -Find list of all factors of 600851475143 by iterating. 
 * -Find out which is prime
 * - Keep track of largest.
 */

public class Problem3 {

	public static void main(String[] args) {

		int largestPrimeFactor = 0;
		long numToAnalyze = 600851475143L;
		
		
		//find if i is a factor of numToAnalyze
		for(int i=2; i<(int)Math.sqrt(numToAnalyze); i++) {
			
			//If evenly divides, check and see if it's prime
			if(numToAnalyze % i == 0) {
				if(isPrime(i)) {
					//i is prime and theoretically larger than previous largestPrimeFactor so reassign
					largestPrimeFactor = i;
					System.out.println("Current Largest Prime Factor: "+ largestPrimeFactor);
				}
			}
		}
	}
	
	
	//Static method to determine if number n is prime
	public static boolean isPrime(int n) {
		//Assume prime unless proven otherwise
		boolean isPrime = true;
		
		//Iterate through all possible factors of n
		for(int i=2; i<=Math.sqrt(n); i++){
			
			if(n%i == 0 && n!=i) {
				//n not prime. Can exit loop
				isPrime = false;
				break;
			}	
		}
		
		return isPrime;
		}
}
