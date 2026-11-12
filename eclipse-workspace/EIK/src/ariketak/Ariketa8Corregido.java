package ariketak;

public class Ariketa8Corregido {

	public Ariketa8Corregido() {	
	}
	
	public Integer kalkulatu(Integer[] zenbakiak) {
		Integer batura=0;
		
		/*for(Integer n=0;n<zenbakiak.length;++n)
			batura = batura + zenbakiak[n];*/
		
		/*for(Integer zbk: zenbakiak)
			batura = batura + zbk;*/
		
		Integer n = 0;
		while(n<zenbakiak.length)
			batura += zenbakiak[n++];
		
		return batura;
	}
	
	public static void main(String[] args) {
		Integer[] datuak = {0, 1, 1, 2, 10, -4};
		
		Ariketa8Corregido zb = new Ariketa8Corregido();
		IO.print(zb.kalkulatu(datuak));

	}

}
