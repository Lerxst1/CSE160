import java.util.*;
public class ConversionMenu {

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
			String kilos = String.format("%.4f", pounds / 2.2046226218);
			
			System.out.println("Kilograms are: " + kilos);
		}
		else if (option.equals("B")) {
			System.out.print("Enter a quantity in kilos: ");
			double kilos = input.nextDouble();
			String pounds = String.format("%.4f", kilos * 2.2046226218);
			System.out.println("Pounds are: " + pounds);
		}
		else if (option.equals("C")) {
			System.out.print("Enter a number of kilometers: ");
			double km = input.nextDouble();
			String mi = String.format("%.4f", km * 0.621371);
			System.out.println("Miles: " + mi);
		}
		else if (option.equals("D")) {
			System.out.print("Enter a number of miles: ");
			double mi = input.nextDouble();
			String km = String.format("%.4f", mi / 0.621371);
			System.out.println("Kilometers: " + km);
		}
		else if (option.equals("E")) {
			System.exit(0);
		}
		else {
			System.out.println("Please enter A, B, C, D, or E.");
		}

	}

}
