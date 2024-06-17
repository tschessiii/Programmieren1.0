package Übung_ADI.Einfach_Verkettete_Listen;

public class LinkedList {

    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }


    public void addNodeFirstPos(String lebensmittel) {
        //Knoten/Node erstellen
        Node newNode = new Node(lebensmittel);


        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;

        }
    }

    public void deleteIndexAtPos(int pos) {
        Node current = first;
        //Info Pos = 0 bedeutet erster Knoten

        if (pos == 0) {
            return;

            //Element an erster Stelle soll gelöscht werden
        } else if (pos == 0) {

            //d.h. zweites Element wird zum ersten
            first = current.getNext();

        } else {

            //Suchen der korrekten Position
            //0<3
            //1 < 1 --> Schleifenabbruch (Bedingung nicht erfüllt)
            for (int i = 0; i < pos -1; i++) {
                //Bereits vorzeitig das
                if (current == last) {
                    return;
                }

                //Um einen Knoten weiterspringen
                current = current.getNext();

            }

            //Referenz verändern
            current.setNext(current.getNext().getNext());
        }


    }

    //Knoten stets ans Ende der Liste anfügen
    public void addNodeAtLastPos(String lebensmittel) {

        //Knoten erstellen
        Node newNode = new Node(lebensmittel);

        //Code wenn Liste leer ist
        if (first == null) {
            first = newNode;
            last = newNode;
        }

        //Code, wenn Liste nicht mehr leer ist
        else {
            last.setNext(newNode);
            last = newNode;
        }


    }
}
