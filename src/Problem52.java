import java.util.Hashtable;


public class Problem52 {

	
	
	public static void main(String[] args) {

		boolean permutedMultipleFound = false;
		boolean currentPermutedAccepted = true;
		int currentInteger = 105;
		int currentIntegerProduct;
		int currentDigit;
		int temporary;
		
		
		Hashtable<Integer, Integer> digits;
		
		while(permutedMultipleFound == false) {
			
			System.out.println("Checking: "+currentInteger);
			
			//Reset hashtable for each iteration
			digits = new Hashtable<Integer, Integer>();
			
			//Assume the current permutation works until proven otherwise
			currentPermutedAccepted = true;
			
			//Set temporary to be the current integer so as not to lose value of current int
			temporary = currentInteger;
			
						
			//Need to compute all digits of currentInteger and build Hash
			while(temporary > 9) {
				currentDigit = temporary % 10;
				temporary /= 10;
				
				digits.put(currentDigit, currentDigit);
			}
			
			//Now currentInteger should be a single digit, so add it to the hashtable
			digits.put(temporary, temporary);
			//Print hashtable
			System.out.println(digits.toString());
			
			
			
			for(int i=2; i<=6; i++) {
			System.out.println("Multiplier: "+i);
			currentIntegerProduct = currentInteger*i;
			
			temporary = currentIntegerProduct;
			
			System.out.println("Current x"+i+": "+currentIntegerProduct);
			
			//Compare digits of currentIntegerDouble to digits in hash
			while(temporary > 9) {
				currentDigit = temporary % 10;
				temporary /= 10;
				
				//If current digit is not in hash, the current number does not work
				if(digits.get(currentDigit) == null) {
					currentPermutedAccepted = false;
					System.out.println("Current digit: "+ currentDigit +" is not in hash.");
					break;
				}
			}
			
			//temporary is now single digit and needs to be compared to hash if it has been accepted up to last digit.
			if(digits.get(temporary) == null && currentPermutedAccepted==true) {
				currentPermutedAccepted = false;
				System.out.println("Current digit: "+ temporary +" is not in hash.");
			}
			
			
			if(currentPermutedAccepted == false) {
				break;
			}
			//End for loop
			}
			
				
			//If currentPermutation is still true through all multiplications, end loop
			if(currentPermutedAccepted == true) {
				permutedMultipleFound = true;
				System.out.println("Accepted: "+currentInteger);
			}
			
			//Increment integer count
			currentInteger ++;
			
			System.out.println("\n");
		}
		
		
		
	}

}
