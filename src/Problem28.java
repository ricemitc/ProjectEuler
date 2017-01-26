
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dimensions = 1001;
		int count;
		ArrayList<Integer> diags = new ArrayList<Integer>();
		
		
		for(int i=dimensions; i>=0; i-=2) {
			
			int totalNums = i * i;
			int numPerimiter = totalNums - ((i-2)*(i-2));

			
			count = 0;
			boolean firstNumber = true;
			for(int j=totalNums; j>totalNums - numPerimiter; j--) {
				//System.out.println("j: " + j + " count before: "+ count);
				if(count == 0 && firstNumber == true) {
					count ++;
					firstNumber = false;
					diags.add(j);
				}
				else if(count == i-1) {
					count = 1;
					diags.add(j);
				}
				else {
					count ++;
				}
				//System.out.println("Count after: "+count);
			}
			
		}
		//Accounting for the middle 1 in the spiral
		diags.add(1);
		System.out.println("Starting to sum diagonals: ");
		int finalCount = 0;
		System.out.println("Printing m: ");
		for(int m=0; m<diags.size(); m++) {
			finalCount += diags.get(m);
			//System.out.println(diags.get(m));
		}
		System.out.println(finalCount);
	}

}
