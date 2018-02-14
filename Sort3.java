import java.util.*;
public class Sort3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three integers.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		
		if (num1 >= num2 && num1 >= num3) {
			if (num2 >= num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			}
			else
				System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if (num2 >= num3 && num2 >= num1) {
			if (num1 >= num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			}
			else
				System.out.println(num2 + " " + num3 + " " + num1);
		}
		else {
			if (num1 >= num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			}
			else
				System.out.println(num3 + " " + num2 + " " + num1);
		}

	}

}
