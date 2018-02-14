import java.util.*;
public class ChangeMaker2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Input the cost of the purchase.");
		float cost = scan.nextFloat();
		System.out.println("Input the amount of money you paid.");
		float bill = scan.nextFloat();
		
		float change = bill - cost;
		final float CHANGE_IN_DOLLARS = change;
		String changeString = String.format("%.2f", CHANGE_IN_DOLLARS);
		String costString = String.format("%.2f", cost);
		
		change *= 100;
		
		int twenties = (int)(change / 2000);
		double r1 = change % 2000;
		
		int tens = (int)(r1 / 1000);
		double r2 = r1 % 1000;
		
		int fives = (int)(r2 / 500);
		double r3 = r2 % 500;
		
		int ones = (int)(r3 / 100);
		double r4 = r3 % 100;
		
		int quarters = (int)(r4 / 25);
		double r5 = r4 % 25;
		
		int dimes = (int)(r5 / 10);
		double r6 = r5 % 10;
		
		int nickels = (int)(r6 / 5);
		
		System.out.println("Price: $" + costString);
		System.out.println("From: $" + bill);
		System.out.println("Computed change: $" + changeString);
		System.out.println(twenties + "x $20 bills");
		System.out.println(tens + "x $10 bills");
		System.out.println(fives + "x $5 bills");
		System.out.println(ones + "x $1 bills");
		System.out.println(quarters + "x quarters");
		System.out.println(dimes + "x dimes");
		System.out.println(nickels + "x nickels");
	}

}
