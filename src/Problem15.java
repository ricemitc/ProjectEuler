/*
 * Mitchell Rice
 * ProjectEuler.org Problem 15
 * 
 * Explanation: 
 * 0-1-1-1
 * |
 * 1-2-3-4
 * |
 * 1-3-6-10
 * |
 * 1-4-10-20
 * 
 * Take a look at the above grid as an example. The '-' and '|' represent the number of sides
 * to the grid. In this example, we have a 3x3 grid. Now, look at each coordinate where a '-'
 * meets a '|'. That is the number of possible paths to get to that coordinate. Along the sides,
 * there is only one path to get there. Upon filling that in, we can fill in the adjacent coordinates.
 * If a coordinate isn't on a side, it is the sum of the number of paths to get to the node directly above
 * it, and to get to the node directly to the left of it. Look at the coordinate for 2-down, 2-right.
 * The number of paths to get here is 6 because there are 3 paths to get to the node directly above [2][2], 
 * and 3 paths to get to the node directly to the left of [2][2]. After applying this principle to a 20x20
 * grid, we can find the answer.
 */


public class Problem15 {

	public static void main(String[] args) {

		System.out.println(pathFinder(20));
		
	}
	
	public static long pathFinder (int n) {
		
		//Grid of coordinates
		long[][] grid = new long[n+1][n+1];
		
		
		//Loop through rows
		for(int i=0; i<(n+1); i++) {
			//Loop through columns
			for(int j=0; j<(n+1); j++) {
				//If either i or j is 0, it's on a side so declare number of paths to be 1
				if(j==0) {
					grid[i][j]=1;
				}
				else if(i==0) {
					grid[i][j]=1;
				}
				//Else, coordinate not on a side so its the sum of the coordinate above and coordinate to left
				else {
					grid[i][j] = grid[i-1][j] + grid[i][j-1];
				}
			}
		}
		
		//Print number of paths for each side
		/*
		for(int i=0; i<n+1; i++) {
			System.out.println(i+": "+grid[i][i]);
		}
		*/
		return grid[n][n];
	}

}
