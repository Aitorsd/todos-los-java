package ariketak;

public class BakarrikPositibo {

	public BakarrikPositibo() {
		int[] zenbakiak = { 1, -4, 5, 2, -9, -132 };

		IO.println("Zenbaki positiboak:");
		for (int i = 0; i < zenbakiak.length; i++) {
			if (zenbakiak[i] > 0) {
				IO.println(zenbakiak[i]);
			}
		}
	}

	public static void main(String[] args) {
		new BakarrikPositibo();

	}

}
