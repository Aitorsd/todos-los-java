package businesslogic;

import ikuspegia.Kontsola;

public class Sekuentzia {
	public void zenbakiBikoitiakKalkulatu() {
		int n = 0;
		for (; n <= 10; n += 1) {
			System.out.println("7 x " + n + " = " + 7*n);
		}
		System.out.println(n);
	}
}
