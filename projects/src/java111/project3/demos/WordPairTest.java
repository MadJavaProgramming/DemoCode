/** Tests the methods of the WordPair class.
 * @author Paula Waite
 */
public class WordPairTest {

    public static void main(String[] args) {
        WordPairTest test = new WordPairTest();
        System.out.println("***** Starting compareWordsSameSuccessTest *******");
        test.compareWordsSameSuccess();
        System.out.println();
        System.out.println("***** Starting compareWordsDifferentSuccess *******");
        test.compareWordsDifferentSuccess();
        System.out.println();
        System.out.println("***** Starting countLettersWord1Success *******");
        test.countLettersWord1Success();
        System.out.println();
    }

    /** verify the compareWords method returns a "the words are the same" message
     * when the words are identical.
     */
    public void compareWordsSameSuccess() {
        String expectedResult = "Word 1, cat, and Word 2, cat, are the same";

        // instantiate the class I want to test
        WordPair wordPair = new WordPair();

        // set the values on the object that are needed for the test
        wordPair.setWord1("cat");
        wordPair.setWord2("cat");

        // call the method I want to test
        String actualResult = wordPair.compareWords();

        // compare the actual result to expected result
        // and display a success or fail message
        if (expectedResult.equals(actualResult)) {
            System.out.println("The compareWordsSameSuccess test passed!");
        } else {
            System.out.println("The compareWordsSameSuccess test failed!");
            System.out.println("The expected result was " + expectedResult);
            System.out.println("The actual result was " + actualResult);
        }

    }
    /** verify the compareWords method returns a "the words are not the same" message
     * when the words are different.
     */
    public void compareWordsDifferentSuccess() {
        String expectedResult = "Word 1, cat, and Word 2, dog, are NOT the same";

        // instantiate the class I want to test
        WordPair wordPair = new WordPair();

        // set the values on the object that are needed for the test
        wordPair.setWord1("cat");
        wordPair.setWord2("dog");

        // call the method I want to test
        String actualResult = wordPair.compareWords();

        // compare the actual result to expected result
        // and display a success or fail message
        if (expectedResult.equals(actualResult)) {
            System.out.println("The compareWordsSameSuccess test passed!");
        } else {
            System.out.println("The compareWordsSameSuccess test failed!");
            System.out.println("The expected result was " + expectedResult);
            System.out.println("The actual result was " + actualResult);
        }

    }

    /** verify the countLettersWord1 method returns the correct count.
     */
    public void countLettersWord1Success() {
        int expectedResult = 7;

        // instantiate the class I want to test
        WordPair wordPair = new WordPair();

        // set the values on the object that are needed for the test
        wordPair.setWord1("weather");

        // call the method I want to test
        int actualResult = wordPair.countLettersWord1();

        // compare the actual result to expected result
        // and display a success or fail message
        if (expectedResult == actualResult) {
            System.out.println("The countLettersWord1Success test passed!");
        } else {
            System.out.println("The countLettersWord1Success test failed!");
            System.out.println("The expected result was " + expectedResult);
            System.out.println("The actual result was " + actualResult);
        }

    }

}
