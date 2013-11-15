/**
 * Project Euler Problem 16 Solution
 * 
 * Problem Description:
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
 * 
 * Solution:
 * I decided to use an array to keep track of the digits in 2^1000. Each time I need
 * to find a new power, I loop through the array and multiply each element by 2 (simulating
 * a new power). Anything that carries over to the next digit is handled by the "carry" variable.
 * I chose 350 as a guess to the number of digits 2^1000 would have. This is because I figured
 * on average, it would take around 3 iterations of x2 before a new digit is needed. 1000/3=333, so 350 to be safe.
 * This 3 iterations comes from the following:
 * 		Look at the leftmost (most significant) digit.
 * 		Several Cases to consider:
 * 			-If this digit is low, (1-2) you'd need 3 or more iterations before a new digit needed.
 * 			-If digit is medium (3-4) you'd need at least 2 iterations before needing a new digit. 
 * 			-If digit is higher (5-9) you only need 2 iterations before a new digit is needed.
 * But, as soon as you need a new digit, you start back over at 1 as the most significant digit. So, most of the
 * time you will need at least 3 iterations before needing a new digit. 1000 iterations/3 iterations per digit = 333 (350 digits needed)
 * 
 * My prediction was actually pretty accurate, as it turns out you only need exactly 300 digits for 2^1000. 
 * 
 * @author Mitchell Rice
 *
 */


public class Problem16 {

	
	
	public static void main(String[] args) {

		
		//Declare the array of digits and fill it originally with 1 (2^0)
		int[] powerOfTwo = new int[350];
		powerOfTwo[powerOfTwo.length-1] = 1;
		int carry, multiply, lastDigit;
		
		
		//Loop for the given number of powers. (2^i)
		for(int i=1; i<=1000; i++) {
			
			
			carry =0;
			//Loop backwards through away and simulate the multiplication by 2 for this iteration
			for(int j=powerOfTwo.length-1; j>=0; j--) {
				
				//If the current digit needs to carry to next digit
				if(powerOfTwo[j]*2 > 9) {
					
					
					multiply = powerOfTwo[j]*2;
					//Find the non carry digit
					lastDigit = multiply%10;
					//Set the current position to the value of the non carrying digit + the carry amount from prev. digit
					powerOfTwo[j] = lastDigit + carry;
					//Assign the carry. (For powers of 2 it will never be more than 1, because most is 2x9=18... carry=1)
					carry = multiply/10;
										
				}
				else {
					//Else, no need to carry anything. So do multiplication, then add carry from previous digit
					powerOfTwo[j] *=2;
					powerOfTwo[j] += carry;
					//Reassign carry to 0 for the next digit
					carry =0;
				}
			}
		}
		

		
		//Loop through and find the sum of the digits (while printing the array)
		int sumDigits = 0;
		for(int i=0; i<powerOfTwo.length; i++) {
			System.out.print(powerOfTwo[i]);
			sumDigits += powerOfTwo[i];
		}
		
		System.out.println();
		System.out.println("Sum of Digits: "+sumDigits);
		
		
	}

}
