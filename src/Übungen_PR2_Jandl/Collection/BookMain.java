package Übungen_PR2_Jandl.Collection;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {

        //Wie bei einem Array werden in einer Liste Daten gespeichert nur das eine Liste ungeordnet ist und unendlich lang sein kann
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Annabelle",true,4.1));
        bookList.add(new Book("Starwars",true,5));
        bookList.add(new Book("War",false,2));

        //Gibt jedem Wert in der Klasse Book die Variable book und geht die Bücherliste durch
        for(Book books: bookList){
            System.out.println(books.toString());
        }

        System.out.println("---------------------------");

        //BookCase
        BookCase bookCase = new BookCase();//BookCase Klasse in der Main aufrufen
        bookCase.books.addAll(bookList);//Man addet die ganze Bücher Liste aus der Main in die Bücher Liste aus der BookCase
        bookCase.showReadBooks();

        System.out.println("-----------------------------");
        bookCase.showUnreadBooks();
    }
}
