package Hausübungen.Hausübung2;

public class HÜ2_5 {

    public int bettenProStockwerk;

    public int stockwerke;

    public int anzahlBesetzt;

    String typ;

    public HÜ2_5(int bettenProStockwerk, int stockwerke, int anzahlBesetzt, String typ) {
        this.bettenProStockwerk = bettenProStockwerk;
        this.stockwerke = stockwerke;
        this.anzahlBesetzt = anzahlBesetzt;
        this.typ = typ;
    }

    public double preisproBett(){
       switch (typ.toLowerCase()){
           case "luxus":
               return 105.4;
           case "standard":
               return 57.5;
           case "lowcost":
               return 25;
           default:
               return 0;
       }
    }
    //Methode zur Berechnung des Preises für die Buchung einer Unterkunft
    public double preisproUnterkunft(){
        return bettenProStockwerk*stockwerke*preisproBett();
    }

    //Methode zur Berechnungdes Preises für eine Buchung von einer bestimmten Anzahl an Betten
    public double preisproBuchung(int betten){
        return betten*preisproBett();
    }

    //Methode zum Buchen von Betten
    public void bucheBetten(int betten){
        if(anzahlBesetzt + betten <= bettenProStockwerk * stockwerke){
            betten= anzahlBesetzt+ betten;
            System.out.println("Betten wurden erfolgreich gebucht!");
        }else {
            System.out.println("Nicht genügend freie Betten verfügbar!");
        }
    }

    public boolean ausgebucht(){
        return anzahlBesetzt >= bettenProStockwerk*stockwerke;
    }

    @Override
    public String toString() {
        return "bettenProStockwerk=" + bettenProStockwerk +
                ", stockwerke=" + stockwerke +
                ", anzahlBesetzt=" + anzahlBesetzt +
                ", typ='" + typ + '\'' +
                '}';
    }
}
