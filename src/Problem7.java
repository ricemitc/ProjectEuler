
public class Problem7 {

	
	public static void main(String[] args) {
		int primeCount = 0;
		boolean primeCountReached = false;
		int counter = 2;
		while (primeCountReached==false) {
			if(isPrime(counter)) {
				System.out.println(counter);
				primeCount++;
			}
			if(primeCount == 10001) {
				System.out.println("Final 10001 prime: "+counter);
				primeCountReached = true;
			}
			counter++;
		}
		System.out.println("Final Prime Count: "+primeCount);
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
