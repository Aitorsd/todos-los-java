package businesslogic;

import java.io.*;
import java.util.*;
import eredua.Bezeroa;

public class Fitxategia {

    private String izena;
    private ArrayList<Bezeroa> zerrenda;

    public Fitxategia() {
        this.zerrenda = new ArrayList<Bezeroa>();
    }

    public Fitxategia(String izena) {
        this();
        this.izena = izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public ArrayList<Bezeroa> getZerrenda() {
        return zerrenda;
    }

    public ArrayList<Bezeroa> irakurri() {
        zerrenda = new ArrayList<Bezeroa>();
        try {
            FileReader fr = new FileReader("./src/businesslogic/" + izena);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();

            String lerroa;
            while ((lerroa = br.readLine()) != null) {
                String[] tokenak = lerroa.split("\t");
                if (tokenak.length >= 5) {
                    Bezeroa b = kapsulatuDatuak(tokenak);
                    zerrenda.add(b);
                }
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println("Errorea fitxategia irakurtzean: " + e.getMessage());
        }
        return zerrenda;
    }

    private Bezeroa kapsulatuDatuak(String[] tokenak) {
        Bezeroa b = new Bezeroa();
        b.setId(tokenak[0]);
        b.setIzena(tokenak[1]);
        b.setAbizena(tokenak[2]);
        b.setHelbidea(tokenak[3]);
        b.setEmaila(tokenak[4]);
        return b;
    }
}