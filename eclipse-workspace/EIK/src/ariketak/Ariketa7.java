package ariketak;

import java.util.Arrays;

public class Ariketa7 {


	
	public static void main(String[] args) {
		Integer[] zenbakiZerrenda = {0, 1, 1, 2, 3, 5, 8, 13, 21};
		Integer[] alderantzizkakoZerrenda = new Integer[zenbakiZerrenda.length];
		
		IO.println(Arrays.toString(zenbakiZerrenda));
		IO.println(Arrays.toString(alderantzizkakoZerrenda));
		
		for(Integer i = 0; i<zenbakiZerrenda.length; ++i)
			alderantzizkakoZerrenda[i] = zenbakiZerrenda[i];
		
		IO.println(Arrays.toString(alderantzizkakoZerrenda));
		
		/*Integer j = alderantzizkakoZerrenda.length - 1;
		for (Integer i = 0; i < zenbakiZerrenda.length; ++i) {
			alderantzizkakoZerrenda[j] = zenbakiZerrenda[i];
			j--;
			}
		IO.println(Arrays.toString(alderantzizkakoZerrenda));*/
		
		Integer j = 0;
		for (Integer i = zenbakiZerrenda.length -1, j = 0; i >= 0; --i, ++j) 
			alderantzizkakoZerrenda[j] = zenbakiZerrenda[i];
		
		IO.println(Arrays.toString(alderantzizkakoZerrenda));
		

		
		/*Forma 1
		 * for(Integer i=0; i < zbk.length; ++i)
			IO.println(zbk[i]);
		
		for (Integer zenbakia : zbk)
			IO.println(zenbakia);
		
		IO.println(Arrays.toString(zbk));
		*/
		
		/*for(Integer i= zenbakiZerrenda.length-1; i >= 0; --i)
			IO.println(zenbakiZerrenda[i]);*/
		
		/* Forma 2
		String tartekoZonaldea1 = "", tartekoZonaldea2 = "";
		for(Integer zenbakia:zenbakiZerrenda) {
			tartekoZonaldea1 = tartekoZonaldea1 + zenbakia + "\n";
			tartekoZonaldea2 =  zenbakia + "\n" + tartekoZonaldea2;
		}
		IO.println(tartekoZonaldea1 + "\n" + tartekoZonaldea2);*/

	}

}
