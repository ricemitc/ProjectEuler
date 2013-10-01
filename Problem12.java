/*
 * Mitchell Rice
 * ProjectEuler Problem 12
 * 
 * Solution:
 * My solution was to compute each triangle number, and then count the number of factors it had.
 * Upon my inital attempt, I didn't realize exactly how big this number would be. Therefore my
 * program took forever to find the solution and I knew I could optimize it. I looked at how I 
 * was counting the number of factors. I realized I was doing twice as much work as I needed to
 * (for all 12 thousand numbers). I only needed to check the first half of the number. For example,
 * take 38. It's factors are: 1,2,19,38. The square root of 38 is 6.164, so I only need to check
 * the first 1-6 factors of 38. Then, multiply that by 2 to get the other side of the number and 
 * I have the number of terms. This is slightly off for any square numbers. Take 16. It's factors
 * are: 1,2,4,8,16. It has 1 less than double the sqrt(16) because it is a square number and 4 is
 * used twice. To solve that, I checked for any square numbers and took the off-by-1 into consideration.
 */



public class Problem12 {

	
	public static void main(String[] args) {

		int triangleCount = 2;
		int divisorCount = 0;
		long triangleNumber = 1;
		boolean highlyDivisibleFound = false;
		
		while(highlyDivisibleFound == false) {
			//Reset divisor count
			divisorCount = 0;
			
			//Print current triangle number we are evaluation
			System.out.println("Triangle number: "+triangleNumber);
			
			//Only need to check 1 side of the triangle number's factors. 
			for(int i=1; i<=(int)Math.sqrt(triangleNumber); i++) {
				
				//If i divides evenly, it's a factor
				if(triangleNumber%i==0) {
					divisorCount++;
				}	
			}
			
			//If current triangle number is a square number, number factors is 1 less than double
			if((int)Math.sqrt(triangleNumber)*triangleNumber == triangleNumber){
				divisorCount = (divisorCount*2)-1;
			}
			else {
				divisorCount = divisorCount*2;
			}
			
			//If divisorCount meets problem criteria, stop and print results.
			if(divisorCount > 500) {
				System.out.println("Highly divisible found! "+triangleNumber);
				highlyDivisibleFound = true;
			}
			
			//Find next triangle number
			triangleNumber = triangleNumber+triangleCount;
			triangleCount++;

		}
		System.out.println("Triangle Count: "+triangleCount);
	}

}
