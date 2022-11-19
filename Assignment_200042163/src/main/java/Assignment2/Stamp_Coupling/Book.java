package Assignment2.Stamp_Coupling;

/*
   Stamp coupling occurs when modules of a software program are interconnected with a set of data,
   composite data structure ,compilation of data or elements etc.

   When an entire set of composite data or object is passed by parameters from one module to another
   instead of a single data(Data Coupling) then we call it stamp coupling

    In this example of Stamp coupling , we have book and bookstore class, here entire set of data
    (Book) has been passed to addBook and IsBookAvailable Function.

    We have done this inside main function which is a different module. So main function is connected
    with other function of bookstore by passing a book object which contain attributes like integer and
    strings . Also in the IsBookAvailable function , all the attributes of book is not needed only passing
    the id would have been enough. But then it would be data coupling then, we want a stamp coupling. So,
    entire dataset has passed
 */
public class Book {
    public int book_id;
    public String publisher;
    public String Book_title;
    public String Author;
    public Book(int id, String publisher, String book_title, String Author){
        this.book_id=id;
        this.publisher=publisher;
        this.Book_title=book_title;
        this.Author=Author;
    }
}
