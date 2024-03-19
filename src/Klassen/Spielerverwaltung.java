package Klassen;

import Klassen.Player;

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

    public Player besterSpieler(){
        Player p =this.spieler[0];
        for (int i = 0; i < this.spieler.length; i++) {
            if(this.spieler[i].getPunkte() > p.getPunkte()){
                p= spieler[i];
            }
        }
        return p;
    }
}
