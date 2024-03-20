package Übungen_PR2.Collection;

import java.util.ArrayList;
import java.util.List;

public class BookCase {
        List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void showReadBooks(){
        for (Book book:bookList) {//For gibt jedem Element im Book den Wert book und geht damit die Liste booklist durch
            if(book.isFinished()){//Überprüft ob eines der books true ist
                System.out.println("Title:"+book.getTitle());
            }

        }
    }


    public void showUnreadBooks(){
        for(Book book:bookList){
            if(!book.isFinished()){
                System.out.println("Title:"+book.getTitle());
            }
        }
    }

}
