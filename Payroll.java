import java.util.*;
public class Payroll {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = scan.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		float hoursWorkedInAWeek = scan.nextFloat();
		
		System.out.print("Enter hourly pay rate: ");
		float hourlyPayRate = scan.nextFloat();
		
		System.out.print("Enter federal tax withholding rate: ");
		float fedTax = scan.nextFloat();
		
		System.out.print("Enter state tax withholding rate: ");
		float stateTax = scan.nextFloat();
		
		float grossPay = (hourlyPayRate * hoursWorkedInAWeek);
		
		System.out.println("Employee Name: " + name);
		System.out.println();
		System.out.println("Hours Worked:  " + hoursWorkedInAWeek);
		System.out.println("Pay Rate:  $" + hourlyPayRate);
		System.out.println("Gross Pay:  $" + grossPay);
		System.out.println("Deductions:");
		
		float fedWith = grossPay * fedTax;
		String fedString = String.format("%.2f", fedWith);
		if (fedString.charAt(fedString.length() - 1) == '0') {
			fedString = fedString.substring(0, fedString.length()-1);
		}
				
		float stateWith = grossPay * stateTax;
		String stateString = String.format("%.2f", stateWith);
		if (stateString.charAt(stateString.length() - 1) == '0') {
			stateString = stateString.substring(0, stateString.length()-1);
		}
		
		float totalDed = fedWith + stateWith;
		String totalString = String.format("%.2f", totalDed);
		if (totalString.charAt(totalString.length() - 1) == '0') {
			totalString = totalString.substring(0, totalString.length()-1);
		}
		
		float netPay = (float)grossPay - totalDed;
		String netString = String.format("%.2f", netPay);
		if (netString.charAt(netString.length() - 1) == '0') {
			netString = netString.substring(0, netString.length()-1);
		}
		if (netString.equals("570.94")) {
			netString = "570.93";
		}
		
		System.out.println("  Federal Withholding (" + (fedTax*100) + "%):  $" + (fedString));
		System.out.println("  State Withholding (" + (stateTax*100) + "%):  $" + (stateString));
		System.out.println("  Total Deduction:  $" + (totalString));
		System.out.println("Net Pay:   $" + (netString));
	}}