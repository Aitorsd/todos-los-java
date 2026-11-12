package ariketak;

import java.util.Arrays;

public class Ariketa15 {

	public Ariketa15() {
		
	}
	
	public static void main(String[] args) {
		Integer[] iturburua1 = {5, 3, 1};
		Integer[] iturburua2 = {1, 0, 7};
		
		Integer[] helmuga = new Integer[iturburua1.length + iturburua2.length];
		
		for(Integer i = 0; i<iturburua1.length; ++i)
			helmuga[i] = iturburua1[i];
		
		for (Integer i = iturburua1.length; i < helmuga.length; ++i)
			helmuga[i] = iturburua2[i - iturburua1.length];
		
		IO.println(Arrays.toString(helmuga));

	}

}
