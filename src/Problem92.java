/**
 * Project Euler Problem 92 Solution
 * 
 * 
 * Problem Description:
 * A number chain is created by continuously adding the square 
 * of the digits in a number to form a new number until it has been seen before.
 * How many starting numbers below ten million will arrive at 89?
 * 
 * Solution:
 * Brute force to find every chain ending in 89 or 1. Don't need a count of 1, but
 * every chain should end in 89 or 1 so I decided to count them anyway. 
 * 
 * 
 * @author Mitchell Rice
 *
 */


public class Problem92 {

	
	
	public static void main(String[] args) {

		int countOf89 = 0;
		int countOf1 = 0;
		int currentNumber; 
		
		for(int i=1; i<10000000; i++) {
			
			//Set currentNumber to i at the start of chain-searching
			currentNumber = i;
			//System.out.println("CurrentNumber is: "+currentNumber);
			
			
			
			//While the chain hasn't gotten to 89 or 1
			while(currentNumber != 89 && currentNumber != 1) {
				
				//Find new sum of squared digits in current number and reassign to currentNumber
				currentNumber = (int) sumSquareDigits(currentNumber);							
			}

			if(currentNumber==89) {
				countOf89++;
				//System.out.println("89++");
			}
			
			if(currentNumber==1) {
				countOf1++;
				//System.out.println("1++");

			}
			
		}
		
		System.out.println("Count of 89: "+countOf89);
		System.out.println("Count of 1: "+countOf1);
	}

	
	//Static method to find the sum of the square of the digits in n
	public static long sumSquareDigits(int n) {
		
		int currentNumber = n;
		int sumOfSquareDigits=0;
		int currentDigit = 0;
		
		//While currentNumber is in double digits or more, take digits apart
		while (currentNumber >=9) {
			//Analyze end digit
			currentDigit = currentNumber%10;
			//Square digit and add to sum
			sumOfSquareDigits += (currentDigit*currentDigit);
			//Shorten currentNumber to exclude last digit
			currentNumber = (int)currentNumber/10;			
		}
		//After gotten down to a single digit
		sumOfSquareDigits += (currentNumber*currentNumber);
		
		return sumOfSquareDigits;
	}
}
