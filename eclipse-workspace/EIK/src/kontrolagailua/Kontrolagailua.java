package kontrolagailua;

import businesslogic.Karratua;
import businesslogic.Progresioa;
import businesslogic.Triangelua;
import ikuspegia.Kontsola;

public class Kontrolagailua {

	public Kontrolagailua() {
		begiztaNagusia();
		// bostMultiploak();
		// marraztuTriangelua();
	}

	private void marraztuTriangelua() {
		Triangelua t = new Triangelua();
		t.marrazketa(4, 1);
	}

	private void begiztaNagusia() {
		String a = "";
		while(!a.equals("3")) {
		Menua m = new Menua();
		m.inprimatu();
		
		a = m.getAukera();	
		if(a.equals("1")) 
			new Karratua().marraztu(4, 4);
		 else if (a.equals("2")) 
			new Triangelua().marrazketa(5,5);
		 else 
			IO.println("Agur!");
		}
		
	}

	private void bostMultiploak() {
		Progresioa p;
		p = new Progresioa();
		p.bostMultiploakKalkulatu();

	}

	public static void main(String[] args) {
		new Kontrolagailua();
	}
}
