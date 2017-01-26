/**
 * 
 * @author Mitch
 * 
 * This problem asks to find the number of sundays in the 20th century that fell on the first 
 * of the month. My solution is extremely messy because when I originally read the problem I though it
 * was asking how many Sundays were in the 20th century (not restricted to the Sundays on the first
 * of the month). Basically I used an iterative solution and just looped through every day in the
 * 20th century. I am in no way proud of this solution and need to revisit it.
 *
 */




public class Problem19 {

	
	public static void main(String[] args) {

		//Starting from Tuesday, January 1, 1901 to 
		//31 of December, 2000
		
		/*
		 * Months:
		 * 		1 = January
		 * 		2 = February
		 * 		3 = March
		 * 		4 = April
		 * 		5 = May
		 * 		6 = June
		 * 		7 = July
		 * 		8 = August
		 * 		9 = September
		 * 		10 = October
		 * 		11 = November
		 * 		12 = December
		 */
		
		/*
		 * Days: 
		 * 		1 = Monday
		 * 		2 = Tuesday
		 * 		3 = Wednesday
		 * 		4 = Thursday
		 * 		5 = Friday
		 * 		6 = Saturday
		 * 		7 = Sunday
		 */
		
		int currentYear = 1900;
		int currentMonth = 1;
		int currentDay = 2;
		int dayCountInMonth = 1;
		int firstSundays = 0;
		
		while ((currentYear <= 2000)) {
			

			
			//If in a month with 30 days
			if(currentMonth == 10 || currentMonth == 4 || currentMonth == 6 || currentMonth == 11) {
				if(dayCountInMonth>=30) {
					//Reset the dayInMonth counter and increment to next month
					dayCountInMonth = 1;
					currentMonth++;
				}
				else {
					dayCountInMonth ++;
				}
			}
			//If current month is february (28 days unless on leapyear)
			else if(currentMonth == 2) {
				//If current year not on a century and divisible by 4
				//OR if current year is on a century and divisible by 400
				if((currentYear%4 ==0 && currentYear%100!=0) || (currentYear%100==0 && currentYear%400==0)) {
					//It's a leap year
					if(dayCountInMonth>=29) {
						dayCountInMonth = 1;
						currentMonth++;
					}
					else  {
						dayCountInMonth++;
					}
				}
				else {
					//It's not a leap year
					if(dayCountInMonth>=28) {
						dayCountInMonth = 1;
						currentMonth++;
					}
					else {
						dayCountInMonth++;
					}
				}
			}
			//Else, its a month with 31 days
			else {
				if(dayCountInMonth >=31) {
					dayCountInMonth = 1;
					if(currentMonth ==12) {
						currentMonth=1;
						currentYear++;
					}
					else {
						currentMonth++;
					}
				}
				else {
					dayCountInMonth++;
				}
				
			}
			
			
			//Evaluate current day of the week
			if(currentDay == 7) {
				currentDay = 1;
				//System.out.println("Current day: "+currentMonth+"/"+dayCountInMonth+"/"+currentYear+" is a Sunday.");
				//System.out.println("Sunday Count: "+sundayCount);
				if(dayCountInMonth==1) {
					//System.out.println("Sunday on first of month!");
					System.out.println("Current day: "+currentMonth+"/"+dayCountInMonth+"/"+currentYear+" is a Sunday on the first of the month.");
					firstSundays++;
				}
			}
			else {
				currentDay++;
			}
			
			
		
			
			
		//End while
		}
		System.out.println(firstSundays);
	}

}
