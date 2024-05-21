package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Exception;

public class ue1 {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    // Konstruktor
    public ue1(int size) {
        this.maxSize = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }

    // Methode zum Hinzufügen eines Elements auf den Stack
    public void push(Object item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        stackArray[++top] = item;
    }

    // Methode zum Entfernen und Zurückgeben des obersten Elements vom Stack
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return stackArray[top--];
    }

    // Hilfsmethode zur Überprüfung, ob der Stack voll ist
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Hilfsmethode zur Überprüfung, ob der Stack leer ist
    public boolean isEmpty() {
        return (top == -1);
    }

    // Hauptmethode zur Demonstration der Funktionalität
    public static void main(String[] args) {
        try {
            ue1 stack = new ue1(3); // Stack mit maximaler Größe 3
            stack.push("Element 1");
            stack.push("Element 2");
            stack.push("Element 3");

            System.out.println(stack.pop()); // Ausgabe: Element 3
            System.out.println(stack.pop()); // Ausgabe: Element 2
            System.out.println(stack.pop()); // Ausgabe: Element 1

            // Versuch, ein weiteres Element zu entfernen, wenn der Stack leer ist
            System.out.println(stack.pop()); // Sollte eine Exception auslösen

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

