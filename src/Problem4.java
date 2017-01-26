/*
 * Start with combos of 100x100 (no need to look at 2 digits)
 * Also, the highest number 3 digit numbers multiplied together can be is: 998001 (999x999)
 * 
 * 2 ways: 
 * 		-Brute force (n^2 time) (Chosen method)
 * 
 * 		-Start at 998001 and work backwards. First check if it's a palindrome. Then 
 * 		to make sure it isn't prime. Then check to make sure it's two divisors are 3 digits long.
 * 		Also no need to loop lower than 10000 (100 * 100)
 */







public class Problem4 {

	
	public static void main(String[] args) {

				 
		
		//The following is a brute force method operating in n^2 time. Checks every possible multiplication
		int product;
		int biggestProduct = 0;
		for(int i=100; i<=999; i++) {
			for(int j=100; j<=999; j++) {
				product = i*j;
				if(palindrome(product)) {
					if(product > biggestProduct) {
						biggestProduct = product;
					}
				}
			}
		}	
		System.out.println(biggestProduct +" Is the largest palindrome of two 3 digit numbers.");
	
	}
	
	
	//Static method to check and see if a number is a palindrome
	static boolean palindrome(int n) {
		
		int num=n;
		int rev = 0;
		int dig;
		
		while (n > 0)
		{
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}
		
		if(num==rev) {
			return true;
		}
		return false;
	}
	
}



