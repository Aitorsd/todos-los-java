package ariketak;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {

		Integer[] balioak = { 5, 3, 1, 10, -1 };
		Integer tartekoa;
		
		for(Integer i = 0; i < balioak.length; ++i) {
			for(Integer j = i; j < balioak.length; ++j) {
				if(balioak[i]>balioak[j]);
				tartekoa = balioak[i];
				balioak[i] = balioak[j];
				balioak[j] = tartekoa;
			}
			
		IO.println(Arrays.toString(balioak));
			
		}
	}

}
