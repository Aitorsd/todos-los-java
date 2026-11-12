package ariketak;

import java.util.Scanner;

public class HandienaTxikiena {
	private Integer[] zerrenda;
	private final Integer elementuKopurua = 10;
	private Integer maximoa, minimoa;
	
	public HandienaTxikiena() {
		sortuZerrenda();
		ZenbakiakIrakurri();
		kalkulatu();
		inprimatu();		
		
	}

	private void sortuZerrenda() {
		zerrenda = new Integer[elementuKopurua];
	}

	private void ZenbakiakIrakurri() {
		Scanner sc = new java.util.Scanner(System.in);
		for (Integer i = 0; i < zerrenda.length; ++i)
			zerrenda[i] = sc.nextInt();
		sc.close();
	}

	private void kalkulatu() {
		maximoa = minimoa = zerrenda[0];
		for (Integer i = 0;i < zerrenda.length; ++i) {
			if (zerrenda[i] > maximoa)
				maximoa = zerrenda[1];
			if (zerrenda[i] < minimoa)
				minimoa = zerrenda[1];
		}
	}

	private void inprimatu() {
		IO.println("MAX: " + maximoa + " MIN: " + minimoa);
	}

	void main() {
		
	}

}
