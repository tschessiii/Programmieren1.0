package Übung_ADI.Einfach_Verkettete_Listen;

public class Node {

    private String lebensmittel; //= Wert
    private Node next; //= Referenz


    public Node(String lebensmittel) {
        this.lebensmittel = lebensmittel;
    }

    public String getLebensmittel() {
        return lebensmittel;
    }

    public void setLebensmittel(String lebensmittel) {
        this.lebensmittel = lebensmittel;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return lebensmittel;
    }
}
