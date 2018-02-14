import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a month number. January = 1, February = 2, etc: ");
		
		int month = scan.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("Please enter a valid month.");
			System.exit(0);
		}
		
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		if (year < 0) {
			System.out.println("Please enter a valid year.");
			System.exit(0);
		}
		
		int days;
		scan.close();
		
		int febDays = 28;
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			febDays = 29;	
		}	
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
			if (month == 1) 
				System.out.println("January " + year + " has " + days + " days.");
			else if (month == 3) 
				System.out.println("March " + year + " has " + days + " days.");
			else if (month == 5) 
				System.out.println("May " + year + " has " + days + " days.");	
			else if (month == 7) 
				System.out.println("July " + year + " has " + days + " days.");
			else if (month == 8) 
				System.out.println("August " + year + " has " + days + " days.");
			else if (month == 10) 
				System.out.println("October " + year + " has " + days + " days.");
			else
				System.out.println("December " + year + " has " + days + " days.");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
			if (month == 4) 
				System.out.println("April " + year + " has " + days + " days.");
			else if (month == 6) 
				System.out.println("June " + year + " has " + days + " days.");
			else if (month == 9) 
				System.out.println("September " + year + " has " + days + " days.");	
			else
				System.out.println("November " + year + " has " + days + " days.");
		}
		else {
			System.out.println("February " + year + " has " + febDays + " days.");
		}


	}

}
