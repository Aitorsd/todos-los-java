package ariketak;

import java.util.Scanner;

public class BilakeaLineala {

	private Integer[] balioak;
	private Integer balioa;
	private Boolean aurkitua;
	private int posizioa;

	public BilakeaLineala() {
		sortuZerrenda();
		zenbakiaIrakurri();
		bilatu();
		inprimatu();
	}

	private void sortuZerrenda() {
		balioak = new Integer[] { 0, 1, 2, 3, 5, 8, 13, 5 };
	}

	private void zenbakiaIrakurri() {
		Scanner sc = new Scanner(System.in);
		IO.print("Bilatzeko balioa: ");
		balioa = sc.nextInt();
		sc.close();
	}

	private void bilatu() {
		aurkitua = false;
		posizioa = 0;

		for (Integer i = 0; i < balioak.length && !aurkitua; ++i) {
			if (balioak[i].equals(balioa)) {
				aurkitua = true;
				posizioa = i;
			}
		}
	}

	private void inprimatu() {
		if (aurkitua) {
			IO.println("Elementua aurkitua da " + (posizioa + 1) + " posizioan");
		} else {
			IO.println("Elementua ez da aurkitua izan");
		}
	}

	public static void main(String[] args) {
		new BilakeaLineala();
	}

}