/** This class creates a bookstore and then fills it with books.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author //TODO add your name here
 */

public class BookStoreBuilder {
    //  Create a private instance variable to hold a BookStore object,
    // but do not instantiate it yet
    BookStore bookStore;

    /** Create books and pass them to the bookstore
     *
     */
     public void createBooks() {
         Book[] books = new Book[2];
         books[0] = new Book();
         books[1] = new Book();

         books[0].setAuthor("Kathy Sierra");
         books[0].setTitle("Head First Java");
         books[0].setSize(3.5);
         books[0].setPublicationYear(2008);
         books[0].setNumberOfCopies(10);

         books[1].setAuthor("Another Author");
         books[1].setTitle("Another title");
         books[1].setSize(1.5);
         books[1].setPublicationYear(2018);
         books[1].setNumberOfCopies(5);

         //Set the local array of books into the BookStore's array of books using
         //     the set method
         bookStore.setBooks(books);

     }


     // TODO Create a run method that
     public void run() {
         // 1) Instantiates a new BookStore object and assigns it to the
         //     instance variable
         bookStore = new BookStore();

         // 2) Call the method to create the books
         createBooks();

         //3) Call the method in the BookStore to display the information about our books
         bookStore.displayAllBooks();
        }
}
