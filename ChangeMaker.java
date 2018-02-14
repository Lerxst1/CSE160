import java.util.*;
public class ChangeMaker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your change, 1-99 cents.");
		int change = scan.nextInt();
		
		int quarters = change / 25;
		int r1 = change % 25;
		
		int dimes = r1 / 10;
		int r2 = r1 % 10;
		
		int nickels = r2 / 5;
		int r3 = r2 % 5;
		
		int pennies = r3;
		System.out.println("Your change is: " + quarters + " quarters, " + dimes + " dimes, " + nickels + 
				
				" nickels, and " + pennies + " pennies.");

	}

}
