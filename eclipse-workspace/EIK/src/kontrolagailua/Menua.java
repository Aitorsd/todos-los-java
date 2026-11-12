package kontrolagailua;

import ikuspegia.Kontsola;

public class Menua {
	public void inprimatu() {
		Kontsola.inprimatu("MENUA");
		Kontsola.inprimatu("1. Inprimatu karratua");
		Kontsola.inprimatu("2. Inprimatu triangelua");
		Kontsola.inprimatu("3. Irten");
	}
	
	public String getAukera() {
		String a;
		a = Teklatua.irakurri();
		return a;
	}
	
}
