package ariketak;

public class Ariketa9Corregido {

	public Ariketa9Corregido() {
		
	}
	
	public void inprimatu(String[] datuak, Integer jauzia) {
		for(Integer i = 0; i < datuak.length; i += jauzia)
			IO.println(datuak[i]);
		
		/*
		 *  0 0
		 *  1 2
		 *  2 4
		 *  3 6
		 *  4 8
		 *  5 10
		 */
		for(Integer i = 0; i < datuak.length / jauzia; ++i)
			IO.println(datuak[i * jauzia]);
		
		Integer i = 0;
		for(String izena: datuak) {
			if (i % jauzia == 0)
				IO.println(izena);
			++i;
		}
		
		i = 0;
		while(i<datuak.length) {
			IO.println(datuak[i]);
			i += jauzia;
		}
		
		String tartekoa="";
		for(i = 0; i < datuak.length; i += jauzia)
			tartekoa+=datuak[i] + "\n";
		IO.println(tartekoa);
		
	}
	
	public static void main(String[] args) {
		Ariketa9Corregido ai = new Ariketa9Corregido();
		String[] izenak = {"Victor", "Irune", "Zunbeltz", "Eder"};
		ai.inprimatu(izenak, 2);

	}

}
