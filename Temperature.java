import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a temperature in Celsius.");
		double celsius = scan.nextDouble();
		
		double fahrenheit = ((9.0 / 5) * celsius) + 32;
		
		System.out.println(celsius + " in Fahrenheit is: " + fahrenheit);

	}

}

