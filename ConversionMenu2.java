
public class ConversionMenu2 {

	public static void main(String[] args) {
		double pounds = 1.0;
		int kilos = 1;
		System.out.println("Kilograms" + "\t" + "Pounds");
		for (int i = 0; i < 199; i++) {
			pounds = kilos * 2.2;
			String poundsString = String.format("%.1f", pounds);
			System.out.println(kilos + "\t" + "\t" + poundsString);
			kilos++;
		}

	}

}
