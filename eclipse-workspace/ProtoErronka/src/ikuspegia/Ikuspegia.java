package ikuspegia;

import java.util.ArrayList;
import eredua.Bezeroa;

public class Ikuspegia {

    public void inprimatuBezeroak(ArrayList<Bezeroa> zerrenda) {
        if (zerrenda == null || zerrenda.isEmpty()) {
            System.out.println("Ez dago bezero gorderik.");
            return;
        }

        System.out.println("Bezeroen zerrenda");
        for (Bezeroa b : zerrenda) {
            System.out.println(b.getId() + " | " + b.getIzena() + " " + b.getAbizena() + " | " + b.getHelbidea() + " | " + b.getEmaila());
        }
    }
}

