package Übungen_PR2_Jandl.Hotel;

public class Schlüsselkasten {


    private Key[] keys;

    private int numbersOfRooms;


    //Constructor------------------------------------------------------
    public Schlüsselkasten(Key[] keys, int numbersOfRooms) {
        this.keys = keys;
        this.numbersOfRooms = numbersOfRooms;
    }


    //Methoden ----------------------------------------------------
    public void giveKeyToGuest(Gast guest){
        int roomNumber = guest.getRoomNumber();
        Key key = keys[roomNumber-1];


        if(key != null){
            guest.setKey(key);
            key.setWithGuest(true);
            keys[roomNumber-1] = null;//Setzte an der Stelle wo der Schlüssel im Array ist null
        }else {
            System.out.println("Zimmer ist bereits verbucht!");
        }
    }


    public  void takeKeyBack(Gast guest){
        Key key= guest.getKey();
        key.setWithGuest(false);
        keys[guest.getRoomNumber()-1]=key;
        guest.setKey(null);

    }

    public  void showkey(){
        for (Key key: keys) {
            System.out.println(key);
        }

    }

}
