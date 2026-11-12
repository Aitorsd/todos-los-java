package ariketak;

public class Ariketa10Corregido {


	
	public Ariketa10Corregido() {
		
	}
	
	public void inprimatu(Integer[] datuak, Boolean positiboa) {
		for(Integer i = 0; i < datuak.length;++i) {
			if(datuak[i]>=0 && positiboa == true || datuak[i]<0 && positiboa == false)
				IO.println(datuak[i]);
		}
	}
	
	public static void main(String[] args) {
		Ariketa10Corregido ai = new Ariketa10Corregido();
		Integer[] nirezenbakiak = {-1,0,5,7,-3,-2,10};
		ai.inprimatu(nirezenbakiak, true);
		

	}

}
