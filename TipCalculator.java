import java.util.*;
public class TipCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the subtotal.");
		float cost = scan.nextFloat();
		float tip;
		
		if (cost < 30) {
			tip = 5;
		}
		else {
			tip = (float)(cost * .15);
		}
	
		float total = tip + cost;
		String totalString = String.format("%.2f", total);
		String tipString = String.format("%.2f", tip);
		System.out.println("The gratuity is: $" + tipString + " and the total is: $" + totalString);

	}

}
