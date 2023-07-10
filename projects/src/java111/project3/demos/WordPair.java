/** 
 * Created for Mod 3 Lab 5. This class contains two words and 
 * has methods to analyze those two words for length and equality.
 * 
 * @author Paula Waite
 **/

public class WordPair {
    private String word1;
    private String word2;

    /** set the first word */
    public void setWord1(String word1) {
        this.word1 = word1;
    }

    /** set the second word */
    public void setWord2(String word2) {
        this.word2 = word2;
    }

    /** Method to compare word 1 and word 2 and return the comparison result */
    public String compareWords() {
        if (word1.equals(word2)) {
            return "Word 1, " + word1 + ", and Word 2, " + word2 + ", are the same";
        } else {
            return "Word 1, " + word1 + ", and Word 2, " + word2 + ", are NOT the same";
        }
    }

    /** Return the number of letters in word 1 */
    public int countLettersWord1() {
        return word1.length();
    }
}
