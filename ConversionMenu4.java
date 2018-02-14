
public class ConversionMenu4 {

	public static void main(String[] args) {
		double km = 1.0;
		int mi = 1;
		System.out.println("Miles" + "\t" + "\t" + "Kilometers");
		for (int i = 0; i < 10; i++) {
			km = mi * 1.609;
			String kmString = String.format("%.3f", km);
			System.out.println(mi + "\t" + "\t" + kmString);
			mi++;
		}

	}

}
