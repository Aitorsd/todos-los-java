
public class Zirkulua {

	double erradioa;
	
	public Zirkulua() {
	}

	public double kalkulatuAzalera() {
		double azalera = 0;
		double pi;
		pi = 3.1416;
		if (erradioa > 0)
			azalera = pi * erradioa * erradioa;
		return azalera;
	}
	
}
