package Übung_ADI.Einfach_Verkettete_Listen;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeAtLastPos("Mango");
        //list.addNodeAtLastPos("Eis");

        System.out.println("First: "+list.getFirst());
        System.out.println("Last: "+list.getLast());

        list.deleteIndexAtPos(3);

    }
}
