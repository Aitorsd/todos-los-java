package ariketak;


public class ArrayakAlderantzizCorregido {

	Double[] datuak = { -1.0, Math.PI, 1e10 };


	public ArrayakAlderantzizCorregido() {

	}


	public ArrayakAlderantzizCorregido(Double[] datuak) {

		this.datuak = datuak;

	}

	

	public void run() {

		inprimatu(false);

	}


	private void inprimatu(Boolean zein) {

		String emaitza = "", emaitza2 = "";

		for (Integer aurkibidea = 0; aurkibidea < datuak.length; ++aurkibidea) {

			emaitza = emaitza + datuak[aurkibidea] + "\n";

			emaitza2 = datuak[aurkibidea] + "\n" + emaitza2;

		}

		if (zein == true)

			IO.println(emaitza);

		else

			IO.println(emaitza2);

	}


	public static void main(String[] args) {

		Double[] besteBat = {0.0, 0.0, 0.0};

		ArrayakAlderantzizCorregido ai = new ArrayakAlderantzizCorregido();

		ai.run();

		ArrayakAlderantzizCorregido ai2 = new ArrayakAlderantzizCorregido(besteBat);

		ai2.run();

		ArrayakAlderantzizCorregido ai3 = new ArrayakAlderantzizCorregido(new Double[] {0.0, 1.0, 1.0, 2.0, 3.0});

		ai3.run();

		

	}


}