package ariketak;

import java.util.Arrays;

public class Ariketa14O15NoMeAcuerdo {

	public Ariketa14O15NoMeAcuerdo() {
		
	}
	
	public static void main(String[] args) {
		Integer[] iturburua = {5, 3, 1, 10, -1};
		Integer[] helmuga = new Integer[iturburua.length];
		
		for (Integer i = 0; i < iturburua.length; ++i)
			helmuga[i] = iturburua[i];
		
		IO.println(Arrays.toString(helmuga));

	}

}
