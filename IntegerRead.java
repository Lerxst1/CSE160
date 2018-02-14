import java.util.*;
public class IntegerRead {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter some number of integers: ");
		
		int n = 1;
		int posCount = 0;
		int negCount = 0;
		int total = 0;
		int numberOfEntries = 0;
		float avg = 0;
		
		while (n != 0) {
			n = scan.nextInt();
			total += n;
			numberOfEntries++;
			if (n > 0) {
				posCount++;
			}
			if (n < 0) {
				negCount++;
			}
		}
		
		avg = (float)(total) / (numberOfEntries - 1);
		scan.close();
		
		System.out.println("# positive: " + posCount);
		System.out.println("# negative: " + negCount);
		System.out.println("input total: " + total);
		System.out.println("input average: " + avg);
		
		
		
	}

}
