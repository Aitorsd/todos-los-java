package businesslogic;

import java.util.Arrays;

import kontrolagailua.Teklatua;

public class Ariketa3 {

	public static void main(String[] args) {
		Double[] balioak;
		balioak = new Double[5];
		Double batazBestekoa = 0.0;

		for (Integer i = 0; i < 5; ++i)
			balioak[i] = Double.valueOf(Teklatua.irakurri());

		for (Integer i = 0; i < balioak.length; ++i)
			batazBestekoa = batazBestekoa + balioak[i];

		batazBestekoa = batazBestekoa / balioak.length;

		IO.println(Arrays.toString(balioak) + " " + batazBestekoa);

	}

}
