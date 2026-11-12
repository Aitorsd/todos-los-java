
public class Adibidea {

	public static void main(String[] args) {
		
		Zirkulua z;
		z = new Zirkulua();
		
		double emaitza;
		z.erradioa=2.0;
		emaitza = z.kalkulatuAzalera();
		
		System.out.println(emaitza);
		
		Zirkulua z2 = new Zirkulua();
		z2.erradioa=9.0;
		System.out.println(z2.kalkulatuAzalera());
		
		z2.erradioa=5.0;
		System.out.println(z2.kalkulatuAzalera());
		
	}

}
