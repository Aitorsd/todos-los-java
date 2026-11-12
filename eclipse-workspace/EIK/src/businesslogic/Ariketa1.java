package businesslogic;

import java.util.Arrays;
import java.util.Scanner;

import kontrolagailua.Teklatua;

public class Ariketa1 {

	public static void main(String[] args) {
		
		Double[] balioak;
		balioak = new Double[5];
		
		for(Integer i=0;i<5;++i) 
			balioak[i]= Double.valueOf(Teklatua.irakurri());
		
		
		for(Double datua : balioak)
			IO.println(datua);
		
		IO.println(Arrays.toString(balioak));

		
		//Otra manera de array
		Integer[] balioak2 = {3, 11, 15, 10000, -5};
	

	}

}
