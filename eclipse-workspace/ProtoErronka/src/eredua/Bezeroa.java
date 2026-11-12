package eredua;

public class Bezeroa {
    private String id;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;

    public Bezeroa() {
    }

    public Bezeroa(String id, String izena, String abizena, String helbidea, String emaila) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.helbidea = helbidea;
        this.emaila = emaila;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public String getEmaila() {
        return emaila;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }
}