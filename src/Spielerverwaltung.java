public class Spielerverwaltung {

    private Player[] spieler;

    public Spielerverwaltung(){
        this.spieler = new Player[5];
    }
    public void neuerSpieler(Player spieler){
        boolean done = false;
        for(int i = 0; i < this.spieler.length;i++){
            if(this.spieler[i] == null){
                this.spieler[i] = spieler;
                done = true;
                break;
            }
        }
        if(!done){
            System.out.println("Voll!");
        }
    }
}
