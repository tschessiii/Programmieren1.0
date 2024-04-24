package Übungen_PR2_Jandl.Collection;

import java.util.ArrayList;
import java.util.List;

public class BookCase {
        List<Book> books = new ArrayList<>();
        //Erstellen eine Liste in der Klasse BookCase

    //Nur Methode
    public void addBook(Book book){
        books.add(book);//Das in der Klammer ist der Parameter
    }

    public void showReadBooks(){
        for (Book book: books) {//For gibt jedem Element im Book den Wert book und geht damit die Liste booklist durch
            if(book.isFinished()){//Überprüft ob eines der books true ist
                System.out.println("Title:"+book.getTitle());
            }

        }
    }

    public void showUnreadBooks(){
        for(Book book: books){
            if(!book.isFinished()){
                System.out.println("Title:"+book.getTitle());
            }
        }
    }

}
