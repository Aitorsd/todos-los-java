package businesslogic;

import java.util.Arrays;

public class TestuKatea {

	public static void main(String[] args) {

		String mezua = "Kaixo \n \t zelan \t zaude";
		
		
		String[] tokenak = mezua.split("\t");
		
		IO.println(mezua.substring(1, 3));
		
		for(Integer i=0;i<tokenak.length;++i)
			IO.println(tokenak[i]);
		
		for(String tokena:tokenak)
			IO.println(tokena);
		
		IO.println(Arrays.toString(tokenak));
		
		

	}

}
