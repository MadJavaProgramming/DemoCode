/** Demo comparing primitives versus objects
 * @author pwaite
 */

public class ComparisonDemo {
    /** compare 2 primitives
     *  compare 2 objects
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int number1 = 6;
        int number2 = 7;

        // comparing the actual values "in the cup"
        if (number1 == number2) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are NOT equal");
        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        // comparing the actual values "in the cup"
        if (dog1 == dog2) {
            System.out.println("The dogs are equal");
        } else {
            System.out.println("The dogs are NOT equal");
        }

        String string1 = "hello";
        String string2 = "hello";
        // comparing the actual objects
        if (string1.equals(string2)) {
            System.out.println("The Strings are equal");
        } else {
            System.out.println("The Strings are NOT equal");
        }


     }

}
