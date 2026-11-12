package ariketak;

import java.util.*;

public class ArrayRandom {
	
	public ArrayRandom() {
		int[] zenbakiak = new int[7];
		
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = new Random().nextInt(100) + 1;
		}
		
		IO.println("Zenbakiak 1-100");
		for (int i = 0; i < zenbakiak.length; i++) {
			IO.println(zenbakiak[i]);;
		}
	}

	public static void main(String[] args) {
		new ArrayRandom();

	}

}
