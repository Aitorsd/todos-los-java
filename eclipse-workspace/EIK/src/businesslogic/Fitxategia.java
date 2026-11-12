package businesslogic;

import java.io.*;

import java.util.*;

import eredua.*;

public class Fitxategia {

	private String izena;

	private ArrayList<Langilea2> zerrenda;
	
	private List al = new ArrayList();

	public Fitxategia() {

	}

	public Fitxategia(String izena) {

		this.izena = izena;

	}

	public void setIzena(String izena) {

		this.izena = izena;

	}

	public void inprimatu() {

		for (Integer i = 0; i < zerrenda.size(); ++i) {

			Langilea2 l = (Langilea2) zerrenda.get(i);

			IO.println(l.getId() + " " + l.getIzena());

		}

	}

	public void irakurri() {

		try {

			FileReader fr = new FileReader("./src/businesslogic/" + izena);

			BufferedReader br = new BufferedReader(fr);

			zerrenda = new ArrayList<Langilea2>();

			br.readLine();

			do {

				String lerroa = br.readLine();

				if (lerroa == null)

					break;

				// IO.println(lerroa);

				String[] tokenak = lerroa.split("\t");
				Langilea3 l = kapsulatuDatuak(tokenak);
				
				//zerrenda.add(l);
				
				//zerrenda.add(kapsulatuDatuak(lerroa.split("\t")));

			} while (true);

			br.close();

			fr.close();

		} catch (Exception e) {

			IO.println(e.toString());

		}

	}
	
	private Langilea3 kapsulatuDatuak(String[] tokenak) {
		Langilea3 l = new Langilea3(tokenak[0], tokenak[1], tokenak[2]);
		
		return l;
	}
	
	public static void main(String[] args) {

		Fitxategia f = new Fitxategia();

		f.setIzena("langileak.txt");

		f.irakurri();

		f.inprimatu();

	}

}