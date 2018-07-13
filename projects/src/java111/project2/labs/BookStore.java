/** This class represents a bookstore.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author //TODO add your name here
 */

public class BookStore {

    // Create the following instance variable, but do not instantiate it.
    // an array that will hold book objects
    Book[] books;

    /** set an array of books
     * @param newBooks the books to put in the array
     */
    public void setBooks(Book[] newBooks) {
        books = newBooks;
    }

    /** calculates and returns the total distance our books take up
     * @return total width the books take up
     */
    public double calculateTotalWidth(){
        double totalWidth = 0;
        for (int counter = 0;counter < books.length; counter++) {
            totalWidth = totalWidth + books[counter].calculateWidth();
        }
        return totalWidth;
    }

    /**  Prints out our book store's information about each book and
      *  the total distance the books take up.
      */
      public void displayAllBooks() {
          for (int counter = 0;counter < books.length; counter++) {
              //String bookInfo = books[counter].display();
              //System.out.println(bookInfo);
              System.out.println(books[counter].display());
          }
          System.out.println("All of my books require " + calculateTotalWidth() + " cm.");

      }

}
