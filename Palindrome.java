import java.util.*;

public class Palindrome {
	private static Scanner scan;

	public static void main (String [] args) {
		
		scan = new Scanner(System.in);
		System.out.print("Enter a three-digit integer:");
		int num = scan.nextInt();
		int posNum;
		String reverse = "";
		String stringNum = "";
		
		if (num < 0) {
			posNum = num * -1;
			stringNum = Integer.toString(posNum);
		}
		else {
		stringNum = Integer.toString(num);
		}
		

		

		
		int i;
		for (i = stringNum.length() - 1; i >= 0; i--) {
			reverse += stringNum.charAt(i);
		}
		
		if (stringNum.equals(reverse) && num >= 0) {
			System.out.println(stringNum + " is a palindrome");
		}
		else if (stringNum.equals(reverse) && num < 0) {
			System.out.println("-" + stringNum + " is a palindrome");
		}
		else
			System.out.println(stringNum + " is not a palindrome");	
		
	}}