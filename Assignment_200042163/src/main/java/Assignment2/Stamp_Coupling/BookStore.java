package Assignment2.Stamp_Coupling;

import java.util.ArrayList;
import java.util.List;
/*
   Explanation is written in book.java
 */
public class BookStore {
    public List<Book> bookList= new ArrayList<>();
    public void AddBook(Book book){
        this.bookList.add(book);
    }
    public boolean IsBookAvailable(Book book){
        for(Book b: bookList){
            if(b.book_id==book.book_id){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        Book book = new Book(1,"ABC", "On Palestine", "Noam Chomsky");
        BookStore bookStore =new BookStore();
        bookStore.AddBook(book);
        bookStore.IsBookAvailable(book);
    }
}
