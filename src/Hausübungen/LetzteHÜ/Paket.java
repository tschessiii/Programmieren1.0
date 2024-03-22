package Hausübungen.LetzteHÜ;

public class Paket{
    private int id;
    private String adresse;

    public Paket(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return "||ID:"+id+ " Adresse: "+adresse;
    }
}
