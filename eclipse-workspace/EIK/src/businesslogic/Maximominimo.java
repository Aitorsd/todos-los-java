package businesslogic;

import java.util.Arrays;

import kontrolagailua.Teklatua;

public class Maximominimo {

	public static void main(String[] args) {
		Double[] balioak;
		balioak = new Double[10];

		for (int i = 0; i < balioak.length; ++i) {
			balioak[i] = Double.valueOf(Teklatua.irakurri());
		}

		Double maximo = balioak[0];
		Double minimo = balioak[0];

		for (int i = 0; i < balioak.length; i++) {
			if (balioak[i] > maximo) {
				maximo = balioak[i];
			}

			if (balioak[i] < minimo) {
				minimo = balioak[i];
			}
		}

		IO.println(Arrays.toString(balioak) + "-tik maximoa: " + maximo + " eta minimoa:" + minimo);
	}

}