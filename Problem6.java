/*
 * Mitchell Rice
 * Project Euler Problem 6
 * 
 * Solution:
 * Simply iterate over first 100 numbers. Keep a running sum of each number 1-100 while also 
 * keeping track of the sum of the squares of each natural number 1-100. At the end, take
 * the square of the running sum for all 1-100 numbers, and subtract from it the
 * sum of the squares count. 
 */


public class Problem6 {
	
	public static void main(String[] args) {

		int sumOfSquares = 0;
		int runningSum = 0;
		int squareOfSum;
		
		
		for(int i=1; i<=100; i++) {
			sumOfSquares += i*i;
			runningSum += i;
		}
		
		squareOfSum = runningSum * runningSum;
		
		System.out.println("Square of sum: "+squareOfSum);
		System.out.println("Sum of squares: "+sumOfSquares);
		System.out.println("Difference: "+(squareOfSum-sumOfSquares));
		//25164150
	}

}
