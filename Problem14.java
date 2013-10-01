
public class Problem14 {

	
	
	public static void main(String[] args) {

		long currentNumber;
		long startingNumber;
		long sequenceCount;
		long bestStartingNumber = 1;
		long bestSequenceCount = 1;
		
		for(int i=2; i<1000000; i++) {
			sequenceCount = 1;
			currentNumber = i;
			startingNumber = i;
			System.out.println("Evaluating: "+i);
			//Loop until the end of the sequence
			while(currentNumber != 1) {
				
				sequenceCount++;
				//If even, follow even rule
				if(currentNumber%2 == 0) {
					currentNumber = currentNumber/2;
					//System.out.println(currentNumber);
				}
				//Else, it's odd so follow odd rule
				else {
					currentNumber = (currentNumber*3)+1;
					//System.out.println(currentNumber);
				}				
			}

			if(sequenceCount > bestSequenceCount) {
				
				bestStartingNumber = startingNumber;
				bestSequenceCount = sequenceCount;
			}	
			
			System.out.println("Current Best Sequence Count: "+bestSequenceCount);
		}
		
		System.out.println("Best Starting Number: "+bestStartingNumber);
		System.out.println("Best sequence Count: "+bestSequenceCount);
	}

}
