public class Player {
    public String Name;
    public int Punkte;
    public String[] spieleOrte;

    public Player(String name, int punkte) {
        this.Name = name;
        this.Punkte = punkte;
        this.spieleOrte = new String[5];
    }


    public void neuerOrt(String Ort){
        for (int i =0;i < spieleOrte.length; i++){
            if(spieleOrte[i] == null){
                spieleOrte[i]= Ort;
            }
        }
    }

   public void gewonnen(int p){
        Punkte = Punkte+p;
   }

    public int getPunkte() {
        return Punkte;
    }
}
