/**
 * 
 * @author Mitch
 * 
 * This problem looks at the fib numbers under 4 million and keeps a running sum of the 
 * even fib numbers. Print out the result at the end.
 */

public class Problem2 {

	
	public static void main(String[] args) {
		
		boolean maxExceeded = false;
		int firstFib = 1, secondFib = 2, sum = 0;
		int temp;
		
		//While the max of 4 million hasn't been exceeded, find more fib numbers
		while(maxExceeded == false) {
			
			//If secondFib is divisible by 2, add it to the sum
			if(secondFib % 2 == 0) {
				sum+= secondFib;
			}
			
			
			//Shifting the 2 fib numbers down the sequence
			temp = secondFib;
			secondFib = firstFib + secondFib;
			firstFib = temp;
			
			
			//If the max has exceeded, set maxExceeded to true 
			if(secondFib > 4000000) {
				maxExceeded = true;
			}
		}
		
		
		//Print the sum after the loop has finished
		System.out.println("Sum: "+sum);
		
	}

}
