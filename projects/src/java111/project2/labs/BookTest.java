/** Unit test for the Book class
 * @author pwaite
 */

public class BookTest {

    /** test the Book calculateWidth method
     *   @param args Command line arguments (not used here)
     */
    public static void main(String[] args) {
        // Instantiate the class to be tested
        Book book = new Book();

        // Set the conditions
        book.setSize(4.1);
        book.setNumberOfCopies(4);

        // Create a variable to hold the expected value
        double expectedTotalWidth = 16.4;

        // Call the method to be tested and put the return value into a variable
        double actualTotalWidth = book.calculateWidth();

        // Verify the correct value was returned and output success or failure message
        if (actualTotalWidth == expectedTotalWidth) {
            System.out.println("Book calculate width method: SUCCESS");
        } else {
            System.out.println("Book calculate width method: FAIL");
        }
    }


}
