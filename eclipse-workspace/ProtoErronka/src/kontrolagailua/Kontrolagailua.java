package kontrolagailua;

import java.util.ArrayList;
import businesslogic.Fitxategia;
import eredua.Bezeroa;
import ikuspegia.Ikuspegia;

public class Kontrolagailua {

    public Kontrolagailua() {
        hasieratu();
    }

    private void hasieratu() {
        Fitxategia fitxategia = new Fitxategia("bezeroak.txt");
        ArrayList<Bezeroa> bezeroak = fitxategia.irakurri();

        Ikuspegia ikuspegia = new Ikuspegia();
        ikuspegia.inprimatuBezeroak(bezeroak);
    }

    public static void main(String[] args) {
        new Kontrolagailua();
    }
}