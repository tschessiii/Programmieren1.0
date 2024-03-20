package Übungen_PR2.Collection;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Liebe",true,4.1));
        bookList.add(new Book("Starwars",true,5));
        bookList.add(new Book("War",false,2));

        for(Book books: bookList){
            System.out.println(books.toString());
        }

        System.out.println("---------------------------");

        BookCase bookCase = new BookCase();//BookCase Klasse in der Main aufrufen
        bookCase.bookList.addAll(bookList);//Man addet die ganze Bücher Liste aus der Main in die Bücher Liste aus der BookCase
        bookCase.showReadBooks();

        System.out.println("-----------------------------");
        bookCase.showUnreadBooks();
    }
}
