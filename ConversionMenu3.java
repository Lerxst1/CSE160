
public class ConversionMenu3 {

	public static void main(String[] args) {
		
		System.out.println("Kilos" + "\t" + "Pounds" + "\t" + "Pounds" + "\t" + "Kilos");
		
		int kilosOdd = 1;
		double poundsOdd = 1;
		double kilosFive = 1;
		int poundsFive = 20;
		for (int i = 0; i < 100; i++) {
			
				poundsOdd = Math.round((kilosOdd * 2.2) * 100);
				poundsOdd /= 100;

				kilosFive = Math.round((poundsFive / 2.2) * 10);
				kilosFive /= 10;
			
			System.out.println(kilosOdd + "\t" + poundsOdd + "\t" + poundsFive + "\t" + kilosFive);
			kilosOdd += 2;
			poundsFive += 5;
		}

	}

}
