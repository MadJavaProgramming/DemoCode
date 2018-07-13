/** Represents a book.
 *  Used emphasize Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author // TODO add your name here
 */
public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;
    private double size;

    /** gets the book's size
     *  @return book's size (width)
     */
    public double getSize() {
        return size;
    }

    /** set the book's size
     *  @param newSize book's size
     */
     public void setSize(double newSize) {
         size = newSize;
     }

     /** gets the book's author
      *  @return book's author
      */
     public String getAuthor() {
         return author;
     }

     /** set the book's author
      *  @param author book's author
      */
      public void setAuthor(String newAuthor) {
          author = newAuthor;
      }

      /** gets the book's title
       *  @return book's title
       */
      public String getTitle() {
          return title;
      }

      /** set the book's title
       *  @param newTitle book's title
       */
       public void setTitle(String newTitle) {
           title = newTitle;
       }

      /** gets the book's publicationYear
       *  @return book's publicationYear
       */
      public int getPublicationYear() {
          return publicationYear;
      }

      /** set the book's publicationYear
       *  @param newPublicationYear book's publicationYear
       */
       public void setPublicationYear(int newPublicationYear) {
           publicationYear = newPublicationYear;
       }

       /** gets the book's numberOfCopies
        *  @return book's numberOfCopies
        */
       public int getNumberOfCopies() {
           return numberOfCopies;
       }

       /** set the book's numberOfCopies
        *  @param newNumberOfCopies book's numberOfCopies
        */
        public void setNumberOfCopies(int newNumberOfCopies) {
            numberOfCopies = newNumberOfCopies;
        }

    /** Calculates the width on the bookshelf that all copies
     * of this book take up (numberOfCopies * size)
     */
     public double calculateWidth() {
         return numberOfCopies * size;
     }

    /** Returns the book information,
     * including the distance this title takes up.
     * @return book information include total distance
     */
     public String display() {
         String bookInfo = title + " by " + author + " published in " + publicationYear;
         bookInfo = bookInfo + " is " + size + " cm. ";
         bookInfo = bookInfo + "We have " + numberOfCopies + " copies,  which take up " +
                calculateWidth() + "cm.";
         return bookInfo;
     }
}
