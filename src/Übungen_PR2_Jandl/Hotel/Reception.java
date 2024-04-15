package Übungen_PR2_Jandl.Hotel;

public class Reception {
    public static void main(String[] args) {
        Key key = new Key(false,1);
        Key key2 = new Key(false,2);
        Key key3 = new Key(false,3);
        Key key4 = new Key(false,4);
        Key key5 = new Key(false,5);

        Key[] keys = new Key[]{key,key2,key3,key4,key5};
        Schlüsselkasten keyrack = new Schlüsselkasten(keys, 5);

        Gast gast = new Gast(null,3, "Paul Walker");
        keyrack.giveKeyToGuest(gast);

        keyrack.showkey();

    }
}
