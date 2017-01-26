
public class Problem30 {

	
	
	public static void main(String[] args) {


		/*Find sum of 5th power digits. Means number to check must be in range
		 * from 10000-99999. Look at each digit of current number, compute 5th power,
		 * then look at next digit and repeat process (for all 5 digits). If the sum of
		 * those 5th power digits is equal to current number, add it to total. 
		 * 
		 * To look at last digit, take current number and do mod 10.
		 * 		System.out.println("1234 MOD 10 is: "+1234%10);

		 */
		
		int runningSum = 0;
		int currentSumDigits;
		int currentDigit;
		int currentNumber;
		
		for(int i=2; i<=500000; i++){
			currentSumDigits = 0;
			currentNumber = i;

			
			//Begin looking at each digit of current number (i)
			for(int j=0; j<6; j++) {
				currentDigit = currentNumber%10;
				currentNumber = currentNumber/10;
							
				currentSumDigits = (int) (currentSumDigits + Math.pow(currentDigit, 5));
			}
						
			
			if(currentSumDigits == i) {
				runningSum += i;
				System.out.println("Current number: "+i+" is special.");
			}
			
		}
		System.out.println("Final Running Sum: "+runningSum);
	}
}
