import java.util.Scanner;
public class ConversionMenuLab3 {
	
	
	public static double poundsToKilos (double pounds) {
		double kilos = pounds / 2.2046226218;
		return kilos;
	}
	
	public static double kilosToPounds (double kilos) {
		double lbs = kilos * 2.2046226218;
		return lbs;
	}
	
	public static double kmToM (double km) {
		return km * 0.621371;
	}
	
	public static double mToKm (double mi) {
		return mi / 0.621371;
	}

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A - convert pounds to kilos");
		System.out.println("B - convert kilos to pounds");
		System.out.println("C - convert kilometers to miles");
		System.out.println("D - convert miles to kilometers");
		System.out.println("E - exit");
		System.out.print("Enter your option: ");
		
		String option = input.next();
		
		
		
		if (option.equals("A")) {
			System.out.print("Enter a quantity in pounds: ");
			double pounds = input.nextDouble();
			double kilos = poundsToKilos(pounds);
			System.out.println(pounds + " pounds is " + kilos + " kilos.");
		}
		else if (option.equals("B")) {
			System.out.print("Enter a quantity in kilos: ");
			double kilos = input.nextDouble();
			double pounds = kilosToPounds(kilos);
			System.out.println(kilos + " kilos is " + pounds + " pounds.");
		}
		else if (option.equals("C")) {
			System.out.print("Enter a number of kilometers: ");
			double km = input.nextDouble();
			double mi = kmToM(km);
			System.out.println(km + " kilometers is " + mi + " miles.");
		}
		else if (option.equals("D")) {
			System.out.print("Enter a number of miles: ");
			double mi = input.nextDouble();
			double km = mToKm(mi);
			System.out.println(mi + " miles is " + km + " kilometers.");
		}
		else if (option.equals("E")) {
			System.exit(0);
		}
		else {
			System.out.println("Please enter A, B, C, D, or E.");
		}
		
	}}