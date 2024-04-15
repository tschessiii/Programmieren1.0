package Programmiere_2_Hofer.Instrumente;

public class MainInstrument {
    public static void main(String[] args) {
        Gitarre g = new Gitarre(20);
        Trompete t = new Trompete(80);
        Pauke p = new Pauke(60);
        Orchester o = new Orchester();
        o.addInstrument(g);
        o.addInstrument(t);
        o.addInstrument(p);

        Piano piano = new Piano(40);
        o.addInstrument(piano);
        o.playAll();

    }
}
