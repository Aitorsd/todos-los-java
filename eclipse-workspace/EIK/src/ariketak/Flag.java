package ariketak;

public class Flag {

	public static void main(String[] args) {
		// 1. Arraya sortu
		// 2. Zenbakia irakurri
		// 3. Begizta
		// 4. Balndintza
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Integer[] balioak = { 0, 1, 2, 3, 5, 8, 13, 5 };
		IO.print("Bilatzeko balioa: ");
		Integer balioa = sc.nextInt();

		Boolean aurkitua = false;
		int posizioa = 0;
		
		for (Integer i = 0; i < balioak.length; ++i) {
			if (balioak[i] == balioa) {
				aurkitua = true;
				posizioa = i;
				IO.println("Elementua aurkitua da " + (posizioa + 1) + " posizoan");
			}
		}
		if (aurkitua == false)
			IO.println("Elementua ez da aurkitua izan");

	}

}
