import java.util.*;
public class IntegerReverse {
	
	public static String reverse (int num) {
		String rev = "";
		String original = Integer.toString(num);
		
		for (int i = original.length()-1; i >= 0; i--) {
			rev += original.charAt(i);
		}
		return rev;
	}
	
		

	
	public static void main (String [] b) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		System.out.println(reverse(s));
	}
	}


