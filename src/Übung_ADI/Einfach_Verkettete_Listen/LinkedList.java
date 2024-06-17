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


    public void addNodeFirstPos(String lebensmittel){
        //Knoten/Node erstellen
        Node newNode = new Node(lebensmittel);


        if(first == null){
            first = newNode;
            last = newNode;
        }else {
            newNode.setNext(first);
            first = newNode;

        }
    }

    public void deleteIndexAtPos(int pos){
        Node current = first;

        //Suchen der korrekten Position
        //0<3
        for(int i = 0; i < pos; i++){

            //Um einen Knoten weiterspringen
            current = current.getNext();
        }


    }

    //Knoten stets ans Ende der Liste anfügen
    public void addNodeAtLastPos(String lebensmittel) {

        //Knoten erstellen
        Node newNode = new Node(lebensmittel);

        //Code wenn Liste leer ist
        if(first == null){
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
