package ariketak;

import java.util.*;

public class Ariketa11Corregido {

	public Ariketa11Corregido() {
		
	}
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Integer[] zenbakiak = new Integer[100];
		
		for(Integer i=0; i< zenbakiak.length; ++i)
			zenbakiak[i] = r.nextInt(10);
		
		IO.println(Arrays.toString(zenbakiak));
	}

}
